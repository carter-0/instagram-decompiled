package X;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.MusicInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.meta.foa.cds.CdsBottomSheetDimmingBehaviour;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.G9y  reason: case insensitive filesystem */
public abstract class C51976G9y {
    public static Bitmap A06(List list) {
        Object obj = list.get(0);
        0qQ.A0C(obj, "null cannot be cast to non-null type com.aiplatform.inputs.AiInputBitmap");
        Bitmap bitmap = ((XH4) obj).A00;
        Bitmap A00 = 0fO.A00(bitmap, (int) (((double) bitmap.getWidth()) * 0.5d), (int) (((double) bitmap.getHeight()) * 0.5d), true);
        0qQ.A07(A00);
        return A00;
    }

    public static View A08(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 1);
        View childAt = viewGroup.getChildAt(0);
        0qQ.A0C(childAt, "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.IgImageView");
        return childAt;
    }

    public static Object A0J(C286575Wy r2, Object obj, Object obj2, boolean z) {
        if (obj != obj2) {
            return obj;
        }
        C52882GeI geI = new C52882GeI(false);
        geI.A00(Boolean.valueOf(z));
        r2.FLL(geI);
        return geI;
    }

    public static String A0L(C233202vF r9, C251373n0 r10) {
        0qQ.A0B(r10, 0);
        AnonymousClass3OA r1 = (AnonymousClass3OA) r10.BTb();
        return 002.A17("ad_id: [", r1.A0S, "] tracking_token: [", r1.A0j, "] media_id: [", r1.A0K.getId(), "] ad_client_delivery_session_id: [", r9.A00, ']');
    }

    public static Set A0N(28D r2) {
        if (LKV.A01(r2)) {
            return 0sc.A06(new C279284yO[]{C3494080g.A00});
        }
        return null;
    }

    public static void A0O(Bitmap bitmap, Canvas canvas, Paint paint, Rect rect) {
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawCircle((float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2), (float) (bitmap.getWidth() / 2), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
    }

    public static void A0P(Rect rect, View view, int i, int i2) {
        03v.A0H(view, 0sr.A1P(new Rect[]{rect, new Rect(view.getWidth() - i, 0, view.getWidth(), i2)}));
    }

    public static void A0V(0Aj r2, 0bb r3) {
        r3.A06("search_session_id", (String) null);
        r3.A06("serp_session_id", (String) null);
        r3.A06("query_text", (String) null);
        r3.A06("rank_token", (String) null);
        r2.AAK(r3, "search_context");
    }

    public static void A0c(1Ln r3, AnonymousClass0iw r4, 0jB r5, String str) {
        r3.A0R("radio_type", (String) r5.A01(C271774jZ.A6o));
        r3.A0O("production_build", true);
        r3.A0R("source_of_action", r4.getModuleName());
        r3.A0R("viewer_session_id", (String) r5.A01(C271774jZ.A9i));
        r3.A0u(String.valueOf(AnonymousClass1QI.A00.A02.A00));
        r3.A0R("app_version", str);
    }

    public static Intent A03(Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.VIEW").setData(uri).setPackage(str);
        0qQ.A07(intent);
        return intent;
    }

    public static Intent A04(C267324bN r3) {
        Intent intent = new Intent();
        intent.putExtra("media_id", r3.getId());
        intent.putExtra("media_type", "REEL");
        return intent;
    }

    public static ExtractedText A09(C285975Tl r5) {
        ExtractedText extractedText = new ExtractedText();
        String str = r5.A01.A00;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = r5.A00;
        extractedText.selectionStart = C285965Tk.A01(j);
        extractedText.selectionEnd = C285965Tk.A00(j);
        extractedText.flags = 00l.A0X(str, 10) ^ true ? 1 : 0;
        return extractedText;
    }

    public static C287965b7 A0A() {
        return new C287965b7(new C289165d8(1 | (1 << 32)), 1.0f, 400.0f);
    }

    public static AnonymousClass5RD A0D(C286575Wy r4, int i) {
        int i2 = (i & 14) >> 3;
        return C291495hO.A02(C287275Zs.A07, r4, C287215Zl.A02, (i2 & 112) | (i2 & 14));
    }

    public static MusicInfo A0F(AnonymousClass3ZH r2) {
        AnonymousClass1dn musicMetadata;
        AnonymousClass3ZG r22 = r2.A00;
        if (r22.getClipsMetadata() != null) {
            C67231sQ clipsMetadata = r22.getClipsMetadata();
            if (clipsMetadata != null) {
                return clipsMetadata.BUr();
            }
            return null;
        } else if (r22.getMusicMetadata() == null || (musicMetadata = r22.getMusicMetadata()) == null) {
            return null;
        } else {
            return musicMetadata.BUr();
        }
    }

    public static ImageUrl A0G(C286575Wy r2) {
        return AnonymousClass0t1.A01.A01((UserSession) r2.AJO(C286955Yl.A00)).Bh3();
    }

    public static FA0 A0H() {
        C46626Di6 di6 = C46626Di6.FLEXIBLE_SHEET;
        Integer num = AnonymousClass05K.A0C;
        C46627Di7 di7 = C46471DfZ.A0S;
        EX7 ex7 = C46471DfZ.A0O;
        EX6 ex6 = C46471DfZ.A0R;
        return new FA0(CdsBottomSheetDimmingBehaviour.Default.A00, (CdsBottomSheetTopSpan) null, ex7, (CdsOpenScreenConfig$BottomSheetMargins) null, EX5.SAME_SIZE, ex6, di7, di6, (C55548HjU) null, num, (Integer) null, false);
    }

    public static String A0K(0bb r1, JSM jsm, String str) {
        r1.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
        String Bxi = jsm.Bxi();
        if (0qQ.A0K(Bxi, "USER_ENGAGED")) {
            return "USER_ENGAGED";
        }
        if (!0qQ.A0K(Bxi, "PERSONALIZED_TRENDING")) {
            return "UNKNOWN";
        }
        return "PERSONALIZED_TRENDING";
    }

    public static Iterator A0M(CharSequence charSequence) {
        return 00k.A0Y(C242173Sx.A07(C242173Sx.A0E(J5Z.A00, C242173Sx.A09(J5Y.A00, new 11S("@\\[\\d+:(.+?)]").A04(charSequence))))).iterator();
    }

    public static void A0Q(RectF rectF, View view, float f, float f2) {
        float f3 = f2 / 2.0f;
        rectF.set((((float) view.getWidth()) / 2.0f) - f, ((float) view.getHeight()) - f3, (((float) view.getWidth()) / 2.0f) + f, ((float) view.getHeight()) + f3);
    }

    public static void A0R(ViewPropertyAnimator viewPropertyAnimator) {
        viewPropertyAnimator.setDuration(400).setInterpolator(new DecelerateInterpolator()).start();
    }

    public static void A0S(Interpolator interpolator, AnonymousClass4Ey r2, C246053du r3, float f, int i) {
        r2.A02 = new AnonymousClass4Ex(interpolator, i);
        r2.A03(r3);
        r2.A02(f);
        r2.A02 = new AnonymousClass4Ex(new DecelerateInterpolator(), i);
    }

    public static void A0U(AnonymousClass0Ac r3, AnonymousClass0Ac r4, 0wc r5, String str, String str2) {
        0Aj A00 = r5.A00(r5.A00, str);
        if (A00.isSampled()) {
            A00.A8M(r3, "entrypoint");
            A00.A8M(r4, "surface");
            A00.AAJ("waterfall_id", str2);
            A00.AAJ("canonical_nav_chain", AnonymousClass1K6.A00);
            A00.Cgf();
        }
    }

    public static void A0X(0Aj r2, 0jB r3) {
        r2.A9F("image_height", (Long) r3.A01(C271774jZ.A7D));
        r2.A7p("hide_caption", (Boolean) r3.A01(C271774jZ.A7B));
        r2.A7p("hide_social_context", (Boolean) r3.A01(C271774jZ.A7C));
        r2.A7p("dismissible", (Boolean) r3.A01(C271774jZ.A77));
    }

    public static void A0Y(0Aj r2, C55868Hop hop, String str) {
        r2.AAJ("nav_chain", str);
        r2.AAJ("search_session_id", hop.A05);
        r2.AAJ("serp_session_id", hop.A06);
        r2.AAJ("rank_token", hop.A02.E4z());
        r2.AAJ("query_text", hop.A04);
        r2.AAJ("text_response_id", hop.A03.A00());
    }

    public static void A0Z(0Ak r2, AnonymousClass0iw r3, Long l) {
        r2.A0Q("post_id", l);
        r2.A0R("reel_id", "");
        r2.A0Q("reel_position", l);
        r2.A0Q("reel_size", l);
        r2.A0R("reel_type", "");
        r2.A0Q("session_reel_counter", l);
        r2.A0R("source_of_action", r3.getModuleName());
    }

    public static void A0b(0Ak r3, UserSession userSession, Long l, String str) {
        r3.A0R("sticker_type", str);
        r3.A0R("story_ranking_token", "");
        Double valueOf = Double.valueOf(0.0d);
        r3.A0P("time_elapsed", valueOf);
        r3.A0P("time_remaining", valueOf);
        r3.A0Q("tray_pos_excl_own_story", l);
        r3.A0Q("tray_position", l);
        r3.A0R("tray_session_id", "");
        r3.A0R(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, userSession.A06);
    }

    public static float A00(AnonymousClass5PZ r1) {
        if (Float.isNaN(r1.B6X())) {
            return 0.0f;
        }
        return r1.B6X();
    }

    public static int A01(C305636Ix r2, AnonymousClass6JL r3, Object obj) {
        return 29b.A00(Integer.valueOf(r2.BGq(r3.getKey())), Integer.valueOf(r2.BGq(((AnonymousClass6JL) obj).getKey())));
    }

    public static long A02(01n r0, Object obj) {
        C270284gU r02 = (C270284gU) r0.A03(obj);
        if (r02 != null) {
            return ((C289005cr) r02.getValue()).A00;
        }
        return 0;
    }

    public static Bitmap A05(Bitmap bitmap, float f) {
        return 0fO.A00(bitmap, (int) ((float) Math.rint((double) (((float) bitmap.getWidth()) / f))), (int) ((float) Math.rint((double) (((float) bitmap.getHeight()) / f))), true);
    }

    public static Rect A07(View view) {
        return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Modifier A0B(C286575Wy r2, Modifier modifier) {
        return C304766Fd.A01(AnonymousClass6FZ.A01(modifier, AnonymousClass5ZN.A00()), AnonymousClass5S0.A00, AnonymousClass5aQ.A00(r2).A0B);
    }

    public static Modifier A0C(C286575Wy r2, Modifier modifier, float f) {
        return C304766Fd.A01(AnonymousClass6FZ.A01(C287205Zk.A0C(modifier, f), AnonymousClass5ZN.A00), AnonymousClass5S0.A00, AnonymousClass5aQ.A00(r2).A0f);
    }

    public static C267974cY A0E(C268074ci r3, int i, long j) {
        return r3.Cnz(Constraints.A04(Constraints.A03(j), i, Constraints.A02(j), Constraints.A00(j)));
    }

    public static Object A0I(C286575Wy r1, Object obj, int i) {
        r1.ExS(i);
        Object ECw = r1.ECw();
        if (ECw != obj) {
            return ECw;
        }
        C56547I1b i1b = new C56547I1b();
        r1.FLL(i1b);
        return i1b;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0013: MOVE  (r1v2 X.Qxo) = (r1v1 X.Qxo)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static void A0T(androidx.fragment.app.Fragment r2, java.lang.Throwable r3, X.AnonymousClass0eM r4) {
        /*
            java.lang.Object r0 = r4.getValue()
            X.Jfk r0 = (X.C60104Jfk) r0
            X.Tfa r1 = r0.A09
            java.lang.String r0 = "OxygenInstallSDK_UnexpectedException"
            r1.Ew3(r0, r3)
            androidx.fragment.app.Fragment r1 = r2.mParentFragment
            boolean r0 = r1 instanceof X.C8607Qxo
            if (r0 == 0) goto L_0x001a
            X.Qxo r1 = (X.C8607Qxo) r1
            if (r1 == 0) goto L_0x001a
            r1.A0G()
        L_0x001a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51976G9y.A0T(androidx.fragment.app.Fragment, java.lang.Throwable, X.0eM):void");
    }

    public static void A0W(0Aj r2, C267324bN r3, 0jB r4, UserSession userSession) {
        r2.AAJ("tracking_token", r3.ByO(userSession));
        r2.A7p("has_image", (Boolean) r4.A01(C271774jZ.A7A));
        r2.AAJ("style", (String) r4.A01(C271774jZ.A7G));
        r2.AAJ("title_option", (String) r4.A01(C271774jZ.A7I));
        r2.AAJ(DialogModule.KEY_TITLE, (String) r4.A01(C271774jZ.A7J));
        r2.AAJ("subtitle", (String) r4.A01(C271774jZ.A7H));
        r2.AAJ("body", (String) r4.A01(C271774jZ.A76));
        r2.AAJ("format", (String) r4.A01(C271774jZ.A79));
        r2.A9F("image_width", (Long) r4.A01(C271774jZ.A7E));
    }

    public static void A0a(0Ak r2, 0jB r3, UserSession userSession, 1Xj r5, AnonymousClass4DU r6) {
        r2.A0Q("m_ts", Long.valueOf(r5.A1A()));
        r2.A0R("tracking_token", C294185m0.A07(userSession, r5, r6));
        r2.A0Q("media_loading_progress", (Long) r3.A01(C271774jZ.A5P));
    }

    public static void A0d(H15 h15, List list) {
        if (h15.isAdded()) {
            C57417IaN iaN = h15.A0B;
            0qQ.A0B(list, 0);
            C52954Gg7 gg7 = iaN.A06;
            int size = gg7.A01.size();
            for (int i = 0; i < size; i++) {
                C59622JQq jQq = (C59622JQq) gg7.A00.get(i);
                if (jQq != null) {
                    jQq.EE3(list);
                }
            }
            H15.A09(h15, H15.A00(list));
            H15.A05(h15);
        }
    }
}
