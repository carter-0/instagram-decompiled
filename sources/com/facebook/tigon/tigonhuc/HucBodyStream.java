package com.facebook.tigon.tigonhuc;

import X.002;
import X.0qQ;
import X.1Su;
import X.C51974G9v;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonErrorCode;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;

public final class HucBodyStream {
    public long bodyLength;
    public long bytesWritten;
    public final TigonHucCallbackForwarder callbackForwarder;
    public final CountDownLatch latch;
    public final OutputStream outputStream;

    public final synchronized void reportBodyLength(long j) {
        this.bodyLength = j;
    }

    public final void reportError(byte[] bArr, int i) {
        0qQ.A0B(bArr, 0);
        TigonError A03 = 1Su.A03(bArr, i);
        TigonHucCallbackForwarder tigonHucCallbackForwarder = this.callbackForwarder;
        TigonErrorCode tigonErrorCode = A03.category;
        tigonHucCallbackForwarder.onError(tigonErrorCode.value, A03.errorDomain, A03.domainErrorCode, 002.A0g(002.A0b(002.A0g(tigonErrorCode.toString(), " domain: ", A03.errorDomain), " code: ", A03.domainErrorCode), " detail: ", A03.analyticsDetail));
    }

    public final synchronized int writeBytes(byte[] bArr, int i) {
        TigonHucCallbackForwarder tigonHucCallbackForwarder;
        int i2;
        String str;
        String str2;
        if (bArr != null && i >= 0) {
            if (i <= bArr.length) {
                try {
                    this.outputStream.write(bArr, 0, i);
                    long j = this.bytesWritten + ((long) i);
                    this.bytesWritten = j;
                    TigonHucCallbackForwarder tigonHucCallbackForwarder2 = this.callbackForwarder;
                    long j2 = this.bodyLength;
                    if (j2 == -1) {
                        j2 = j;
                    }
                    tigonHucCallbackForwarder2.onUploadProgress(j, j2);
                    return 0;
                } catch (IOException e) {
                    tigonHucCallbackForwarder = this.callbackForwarder;
                    i2 = TigonErrorCode.TRANSIENT_ERROR.value;
                    str = "HucBodyStream";
                    str2 = e.getMessage();
                    if (str2 == null) {
                        str2 = "";
                    }
                }
            }
        }
        tigonHucCallbackForwarder = this.callbackForwarder;
        i2 = TigonErrorCode.INVALID_REQUEST.value;
        str = "HucBodyStream";
        str2 = "Invalid buffer or size provided";
        tigonHucCallbackForwarder.onError(i2, str, 1, str2);
        return 1;
    }

    public final void writeEOM() {
        this.latch.countDown();
    }

    public HucBodyStream(OutputStream outputStream2, CountDownLatch countDownLatch, long j, TigonHucCallbackForwarder tigonHucCallbackForwarder) {
        C51974G9v.A1L(outputStream2, countDownLatch, tigonHucCallbackForwarder);
        this.outputStream = outputStream2;
        this.latch = countDownLatch;
        this.bodyLength = j;
        this.callbackForwarder = tigonHucCallbackForwarder;
    }
}
