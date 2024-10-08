package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.nio.charset.Charset;

/* renamed from: X.ABo  reason: case insensitive filesystem */
public abstract class C39842ABo {
    public static final Charset A00 = Charset.forName(ReactWebViewManager.HTML_ENCODING);

    public static C3741198f A00(C3738097a r6) {
        C375269Cx A0C = C3741198f.DEFAULT_INSTANCE.A0C();
        int i = r6.primaryKeyId_;
        A0C.A03();
        ((C3741198f) A0C.A00).primaryKeyId_ = i;
        for (C3741398h r4 : r6.key_) {
            C375269Cx A0C2 = C3741298g.DEFAULT_INSTANCE.A0C();
            C3741498i r0 = r4.keyData_;
            if (r0 == null) {
                r0 = C3741498i.DEFAULT_INSTANCE;
            }
            String str = r0.typeUrl_;
            A0C2.A03();
            str.getClass();
            ((C3741298g) A0C2.A00).typeUrl_ = str;
            C375139Ck A0F = r4.A0F();
            A0C2.A03();
            C3741298g r1 = (C3741298g) A0C2.A00;
            if (A0F != C375139Ck.UNRECOGNIZED) {
                r1.status_ = A0F.A00;
                AnonymousClass98D A002 = AnonymousClass98D.A00(r4.outputPrefixType_);
                if (A002 == null) {
                    A002 = AnonymousClass98D.UNRECOGNIZED;
                }
                A0C2.A03();
                ((C3741298g) A0C2.A00).outputPrefixType_ = A002.A01();
                int i2 = r4.keyId_;
                A0C2.A03();
                ((C3741298g) A0C2.A00).keyId_ = i2;
                AnonymousClass972 A01 = A0C2.A01();
                A0C.A03();
                C3741198f r3 = (C3741198f) A0C.A00;
                A01.getClass();
                AnonymousClass978 r2 = r3.keyInfo_;
                if (!((AnonymousClass977) r2).A00) {
                    int size = r2.size();
                    int i3 = size * 2;
                    if (size == 0) {
                        i3 = 10;
                    }
                    r2 = r2.Coo(i3);
                    r3.keyInfo_ = r2;
                }
                r2.add(A01);
            } else {
                throw AnonymousClass7TE.A0w(Pxd.A00(1));
            }
        }
        return (C3741198f) A0C.A01();
    }
}
