package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public final class SQW {
    public static final Logger A00 = Pxf.A11(SQW.class);

    public static C13200TPg A00(Socket socket) {
        if (socket == null) {
            throw AnonymousClass7TE.A0w("socket == null");
        } else if (socket.getOutputStream() != null) {
            TZ3 tz3 = new TZ3(socket);
            OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new C13200TPg(tz3, new C13201TPh(outputStream, tz3));
            }
            throw AnonymousClass7TE.A0w("out == null");
        } else {
            throw JTO.A0u("socket's output stream == null");
        }
    }

    public static C13204TPk A01(Socket socket) {
        if (socket == null) {
            throw AnonymousClass7TE.A0w("socket == null");
        } else if (socket.getInputStream() != null) {
            TZ3 tz3 = new TZ3(socket);
            InputStream inputStream = socket.getInputStream();
            if (inputStream != null) {
                return new C13204TPk(tz3, new C13205TPl(inputStream, tz3));
            }
            throw AnonymousClass7TE.A0w("in == null");
        } else {
            throw JTO.A0u("socket's input stream == null");
        }
    }
}
