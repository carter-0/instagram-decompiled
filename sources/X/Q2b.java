package X;

import android.util.Base64;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.util.concurrent.ListenableFuture;

public final class Q2b implements C303636Ad {
    public final /* synthetic */ Q2X A00;
    public final /* synthetic */ C7271Q1v A01;

    public Q2b(Q2X q2x, C7271Q1v q1v) {
        this.A00 = q2x;
        this.A01 = q1v;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.1K2] */
    /* JADX WARNING: type inference failed for: r0v12, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.1K2] */
    public final /* bridge */ /* synthetic */ ListenableFuture ABk(Object obj) {
        Exception exc;
        C7263Q1n q1n = (C7263Q1n) obj;
        if (q1n == null) {
            Exception exc2 = new Exception("decodeDocument: ShowreelNativeDocument is null", (Throwable) null);
            ? obj2 = new Object();
            obj2.setException(exc2);
            return obj2;
        }
        String str = q1n.A03;
        int length = str.length();
        if (length == 0) {
            Q2X q2x = this.A00;
            Integer num = AnonymousClass05K.A0Y;
            ImmutableMap immutableMap = RegularImmutableMap.A02;
            0qQ.A07(immutableMap);
            q2x.Dlm(immutableMap, num, "Document string is empty");
        }
        C7272Q1w q1w = this.A01.A02;
        Q2X q2x2 = this.A00;
        0qQ.A0B(q2x2, 1);
        try {
            AnonymousClass0JR r1 = q1w.A00;
            r1.now();
            if (length == 0) {
                exc = new Exception("decodeDocument: animationResource.document is empty", (Throwable) null);
            } else {
                try {
                    byte[] decode = Base64.decode(str, 0);
                    0qQ.A0A(decode);
                    r1.now();
                    String str2 = q1n.A04;
                    ImmutableMap build = Pxf.A0Q().build();
                    0qQ.A07(build);
                    return new 1Ks(new C67605Mqd(q1n.A00, str2, q1n.A02, build, decode));
                } catch (IllegalArgumentException e) {
                    exc = new Exception("decodeDocument: decode base64 string failed", e);
                }
            }
            throw exc;
        } catch (RJX e2) {
            Integer num2 = AnonymousClass05K.A0j;
            ImmutableMap immutableMap2 = RegularImmutableMap.A02;
            0qQ.A07(immutableMap2);
            q2x2.Dlm(immutableMap2, num2, C273654mx.A00(1240));
            ? obj3 = new Object();
            obj3.setException(e2);
            return obj3;
        }
    }
}
