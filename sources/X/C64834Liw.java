package X;

import com.facebook.quicklog.PointEditor;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Liw  reason: case insensitive filesystem */
public final class C64834Liw implements AnonymousClass0lh {
    public Map A00 = 0Yt.A0E();
    public final 1QP A01;
    public final UserSession A02;

    public C64834Liw(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = AnonymousClass1QO.A00(userSession);
    }

    public final void A02(C62535KhR khR) {
        0qQ.A0B(khR, 0);
        if (this.A00.containsKey(khR)) {
            this.A01.flowEndCancel(A00(khR, this), CancelReason.USER_CANCELLED);
            this.A00 = 0Yt.A09(khR, this.A00);
        }
    }

    public final void A05(String str, String str2, boolean z, String str3) {
        String str4;
        String str5 = str2;
        0qQ.A0B(str5, 2);
        C62535KhR khR = C62535KhR.A03;
        if (this.A00.containsKey(khR)) {
            A02(khR);
        }
        this.A01.flowStart(A00(khR, this), new UserFlowConfig("shopping_creation", false));
        if (str != null) {
            A03(khR, AnonymousClass000.A00(55), str);
        }
        if (z) {
            str4 = "seller";
        } else {
            str4 = "creator";
        }
        A03(khR, "user_tag_type", str4);
        if (str != null) {
            A03(khR, AnonymousClass000.A00(55), str);
        }
        A03(khR, "media_format", str3);
        A04((Boolean) null, str5, (String) null, (String) null, (String) null, true);
    }

    public static final long A00(C62535KhR khR, C64834Liw liw) {
        if (!liw.A00.containsKey(khR)) {
            liw.A00 = 0Yt.A0C(liw.A00, AnonymousClass7TF.A0y(khR, liw.A01.generateNewFlowId(khR.A00)));
        }
        return DbY.A04(C51966G9m.A14(khR, liw.A00));
    }

    public final void A01(int i, int i2, String str) {
        C62535KhR khR = C62535KhR.A03;
        if (this.A00.containsKey(khR)) {
            A04((Boolean) null, (String) null, str, (String) null, (String) null, false);
            if (this.A00.containsKey(khR)) {
                this.A01.flowAnnotate(A00(khR, this), "product_count", i);
            }
            if (this.A00.containsKey(khR)) {
                this.A01.flowAnnotate(A00(khR, this), "collection_count", i2);
            }
            this.A01.flowEndSuccess(A00(khR, this));
            this.A00 = 0Yt.A09(khR, this.A00);
        }
    }

    public final void A03(C62535KhR khR, String str, String str2) {
        if (this.A00.containsKey(khR)) {
            this.A01.flowAnnotate(A00(khR, this), str, str2);
        }
    }

    public final void A04(Boolean bool, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C62535KhR khR = C62535KhR.A03;
        if (this.A00.containsKey(khR)) {
            long A002 = A00(khR, this);
            if (z) {
                str5 = "shopping_creation_navigate_start";
            } else {
                str5 = "shopping_creation_navigate_end";
            }
            PointEditor markPointWithEditor = this.A01.markPointWithEditor(A002, str5);
            if (str != null) {
                markPointWithEditor.addPointData("start_source_type", str);
            }
            if (str2 != null) {
                markPointWithEditor.addPointData("end_source_type", str2);
            }
            if (str3 != null) {
                markPointWithEditor.addPointData("merchant_id", str3);
            }
            if (str4 != null) {
                markPointWithEditor.addPointData("product_id", str4);
            }
            if (bool != null) {
                markPointWithEditor.addPointData(C273654mx.A00(773), bool.booleanValue());
            }
            markPointWithEditor.pointEditingCompleted();
        }
    }

    public final void A06(boolean z) {
        String str;
        C62535KhR khR = C62535KhR.A03;
        if (this.A00.containsKey(khR)) {
            if (z) {
                str = "shopping_creation_variant_navigate_start";
            } else {
                str = "shopping_creation_variant_navigate_end";
            }
            if (this.A00.containsKey(khR)) {
                this.A01.flowMarkPoint(A00(khR, this), str, (String) null);
            }
        }
    }

    public final void onSessionWillEnd() {
        Iterator A0u = AnonymousClass7TF.A0u(this.A00);
        while (A0u.hasNext()) {
            A02((C62535KhR) AnonymousClass7TE.A1J(A0u).getKey());
        }
    }
}
