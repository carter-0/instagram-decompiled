package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.reels.Reel;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.5qj  reason: invalid class name and case insensitive filesystem */
public final class C296845qj {
    public float A00;
    public C254043rq A01;
    public final UserSession A02;
    public final AnonymousClass3W1 A03;
    public final AnonymousClass2xS A04;
    public final C17837Vgq A05;
    public final C293255kQ A06;
    public final C230272pJ A07;
    public final C313216g4 A08;
    public final Map A09 = new LinkedHashMap();
    public final Map A0A = new LinkedHashMap();
    public final Map A0B = new LinkedHashMap();
    public final C262224Cq A0C;

    public C296845qj(UserSession userSession, AnonymousClass3W1 r5, AnonymousClass2xS r6, C17837Vgq vgq, C293255kQ r8, C230272pJ r9) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r9, 4);
        0qQ.A0B(r8, 5);
        this.A02 = userSession;
        this.A03 = r5;
        this.A04 = r6;
        this.A07 = r9;
        this.A06 = r8;
        this.A05 = vgq;
        this.A08 = new C313216g4(userSession, AnonymousClass3BQ.IN_FEED_STORIES_TRAY, new C19823Wg4(this));
        this.A0C = 19E.A02(AnonymousClass12T.A00.A04);
    }

    public static final Object A00(AnonymousClass0iw r12, AnonymousClass3W1 r13, Reel reel, C255773uh r15, AnonymousClass3BT r16, C254043rq r17, C296845qj r18, C263414Lx r19, AnonymousClass4D7 r20, boolean z) {
        1IW r4;
        long j;
        C255773uh r6 = r15;
        1Xj r10 = r15.A0b;
        if (r10 != null) {
            C296845qj r5 = r18;
            r5.A00 = 0.0f;
            boolean A6W = r10.A6W(r5.A02);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = 1IW.A02;
            AnonymousClass4D7 A022 = 1Ey.A02(r20);
            C254043rq r11 = r17;
            if (A6W) {
                r4 = new 1IW(1, A022);
                r4.A0I();
                String id = r10.getId();
                if (id == null) {
                    r4.AG9((Throwable) null);
                } else {
                    IgImageView igImageView = r11.A01;
                    ExtendedImageUrl A1m = r10.A1m(igImageView.getWidth());
                    if (A1m != null) {
                        igImageView.setVisibility(0);
                        igImageView.setUrl(A1m, r12);
                    }
                    AnonymousClass2xS r9 = r5.A04;
                    r9.A0B(r10, new WXG(reel, r6, r5));
                    r9.A0K.put(id, new AnonymousClass5MN(r11, r5));
                    r9.A0J.put(id, new VWK(r5, id, r4));
                    r9.A0A(r10, r11, r13, r19, z, true);
                }
            } else {
                r4 = new 1IW(1, A022);
                r4.A0I();
                C313216g4 r7 = r5.A08;
                r7.A02();
                IgImageView igImageView2 = r11.A01;
                ExtendedImageUrl A1m2 = r10.A1m(igImageView2.getWidth());
                if (A1m2 != null) {
                    igImageView2.setVisibility(0);
                    igImageView2.setUrl(A1m2, r12);
                }
                AnonymousClass3BT r102 = r16;
                Integer num = r102.A03.A0g;
                if (num != null) {
                    j = TimeUnit.SECONDS.toMillis((long) num.intValue());
                } else {
                    j = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                }
                r5.A0A.put(r15, new C74186PqS(4, (Object) r5, (Object) r11));
                r5.A0B.put(r15, new C20704Wxb(0, r5, r102, r15));
                r5.A09.put(r15, new C20704Wxb(1, r5, r15, r4));
                r7.A04(r15, j);
            }
            Object A0E = r4.A0E();
            1Hj r0 = 1Hj.A02;
            if (A0E != r0) {
                A0E = C60340gF.A00;
            }
            if (A0E == r0) {
                return A0E;
            }
        }
        return C60340gF.A00;
    }
}
