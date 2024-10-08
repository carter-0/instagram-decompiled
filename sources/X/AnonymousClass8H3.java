package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: X.8H3  reason: invalid class name */
public final class AnonymousClass8H3 implements C3493580b {
    public Drawable A00;
    public Drawable A01;
    public C356738Va A02;
    public C365798nh A03;
    public final float A04;
    public final float A05;
    public final Activity A06;
    public final UserSession A07;
    public final C357638Yz A08;
    public final AnonymousClass8BA A09;
    public final TargetViewSizeProvider A0A;
    public final AnonymousClass8H4 A0B = new AnonymousClass8H4(this);
    public final AnonymousClass80U A0C;
    public final AnonymousClass3BK A0D;
    public final C3510387i A0E;
    public final InteractiveDrawableContainer A0F;

    public AnonymousClass8H3(C357638Yz r3, C3510387i r4, AnonymousClass8BA r5, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass80D r7, AnonymousClass80U r8, InteractiveDrawableContainer interactiveDrawableContainer) {
        0qQ.A0B(interactiveDrawableContainer, 4);
        0qQ.A0B(r3, 5);
        0qQ.A0B(targetViewSizeProvider, 7);
        this.A09 = r5;
        this.A0E = r4;
        this.A0F = interactiveDrawableContainer;
        this.A08 = r3;
        this.A0C = r8;
        this.A0A = targetViewSizeProvider;
        UserSession userSession = r7.A0S;
        this.A07 = userSession;
        Activity activity = r7.A05;
        this.A06 = activity;
        0qQ.A07(userSession);
        this.A0D = AnonymousClass3BJ.A00(userSession);
        0qQ.A07(activity);
        float A002 = 0nA.A00(activity, 296.0f);
        this.A05 = A002;
        this.A04 = A002 / 2.0f;
    }

    private final C310416b1 A00(boolean z) {
        C39890ADo aDo = new C39890ADo();
        aDo.A0Q = false;
        aDo.A05 = z ? 1 : 0;
        aDo.A0I = false;
        aDo.A04 = 0.7f;
        aDo.A00 = 1.5f;
        aDo.A01 = 0.25f;
        aDo.A0P = true;
        aDo.A0N = true;
        int i = (int) (this.A05 * 0.7f);
        aDo.A06 = new C16336Ut6(new Rect(0, 0, i, i));
        aDo.A01(0.0f, this.A06.getResources().getDimension(R.dimen.abc_dialog_padding_top_material));
        if (z) {
            aDo.A08 = this.A0E;
        }
        return new C310416b1(aDo);
    }

    private final void A01(C365798nh r23) {
        C365798nh r2 = r23;
        if (r2.A05.ordinal() != 0) {
            C349307zv r22 = r2.A03;
            if (r22 != null) {
                try {
                    UserSession userSession = this.A07;
                    0qQ.A06(userSession);
                    Medium A032 = C282665Eg.A03(new File(r22.A0k), 3, 0);
                    C391149sQ r7 = C391149sQ.ROLL_CALL_STORIES;
                    int i = (int) this.A05;
                    float f = this.A04;
                    AnonymousClass9X8 r3 = new AnonymousClass9X8(new C376429Hy(1, f, f, f, f), A032, userSession, r7, C391099sL.NOT_CLIPS, "rollcall_v2_video_sticker", 0.0f, i, i, -1, AnonymousClass972.MUTABLE_FLAG_MASK, false);
                    AnonymousClass8BA r5 = this.A09;
                    ArrayList A1M = 0sr.A1M(new String[]{"rollcall_v2_video_sticker"});
                    AnonymousClass9X8 r6 = r3;
                    r5.A0f(r6, AnonymousClass57C.ASSET_PICKER, A00(true), "rollcall_v2_video_sticker", A1M);
                    this.A00 = r3;
                } catch (IllegalArgumentException e) {
                    0kD.A0E("RollCallCaptureController", "Error creating video sticker for video Roll Call.", e);
                }
            }
        } else {
            C352218Cl r32 = r2.A02;
            if (r32 != null) {
                String A062 = r32.A06();
                int i2 = (int) this.A05;
                Bitmap A0G = 1MF.A0G(A062, i2, i2, i2, i2, r32.A07, r32.A13);
                if (A0G != null) {
                    Activity activity = this.A06;
                    0qQ.A06(activity);
                    File file = new File(r32.A06());
                    0qQ.A0B(file, 0);
                    C369908vW r52 = new C369908vW(activity, A0G, C282665Eg.A03(file, 1, 0), (ImageUrl) null, C354668Mx.ROLL_CALL, (Integer) null, i2, i2, true, false, false, false);
                    AnonymousClass8BA r4 = this.A09;
                    ArrayList A1M2 = 0sr.A1M(new String[]{"rollcall_v2_photo_sticker"});
                    r4.A0f(r52, AnonymousClass57C.ASSET_PICKER, A00(false), "rollcall_v2_photo_sticker", A1M2);
                    this.A00 = r52;
                }
            }
        }
    }

    public static final void A02(C365798nh r34, AnonymousClass8H3 r35) {
        C349307zv r2;
        Integer num;
        AnonymousClass8H3 r1 = r35;
        AnonymousClass80U r22 = r1.A0C;
        C365798nh r4 = r34;
        if (r22.CQ0(AnonymousClass80V.ROLL_CALL_SEQUENTIAL_CAPTURE)) {
            C365798nh r3 = r1.A03;
            if (r3 != null) {
                C365758nd r23 = r3.A05;
                if (r23 == C365758nd.A04) {
                    C352218Cl r24 = r3.A02;
                    if (r24 != null) {
                        r24.A16 = true;
                    }
                } else if (r23 == C365758nd.A07 && (r2 = r3.A03) != null) {
                    r2.A1E = true;
                }
                C356738Va r0 = r1.A02;
                if (r0 != null) {
                    r0.A00.A00(r3);
                }
                r1.A01(r4);
                AnonymousClass3BK r25 = r1.A0D;
                Long l = r25.A00;
                if (l != null) {
                    if (((Number) r25.A05.invoke()).longValue() > l.longValue()) {
                        num = AnonymousClass05K.A0N;
                        Activity activity = r1.A06;
                        0qQ.A06(activity);
                        0qQ.A06(r1.A07);
                        Activity activity2 = activity;
                        C369708vC r32 = new C369708vC(activity2, num, ((NineSixteenLayoutConfigImpl) r1.A0A).A0K.getWidth(), new Date().getTime());
                        AnonymousClass8BA r33 = r1.A09;
                        ArrayList A1M = 0sr.A1M(new String[]{"rollcall_v2_timestamp_sticker"});
                        AnonymousClass8BA r30 = r33;
                        C369708vC r31 = r32;
                        r30.A0f(r31, AnonymousClass57C.ASSET_PICKER, new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 10, false, false, true, false, true, false, false, true, true, true, true, false, false, false), "rollcall_v2_timestamp_sticker", A1M);
                        r1.A01 = r32;
                        return;
                    }
                }
                num = AnonymousClass05K.A0C;
                Activity activity3 = r1.A06;
                0qQ.A06(activity3);
                0qQ.A06(r1.A07);
                Activity activity22 = activity3;
                C369708vC r322 = new C369708vC(activity22, num, ((NineSixteenLayoutConfigImpl) r1.A0A).A0K.getWidth(), new Date().getTime());
                AnonymousClass8BA r332 = r1.A09;
                ArrayList A1M2 = 0sr.A1M(new String[]{"rollcall_v2_timestamp_sticker"});
                AnonymousClass8BA r302 = r332;
                C369708vC r312 = r322;
                r302.A0f(r312, AnonymousClass57C.ASSET_PICKER, new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 10, false, false, true, false, true, false, false, true, true, true, true, false, false, false), "rollcall_v2_timestamp_sticker", A1M2);
                r1.A01 = r322;
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        r1.A03 = r4;
        r22.E3H(new Object());
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        C352218Cl r0;
        Bitmap bitmap;
        BackgroundGradientColors A002;
        if (obj3 instanceof AnonymousClass8V7) {
            C365798nh r3 = this.A03;
            if (r3 != null) {
                A01(r3);
                File file = null;
                if (r3.A05.ordinal() != 0) {
                    C349307zv r02 = r3.A03;
                    if (r02 != null) {
                        file = new File(r02.A0k);
                    }
                    A002 = C39581A0x.A00(this.A07, file, true);
                } else {
                    C352218Cl r03 = r3.A02;
                    if (r03 != null) {
                        file = r03.A03();
                    }
                    A002 = C39581A0x.A00(this.A07, file, false);
                }
                Activity activity = this.A06;
                0qQ.A06(activity);
                LTL.A05(activity, new AZ8(this), 2RR.A01(), 0.2f, A002.A01, A002.A00, false);
            }
        } else if ((obj3 instanceof AnonymousClass8SD) && obj == AnonymousClass80V.ROLL_CALL_SEQUENTIAL_CAPTURE) {
            C365798nh r04 = this.A03;
            if (!(r04 == null || (r0 = r04.A02) == null || (bitmap = r0.A0C) == null)) {
                bitmap.recycle();
            }
            this.A03 = null;
        }
    }
}
