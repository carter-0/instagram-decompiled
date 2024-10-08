package com.instagram.newsfeed.ui;

import X.002;
import X.0Yt;
import X.0bY;
import X.0cp;
import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C255463uA;
import X.C41845B3m;
import X.C47156DrX;
import X.C51797G2g;
import X.C51967G9n;
import X.C66928MfN;
import X.DbT;
import X.DbW;
import X.EWF;
import X.VJ6;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.Serializable;

@Serializable
public final class InlineLinkUrn extends AnonymousClass0T0 {
    public static final 0bY A05 = DbW.A0G();
    public static final Companion Companion = new Object();
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public final class Companion {
        public static final InlineLinkUrn A00(C47156DrX drX, String str) {
            0qQ.A0B(drX, 0);
            String A0q = C51967G9n.A0q(str, drX.A01, drX.A00);
            String str2 = ((EWF) drX.A06.getValue()).A00;
            LinkedHashMap A03 = 0Yt.A03((Map) drX.A04.getValue());
            A03.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, drX.A02);
            Uri.Builder builder = new Uri.Builder();
            builder.authority(str2);
            Iterator A0s = AnonymousClass7TF.A0s(A03);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                builder.appendQueryParameter(DbT.A13(A1J), (String) A1J.getValue());
            }
            return new InlineLinkUrn(A0q, DbT.A10(builder.build()));
        }

        public final C255463uA serializer() {
            return C66928MfN.A00;
        }
    }

    public InlineLinkUrn(String str, String str2) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        this.A01 = str;
        this.A02 = str2;
        this.A00 = 0cp.A01(A05, str2);
        this.A04 = AnonymousClass0eN.A01(new C51797G2g(this, 28));
        this.A03 = AnonymousClass0eN.A01(new C51797G2g(this, 29));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof InlineLinkUrn) {
                InlineLinkUrn inlineLinkUrn = (InlineLinkUrn) obj;
                if (!0qQ.A0K(this.A01, inlineLinkUrn.A01) || !0qQ.A0K(this.A02, inlineLinkUrn.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00(String str) {
        return DbT.A11(str, (Map) this.A04.getValue());
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, AnonymousClass7TE.A0O(this.A01));
    }

    public final String toString() {
        return 002.A11("InlineLinkUrn(text='", this.A01, "', url='", this.A02, "')");
    }

    public /* synthetic */ InlineLinkUrn(String str, String str2, int i) {
        if (3 != (i & 3)) {
            VJ6.A00(C66928MfN.A01, i, 3);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = str;
        this.A02 = str2;
        this.A00 = 0cp.A01(A05, str2);
        this.A04 = AnonymousClass0eN.A01(new C51797G2g(this, 28));
        this.A03 = AnonymousClass0eN.A01(new C51797G2g(this, 29));
    }
}
