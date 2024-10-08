package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/* renamed from: X.9mL  reason: invalid class name and case insensitive filesystem */
public final class C387519mL extends AA8 {
    public C317876nz A00;
    public List A01 = AnonymousClass7TE.A1C();
    public boolean A02 = false;
    public final Context A03;
    public final Bitmap A04;
    public final UserSession A05;
    public final C3510387i A06;
    public final TargetViewSizeProvider A07;
    public final AnonymousClass87H A08;
    public final C40268AYh A09;

    public static C352218Cl A00(Context context, Bitmap bitmap, TargetViewSizeProvider targetViewSizeProvider) {
        FileOutputStream fileOutputStream;
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        Bitmap bitmap2 = bitmap;
        if (bitmap == null) {
            return null;
        }
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider2).A0K;
        Bitmap createBitmap = Bitmap.createBitmap(r0.getWidth(), r0.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        BackgroundGradientColors A012 = 0oT.A01(bitmap2, AnonymousClass05K.A00);
        int[] iArr = {A012.A01, A012.A00};
        0v6 A013 = 0oY.A01(A012, 0);
        Paint A0V = AnonymousClass7TE.A0V(4);
        A0V.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (float) createBitmap.getHeight(), iArr, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawPaint(A0V);
        Context context2 = context;
        File A042 = 0mb.A04(context2);
        try {
            fileOutputStream = new FileOutputStream(A042.getPath());
            JZK.A00(Bitmap.CompressFormat.JPEG, createBitmap, fileOutputStream);
            long currentTimeMillis = System.currentTimeMillis();
            C352218Cl r13 = new C352218Cl(A042, createBitmap.getWidth(), createBitmap.getHeight(), currentTimeMillis, currentTimeMillis, false);
            r13.A0I = A013;
            fileOutputStream.close();
            return r13;
        } catch (IOException unused) {
            C59689JTv.A0A(context2, "output_stream_failed");
            return null;
        } catch (Throwable th) {
            C9153RRe.A00(th, th);
        }
        throw th;
    }

    public static void A01(C387519mL r38) {
        C387519mL r4 = r38;
        C317876nz r2 = r4.A00;
        if (r2 != null) {
            C347017w8 A012 = C347017w8.A01(r4.A03, r4.A05, r2);
            r4.A08.A0B(A012, AnonymousClass57C.STORY_ATTRIBUTION, r2, new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.5f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A01, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 7, false, false, true, true, false, false, true, true, true, true, true, true, false, false), false, false);
            return;
        }
        C379979Wb r3 = new C379979Wb(r4.A03);
        r4.A08.A0C(r3, new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.22f, 0.88f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 7, false, false, true, true, false, false, true, true, true, true, true, true, false, false), false);
    }

    public static void A02(C387519mL r9, 1Xj r10) {
        if (r9.A00 != null) {
            C317876nz r4 = C317876nz.A17;
            r9.A08.A0C(C369468uo.A0F.A01(r9.A03, r9.A05, r4, (String) null, (String) null, r10.A1A() * 1000), C39906AIv.A00(), false);
        }
    }

    public C387519mL(Context context, UserSession userSession, C3510387i r6, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass87H r8) {
        this.A03 = context;
        this.A06 = r6;
        this.A08 = r8;
        this.A05 = userSession;
        this.A07 = targetViewSizeProvider;
        this.A09 = (C40268AYh) userSession.A01(C40268AYh.class, new C41399AtL(userSession, 0));
        AnonymousClass81W r0 = ((NineSixteenLayoutConfigImpl) targetViewSizeProvider).A0K;
        this.A04 = Bitmap.createBitmap(r0.getWidth(), r0.getHeight(), Bitmap.Config.RGB_565);
    }

    public static void A03(C387519mL r13, List list, int i) {
        int i2 = i;
        if (i == list.size()) {
            AnonymousClass87H r3 = r13.A08;
            List list2 = r13.A01;
            C3509386y r1 = r3.A00;
            r1.A01.A00();
            A01(r13);
            r3.A0G(r1.A01.A01.A08(), list2);
            return;
        }
        1Xj r15 = (1Xj) list.get(i);
        Context context = r13.A03;
        C290815g0 r0 = new C290815g0(new C13155TNn(context, r13.A05, C59730JVo.A05(context, r15, "CanvasBirthdayHighlightsController", false, false), r15.A0y(), r15.A0x(), -1, false), 483);
        r0.A00 = new C385869jf(i2, 1, r13, list, r15);
        1ES.A03(r0);
    }
}
