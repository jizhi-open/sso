package net.totime.sso.core.exception;

import java.io.Serial;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/08/15
 * @description 极致单点登录异常
 * @see RuntimeException
 * @since 1.0.0
 */
public class JiZhiSsoException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 48L;

    public JiZhiSsoException(String msg) {
        super(msg);
    }

    public JiZhiSsoException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public JiZhiSsoException(Throwable cause) {
        super(cause);
    }
}
