package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.model.fundraiser.NewFundraiserInfo;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.6Ma  reason: invalid class name and case insensitive filesystem */
public final class C306406Ma {
    public static final C306406Ma A00 = new Object();
    public static final List A01 = 0sr.A1P(new String[]{"1772051206458957", "806120832902363", "176679082882533", "1979937175616497", "309008599532594", "673145442870578", "1208134583542612", "1176093070295937", "855777719310828", "334259729754898", "1659547504846928", "1618009362375836"});
    public static final Matrix A02 = new Matrix();
    public static final RectF A03 = new RectF();

    public static final void A02(View view, float f, float f2, boolean z) {
        0qQ.A0B(view, 0);
        C306416Mb r3 = new C306416Mb(view, f, f2, z);
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            0wj.A01.AEf("ReelInteractiveUtil", 817897142).report();
            0nA.A0o(view, new C306426Mc(view), r3);
            return;
        }
        r3.run();
    }

    public static final void A03(View view, View view2, C255783ui r7, Integer num, 0eP r9, float f, int i, int i2) {
        0qQ.A0B(view, 0);
        0qQ.A0B(r7, 1);
        0qQ.A0B(view2, 7);
        Rect rect = new Rect();
        C306746Ni.A01(rect, r7, f, i, i2);
        AnonymousClass6SJ r3 = new AnonymousClass6SJ(rect, view, view2, r7, num, r9);
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            0f9 AEf = 0wj.A01.AEf("ReelInteractiveUtil", 817897142);
            AEf.ABQ("interactive_type", r7.A11.name());
            AEf.report();
            0nA.A0o(view, new C11540Sc1(view), r3);
            return;
        }
        r3.run();
    }

    public static /* synthetic */ void A04(View view, C255783ui r6, float f, int i, int i2, boolean z) {
        Integer num;
        0eP r4 = new 0eP(0, 0);
        View view2 = view;
        0qQ.A0B(view, 0);
        if (z) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0Y;
        }
        A03(view2, view2, r6, num, r4, f, i, i2);
    }

    public static final boolean A0A(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        Drawable A0B = A00.A0B(drawable);
        if ((A0B instanceof C389529pm) || (A0B instanceof C16149Upa) || (A0B instanceof C16145UpW) || (A0B instanceof C59812JZg) || (A0B instanceof U1R)) {
            return true;
        }
        return false;
    }

    public final Drawable A0B(Drawable drawable) {
        Drawable AfT;
        0qQ.A0B(drawable, 0);
        if (drawable instanceof C347017w8) {
            AfT = ((C347017w8) drawable).A04();
            0qQ.A07(AfT);
        } else if (!(drawable instanceof AnonymousClass5MI)) {
            return drawable;
        } else {
            AfT = ((AnonymousClass5MI) drawable).AfT();
        }
        return A0B(AfT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (X.182.A06(r2, r3, 36320992234251266L) != false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(com.instagram.common.session.UserSession r3, com.instagram.music.common.model.MusicOverlayStickerModel r4, X.C255783ui r5, java.lang.String r6, java.lang.String r7) {
        /*
            X.3WT r0 = X.AnonymousClass3WT.MUSIC_OVERLAY
            r5.A11 = r0
            r5.A0u = r4
            if (r7 == 0) goto L_0x000a
            r5.A1k = r7
        L_0x000a:
            if (r6 == 0) goto L_0x0042
            r5.A1g = r6
            X.6KJ r0 = X.AnonymousClass6KJ.MUSIC_OVERLAY_SIMPLE
            java.lang.String r0 = r0.A02
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0022
            X.6KJ r0 = X.AnonymousClass6KJ.MUSIC_OVERLAY_ALBUM_ART
            java.lang.String r0 = r0.A02
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0042
        L_0x0022:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323229912017934(0x810bc900002c0e, double:3.034295086042644E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x003b
            r0 = 36320992234251266(0x8109c000032402, double:3.032879969612598E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x003c
        L_0x003b:
            r0 = 1
        L_0x003c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A1I = r0
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C306406Ma.A05(com.instagram.common.session.UserSession, com.instagram.music.common.model.MusicOverlayStickerModel, X.3ui, java.lang.String, java.lang.String):void");
    }

    public static final void A06(AnonymousClass91P r2, C255783ui r3) {
        if (r2 instanceof AnonymousClass91O) {
            A09(r3, ((AnonymousClass91O) r2).A00, "mention_username");
        } else if (r2 instanceof C15915Ukf) {
            A08(((C15915Ukf) r2).A00, r3, (String) null, false);
        } else {
            throw new UnsupportedOperationException("Unknown tag type");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.DDv] */
    public static final void A07(NewFundraiserInfo newFundraiserInfo, C255783ui r6, String str, String str2) {
        r6.A11 = AnonymousClass3WT.BLOKS_TAPPABLE;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str != null) {
            hashMap.put("fundraiser_id", str);
        }
        if (newFundraiserInfo != null) {
            hashMap2.put(AnonymousClass000.A00(713), C64130LPe.A00(newFundraiserInfo));
        }
        if (str2 != null) {
            hashMap.put("source", str2);
        }
        ? obj = new Object();
        obj.A0A = new HashMap();
        obj.A0B = new HashMap();
        obj.A0C = new HashMap();
        obj.A09 = "standalone_fundraiser_sticker_id";
        obj.A0B = hashMap;
        obj.A0C = hashMap2;
        r6.A1F = obj;
    }

    public static final void A08(Hashtag hashtag, C255783ui r2, String str, boolean z) {
        if (!r2.A1t) {
            r2.A1k = "hashtag_text";
        }
        r2.A11 = AnonymousClass3WT.HASHTAG;
        r2.A0k = hashtag.FEY();
        r2.A1N = str;
        r2.A1u = z;
    }

    public static final void A09(C255783ui r1, User user, String str) {
        if (!r1.A1t) {
            r1.A1k = "mention_text";
        }
        r1.A11 = AnonymousClass3WT.MENTION;
        r1.A1B = user;
        r1.A1g = str;
    }

    public static final C255783ui A00(AnonymousClass91P r9, C306386Ly r10, InteractiveDrawableContainer interactiveDrawableContainer, C369458un r12) {
        int width = interactiveDrawableContainer.getWidth();
        int height = interactiveDrawableContainer.getHeight();
        int i = -AnonymousClass6M0.A00(r10.A0G);
        RectF rectF = A03;
        0qQ.A0B(rectF, 0);
        rectF.set(r9.A00);
        Rect bounds = r10.getBounds();
        0qQ.A07(bounds);
        rectF.offset(((float) bounds.left) + r10.A00, ((float) bounds.top) + r10.A01);
        float f = (float) width;
        float f2 = (float) height;
        float height2 = (rectF.height() * r12.A06) / f2;
        Matrix matrix = A02;
        matrix.set(r12.A0E);
        matrix.preTranslate((float) i, 0.0f);
        matrix.mapRect(rectF);
        float centerY = rectF.centerY() / f2;
        C255783ui r2 = new C255783ui();
        r2.A03 = rectF.centerX() / f;
        r2.A04 = centerY;
        r2.A09 = (r12.A09 * 1000000) + r12.A0B;
        r2.A02 = (rectF.width() * r12.A06) / f;
        r2.A00 = height2;
        r2.A01 = r12.A05 / 360.0f;
        A06(r9, r2);
        return r2;
    }

    public static final void A01(Drawable drawable, C255783ui r11, InteractiveDrawableContainer interactiveDrawableContainer, C369458un r13, boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int width = interactiveDrawableContainer.getWidth();
        int height = interactiveDrawableContainer.getHeight();
        if (drawable instanceof C41795B1a) {
            Rect BIJ = ((C41795B1a) drawable).BIJ();
            f = (float) BIJ.width();
            f2 = (float) BIJ.height();
            float[] fArr = {r13.A01 + BIJ.exactCenterX(), r13.A02 + BIJ.exactCenterY()};
            Matrix matrix = new Matrix();
            float f6 = r13.A06;
            matrix.postScale(f6, f6, r13.A03, r13.A04);
            matrix.postRotate(r13.A05, r13.A03, r13.A04);
            matrix.mapPoints(fArr);
            f3 = fArr[0];
            f4 = fArr[1];
        } else {
            f = (float) r13.A0A;
            f2 = (float) r13.A07;
            f3 = r13.A03;
            f4 = r13.A04;
        }
        if (!z2) {
            f5 = r13.A06;
        } else {
            f5 = 1.0f;
        }
        float f7 = (float) width;
        float f8 = (f * f5) / f7;
        float f9 = f2 * f5;
        float f10 = (float) height;
        r11.A03 = f3 / f7;
        r11.A04 = f4 / f10;
        r11.A09 = (r13.A09 * 1000000) + r13.A0B;
        r11.A02 = f8;
        r11.A00 = f9 / f10;
        r11.A01 = r13.A05 / 360.0f;
        r11.A1t = z;
    }
}
