package common.service;

import org.springframework.stereotype.Service;
import java.util.Date;
import java.text.SimpleDateFormat;


@Service
public class BuildStampServiceImpl implements BuildStampService {
    private static final String DATE_PATTERN = "yyyy/MMdd HH:mm:ss";
    private static final String BUILD_STAMP = new SimpleDateFormat(DATE_PATTERN).format(new Date());

    @Override
    public String getBuildStamp() {
        return BUILD_STAMP;
    }
}
