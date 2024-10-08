package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrlBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GwP  reason: case insensitive filesystem */
public final class C53919GwP extends C251343mx {
    public final C267324bN A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final HashMap A03;

    private final C53985GxT A00(C70832Wc r14, 2WX r15, 1Xj r16, int i, int i2, int i3) {
        String str;
        ImageUrlBase imageUrlBase;
        1Xj r1 = r16;
        if (r16 != null) {
            str = r1.getId();
            imageUrlBase = C52154GGw.A00(C243803a8.A00(r14), r1);
        } else {
            str = null;
            imageUrlBase = null;
        }
        HashMap hashMap = this.A03;
        String id = this.A00.getId();
        AnonymousClass0iw r5 = this.A01;
        int A09 = C51969G9p.A09(r14, C244013aV.A03(r14));
        AnonymousClass3XV r0 = 2WX.A02;
        return new C53985GxT(C51974G9v.A0I((2WX) null, C51965G9l.A0c(AnonymousClass05K.A00, 0, C244013aV.A0C(r14, i)), r14, i2).A00(r15), r5, imageUrlBase, str, id, "Unknown", hashMap, i3, A09);
    }

    public final C251263mp A0X(AnonymousClass3Y5 r22) {
        int i;
        1Xj r17;
        1Xj r14;
        1Xj r142;
        AnonymousClass3Y5 r5 = r22;
        0qQ.A0B(r5, 0);
        int A0H = C51971G9r.A0H(A04());
        int i2 = 0;
        int i3 = R.dimen.clips_fullcard_auto_created_reel_video_height;
        if (A0H >= 3) {
            i2 = 1;
            i3 = R.dimen.clips_fullcard_primary_video_height;
            i = R.dimen.ab_test_media_thumbnail_preview_item_width;
        } else {
            i = R.dimen.clips_fullcard_auto_created_reel_video_width;
        }
        List A04 = A04();
        boolean z = false;
        if (A0H >= 3) {
            z = true;
        }
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0I = C51974G9v.A0I((2WX) null, C51965G9l.A0b(AnonymousClass05K.A00, 100.0f, 0), r5, i3);
        2Wb A0Q = C51972G9s.A0Q(r5);
        if (z) {
            2Wb A0w = G9t.A0w(A0Q);
            if (A04 != null) {
                r14 = C51966G9m.A0u(A04, 1);
            } else {
                r14 = null;
            }
            A0w.A00(A00(A0w, AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A09, 0, C244013aV.A0C(A0w, R.dimen.album_preview_add_item_circle_size)), r14, R.dimen.canvas_colour_wheel_offset_y, R.dimen.ai_agent_embodiment_video_container_size, 0));
            if (A04 != null) {
                r142 = C51966G9m.A0u(A04, 2);
            } else {
                r142 = null;
            }
            A0w.A00(A00(A0w, (2WX) null, r142, R.dimen.canvas_colour_wheel_offset_y, R.dimen.ai_agent_embodiment_video_container_size, 2));
            A0Q.A00(C243563Zg.A0A(A0w, A0Q));
        }
        if (A04 != null) {
            r17 = C51966G9m.A0u(A04, 0);
        } else {
            r17 = null;
        }
        return C51967G9n.A0O(A00(A0Q, C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), r17, i, i3, i2), A0Q, r5, A0I);
    }

    private final List A04() {
        List<C276014sL> list;
        C53328GmE A022 = this.A00.A02();
        if (A022 == null || (list = A022.A0F) == null) {
            return null;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C276014sL r0 : list) {
            A0r.add(r0.A00);
        }
        return A0r;
    }

    public C53919GwP(C267324bN r1, AnonymousClass0iw r2, UserSession userSession, HashMap hashMap) {
        C51974G9v.A1L(r2, userSession, hashMap);
        this.A01 = r2;
        this.A02 = userSession;
        this.A00 = r1;
        this.A03 = hashMap;
    }
}
