package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;

/* renamed from: X.TuI  reason: case insensitive filesystem */
public final class C14335TuI extends C252313ou {
    public final UserSession A00;
    public final AnonymousClass0eK A01;
    public final AnonymousClass0eK A02;
    public final AnonymousClass0eK A03;

    public C14335TuI(UserSession userSession, AnonymousClass4DU r3, String str, AnonymousClass0eK r5, AnonymousClass0eK r6, AnonymousClass0eK r7) {
        super(userSession, r3, str, false);
        this.A00 = userSession;
        this.A01 = r5;
        this.A02 = r6;
        this.A03 = r7;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.4OC] */
    public final void A0A(0xI r5, C263934Nx r6) {
        0qQ.A0B(r5, 0);
        this.A01.get();
        ? obj = new Object();
        C14314Tto tto = (C14314Tto) ((C257443xP) this.A02.get()).A04();
        if (tto != null) {
            C296995qz r0 = tto.A01;
            String A012 = C320166rs.A01(r0.A01, r0.A00);
            obj.A0V = A012;
            r5.A0C("position", A012);
            C296905qq r02 = tto.A02;
            String A013 = C320166rs.A01(r02.A03, r02.A01);
            obj.A0W = A013;
            r5.A0C("size", A013);
            Long valueOf = Long.valueOf(tto.A00);
            obj.A0P = valueOf;
            if (valueOf != null) {
                r5.A0B(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, valueOf);
            }
            String str = tto.A03;
            if (str != null) {
                obj.A0Z = str;
                r5.A0C("subtype", str);
            }
        }
        1Xj r2 = (1Xj) ((C257443xP) this.A03.get()).A04();
        if (r2 != null) {
            String mezqlToken = r2.A0C.getMezqlToken();
            if (mezqlToken != null) {
                r5.A0C("mezql_token", mezqlToken);
            }
            String loggingInfoToken = r2.A0C.getLoggingInfoToken();
            if (loggingInfoToken != null) {
                r5.A0C("ranking_info_token", loggingInfoToken);
            }
        }
        if (r6 != null) {
            r6.A07 = obj;
        }
    }

    public final AnonymousClass4OR A0C(1Xj r6) {
        0qQ.A0B(r6, 0);
        C14314Tto tto = (C14314Tto) ((C257443xP) this.A02.get()).A04();
        AnonymousClass4OR A012 = A01(this.A00, r6);
        if (tto != null) {
            String str = tto.A03;
            A012.A06("subtype", str);
            String id = r6.getId();
            AnonymousClass4NZ r1 = AnonymousClass4NZ.A05;
            if (AnonymousClass4NZ.A03() && id != null) {
                r1.A04(id, str);
            }
        }
        return A012;
    }

    public final Integer A08() {
        return AnonymousClass05K.A15;
    }

    public final C263974Ob A0D(C263974Ob r3, 1Xj r4) {
        AnonymousClass7TG.A1N(r4, r3);
        super.A0D(r3, r4);
        C14314Tto tto = (C14314Tto) ((C257443xP) this.A02.get()).A04();
        if (tto != null) {
            r3.A05("instagram_grid_item_type", Long.valueOf(tto.A00));
        }
        return r3;
    }
}
