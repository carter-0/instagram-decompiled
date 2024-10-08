package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2zq  reason: invalid class name and case insensitive filesystem */
public final class C235392zq extends C234532y8 {
    public final AnonymousClass306 A00;
    public final AnonymousClass301 A01;
    public final AnonymousClass303 A02;
    public final AnonymousClass309 A03;
    public final AnonymousClass30A A04;
    public final AnonymousClass308 A05;
    public final AnonymousClass305 A06;
    public final AnonymousClass304 A07;
    public final C235452zx A08;
    public final C235472zz A09;
    public final AnonymousClass307 A0A;
    public final C235402zr A0B;
    public final AnonymousClass302 A0C;
    public final C235462zy A0D;
    public final AnonymousClass300 A0E;
    public final Map A0F;

    public final void Csj(C2354830a r2, 1Xj r3, AnonymousClass3W1 r4) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        if (r3.CcK()) {
            r2.A00(this.A0C);
        }
    }

    public final void Csk(C2354830a r2, 1Xj r3, AnonymousClass3W1 r4, int i) {
        C250603lj r0;
        0qQ.A0B(r2, 1);
        0qQ.A0B(r3, 2);
        if (r3.CcK()) {
            if (i == C231592rv.MEDIA_HEADER.ordinal() || i == C231592rv.LITHO_MEDIA_HEADER.ordinal()) {
                r0 = this.A0B;
            } else if (i == C231592rv.GAP.ordinal()) {
                r0 = this.A0D;
            } else if (i == C231592rv.AD_CTA.ordinal() || i == C231592rv.LITHO_AD_CTA.ordinal()) {
                r0 = this.A09;
            } else if (i == C231592rv.MEDIA_UFI.ordinal() || i == C231592rv.LITHO_MEDIA_UFI.ordinal()) {
                r0 = this.A0E;
            } else if (i == C231592rv.BRANDED_CONTENT_LABEL.ordinal()) {
                r0 = this.A08;
            } else if (i == C231592rv.MEDIA_FEEDBACK.ordinal()) {
                r0 = this.A0A;
            } else {
                return;
            }
            r2.A00(r0);
        }
    }

    public final void Dcw(View view, int i, Object obj, Object obj2) {
        C235412zs r0;
        int i2;
        Map map;
        int i3;
        int i4;
        0qQ.A0B(view, 0);
        0qQ.A0B(obj, 2);
        if (obj instanceof 1Xj) {
            1Xj r11 = (1Xj) obj;
            if (r11.CcK()) {
                if (i == C231592rv.MEDIA_COMMENT.ordinal()) {
                    r0 = this.A01;
                } else if (i == C231592rv.MEDIA_HEADER.ordinal() || i == C231592rv.LITHO_MEDIA_HEADER.ordinal()) {
                    r0 = this.A0B;
                } else if (i == C231592rv.COLLECTION_TOP_WITH_BOTTOM_THREE_CONTENT.ordinal()) {
                    AnonymousClass305 r2 = this.A06;
                    IgProgressImageView A002 = AnonymousClass305.A00(view, R.id.collection_thumbnail_1);
                    IgProgressImageView A003 = AnonymousClass305.A00(view, R.id.collection_thumbnail_2);
                    IgProgressImageView A004 = AnonymousClass305.A00(view, R.id.collection_thumbnail_3);
                    IgProgressImageView A005 = AnonymousClass305.A00(view, R.id.collection_thumbnail_4);
                    IgProgressImageView A006 = AnonymousClass305.A00(view, R.id.collection_thumbnail_5);
                    IgProgressImageView A007 = AnonymousClass305.A00(view, R.id.collection_thumbnail_6);
                    if (AnonymousClass305.A01(A002)) {
                        map = r2.A00;
                        i2 = R.id.collection_thumbnail_1;
                    } else {
                        i2 = R.id.collection_thumbnail_7;
                        A002 = AnonymousClass305.A00(view, R.id.collection_thumbnail_7);
                        map = r2.A00;
                    }
                    map.put(Integer.valueOf(i2), A002);
                    if (AnonymousClass305.A01(A003)) {
                        i3 = R.id.collection_thumbnail_2;
                    } else {
                        i3 = R.id.collection_thumbnail_8;
                        A003 = AnonymousClass305.A00(view, R.id.collection_thumbnail_8);
                    }
                    map.put(Integer.valueOf(i3), A003);
                    if (AnonymousClass305.A01(A004)) {
                        i4 = R.id.collection_thumbnail_3;
                    } else {
                        i4 = R.id.collection_thumbnail_9;
                        A004 = AnonymousClass305.A00(view, R.id.collection_thumbnail_9);
                    }
                    map.put(Integer.valueOf(i4), A004);
                    if (AnonymousClass305.A01(A005)) {
                        map.put(Integer.valueOf(R.id.collection_thumbnail_4), A005);
                    }
                    if (AnonymousClass305.A01(A006)) {
                        map.put(Integer.valueOf(R.id.collection_thumbnail_5), A006);
                    }
                    if (AnonymousClass305.A01(A007)) {
                        map.put(Integer.valueOf(R.id.collection_thumbnail_6), A007);
                        return;
                    }
                    return;
                } else if (i == C231592rv.MEDIA_CONTENT_SERVER_RENDERED.ordinal()) {
                    this.A02.A03(view, r11);
                    this.A03.A03(view, r11);
                    r0 = this.A04;
                } else if (i == C231592rv.LITHO_MEDIA_CONTENT.ordinal() || i == C231592rv.MEDIA_CONTENT.ordinal() || i == C231592rv.CAROUSEL_CONTENT.ordinal()) {
                    this.A02.A03(view, r11);
                    this.A05.A03(view, r11);
                    this.A07.A03(view, r11);
                    r0 = this.A00;
                } else if (i == C231592rv.MEDIA_FEEDBACK.ordinal()) {
                    r0 = this.A0A;
                } else {
                    return;
                }
                r0.A03(view, r11);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.2zx, X.2zt] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.2zy, X.2zt] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.2zz, X.2zt] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.300, X.2zt] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.2zs, X.306] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.2zs, X.307] */
    /* JADX WARNING: type inference failed for: r0v14, types: [X.30A, X.2zs] */
    public C235392zq(Context context, UserSession userSession, AnonymousClass4DU r5) {
        HashMap hashMap = new HashMap();
        this.A0F = hashMap;
        this.A0B = new C235402zr(userSession, hashMap);
        this.A08 = new C235422zt(hashMap);
        this.A0D = new C235422zt(hashMap);
        this.A09 = new C235422zt(hashMap);
        this.A0E = new C235422zt(hashMap);
        this.A01 = new AnonymousClass301(userSession, hashMap);
        this.A0C = new AnonymousClass302(context, userSession, r5, hashMap);
        this.A02 = new AnonymousClass303(userSession, hashMap);
        this.A07 = new AnonymousClass304(userSession, hashMap);
        this.A06 = new AnonymousClass305(hashMap);
        this.A00 = new C235412zs(hashMap);
        this.A0A = new C235412zs(hashMap);
        this.A05 = new AnonymousClass308(r5, userSession, hashMap);
        this.A03 = new AnonymousClass309(userSession, hashMap);
        this.A04 = new C235412zs(hashMap);
    }
}
