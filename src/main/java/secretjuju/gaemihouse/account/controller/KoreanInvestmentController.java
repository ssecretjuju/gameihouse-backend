package secretjuju.gaemihouse.account.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import secretjuju.gaemihouse.account.service.KoreaInvestmentService;
import secretjuju.gaemihouse.common.ResponseDTO;

import java.nio.charset.Charset;

@RestController
@RequestMapping("/account")
public class KoreanInvestmentController {

    private final KoreaInvestmentService koreaInvestmentService;

    public KoreanInvestmentController(KoreaInvestmentService koreaInvestmentService) {
        this.koreaInvestmentService = koreaInvestmentService;
    }

    // Appkey & Appsecret 유효성 검사
    @PostMapping("/auth")
    public ResponseEntity<ResponseDTO> checkAccessToken(/*MemberDTO member*/) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        if(koreaInvestmentService.getAccountBalance()) {
            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .body(new ResponseDTO(HttpStatus.OK, "successful", true));
        } else {
            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .body(new ResponseDTO(HttpStatus.OK, "failed", false));
        }

    }

    @PostMapping("/current/evaluate-property")
    public ResponseEntity<ResponseDTO> getCurrentEvaluateProperty(/*MemberDTO member*/) {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));

        int currentEvaluateProperty = koreaInvestmentService.getCurrentEvaluateProperty();

        if(currentEvaluateProperty == -1) {
            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .body(new ResponseDTO(HttpStatus.OK, "failed", -1));
        } else {
            return ResponseEntity
                    .ok()
                    .headers(headers)
                    .body(new ResponseDTO(HttpStatus.OK, "successful", currentEvaluateProperty));
        }
    }
}