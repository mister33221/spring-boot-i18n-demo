package com.kai.i18ndemo.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

public class AcceptHeaderResolver extends AcceptHeaderLocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        String headerLang = request.getHeader("Accept-Language");
        if (StringUtils.isNotBlank(headerLang)) {
            return getExtention(headerLang);
        }
        return null;
    }

    public static Locale getExtention(String language) {
        switch (language) {
            case "zh-TW":
                return Locale.TAIWAN;
            case "en-US":
                return Locale.US;
            case "ja-JP":
                return Locale.JAPAN;
            case "ko-KR":
                return Locale.KOREA;
            case "zh-CN":
                return Locale.CHINA;
            default:
                return Locale.TAIWAN;
        }
    }





}
