package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.creation.base.CreationSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.base.PhotoSession;
import com.instagram.creation.base.ui.filterview.FilterViewContainer;
import com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar;
import com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController;
import com.instagram.creation.ml.VisualFeatureStore;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.creation.toolbar.CreationToolbarView;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.model.people.PeopleTag;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.JcV  reason: case insensitive filesystem */
public final class C59962JcV extends AnonymousClass4DH implements AnonymousClass4DR, MV0, AnonymousClass8KG {
    public static final String __redex_internal_original_name = "PhotoFilterFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ImageView A06;
    public ViewFlipper A07;
    public RecyclerView A08;
    public IgFrameLayout A09;
    public C60715Jq4 A0A;
    public FilterViewContainer A0B;
    public MediaEditActionBar A0C;
    public C353838Jj A0D;
    public AnonymousClass88H A0E;
    public C3499582p A0F;
    public C3499682q A0G;
    public C357318Xk A0H;
    public AnonymousClass80Q A0I;
    public MXQ A0J;
    public VisualFeatureStore A0K;
    public LG9 A0L;
    public C60439JlX A0M;
    public LOy A0N;
    public LCk A0O;
    public C273514mi A0P;
    public CreationToolbarView A0Q;
    public C234502xy A0R;
    public AnonymousClass3Q2 A0S;
    public InteractiveDrawableContainer A0T;
    public Integer A0U;
    public List A0V;
    public Map A0W;
    public AtomicBoolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public List A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final String A0e;
    public final AnonymousClass0eM A0f;
    public final AnonymousClass0eM A0g;
    public final AnonymousClass0eM A0h;
    public final AnonymousClass0eM A0i = C227642jf.A02(this);
    public final AnonymousClass0eM A0j;
    public final AnonymousClass0eM A0k;

    public static final void A03(ImageView imageView, C59962JcV jcV, int i) {
        ImageView imageView2 = imageView;
        if (imageView != null) {
            C59962JcV jcV2 = jcV;
            if (jcV.A0L == null) {
                AnonymousClass0eM r0 = jcV.A0i;
                UserSession A0l = AnonymousClass7TE.A0l(r0);
                Context themedContext = jcV.getThemedContext();
                FragmentActivity requireActivity = jcV.requireActivity();
                AnonymousClass3Q2 r11 = jcV.A0S;
                0qQ.A0A(r11);
                C65142Lo4 lo4 = new C65142Lo4(jcV);
                C3499682q r9 = jcV.A0G;
                if (r9 == null) {
                    0qQ.A0F("creationCameraSession");
                    throw AnonymousClass00P.createAndThrow();
                }
                int i2 = i;
                LG9 lg9 = new LG9(requireActivity, themedContext, imageView2, jcV2, A0l, r9, lo4, r11, (C267834cI) null, i2, 182.A06(0Tu.A06, AnonymousClass7TE.A0l(r0), 36326541331871556L));
                jcV2.A0L = lg9;
                lg9.A00(imageView2);
            }
        }
    }

    public final void DAi() {
    }

    public final void DAj(View view, float f, float f2, boolean z, boolean z2) {
    }

    public final void DpU(int i, int i2) {
    }

    public final void Dpb() {
    }

    public final String getModuleName() {
        return "photo_filter";
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        C59962JcV.super.onAttach(context);
        C273514mi requireActivity = requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.creation.photo.edit.ui.creationprovider.CreationProvider");
        this.A0P = requireActivity;
        C267844cJ requireActivity2 = requireActivity();
        0qQ.A0C(requireActivity2, "null cannot be cast to non-null type com.instagram.creation.base.sessionprovider.CameraSessionProvider");
        C3499582p Ajn = requireActivity2.Ajn();
        this.A0F = Ajn;
        if (Ajn == null) {
            0qQ.A0F("cameraSession");
            throw AnonymousClass00P.createAndThrow();
        }
        this.A0G = Ajn.A00();
        this.A0U = Integer.valueOf(AnonymousClass0nB.A01(context));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: X.JcV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v7, resolved type: X.4DH} */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x038d, code lost:
        if (((X.JWE) r4).A01.A0I != false) goto L_0x038f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x039a, code lost:
        if (r11 == X.AnonymousClass36W.PROFILE_PHOTO) goto L_0x039c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x039c, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x039d, code lost:
        r9.A05 = r4;
        r9.A03 = new X.C64949Lko(r0, r22);
        r9.setOnTouchListener(new X.C64283LYj(1, r5, r27, r0));
        r4 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03b4, code lost:
        if (r4 == null) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03b8, code lost:
        if (r9.A05 == false) goto L_0x03bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        if (r2 == null) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03ba, code lost:
        r4.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03bd, code lost:
        r19.A08(r0);
        r18.Eee(new X.C63928LDl(r8, r35, r36, r27, r0));
        r8 = X.AnonymousClass84K.A00(requireContext(), X.AnonymousClass7TE.A0l(r40));
        r4 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03e2, code lost:
        if (r4 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03e4, code lost:
        r11 = ((X.JWE) r4).A01.A01();
        r4 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03ee, code lost:
        if (r4 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03f0, code lost:
        r12 = ((X.JWE) r4).A01.A00();
        r4 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03fa, code lost:
        if (r4 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x03fc, code lost:
        r13 = r4.ATT();
        r4 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0402, code lost:
        if (r4 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0404, code lost:
        r8.A01(r4.E2g(), X.C59902JbR.A00, r11, r12, r13);
        r0.A05 = r3.findViewById(com.instagram.android.R.id.tools_hidden_overlay);
        r0.A03 = r3.findViewById(com.instagram.android.R.id.gradient_overlay);
        r0.A07 = (android.widget.ViewFlipper) r3.requireViewById(com.instagram.android.R.id.creation_main_actions);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x042e, code lost:
        if (X.C59963JcW.A03(r0) == false) goto L_0x04d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0430, code lost:
        r5 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0432, code lost:
        if (r5 == null) goto L_0x0dfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0434, code lost:
        r5.setVisibility(8);
        r5 = X.JTP.A0H(X.JTR.A0X(r3, com.instagram.android.R.id.creation_bottom_toolbar), com.instagram.android.R.layout.creation_bottom_toolbar);
        X.0qQ.A0C(r5, "null cannot be cast to non-null type com.instagram.creation.toolbar.CreationToolbarView");
        r5 = (com.instagram.creation.toolbar.CreationToolbarView) r5;
        r0.A0Q = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0450, code lost:
        if (r5 == null) goto L_0x0455;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0452, code lost:
        r5.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0455, code lost:
        r5 = r0.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0457, code lost:
        if (r5 == null) goto L_0x0464;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0459, code lost:
        r5.setViewModel((X.C60188Jh7) r0.A0f.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0464, code lost:
        r14 = r0.A0f;
        r13 = (X.C60188Jh7) r14.getValue();
        r12 = X.AnonymousClass05K.A0C;
        r11 = X.AnonymousClass7TE.A1C();
        r4 = r13.A02;
        r10 = r4.FN1().isEmpty();
        r9 = r13.A01;
        r8 = X.JWE.A04(r4);
        r5 = r4.Co4().size();
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x048b, code lost:
        if (r5 > 1) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x048d, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0492, code lost:
        if (X.C64132LPg.A02(r9, r8, r10, r4) == false) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0494, code lost:
        X.C66296MMf.A01(X.AnonymousClass05K.A00, r13, r11, 36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x049b, code lost:
        X.C66296MMf.A01(X.AnonymousClass05K.A01, r13, r11, 37);
        X.C66296MMf.A01(r12, r13, r11, 38);
        X.C66296MMf.A01(X.AnonymousClass05K.A0N, r13, r11, 39);
        X.C66296MMf.A01(X.AnonymousClass05K.A0Y, r13, r11, 40);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x04bb, code lost:
        if (X.JTP.A1b(r11, r13.A05) == false) goto L_0x04b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04bd, code lost:
        X.DbZ.A1C(r0, new X.MGX(r0, (X.AnonymousClass4D7) null, 16), ((X.C60188Jh7) r14.getValue()).A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x04d1, code lost:
        r5 = X.DbX.A0I(r3, com.instagram.android.R.id.filter_picker_frame);
        r4 = androidx.recyclerview.widget.RecyclerView.A1E;
        r13 = new X.C60715Jq4(getThemedContext());
        r0.A0A = r13;
        r13.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        r13.setClipChildren(false);
        r5.addView(r13);
        X.C63124Krs.A00(X.AnonymousClass7TE.A0l(r40));
        r13.setBlurIconCache(X.C59953JcJ.A00(X.AnonymousClass7TE.A0l(r40)));
        r13.A05 = true;
        r5 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x050a, code lost:
        if (r5 == null) goto L_0x0e06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x050c, code lost:
        r8 = X.AnonymousClass05K.A00;
        r13.A02 = new X.C64948Lkn(r5, r0, r8);
        r15 = X.AnonymousClass7TE.A0l(r40);
        r4 = r0.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x051b, code lost:
        if (r4 == null) goto L_0x0e01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x051d, code lost:
        r5 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x051f, code lost:
        if (r5 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0521, code lost:
        r11 = r5.E2g();
        r4 = (com.instagram.creation.activity.MediaCaptureActivity) r4;
        r10 = r4.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x052d, code lost:
        if (r10.containsKey(r11) != false) goto L_0x053b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x052f, code lost:
        r10.put(r11, new X.C63626L0o(r4.A04, r4.A06));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x053b, code lost:
        r12 = r10.get(r11);
        r12.getClass();
        r12 = (X.C63626L0o) r12;
        r4 = X.C63125Krt.A00(r15);
        r11 = X.AnonymousClass7TE.A1C();
        r15 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0554, code lost:
        if (r15.hasNext() == false) goto L_0x057a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0556, code lost:
        r5 = (X.C63805L7l) r15.next();
        r10 = (X.C66568MWw) r12.A00.get(r5.A00);
        r10.getClass();
        r9 = r5.A03;
        r5 = r5.A02;
        r4 = ((X.C64943Lki) r10).A00;
        r4.A03 = r9;
        r4.A02 = r5;
        r11.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x057a, code lost:
        r0.A0V = r11;
        r13.setEffects(r11, false, X.AnonymousClass7TE.A0l(r40));
        r9 = r13.getParent();
        X.0qQ.A0C(r9, "null cannot be cast to non-null type android.view.ViewGroup");
        r9 = (android.view.ViewGroup) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0592, code lost:
        if (A0B(r0) == false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0596, code lost:
        if (r0.A0Y == false) goto L_0x05c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0598, code lost:
        r9 = android.view.LayoutInflater.from(getContext()).inflate(com.instagram.android.R.layout.accept_reject_edit_buttons_v4, r9, true);
        X.LYF.A01(X.AnonymousClass7TF.A0G(r9, com.instagram.android.R.id.button_accept_adjust), 27, r0);
        X.LYF.A01(X.AnonymousClass7TF.A0G(r9, com.instagram.android.R.id.button_cancel_adjust), 28, r0);
        r0.A02 = r9.requireViewById(com.instagram.android.R.id.bottom_button_container);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05c8, code lost:
        r13 = requireContext();
        r12 = X.AnonymousClass7TE.A0l(r40);
        r4 = r0.A0A;
        X.0qQ.A0B(r12, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x05d5, code lost:
        if (r4 == null) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05d7, code lost:
        r11 = X.AnonymousClass7TE.A1C();
        r10 = X.AnonymousClass7TE.A1C();
        r15 = r4.getTileFrames().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x05eb, code lost:
        if (r15.hasNext() == false) goto L_0x05ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x05ed, code lost:
        r9 = (X.C60060Jeb) r15.next();
        r5 = r9.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x05f9, code lost:
        if (X.C66568MWw.A00(r5) == -1) goto L_0x05e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x05fb, code lost:
        X.C66568MWw.A03(r9, r5, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0603, code lost:
        if (X.DbT.A1b(r10) == false) goto L_0x060c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0605, code lost:
        X.C59953JcJ.A00(r12).A06(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x060c, code lost:
        X.C59953JcJ.A00(r12).A07(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0613, code lost:
        r11 = X.AnonymousClass7TE.A1C();
        r10 = X.C62531KhN.values();
        r9 = r10.length;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x061d, code lost:
        if (r5 >= r9) goto L_0x0673;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x061f, code lost:
        r4 = r6.get(r10[r5]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0625, code lost:
        if (r4 == null) goto L_0x062a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0627, code lost:
        r11.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x062a, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0673, code lost:
        r0.A0a = r11;
        r6 = (com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker) X.AnonymousClass7TF.A0F(r3, com.instagram.android.R.id.tool_picker);
        r5 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0680, code lost:
        if (r5 == null) goto L_0x0e06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0682, code lost:
        r10 = X.AnonymousClass05K.A01;
        r6.A05 = new X.C64948Lkn(r5, r0, r10);
        r6.setEffects(r0.A0a, false, X.AnonymousClass7TE.A0l(r40));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0698, code lost:
        if (A0A(r0) == false) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x069a, code lost:
        r11 = A01(r0);
        r9 = r11.A09;
        X.C63197Kt4.A00(r0, r9, r11.A0A, (java.util.Map) null, X.C66240MKb.A00, new X.MP4(r11, 41));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x06c0, code lost:
        if (X.AnonymousClass30D.A0F(X.AnonymousClass7TE.A0l(r40)) == false) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x06c2, code lost:
        r0.A0R = X.C234472xv.A01(requireContext(), X.AnonymousClass7TE.A0l(r40), (X.AnonymousClass4DU) null, new X.C234462xu(requireContext(), X.AnonymousClass7TE.A0l(r40)), __redex_internal_original_name, false, true, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x06ef, code lost:
        if (A0B(r0) == false) goto L_0x0815;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x06f1, code lost:
        r4 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x06f3, code lost:
        if (r4 == null) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06f5, code lost:
        r5 = r4.getViewTreeObserver();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x06f9, code lost:
        if (r5 == null) goto L_0x06ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x06fb, code lost:
        X.LZ0.A00(r5, r0, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x06ff, code lost:
        r6 = X.AnonymousClass7TE.A0l(r40);
        X.0qQ.A0B(r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x070f, code lost:
        if (X.182.A06(r2, r6, 36319355851775146L) == false) goto L_0x0794;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0711, code lost:
        X.1Eo.A03(r8, new X.AnonymousClass12U().AOJ(1632833315, 3), new X.MH6(r0, r3, r22, (X.AnonymousClass4D7) null, 6), X.DbW.A0E(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0736, code lost:
        r5 = X.DbY.A0F(r3, com.instagram.android.R.id.mif_creation_post_cap_tray_stub);
        X.0qQ.A0C(r5, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        r0.A08 = (androidx.recyclerview.widget.RecyclerView) r5;
        r11 = X.AnonymousClass0eN.A01(X.C59917Jbg.A00(r0, 20));
        r26 = X.AnonymousClass7TE.A0l(r40);
        r6 = r0.A0e;
        r30 = X.AnonymousClass7TE.A1C();
        r12 = X.C60466Jly.A01;
        r9 = requireContext();
        r4 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0763, code lost:
        if (r0.A0Y == false) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0765, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0766, code lost:
        r24 = new X.C60439JlX(X.C3515589i.NO_MUSIC_BROWSER, r26, new X.C65148LoD(r0, r11), r10, r6, r30, r12.A00(r9, r4));
        r0.A0M = r24;
        r24.setHasStableIds(true);
        r5 = r0.A08;
        r24 = "audioList";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0787, code lost:
        if (r5 == null) goto L_0x0e01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0789, code lost:
        r4 = r0.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x078b, code lost:
        if (r4 != null) goto L_0x07b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x078d, code lost:
        r16 = "audioListAdapter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0794, code lost:
        r11 = A01(r0);
        r9 = r11.A09;
        X.C63197Kt4.A00(r0, r9, r11.A0A, (java.util.Map) null, X.C59917Jbg.A00(r11, 36), new X.MP4(r11, 40));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009a, code lost:
        if (r4 == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x07b7, code lost:
        r5.setAdapter(r4);
        r5 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x07bc, code lost:
        if (r5 == null) goto L_0x0e01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x07be, code lost:
        X.DbV.A1A(requireContext(), r5);
        r6 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x07c7, code lost:
        if (r6 == null) goto L_0x0e01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x07c9, code lost:
        r5 = requireContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x07cf, code lost:
        if (r0.A0Y == false) goto L_0x07d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x07d1, code lost:
        r8 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x07d2, code lost:
        r6.A11(new X.C60466Jly(r5, r8));
        r5 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x07dc, code lost:
        if (r5 == null) goto L_0x0e01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x07de, code lost:
        r5.setItemAnimator(new X.U05());
        r4 = r0.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x07e8, code lost:
        if (r4 == null) goto L_0x0e01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x07ea, code lost:
        r5 = r4.A0C;
        X.0qQ.A0C(r5, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((X.AnonymousClass3AR) r5).A00 = false;
        requireContext();
        r6 = X.AnonymousClass7TE.A0l(r40);
        r5 = r0.A0S;
        r4 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0800, code lost:
        if (r4 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0802, code lost:
        r8 = X.C63199Kt6.A00(r6, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0806, code lost:
        if (r8 == null) goto L_0x0815;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0808, code lost:
        r6 = A01(r0);
        X.MHN.A03(r8, r6, X.C318116oQ.A00(r6), 34);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0815, code lost:
        r8 = r0.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0817, code lost:
        if (r8 == null) goto L_0x0e06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0819, code lost:
        r12 = r18.CUZ();
        r4 = r20;
        r0.A0C = r4;
        r6 = r4.A0A;
        r6.removeAllViews();
        r9 = X.AnonymousClass7TE.A0l(r40);
        X.0qQ.A0B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x082f, code lost:
        if (X.2Ht.A00 == false) goto L_0x0863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x083a, code lost:
        if (X.182.A06(r2, r9, 36315473202777330L) == false) goto L_0x0863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x083c, code lost:
        r9 = A00(r6, com.instagram.android.R.drawable.instagram_download_pano_outline_24, 2131972572, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x084e, code lost:
        if (X.JWB.A01(X.AnonymousClass7TE.A0l(r40)) == false) goto L_0x085e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0850, code lost:
        r9.setColorFilter(X.DbV.A05(r0).getColor(com.instagram.android.R.color.design_dark_default_color_on_background));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x085e, code lost:
        X.LYF.A01(r9, 35, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0867, code lost:
        if (X.C59963JcW.A03(r0) != false) goto L_0x087c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0869, code lost:
        r5 = A00(r6, com.instagram.android.R.drawable.instagram_lux_pano_outline_24, 2131965654, false);
        X.AnonymousClass0fU.A00(X.LYG.A01(r0, r5, 42), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0880, code lost:
        if (A08() == false) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0884, code lost:
        if (r0.A0S == null) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x088a, code lost:
        if (X.C59963JcW.A03(r0) != false) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0890, code lost:
        if (X.AnonymousClass7TF.A1Z(r39) == false) goto L_0x0dc2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0892, code lost:
        r4 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0894, code lost:
        if (r4 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0896, code lost:
        r5 = ((X.JWE) r4).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x089c, code lost:
        if (r5.A0I == false) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x08a0, code lost:
        if (r5.A0C == null) goto L_0x0dc2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x08a6, code lost:
        if (A0B(r0) == false) goto L_0x08c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x08ac, code lost:
        if (X.C59963JcW.A03(r0) != false) goto L_0x08c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x08ae, code lost:
        r5 = A00(r6, com.instagram.android.R.drawable.instagram_effects_pano_outline_24, 2131962420, false);
        r5.setId(com.instagram.android.R.id.feed_creation_filter_button);
        X.LYF.A01(r5, 36, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x08c7, code lost:
        if (A08() == false) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x08cf, code lost:
        if (X.AnonymousClass7TF.A1Z(r0.A0g) != false) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x08d1, code lost:
        r9 = X.AnonymousClass7TE.A0l(r40);
        X.0qQ.A0B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x08e1, code lost:
        if (X.182.A06(r2, r9, 36323113948097382L) == false) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x08e7, code lost:
        if (X.C59963JcW.A03(r0) != false) goto L_0x08fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x08e9, code lost:
        r5 = A00(r6, com.instagram.android.R.drawable.instagram_photo_pano_outline_24, 2131962901, false);
        r5.setId(com.instagram.android.R.id.gallery_sticker_button);
        X.LYF.A01(r5, 37, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0902, code lost:
        if (A08() == false) goto L_0x0939;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x090a, code lost:
        if (X.AnonymousClass7TF.A1Z(r0.A0g) != false) goto L_0x0939;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x090c, code lost:
        r9 = X.AnonymousClass7TE.A0l(r40);
        X.0qQ.A0B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x091c, code lost:
        if (X.182.A06(r2, r9, 36323113948031845L) == false) goto L_0x0939;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0922, code lost:
        if (X.C59963JcW.A03(r0) != false) goto L_0x0939;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0924, code lost:
        r5 = A00(r6, com.instagram.android.R.drawable.instagram_sticker_pano_outline_24, 2131953207, false);
        r5.setId(com.instagram.android.R.id.feed_creation_asset_button);
        X.LYF.A01(r5, 38, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x093d, code lost:
        if (A08() == false) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0945, code lost:
        if (X.AnonymousClass7TF.A1Z(r0.A0g) != false) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0947, code lost:
        r9 = X.AnonymousClass7TE.A0l(r40);
        X.0qQ.A0B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0957, code lost:
        if (X.182.A06(r2, r9, 36323113947900771L) == false) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x095d, code lost:
        if (X.C59963JcW.A03(r0) != false) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x095f, code lost:
        r11 = A00(r6, com.instagram.android.R.drawable.instagram_text_pano_filled_24, 2131975081, true);
        r11.setId(com.instagram.android.R.id.add_text_button);
        r9 = X.AnonymousClass7TE.A0l(r40);
        X.0qQ.A0B(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x097f, code lost:
        if (X.182.A06(r2, r9, 36323113948359530L) == false) goto L_0x099f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x098f, code lost:
        if (X.AnonymousClass7TE.A0q(X.AnonymousClass7TE.A0l(r40)).getBoolean("dismissed_feed_text_tool_badge", false) != false) goto L_0x099f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0993, code lost:
        if ((r11 instanceof com.instagram.common.ui.base.IgSimpleImageView) == false) goto L_0x099f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0995, code lost:
        r4 = (com.instagram.common.ui.base.IgSimpleImageView) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0998, code lost:
        if (r4 == null) goto L_0x099f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x099a, code lost:
        r4.A05 = true;
        r4.invalidate();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x09a1, code lost:
        if ((r11 instanceof com.instagram.creation.photo.edit.ui.util.IgMultiListenerSimpleImageView) == false) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x09a3, code lost:
        r5 = (com.instagram.creation.photo.edit.ui.util.IgMultiListenerSimpleImageView) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x09a6, code lost:
        if (r5 == null) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x09a8, code lost:
        r5.A01.add(X.LYG.A01(r0, r11, 43));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x09b5, code lost:
        if (r5.A00 != null) goto L_0x09bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x09b7, code lost:
        r5.setOnClickListener((android.view.View.OnClickListener) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x09bc, code lost:
        if (r12 == false) goto L_0x09e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x09cb, code lost:
        if (X.182.A06(r2, X.AnonymousClass7TE.A0l(r40), 36322469702805700L) == false) goto L_0x09e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x09cd, code lost:
        r5 = A00(r6, com.instagram.android.R.drawable.instagram_filter_pano_filled_24, 2131963305, false);
        X.AnonymousClass0fU.A00(X.LYA.A00(r5, r8, r0, 23), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x09e4, code lost:
        if (X.C59963JcW.A03(r0) == false) goto L_0x0da9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x09e6, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x09eb, code lost:
        if (X.C59963JcW.A03(r0) == false) goto L_0x0d90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x09ed, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x09f0, code lost:
        if (r0.A0Y == false) goto L_0x0d8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x09f6, code lost:
        if (X.AnonymousClass7TF.A1Z(r39) != false) goto L_0x0d8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x09f8, code lost:
        r4 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x09fa, code lost:
        if (r4 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0a02, code lost:
        if (X.JWE.A04(r4) != X.AnonymousClass36W.FOLLOWERS_SHARE) goto L_0x0d8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0a12, code lost:
        if (X.AnonymousClass7TE.A1b(X.JWX.A00(X.AnonymousClass7TE.A0l(r40)).A03) == false) goto L_0x0d8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0a14, code lost:
        r11 = X.AnonymousClass7TE.A0l(r40);
        X.0qQ.A0B(r11, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0a24, code lost:
        if (X.182.A06(r2, r11, 36320425299157416L) == false) goto L_0x0d8c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0a26, code lost:
        r4 = X.AnonymousClass7TF.A0G(r3, com.instagram.android.R.id.gallery_add_container);
        X.LHt.A00(requireActivity(), requireContext(), r0, A01(r0).A08, X.AnonymousClass7TE.A0l(r40));
        r4.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0a47, code lost:
        if (r0.A0Y == false) goto L_0x0d77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0a49, code lost:
        r27 = r3.requireViewById(com.instagram.android.R.id.creation_next_button);
        r12 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0a58, code lost:
        if (X.AnonymousClass7TF.A1Z(r39) == false) goto L_0x0d1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0a5a, code lost:
        r12.setButtonStyle(X.C296235pj.CREATION_FLOW_FEED_PRIMARY);
        r12.setLabel(X.DbV.A05(r0).getString(2131960992));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0a71, code lost:
        if (X.C59963JcW.A03(r0) == false) goto L_0x0a82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0a73, code lost:
        r5 = r12.getLayoutParams();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0a77, code lost:
        if (r5 == null) goto L_0x0e0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0a79, code lost:
        r5 = (X.C71492dQ) r5;
        r5.A03 = 0.5f;
        r12.setLayoutParams(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0a82, code lost:
        X.LYF.A01(r12, 34, r0);
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0a88, code lost:
        r6.setGravity(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0a8d, code lost:
        if (r0.A0Y == false) goto L_0x0cfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0a8f, code lost:
        r6 = X.JTR.A0X(r3, com.instagram.android.R.id.accept_reject_buttons_stub);
        r5 = X.JTR.A0X(r3, com.instagram.android.R.id.secondary_accept_buttons_stub);
        r6.setLayoutResource(com.instagram.android.R.layout.accept_reject_edit_buttons_v3);
        r5.setLayoutResource(com.instagram.android.R.layout.accept_reject_edit_buttons_v3);
        r0.A04 = r6.inflate();
        r5.inflate();
        r5 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0ab1, code lost:
        if (r5 == null) goto L_0x0dfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0ab3, code lost:
        r6 = X.AnonymousClass7TF.A0G(r5, com.instagram.android.R.id.accept_buttons_container);
        X.LYF.A01(r6.requireViewById(com.instagram.android.R.id.button_accept_adjust), 39, r0);
        X.LYF.A01(r6.requireViewById(com.instagram.android.R.id.button_cancel_adjust), 40, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0ad6, code lost:
        if (A0A(r0) == false) goto L_0x0af3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0ad8, code lost:
        X.JTR.A1C(r6, com.instagram.android.R.id.button_change_audio_stub);
        r6 = r6.requireViewById(com.instagram.android.R.id.button_change_audio);
        r0.A00 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0ae7, code lost:
        if (r6 == null) goto L_0x0af3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0ae9, code lost:
        r2 = new X.LYF((java.lang.Object) r0, 41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0af0, code lost:
        X.AnonymousClass0fU.A00(r2, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0af3, code lost:
        if (r9 == null) goto L_0x0afa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0af5, code lost:
        X.LYF.A01(r9, 30, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0afa, code lost:
        if (r8 == null) goto L_0x0b01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0afc, code lost:
        X.LYF.A01(r8, 31, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0b01, code lost:
        if (r4 == null) goto L_0x0b08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0b03, code lost:
        X.LYF.A01(r4, 32, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0b0c, code lost:
        if (A08() == false) goto L_0x0bfe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0b14, code lost:
        if (X.AnonymousClass7TF.A1Z(r0.A0g) != false) goto L_0x0bfe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0b1e, code lost:
        if (X.C59961JcU.A00(X.AnonymousClass7TE.A0l(r40)) == false) goto L_0x0bfe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0b20, code lost:
        X.JTR.A1C(requireView(), com.instagram.android.R.id.text_edit_tools_stub);
        r10 = X.DbY.A0F(requireView(), com.instagram.android.R.id.interactive_drawable_container_stub);
        X.0qQ.A0C(r10, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.InteractiveDrawableContainer");
        r10 = (com.instagram.ui.widget.interactive.InteractiveDrawableContainer) r10;
        r11 = X.AnonymousClass7TE.A0l(r40);
        r6 = X.DbV.A05(r0).getDimensionPixelSize(com.instagram.android.R.dimen.trash_can_margin);
        X.0qQ.A0B(r11, 0);
        r5 = r10.A0k;
        r2 = X.DbX.A0G(r5);
        r2.bottomMargin = r6;
        r5.setLayoutParams(r2);
        r10.A0m.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0b63, code lost:
        if (X.JWB.A01(r11) != false) goto L_0x0b71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0b65, code lost:
        X.DbU.A11(r10.getContext(), r10.A0l, com.instagram.android.R.drawable.trash_can_with_circle_border_light_dark_mode);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0b71, code lost:
        r10.A0R = true;
        r10.A0y(A01(r0));
        r10.setMarginAlignmentGuideEnabled(false);
        r0.A0T = r10;
        r5 = X.AnonymousClass7TE.A0l(r40);
        r2 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0b85, code lost:
        if (r2 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x0b87, code lost:
        X.C226112fe.A0B.A05(requireActivity(), new X.C41163ApN(r19, r0, X.LTZ.A04(r5, r2, false).size()));
        r5 = requireView();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0ba5, code lost:
        if ((r5 instanceof android.view.ViewGroup) == false) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0ba7, code lost:
        r5 = r5.findViewById(com.instagram.android.R.id.done_button);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0bae, code lost:
        if (r5 == null) goto L_0x0bb5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0bb0, code lost:
        X.LYF.A01(r5, 33, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0bb5, code lost:
        A01(r0).A04().EWl(26, false);
        r2 = r0.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0bc4, code lost:
        if (r2 == null) goto L_0x0bfe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0bc6, code lost:
        r2.setVisibility(0);
        r2.A0O = true;
        r2.setLongPressEnabled(false);
        r5 = new X.C40293AZi(r2);
        r0.A0E = r5;
        r10 = new X.C353838Jj(requireContext(), X.AnonymousClass7TE.A0l(r40), new X.C64973LlC(), new X.C64980LlJ(r2), X.DbV.A14(r5));
        r0.A0D = r10;
        r18.EjJ(new X.C64444Lbz(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0bfe, code lost:
        r0.A01 = requireActivity().findViewById(com.instagram.android.R.id.view_drag_overlay);
        X.DbZ.A1C(r0, new X.C66179MGq((java.lang.Object) r0, (java.lang.Object) r9, (java.lang.Object) r27, (java.lang.Object) r4, (java.lang.Object) r20, (java.lang.Object) r8, (X.AnonymousClass4D7) null, 1), A01(r0).A0R);
        X.DbZ.A1C(r0, new X.MGX(r0, (X.AnonymousClass4D7) null, 17), A01(r0).A0H);
        X.DbZ.A1C(r0, new X.C66172MGj(r3, r18, r0, (X.AnonymousClass4D7) null, 14), A01(r0).A0P);
        X.DbZ.A1C(r0, new X.C59819JZr((X.AnonymousClass4D7) null, (java.lang.Object) r0, (java.lang.Object) r4, 46), A01(r0).A0I);
        X.DbZ.A1C(r0, new X.MGX(r0, (X.AnonymousClass4D7) null, 18), A01(r0).A0G);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0c76, code lost:
        if (A0B(r0) == false) goto L_0x0c88;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0c78, code lost:
        X.DbZ.A1C(r0, new X.MGX(r0, (X.AnonymousClass4D7) null, 19), A01(r0).A0F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0c88, code lost:
        X.DbZ.A1C(r0, new X.MGX(r0, (X.AnonymousClass4D7) null, 20), A01(r0).A0J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0c9c, code lost:
        if (A0A(r0) == false) goto L_0x0cae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x0c9e, code lost:
        X.DbZ.A1C(r0, new X.C59819JZr((X.AnonymousClass4D7) null, (java.lang.Object) r0, (java.lang.Object) r3, 47), A01(r0).A0Q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0cb2, code lost:
        if (X.AnonymousClass7TF.A1Z(r39) == false) goto L_0x0cd8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0cb4, code lost:
        r2 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0cb6, code lost:
        if (r2 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0cb8, code lost:
        r3 = ((X.JWE) r2).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0cbe, code lost:
        if (r3.A0I == false) goto L_0x0cc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0cc2, code lost:
        if (r3.A0C == null) goto L_0x0cd8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0cc4, code lost:
        X.C63200Kt7.A00(requireContext(), X.AnonymousClass7TE.A0l(r40), X.DbT.A0l(A0B(r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0cd7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0cda, code lost:
        if (r0.A0d != false) goto L_0x0cc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x0cdc, code lost:
        r3 = X.JW1.A00(X.AnonymousClass7TE.A0l(r40));
        r2 = r0.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:0x0ce6, code lost:
        if (r2 == null) goto L_0x078f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0ce8, code lost:
        r5 = r2.A01.toString();
        X.0qQ.A0B(r5, 0);
        X.JTP.A1L(r3.A0B, "PHOTO_FILTER_FRAGMENT_VIEW_CREATED : ", r5, r3.A06);
        r0.A0d = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0cfd, code lost:
        X.LYF.A01(r20.requireViewById(com.instagram.android.R.id.button_accept_adjust), 42, r0);
        r6 = r20.requireViewById(com.instagram.android.R.id.button_cancel_adjust);
        r2 = new X.LYF((java.lang.Object) r0, 43);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x0d1d, code lost:
        r5 = r0.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x0d1f, code lost:
        if (r5 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0d27, code lost:
        if (X.JWE.A04(r5) != X.AnonymousClass36W.PROFILE_PHOTO) goto L_0x0d43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0d31, code lost:
        if (X.C322606w6.A06(X.AnonymousClass7TE.A0l(r40)) == false) goto L_0x0d43;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0d33, code lost:
        r12.setLabel(X.DbV.A05(r0).getString(2131960992));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0d43, code lost:
        r5 = X.AnonymousClass7TE.A0l(r40);
        X.0qQ.A0B(r5, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0d53, code lost:
        if (X.182.A06(r2, r5, 36329041002905345L) != false) goto L_0x0d66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0d5d, code lost:
        if (X.C355698Qz.A00(X.AnonymousClass7TE.A0l(r40)) != false) goto L_0x0d66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0d5f, code lost:
        r12.setEndAddOn(X.C62567Khx.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x0d66, code lost:
        r12.setButtonStyle(X.C296235pj.CREATION_FLOW_FEED_PRIMARY);
        r12.setEndAddOn(X.C62567Khx.A06);
        r12.setLabel((java.lang.CharSequence) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0d77, code lost:
        r27 = X.JWN.A01(new X.LYF((java.lang.Object) r0, 29), r20, r10, X.AnonymousClass7TF.A1Z(r39));
        r2 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0d8c, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:426:0x0d92, code lost:
        if (r0.A0Y == false) goto L_0x0d9d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0d94, code lost:
        r8 = r3.requireViewById(com.instagram.android.R.id.creation_filter_button);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0d9d, code lost:
        r8 = A00(r6, com.instagram.android.R.drawable.filter_off, 2131962411, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0dab, code lost:
        if (r0.A0Y == false) goto L_0x0db6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x0dad, code lost:
        r9 = r3.requireViewById(com.instagram.android.R.id.creation_edit_button);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x0db6, code lost:
        r9 = A00(r6, com.instagram.android.R.drawable.tools_off, 2131961425, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:434:0x0dca, code lost:
        if (X.AnonymousClass30D.A09(X.AnonymousClass7TE.A0l(r40)) == false) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x0dd0, code lost:
        if (A0B(r0) != false) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:0x0dd6, code lost:
        if (X.C59963JcW.A03(r0) != false) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:439:0x0dd8, code lost:
        r5 = android.view.LayoutInflater.from(getThemedContext()).inflate(com.instagram.android.R.layout.media_edit_button, r6, false);
        X.0qQ.A0C(r5, "null cannot be cast to non-null type android.widget.ImageView");
        r5 = (android.widget.ImageView) r5;
        r0.A06 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:0x0df0, code lost:
        if (r5 == null) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0df2, code lost:
        A03(r5, r0, com.instagram.android.R.drawable.instagram_music_pano_outline_24);
        r6.addView(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0dfd, code lost:
        r17 = "creationMainActionsFlipper";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0e11, code lost:
        throw X.AnonymousClass7TE.A11("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r42, android.os.Bundle r43) {
        /*
            r41 = this;
            r1 = 0
            r3 = r42
            X.0qQ.A0B(r3, r1)
            r0 = r41
            r2 = r43
            super.onViewCreated(r3, r2)
            X.JWN.A04(r3)
            X.82q r2 = r0.A0G
            java.lang.String r17 = "creationCameraSession"
            r23 = 0
            if (r2 == 0) goto L_0x0355
            X.JWE r2 = (X.JWE) r2
            com.instagram.creation.base.CreationSession r2 = r2.A01
            com.instagram.creation.base.MediaSession r2 = r2.A07
            if (r2 != 0) goto L_0x002c
            java.lang.String r5 = "PhotoFilterFragment"
            java.lang.String r4 = "Creation session is not valid."
            r2 = r23
            X.0kD.A07(r5, r4, r2)
            X.DbX.A1I(r0)
        L_0x002c:
            X.0eM r2 = r0.A0i
            r40 = r2
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r40)
            boolean r2 = X.2Ht.A02(r2)
            java.lang.String r16 = "cameraSession"
            if (r2 == 0) goto L_0x0050
            X.82p r2 = r0.A0F
            if (r2 == 0) goto L_0x078f
            com.instagram.creation.base.CreationSession r2 = X.JWE.A01(r2)
            com.instagram.creation.base.PhotoSession r2 = r2.A02()
            if (r2 == 0) goto L_0x0050
            java.lang.String r2 = r2.A0B
            r22 = r2
            if (r2 != 0) goto L_0x005c
        L_0x0050:
            X.82p r2 = r0.A0F
            if (r2 == 0) goto L_0x078f
            X.82q r2 = r2.A00()
            java.lang.String r22 = r2.E2g()
        L_0x005c:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r40)
            X.0Tu r2 = X.0Tu.A05
            r4 = 36318471089559685(0x81077500141885, double:3.0312855875578075E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x0083
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            X.8qK r7 = new X.8qK
            r7.<init>(r4)
            android.content.Context r6 = r0.requireContext()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r40)
            X.8qM r4 = X.C367208qM.A03
            r7.A00(r6, r5, r4)
        L_0x0083:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r40)
            X.0qQ.A0B(r6, r1)
            boolean r4 = X.2Ht.A06(r6)
            if (r4 == 0) goto L_0x009c
            r4 = 36321670839150203(0x810a5e0004267b, double:3.0333091220832086E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            r6 = 1
            if (r4 != 0) goto L_0x009d
        L_0x009c:
            r6 = 0
        L_0x009d:
            r4 = 2131430972(0x7f0b0e3c, float:1.848366E38)
            android.view.View r5 = r3.requireViewById(r4)
            com.instagram.creation.base.ui.filterview.FilterViewContainer r5 = (com.instagram.creation.base.ui.filterview.FilterViewContainer) r5
            r0.A0B = r5
            java.lang.String r21 = "filterViewContainer"
            if (r5 == 0) goto L_0x0e06
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            r5.A02 = r4
            com.instagram.creation.base.ui.filterview.FilterViewContainer r5 = r0.A0B
            if (r6 == 0) goto L_0x0658
            if (r5 == 0) goto L_0x0e06
            r4 = 2131432870(0x7f0b15a6, float:1.848751E38)
            android.view.View r5 = X.JTS.A0C(r5, r4)
            r4 = 2131432867(0x7f0b15a3, float:1.8487504E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r5, r4)
            android.view.SurfaceView r5 = (android.view.SurfaceView) r5
            X.80G r19 = new X.80G
            r4 = r19
            r4.<init>((android.view.SurfaceView) r5)
        L_0x00cf:
            X.4mi r4 = r0.A0P
            java.lang.String r24 = "provider"
            if (r4 == 0) goto L_0x0e01
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r20 = r4.BQ1()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            boolean r4 = X.JWB.A01(r4)
            if (r4 == 0) goto L_0x00e8
            r5 = 1
            r4 = r20
            r4.A02 = r5
        L_0x00e8:
            boolean r4 = r0.A0Y
            if (r4 == 0) goto L_0x0126
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            boolean r4 = X.C59961JcU.A00(r4)
            if (r4 == 0) goto L_0x064d
            X.0nA.A0e(r3, r1)
            r4 = 2131435998(0x7f0b21de, float:1.8493854E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r3, r4)
            android.view.ViewGroup$LayoutParams r4 = r20.getLayoutParams()
            int r4 = r4.height
            X.0nA.A0c(r5, r4)
        L_0x0109:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r40)
            r4 = 36328590031207875(0x8110a900003dc3, double:3.0376848470018304E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x0649
            X.KhI r5 = X.C62526KhI.BACK_CARROT
        L_0x011a:
            r4 = r20
            r4.setupBackButton(r5)
            r5 = 8
            android.view.View r4 = r4.A09
            r4.setVisibility(r5)
        L_0x0126:
            r4 = 2131432869(0x7f0b15a5, float:1.8487508E38)
            android.view.View r35 = X.AnonymousClass7TF.A0G(r3, r4)
            r4 = 2131432868(0x7f0b15a4, float:1.8487506E38)
            android.view.View r36 = X.AnonymousClass7TF.A0G(r3, r4)
            r4 = 2131441991(0x7f0b3947, float:1.850601E38)
            android.view.View r27 = X.AnonymousClass7TF.A0G(r3, r4)
            r4 = r27
            com.instagram.creation.base.ui.grid.GridLinesView r4 = (com.instagram.creation.base.ui.grid.GridLinesView) r4
            r27 = r4
            android.content.Context r5 = r0.requireContext()
            r4 = 2131100272(0x7f060270, float:1.781292E38)
            int r5 = r5.getColor(r4)
            r4 = r27
            r4.setInnerStrokeColor(r5)
            r4 = 2131440095(0x7f0b31df, float:1.8502164E38)
            android.view.View r4 = r3.requireViewById(r4)
            com.instagram.common.ui.base.IgFrameLayout r4 = (com.instagram.common.ui.base.IgFrameLayout) r4
            r4.setVisibility(r1)
            r0.A09 = r4
            X.4mi r5 = r0.A0P
            if (r5 == 0) goto L_0x0e01
            r4 = r22
            X.8m7 r18 = r5.Blh(r4)
            boolean r4 = r0.A0Y
            if (r4 == 0) goto L_0x0183
            android.content.Context r4 = r0.requireContext()
            int r5 = X.DbY.A01(r4)
            com.instagram.creation.base.ui.filterview.FilterViewContainer r4 = r0.A0B
            if (r4 == 0) goto L_0x0e06
            X.0nA.A0e(r4, r5)
            com.instagram.creation.base.ui.filterview.FilterViewContainer r4 = r0.A0B
            if (r4 == 0) goto L_0x0e06
            X.0nA.A0T(r4, r5)
        L_0x0183:
            android.content.Context r10 = r0.requireContext()
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r40)
            X.82p r6 = r0.A0F
            if (r6 == 0) goto L_0x078f
            boolean r5 = r0.A0Y
            boolean r26 = X.C59963JcW.A03(r0)
            r7 = 1
            X.0qQ.A0B(r9, r7)
            com.instagram.creation.base.CreationSession r4 = X.JWE.A01(r6)
            com.instagram.creation.base.PhotoSession r4 = r4.A02()
            r4.getClass()
            float r4 = r4.A00
            android.content.res.Resources r15 = r10.getResources()
            X.82q r31 = r6.A00()
            X.Lkh r14 = new X.Lkh
            r28 = r14
            r29 = r15
            r30 = r9
            r32 = r23
            r33 = r4
            r34 = r5
            r28.<init>(r29, r30, r31, r32, r33, r34)
            X.Lke r8 = new X.Lke
            r8.<init>(r9)
            X.Lkf r25 = new X.Lkf
            r4 = r25
            r4.<init>(r9)
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            r4 = 36329745378197821(0x8111b6000c413d, double:3.038415493090481E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x01ef
            X.KhN r13 = X.C62531KhN.ADJUST
            r4 = 2131952471(0x7f130357, float:1.9541386E38)
            java.lang.String r12 = r15.getString(r4)
            r11 = 2131240168(0x7f0824e8, float:1.8096664E38)
            r5 = -1
            X.KJc r4 = new X.KJc
            r4.<init>(r14, r12, r5, r11)
            r6.put(r13, r4)
        L_0x01ef:
            if (r26 == 0) goto L_0x020b
            X.KhN r14 = X.C62531KhN.LUX
            r4 = 2131965654(0x7f1336d6, float:1.9568124E38)
            java.lang.String r13 = r15.getString(r4)
            X.Lkb r12 = new X.Lkb
            r12.<init>(r9)
            r11 = 2131238519(0x7f081e77, float:1.809332E38)
            r5 = -1
            X.KJc r4 = new X.KJc
            r4.<init>(r12, r13, r5, r11)
            r6.put(r14, r4)
        L_0x020b:
            r4 = 36329745377607988(0x8111b600034134, double:3.0384154927174684E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x021d
            X.KhN r5 = X.C62531KhN.BRIGHTNESS
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            A02(r10, r8, r4, r5, r6)
        L_0x021d:
            r4 = 36329745377476914(0x8111b600014132, double:3.038415492634577E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x022f
            X.KhN r5 = X.C62531KhN.CONTRAST
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            A02(r10, r8, r4, r5, r6)
        L_0x022f:
            r4 = 36329745377739062(0x8111b600054136, double:3.03841549280036E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x0254
            X.KhN r14 = X.C62531KhN.STRUCTURE
            r4 = 2131974579(0x7f1359b3, float:1.9586226E38)
            java.lang.String r13 = r15.getString(r4)
            X.Lkc r12 = new X.Lkc
            r12.<init>(r9)
            r11 = 2131240176(0x7f0824f0, float:1.809668E38)
            r5 = -1
            X.KJc r4 = new X.KJc
            r4.<init>(r12, r13, r5, r11)
            r6.put(r14, r4)
        L_0x0254:
            r4 = 36329745377935673(0x8111b600084139, double:3.038415492924698E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x0266
            X.KhN r5 = X.C62531KhN.WARMTH
            java.lang.Integer r4 = X.AnonymousClass05K.A0N
            A02(r10, r8, r4, r5, r6)
        L_0x0266:
            r4 = 36329745377673525(0x8111b600044135, double:3.038415492758914E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x0278
            X.KhN r5 = X.C62531KhN.SATURATION
            java.lang.Integer r4 = X.AnonymousClass05K.A0C
            A02(r10, r8, r4, r5, r6)
        L_0x0278:
            r4 = 36329745377542451(0x8111b600024133, double:3.0384154926760226E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x028c
            X.KhN r11 = X.C62531KhN.TINT
            java.lang.Integer r5 = X.AnonymousClass05K.A0u
            r4 = r25
            A02(r10, r4, r5, r11, r6)
        L_0x028c:
            r4 = 36329745378066747(0x8111b6000a413b, double:3.0384154930075895E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x029e
            X.KhN r5 = X.C62531KhN.FADE
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            A02(r10, r8, r4, r5, r6)
        L_0x029e:
            r4 = 36329745378132284(0x8111b6000b413c, double:3.0384154930490353E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x02b0
            X.KhN r5 = X.C62531KhN.HIGHLIGHTS
            java.lang.Integer r4 = X.AnonymousClass05K.A1I
            A02(r10, r8, r4, r5, r6)
        L_0x02b0:
            r4 = 36329745377870136(0x8111b600074138, double:3.038415492883252E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x02c2
            X.KhN r5 = X.C62531KhN.SHADOWS
            java.lang.Integer r4 = X.AnonymousClass05K.A1F
            A02(r10, r8, r4, r5, r6)
        L_0x02c2:
            r4 = 36329745378001210(0x8111b60009413a, double:3.0384154929661436E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x02d4
            X.KhN r5 = X.C62531KhN.VIGNETTE
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            A02(r10, r8, r4, r5, r6)
        L_0x02d4:
            r4 = 36329745377411377(0x8111b600004131, double:3.038415492593131E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x02f9
            X.KhN r14 = X.C62531KhN.TILT
            r4 = 2131975381(0x7f135cd5, float:1.9587853E38)
            java.lang.String r13 = r15.getString(r4)
            X.Lkg r12 = new X.Lkg
            r12.<init>(r15, r9)
            r11 = 2131240177(0x7f0824f1, float:1.8096682E38)
            r5 = -1
            X.KJc r4 = new X.KJc
            r4.<init>(r12, r13, r5, r11)
            r6.put(r14, r4)
        L_0x02f9:
            r4 = 36329745377804599(0x8111b600064137, double:3.038415492841806E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 != 0) goto L_0x030b
            X.KhN r5 = X.C62531KhN.SHARPEN
            java.lang.Integer r4 = X.AnonymousClass05K.A15
            A02(r10, r8, r4, r5, r6)
        L_0x030b:
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r40)
            X.82p r9 = r0.A0F
            if (r9 == 0) goto L_0x078f
            X.0qQ.A0B(r10, r1)
            r4 = r18
            X.0qQ.A0B(r4, r7)
            boolean r4 = X.2Ht.A03(r10)
            if (r4 == 0) goto L_0x062d
            X.Lli r8 = new X.Lli
            r5 = r19
            r4 = r18
            r8.<init>(r5, r4)
        L_0x032a:
            X.MXQ r8 = (X.MXQ) r8
            r0.A0J = r8
            com.instagram.creation.base.ui.filterview.FilterViewContainer r9 = r0.A0B
            if (r9 == 0) goto L_0x0e06
            com.instagram.common.ui.base.IgFrameLayout r8 = r0.A09
            X.KhN r4 = X.C62531KhN.ADJUST
            java.lang.Object r4 = r6.get(r4)
            X.MWw r4 = (X.C66568MWw) r4
            r5 = 0
            if (r4 == 0) goto L_0x0343
            X.MVo r5 = r4.ArI()
        L_0x0343:
            X.Lkh r5 = (X.C64942Lkh) r5
            if (r5 == 0) goto L_0x0379
            X.JcW r4 = A01(r0)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r12 = r4.A04()
            X.MXQ r11 = r0.A0J
            if (r11 != 0) goto L_0x035d
            java.lang.String r17 = "imageRenderControllerManager"
        L_0x0355:
            X.0qQ.A0F(r17)
        L_0x0358:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x035d:
            X.LCk r10 = r0.A0O
            r5.A0I = r7
            r5.A01 = r9
            r5.A0A = r12
            java.lang.String r4 = "AdjustController_prepareCropTransform()"
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r4 = X.C395019z4.A00(r12, r4)
            r5.A08 = r4
            r5.A09 = r11
            r5.A07 = r10
            r4 = r22
            r5.A0D = r4
            X.3Q2 r4 = r0.A0S
            r5.A0B = r4
        L_0x0379:
            X.0eM r4 = r0.A0j
            r39 = r4
            boolean r4 = X.AnonymousClass7TF.A1Z(r39)
            if (r4 == 0) goto L_0x038f
            X.82q r4 = r0.A0G
            if (r4 == 0) goto L_0x0355
            X.JWE r4 = (X.JWE) r4
            com.instagram.creation.base.CreationSession r4 = r4.A01
            boolean r4 = r4.A0I
            if (r4 == 0) goto L_0x039c
        L_0x038f:
            X.82q r4 = r0.A0G
            if (r4 == 0) goto L_0x0355
            X.36W r11 = X.JWE.A04(r4)
            X.36W r10 = X.AnonymousClass36W.PROFILE_PHOTO
            r4 = 1
            if (r11 != r10) goto L_0x039d
        L_0x039c:
            r4 = 0
        L_0x039d:
            r9.A05 = r4
            X.Lko r10 = new X.Lko
            r4 = r22
            r10.<init>(r0, r4)
            r9.A03 = r10
            X.LYj r10 = new X.LYj
            r4 = r27
            r10.<init>(r7, r5, r4, r0)
            r9.setOnTouchListener(r10)
            android.view.View r4 = r9.A00
            if (r4 == 0) goto L_0x03bd
            boolean r5 = r9.A05
            if (r5 == 0) goto L_0x03bd
            r4.setVisibility(r1)
        L_0x03bd:
            r4 = r19
            r4.A08(r0)
            X.LDl r4 = new X.LDl
            r33 = r4
            r34 = r8
            r37 = r27
            r38 = r0
            r33.<init>(r34, r35, r36, r37, r38)
            r5 = r18
            r5.Eee(r4)
            android.content.Context r5 = r0.requireContext()
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            X.84L r8 = X.AnonymousClass84K.A00(r5, r4)
            X.82q r4 = r0.A0G
            if (r4 == 0) goto L_0x0355
            X.JWE r4 = (X.JWE) r4
            com.instagram.creation.base.CreationSession r4 = r4.A01
            int r11 = r4.A01()
            X.82q r4 = r0.A0G
            if (r4 == 0) goto L_0x0355
            X.JWE r4 = (X.JWE) r4
            com.instagram.creation.base.CreationSession r4 = r4.A01
            int r12 = r4.A00()
            X.82q r4 = r0.A0G
            if (r4 == 0) goto L_0x0355
            int r13 = r4.ATT()
            X.82q r4 = r0.A0G
            if (r4 == 0) goto L_0x0355
            java.lang.String r9 = r4.E2g()
            X.JbR r10 = X.C59902JbR.A00
            r8.A01(r9, r10, r11, r12, r13)
            r4 = 2131443038(0x7f0b3d5e, float:1.8508133E38)
            android.view.View r4 = r3.findViewById(r4)
            r0.A05 = r4
            r4 = 2131433628(0x7f0b189c, float:1.8489047E38)
            android.view.View r4 = r3.findViewById(r4)
            r0.A03 = r4
            r4 = 2131430973(0x7f0b0e3d, float:1.8483662E38)
            android.view.View r4 = r3.requireViewById(r4)
            android.widget.ViewFlipper r4 = (android.widget.ViewFlipper) r4
            r0.A07 = r4
            boolean r4 = X.C59963JcW.A03(r0)
            if (r4 == 0) goto L_0x04d1
            android.widget.ViewFlipper r5 = r0.A07
            if (r5 == 0) goto L_0x0dfd
            r4 = 8
            r5.setVisibility(r4)
            r4 = 2131430965(0x7f0b0e35, float:1.8483646E38)
            android.view.ViewStub r5 = X.JTR.A0X(r3, r4)
            r4 = 2131624691(0x7f0e02f3, float:1.8876569E38)
            android.view.View r5 = X.JTP.A0H(r5, r4)
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.creation.toolbar.CreationToolbarView"
            X.0qQ.A0C(r5, r4)
            com.instagram.creation.toolbar.CreationToolbarView r5 = (com.instagram.creation.toolbar.CreationToolbarView) r5
            r0.A0Q = r5
            if (r5 == 0) goto L_0x0455
            r5.setVisibility(r1)
        L_0x0455:
            com.instagram.creation.toolbar.CreationToolbarView r5 = r0.A0Q
            if (r5 == 0) goto L_0x0464
            X.0eM r4 = r0.A0f
            java.lang.Object r4 = r4.getValue()
            X.Jh7 r4 = (X.C60188Jh7) r4
            r5.setViewModel(r4)
        L_0x0464:
            X.0eM r14 = r0.A0f
            java.lang.Object r13 = r14.getValue()
            X.Jh7 r13 = (X.C60188Jh7) r13
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            X.82q r4 = r13.A02
            java.util.List r5 = r4.FN1()
            boolean r10 = r5.isEmpty()
            com.instagram.common.session.UserSession r9 = r13.A01
            X.36W r8 = X.JWE.A04(r4)
            java.util.List r4 = r4.Co4()
            int r5 = r4.size()
            r4 = 1
            if (r5 > r7) goto L_0x048e
            r4 = 0
        L_0x048e:
            boolean r4 = X.C64132LPg.A02(r9, r8, r10, r4)
            if (r4 == 0) goto L_0x049b
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            r4 = 36
            X.C66296MMf.A01(r5, r13, r11, r4)
        L_0x049b:
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r4 = 37
            X.C66296MMf.A01(r5, r13, r11, r4)
            r4 = 38
            X.C66296MMf.A01(r12, r13, r11, r4)
            java.lang.Integer r5 = X.AnonymousClass05K.A0N
            r4 = 39
            X.C66296MMf.A01(r5, r13, r11, r4)
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            r4 = 40
            X.C66296MMf.A01(r5, r13, r11, r4)
            X.05G r4 = r13.A05
        L_0x04b7:
            boolean r5 = X.JTP.A1b(r11, r4)
            if (r5 == 0) goto L_0x04b7
            java.lang.Object r4 = r14.getValue()
            X.Jh7 r4 = (X.C60188Jh7) r4
            X.0r6 r9 = r4.A04
            r8 = 16
            X.MGX r5 = new X.MGX
            r4 = r23
            r5.<init>(r0, r4, r8)
            X.DbZ.A1C(r0, r5, r9)
        L_0x04d1:
            r4 = 2131432859(0x7f0b159b, float:1.8487487E38)
            android.view.ViewGroup r5 = X.DbX.A0I(r3, r4)
            float r4 = androidx.recyclerview.widget.RecyclerView.A1E
            android.content.Context r4 = r0.getThemedContext()
            X.Jq4 r13 = new X.Jq4
            r13.<init>(r4)
            r0.A0A = r13
            r14 = -1
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r14, r14)
            r13.setLayoutParams(r4)
            r13.setClipChildren(r1)
            r5.addView(r13)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            X.C63124Krs.A00(r4)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            X.LRo r4 = X.C59953JcJ.A00(r4)
            r13.setBlurIconCache(r4)
            r13.A05 = r7
            com.instagram.creation.base.ui.filterview.FilterViewContainer r5 = r0.A0B
            if (r5 == 0) goto L_0x0e06
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.Lkn r4 = new X.Lkn
            r4.<init>(r5, r0, r8)
            r13.A02 = r4
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r40)
            X.4mi r4 = r0.A0P
            if (r4 == 0) goto L_0x0e01
            X.82q r5 = r0.A0G
            if (r5 == 0) goto L_0x0355
            java.lang.String r11 = r5.E2g()
            com.instagram.creation.activity.MediaCaptureActivity r4 = (com.instagram.creation.activity.MediaCaptureActivity) r4
            java.util.Map r10 = r4.A0N
            boolean r5 = r10.containsKey(r11)
            if (r5 != 0) goto L_0x053b
            com.instagram.common.session.UserSession r9 = r4.A04
            com.instagram.creation.base.CreationSession r5 = r4.A06
            X.L0o r4 = new X.L0o
            r4.<init>(r9, r5)
            r10.put(r11, r4)
        L_0x053b:
            java.lang.Object r12 = r10.get(r11)
            r12.getClass()
            X.L0o r12 = (X.C63626L0o) r12
            java.util.LinkedList r4 = X.C63125Krt.A00(r15)
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r15 = r4.iterator()
        L_0x0550:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x057a
            java.lang.Object r5 = r15.next()
            X.L7l r5 = (X.C63805L7l) r5
            int r9 = r5.A00
            android.util.SparseArray r4 = r12.A00
            java.lang.Object r10 = r4.get(r9)
            X.MWw r10 = (X.C66568MWw) r10
            r10.getClass()
            r4 = r10
            X.Lki r4 = (X.C64943Lki) r4
            boolean r9 = r5.A03
            boolean r5 = r5.A02
            X.L7l r4 = r4.A00
            r4.A03 = r9
            r4.A02 = r5
            r11.add(r10)
            goto L_0x0550
        L_0x057a:
            r0.A0V = r11
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            r13.setEffects(r11, r1, r4)
            android.view.ViewParent r9 = r13.getParent()
            java.lang.String r4 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r9, r4)
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            boolean r4 = A0B(r0)
            if (r4 == 0) goto L_0x05c8
            boolean r4 = r0.A0Y
            if (r4 == 0) goto L_0x05c8
            android.content.Context r4 = r0.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r4)
            r4 = 2131623969(0x7f0e0021, float:1.8875104E38)
            android.view.View r9 = r5.inflate(r4, r9, r7)
            r4 = 2131429291(0x7f0b07ab, float:1.848025E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r9, r4)
            r4 = 27
            X.LYF.A01(r5, r4, r0)
            r4 = 2131429299(0x7f0b07b3, float:1.8480267E38)
            android.view.View r5 = X.AnonymousClass7TF.A0G(r9, r4)
            r4 = 28
            X.LYF.A01(r5, r4, r0)
            r4 = 2131428899(0x7f0b0623, float:1.8479456E38)
            android.view.View r4 = r9.requireViewById(r4)
            r0.A02 = r4
        L_0x05c8:
            android.content.Context r13 = r0.requireContext()
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r40)
            X.Jq4 r4 = r0.A0A
            X.0qQ.A0B(r12, r7)
            if (r4 == 0) goto L_0x0613
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            java.util.List r4 = r4.getTileFrames()
            java.util.Iterator r15 = r4.iterator()
        L_0x05e7:
            boolean r4 = r15.hasNext()
            if (r4 == 0) goto L_0x05ff
            java.lang.Object r9 = r15.next()
            X.Jeb r9 = (X.C60060Jeb) r9
            X.Jez r5 = r9.A05
            int r4 = X.C66568MWw.A00(r5)
            if (r4 == r14) goto L_0x05e7
            X.C66568MWw.A03(r9, r5, r11)
            goto L_0x05e7
        L_0x05ff:
            boolean r4 = X.DbT.A1b(r10)
            if (r4 == 0) goto L_0x060c
            X.LRo r4 = X.C59953JcJ.A00(r12)
            r4.A06(r13, r10)
        L_0x060c:
            X.LRo r4 = X.C59953JcJ.A00(r12)
            r4.A07(r13, r11)
        L_0x0613:
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            X.KhN[] r10 = X.C62531KhN.values()
            int r9 = r10.length
            r5 = 0
        L_0x061d:
            if (r5 >= r9) goto L_0x0673
            r4 = r10[r5]
            java.lang.Object r4 = r6.get(r4)
            if (r4 == 0) goto L_0x062a
            r11.add(r4)
        L_0x062a:
            int r5 = r5 + 1
            goto L_0x061d
        L_0x062d:
            boolean r4 = X.2Ht.A00
            if (r4 == 0) goto L_0x063c
            X.Llj r8 = new X.Llj
            r5 = r19
            r4 = r18
            r8.<init>(r10, r5, r9, r4)
            goto L_0x032a
        L_0x063c:
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r5 = r19.A06()
            X.Llh r8 = new X.Llh
            r4 = r18
            r8.<init>(r5, r4)
            goto L_0x032a
        L_0x0649:
            X.KhI r5 = X.C62526KhI.CANCEL
            goto L_0x011a
        L_0x064d:
            android.view.ViewGroup$LayoutParams r4 = r20.getLayoutParams()
            int r4 = r4.height
            X.0nA.A0e(r3, r4)
            goto L_0x0109
        L_0x0658:
            if (r5 == 0) goto L_0x0e06
            r4 = 2131432875(0x7f0b15ab, float:1.848752E38)
            android.view.View r5 = X.JTS.A0C(r5, r4)
            r4 = 2131432873(0x7f0b15a9, float:1.8487516E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r5, r4)
            com.instagram.common.ui.widget.textureview.MultiListenerTextureView r5 = (com.instagram.common.ui.widget.textureview.MultiListenerTextureView) r5
            X.80G r19 = new X.80G
            r4 = r19
            r4.<init>((com.instagram.common.ui.widget.textureview.MultiListenerTextureView) r5)
            goto L_0x00cf
        L_0x0673:
            r0.A0a = r11
            r4 = 2131442979(0x7f0b3d23, float:1.8508013E38)
            android.view.View r6 = X.AnonymousClass7TF.A0F(r3, r4)
            com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker r6 = (com.instagram.creation.base.ui.feedcolorfilterpicker.FeedColorFilterPicker) r6
            com.instagram.creation.base.ui.filterview.FilterViewContainer r5 = r0.A0B
            if (r5 == 0) goto L_0x0e06
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            X.Lkn r4 = new X.Lkn
            r4.<init>(r5, r0, r10)
            r6.A05 = r4
            java.util.List r5 = r0.A0a
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            r6.setEffects(r5, r1, r4)
            boolean r4 = A0A(r0)
            if (r4 == 0) goto L_0x06eb
            X.JcW r11 = A01(r0)
            com.instagram.common.session.UserSession r9 = r11.A09
            X.82q r6 = r11.A0A
            r5 = 41
            X.MP4 r4 = new X.MP4
            r4.<init>(r11, r5)
            X.MKb r28 = X.C66240MKb.A00
            r24 = r0
            r25 = r9
            r26 = r6
            r27 = r23
            r29 = r4
            X.C63197Kt4.A00(r24, r25, r26, r27, r28, r29)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            boolean r4 = X.AnonymousClass30D.A0F(r4)
            if (r4 == 0) goto L_0x06eb
            android.content.Context r24 = r0.requireContext()
            com.instagram.common.session.UserSession r25 = X.AnonymousClass7TE.A0l(r40)
            android.content.Context r6 = r0.requireContext()
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r40)
            X.2xu r4 = new X.2xu
            r4.<init>(r6, r5)
            java.lang.String r28 = "PhotoFilterFragment"
            r26 = r23
            r27 = r4
            r29 = r1
            r30 = r7
            r31 = r7
            r32 = r1
            X.2xy r4 = X.C234472xv.A01(r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r0.A0R = r4
        L_0x06eb:
            boolean r4 = A0B(r0)
            if (r4 == 0) goto L_0x0815
            X.Jq4 r4 = r0.A0A
            if (r4 == 0) goto L_0x06ff
            android.view.ViewTreeObserver r5 = r4.getViewTreeObserver()
            if (r5 == 0) goto L_0x06ff
            r4 = 7
            X.LZ0.A00(r5, r0, r4)
        L_0x06ff:
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r40)
            X.0qQ.A0B(r6, r1)
            r4 = 36319355851775146(0x81084300041caa, double:3.0318451147455166E-306)
            boolean r4 = X.182.A06(r2, r6, r4)
            if (r4 == 0) goto L_0x0794
            X.0xx r6 = X.DbW.A0E(r0)
            X.12U r9 = new X.12U
            r9.<init>()
            r5 = 1632833315(0x61530f23, float:2.433346E20)
            r4 = 3
            X.0nV r5 = r9.AOJ(r5, r4)
            r29 = 6
            X.MH6 r4 = new X.MH6
            r24 = r4
            r25 = r0
            r26 = r3
            r27 = r22
            r28 = r23
            r24.<init>(r25, r26, r27, r28, r29)
            X.1Eo.A03(r8, r5, r4, r6)
        L_0x0736:
            r4 = 2131436361(0x7f0b2349, float:1.849459E38)
            android.view.View r5 = X.DbY.A0F(r3, r4)
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView"
            X.0qQ.A0C(r5, r4)
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            r0.A08 = r5
            r4 = 20
            X.Jbg r4 = X.C59917Jbg.A00(r0, r4)
            X.0t0 r11 = X.AnonymousClass0eN.A01(r4)
            com.instagram.common.session.UserSession r26 = X.AnonymousClass7TE.A0l(r40)
            java.lang.String r6 = r0.A0e
            java.util.ArrayList r30 = X.AnonymousClass7TE.A1C()
            X.LBb r12 = X.C60466Jly.A01
            android.content.Context r9 = r0.requireContext()
            boolean r5 = r0.A0Y
            r4 = r8
            if (r5 == 0) goto L_0x0766
            r4 = r10
        L_0x0766:
            int r31 = r12.A00(r9, r4)
            X.LoD r5 = new X.LoD
            r5.<init>(r0, r11)
            X.89i r25 = X.C3515589i.NO_MUSIC_BROWSER
            X.JlX r4 = new X.JlX
            r24 = r4
            r27 = r5
            r28 = r10
            r29 = r6
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r0.A0M = r4
            r4.setHasStableIds(r7)
            androidx.recyclerview.widget.RecyclerView r5 = r0.A08
            java.lang.String r24 = "audioList"
            if (r5 == 0) goto L_0x0e01
            X.JlX r4 = r0.A0M
            if (r4 != 0) goto L_0x07b7
            java.lang.String r16 = "audioListAdapter"
        L_0x078f:
            X.0qQ.A0F(r16)
            goto L_0x0358
        L_0x0794:
            X.JcW r11 = A01(r0)
            com.instagram.common.session.UserSession r9 = r11.A09
            X.82q r6 = r11.A0A
            r4 = 40
            X.MP4 r5 = new X.MP4
            r5.<init>(r11, r4)
            r4 = 36
            X.Jbg r28 = X.C59917Jbg.A00(r11, r4)
            r24 = r0
            r25 = r9
            r26 = r6
            r27 = r23
            r29 = r5
            X.C63197Kt4.A00(r24, r25, r26, r27, r28, r29)
            goto L_0x0736
        L_0x07b7:
            r5.setAdapter(r4)
            androidx.recyclerview.widget.RecyclerView r5 = r0.A08
            if (r5 == 0) goto L_0x0e01
            android.content.Context r4 = r0.requireContext()
            X.DbV.A1A(r4, r5)
            androidx.recyclerview.widget.RecyclerView r6 = r0.A08
            if (r6 == 0) goto L_0x0e01
            android.content.Context r5 = r0.requireContext()
            boolean r4 = r0.A0Y
            if (r4 == 0) goto L_0x07d2
            r8 = r10
        L_0x07d2:
            X.Jly r4 = new X.Jly
            r4.<init>(r5, r8)
            r6.A11(r4)
            androidx.recyclerview.widget.RecyclerView r5 = r0.A08
            if (r5 == 0) goto L_0x0e01
            X.U05 r4 = new X.U05
            r4.<init>()
            r5.setItemAnimator(r4)
            androidx.recyclerview.widget.RecyclerView r4 = r0.A08
            if (r4 == 0) goto L_0x0e01
            X.3AS r5 = r4.A0C
            java.lang.String r4 = "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator"
            X.0qQ.A0C(r5, r4)
            X.3AR r5 = (X.AnonymousClass3AR) r5
            r5.A00 = r1
            r0.requireContext()
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r40)
            X.3Q2 r5 = r0.A0S
            X.82q r4 = r0.A0G
            if (r4 == 0) goto L_0x0355
            com.instagram.music.common.model.AudioOverlayTrack r8 = X.C63199Kt6.A00(r6, r4, r5)
            if (r8 == 0) goto L_0x0815
            X.JcW r6 = A01(r0)
            X.6oS r5 = X.C318116oQ.A00(r6)
            r4 = 34
            X.MHN.A03(r8, r6, r5, r4)
        L_0x0815:
            com.instagram.creation.base.ui.filterview.FilterViewContainer r8 = r0.A0B
            if (r8 == 0) goto L_0x0e06
            boolean r12 = r18.CUZ()
            r4 = r20
            r0.A0C = r4
            android.widget.LinearLayout r6 = r4.A0A
            r6.removeAllViews()
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r40)
            X.0qQ.A0B(r9, r1)
            boolean r4 = X.2Ht.A00
            if (r4 == 0) goto L_0x0863
            r4 = 36315473202777330(0x8104bb001a0cf2, double:3.029389711885125E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 == 0) goto L_0x0863
            r5 = 2131238227(0x7f081d53, float:1.8092727E38)
            r4 = 2131972572(0x7f1351dc, float:1.9582155E38)
            android.widget.ImageView r9 = r0.A00(r6, r5, r4, r1)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            boolean r4 = X.JWB.A01(r4)
            if (r4 == 0) goto L_0x085e
            android.content.res.Resources r5 = X.DbV.A05(r0)
            r4 = 2131100036(0x7f060184, float:1.7812442E38)
            int r4 = r5.getColor(r4)
            r9.setColorFilter(r4)
        L_0x085e:
            r4 = 35
            X.LYF.A01(r9, r4, r0)
        L_0x0863:
            boolean r4 = X.C59963JcW.A03(r0)
            if (r4 != 0) goto L_0x087c
            r5 = 2131238519(0x7f081e77, float:1.809332E38)
            r4 = 2131965654(0x7f1336d6, float:1.9568124E38)
            android.widget.ImageView r5 = r0.A00(r6, r5, r4, r1)
            r4 = 42
            X.LYG r4 = X.LYG.A01(r0, r5, r4)
            X.AnonymousClass0fU.A00(r4, r5)
        L_0x087c:
            boolean r4 = r0.A08()
            if (r4 == 0) goto L_0x09bc
            X.3Q2 r4 = r0.A0S
            if (r4 == 0) goto L_0x09bc
            boolean r4 = X.C59963JcW.A03(r0)
            if (r4 != 0) goto L_0x08a2
            boolean r4 = X.AnonymousClass7TF.A1Z(r39)
            if (r4 == 0) goto L_0x0dc2
            X.82q r4 = r0.A0G
            if (r4 == 0) goto L_0x0355
            X.JWE r4 = (X.JWE) r4
            com.instagram.creation.base.CreationSession r5 = r4.A01
            boolean r4 = r5.A0I
            if (r4 == 0) goto L_0x08a2
            java.lang.String r4 = r5.A0C
            if (r4 == 0) goto L_0x0dc2
        L_0x08a2:
            boolean r4 = A0B(r0)
            if (r4 == 0) goto L_0x08c3
            boolean r4 = X.C59963JcW.A03(r0)
            if (r4 != 0) goto L_0x08c3
            r5 = 2131238252(0x7f081d6c, float:1.8092777E38)
            r4 = 2131962420(0x7f132a34, float:1.9561565E38)
            android.widget.ImageView r5 = r0.A00(r6, r5, r4, r1)
            r4 = 2131432748(0x7f0b152c, float:1.8487262E38)
            r5.setId(r4)
            r4 = 36
            X.LYF.A01(r5, r4, r0)
        L_0x08c3:
            boolean r4 = r0.A08()
            if (r4 == 0) goto L_0x08fe
            X.0eM r4 = r0.A0g
            boolean r4 = X.AnonymousClass7TF.A1Z(r4)
            if (r4 != 0) goto L_0x08fe
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r40)
            X.0qQ.A0B(r9, r1)
            r4 = 36323113948097382(0x810bae00032b66, double:3.034221749992338E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 == 0) goto L_0x08fe
            boolean r4 = X.C59963JcW.A03(r0)
            if (r4 != 0) goto L_0x08fe
            r5 = 2131238638(0x7f081eee, float:1.809356E38)
            r4 = 2131962901(0x7f132c15, float:1.956254E38)
            android.widget.ImageView r5 = r0.A00(r6, r5, r4, r1)
            r4 = 2131433479(0x7f0b1807, float:1.8488745E38)
            r5.setId(r4)
            r4 = 37
            X.LYF.A01(r5, r4, r0)
        L_0x08fe:
            boolean r4 = r0.A08()
            if (r4 == 0) goto L_0x0939
            X.0eM r4 = r0.A0g
            boolean r4 = X.AnonymousClass7TF.A1Z(r4)
            if (r4 != 0) goto L_0x0939
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r40)
            X.0qQ.A0B(r9, r1)
            r4 = 36323113948031845(0x810bae00022b65, double:3.034221749950892E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 == 0) goto L_0x0939
            boolean r4 = X.C59963JcW.A03(r0)
            if (r4 != 0) goto L_0x0939
            r5 = 2131238850(0x7f081fc2, float:1.809399E38)
            r4 = 2131953207(0x7f130637, float:1.9542878E38)
            android.widget.ImageView r5 = r0.A00(r6, r5, r4, r1)
            r4 = 2131432746(0x7f0b152a, float:1.8487258E38)
            r5.setId(r4)
            r4 = 38
            X.LYF.A01(r5, r4, r0)
        L_0x0939:
            boolean r4 = r0.A08()
            if (r4 == 0) goto L_0x09bc
            X.0eM r4 = r0.A0g
            boolean r4 = X.AnonymousClass7TF.A1Z(r4)
            if (r4 != 0) goto L_0x09bc
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r40)
            X.0qQ.A0B(r9, r1)
            r4 = 36323113947900771(0x810bae00002b63, double:3.034221749868E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 == 0) goto L_0x09bc
            boolean r4 = X.C59963JcW.A03(r0)
            if (r4 != 0) goto L_0x09bc
            r5 = 2131238898(0x7f081ff2, float:1.8094088E38)
            r4 = 2131975081(0x7f135ba9, float:1.9587244E38)
            android.widget.ImageView r11 = r0.A00(r6, r5, r4, r7)
            r4 = 2131427752(0x7f0b01a8, float:1.847713E38)
            r11.setId(r4)
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r40)
            X.0qQ.A0B(r9, r1)
            r4 = 36323113948359530(0x810bae00072b6a, double:3.0342217501581213E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 == 0) goto L_0x099f
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            X.0xa r5 = X.AnonymousClass7TE.A0q(r4)
            java.lang.String r4 = "dismissed_feed_text_tool_badge"
            boolean r4 = r5.getBoolean(r4, r1)
            if (r4 != 0) goto L_0x099f
            boolean r4 = r11 instanceof com.instagram.common.ui.base.IgSimpleImageView
            if (r4 == 0) goto L_0x099f
            r4 = r11
            com.instagram.common.ui.base.IgSimpleImageView r4 = (com.instagram.common.ui.base.IgSimpleImageView) r4
            if (r4 == 0) goto L_0x099f
            r4.A05 = r7
            r4.invalidate()
        L_0x099f:
            boolean r4 = r11 instanceof com.instagram.creation.photo.edit.ui.util.IgMultiListenerSimpleImageView
            if (r4 == 0) goto L_0x09bc
            r5 = r11
            com.instagram.creation.photo.edit.ui.util.IgMultiListenerSimpleImageView r5 = (com.instagram.creation.photo.edit.ui.util.IgMultiListenerSimpleImageView) r5
            if (r5 == 0) goto L_0x09bc
            r4 = 43
            X.LYG r9 = X.LYG.A01(r0, r11, r4)
            java.util.List r4 = r5.A01
            r4.add(r9)
            android.view.View$OnClickListener r4 = r5.A00
            if (r4 != 0) goto L_0x09bc
            r4 = r23
            r5.setOnClickListener(r4)
        L_0x09bc:
            if (r12 == 0) goto L_0x09e0
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r40)
            r4 = 36322469702805700(0x810b18000028c4, double:3.0338143266757106E-306)
            boolean r4 = X.182.A06(r2, r9, r4)
            if (r4 == 0) goto L_0x09e0
            r5 = 2131238299(0x7f081d9b, float:1.8092873E38)
            r4 = 2131963305(0x7f132da9, float:1.956336E38)
            android.widget.ImageView r5 = r0.A00(r6, r5, r4, r1)
            r4 = 23
            X.LYA r4 = X.LYA.A00(r5, r8, r0, r4)
            X.AnonymousClass0fU.A00(r4, r5)
        L_0x09e0:
            boolean r4 = X.C59963JcW.A03(r0)
            if (r4 == 0) goto L_0x0da9
            r9 = 0
        L_0x09e7:
            boolean r4 = X.C59963JcW.A03(r0)
            if (r4 == 0) goto L_0x0d90
            r8 = 0
        L_0x09ee:
            boolean r4 = r0.A0Y
            if (r4 == 0) goto L_0x0d8c
            boolean r4 = X.AnonymousClass7TF.A1Z(r39)
            if (r4 != 0) goto L_0x0d8c
            X.82q r4 = r0.A0G
            if (r4 == 0) goto L_0x0355
            X.36W r5 = X.JWE.A04(r4)
            X.36W r4 = X.AnonymousClass36W.FOLLOWERS_SHARE
            if (r5 != r4) goto L_0x0d8c
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            X.JX9 r4 = X.JWX.A00(r4)
            java.util.List r4 = r4.A03
            boolean r4 = X.AnonymousClass7TE.A1b(r4)
            if (r4 == 0) goto L_0x0d8c
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r40)
            X.0qQ.A0B(r11, r1)
            r4 = 36320425299157416(0x81093c000c21a8, double:3.032521437576383E-306)
            boolean r4 = X.182.A06(r2, r11, r4)
            if (r4 == 0) goto L_0x0d8c
            r4 = 2131433349(0x7f0b1785, float:1.8488481E38)
            android.view.View r4 = X.AnonymousClass7TF.A0G(r3, r4)
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r40)
            androidx.fragment.app.FragmentActivity r12 = r0.requireActivity()
            android.content.Context r11 = r0.requireContext()
            X.JcW r5 = A01(r0)
            X.7y9 r5 = r5.A08
            X.LHt.A00(r12, r11, r0, r5, r13)
            r4.setVisibility(r1)
        L_0x0a45:
            boolean r5 = r0.A0Y
            if (r5 == 0) goto L_0x0d77
            r5 = 2131430974(0x7f0b0e3e, float:1.8483664E38)
            android.view.View r27 = r3.requireViewById(r5)
            r12 = r27
            com.instagram.igds.components.mediabutton.IgdsMediaButton r12 = (com.instagram.igds.components.mediabutton.IgdsMediaButton) r12
            boolean r5 = X.AnonymousClass7TF.A1Z(r39)
            if (r5 == 0) goto L_0x0d1d
            X.5pj r2 = X.C296235pj.CREATION_FLOW_FEED_PRIMARY
            r12.setButtonStyle(r2)
            android.content.res.Resources r5 = X.DbV.A05(r0)
            r2 = 2131960992(0x7f1324a0, float:1.9558668E38)
            java.lang.String r2 = r5.getString(r2)
            r12.setLabel(r2)
            boolean r2 = X.C59963JcW.A03(r0)
            if (r2 == 0) goto L_0x0a82
            android.view.ViewGroup$LayoutParams r5 = r12.getLayoutParams()
            if (r5 == 0) goto L_0x0e0b
            X.2dQ r5 = (X.C71492dQ) r5
            r2 = 1056964608(0x3f000000, float:0.5)
            r5.A03 = r2
            r12.setLayoutParams(r5)
        L_0x0a82:
            r2 = 34
            X.LYF.A01(r12, r2, r0)
            r2 = 5
        L_0x0a88:
            r6.setGravity(r2)
            boolean r2 = r0.A0Y
            if (r2 == 0) goto L_0x0cfd
            r2 = 2131427374(0x7f0b002e, float:1.8476362E38)
            android.view.ViewStub r6 = X.JTR.A0X(r3, r2)
            r2 = 2131440849(0x7f0b34d1, float:1.8503693E38)
            android.view.ViewStub r5 = X.JTR.A0X(r3, r2)
            r2 = 2131623968(0x7f0e0020, float:1.8875102E38)
            r6.setLayoutResource(r2)
            r5.setLayoutResource(r2)
            android.view.View r2 = r6.inflate()
            r0.A04 = r2
            r5.inflate()
            android.widget.ViewFlipper r5 = r0.A07
            if (r5 == 0) goto L_0x0dfd
            r2 = 2131427373(0x7f0b002d, float:1.847636E38)
            android.view.View r6 = X.AnonymousClass7TF.A0G(r5, r2)
            r2 = 2131429291(0x7f0b07ab, float:1.848025E38)
            android.view.View r5 = r6.requireViewById(r2)
            r2 = 39
            X.LYF.A01(r5, r2, r0)
            r2 = 2131429299(0x7f0b07b3, float:1.8480267E38)
            android.view.View r5 = r6.requireViewById(r2)
            r2 = 40
            X.LYF.A01(r5, r2, r0)
            boolean r2 = A0A(r0)
            if (r2 == 0) goto L_0x0af3
            r2 = 2131429301(0x7f0b07b5, float:1.848027E38)
            X.JTR.A1C(r6, r2)
            r2 = 2131429300(0x7f0b07b4, float:1.8480269E38)
            android.view.View r6 = r6.requireViewById(r2)
            r0.A00 = r6
            if (r6 == 0) goto L_0x0af3
            r5 = 41
            X.LYF r2 = new X.LYF
            r2.<init>((java.lang.Object) r0, (int) r5)
        L_0x0af0:
            X.AnonymousClass0fU.A00(r2, r6)
        L_0x0af3:
            if (r9 == 0) goto L_0x0afa
            r2 = 30
            X.LYF.A01(r9, r2, r0)
        L_0x0afa:
            if (r8 == 0) goto L_0x0b01
            r2 = 31
            X.LYF.A01(r8, r2, r0)
        L_0x0b01:
            if (r4 == 0) goto L_0x0b08
            r2 = 32
            X.LYF.A01(r4, r2, r0)
        L_0x0b08:
            boolean r2 = r0.A08()
            if (r2 == 0) goto L_0x0bfe
            X.0eM r2 = r0.A0g
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            if (r2 != 0) goto L_0x0bfe
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r40)
            boolean r2 = X.C59961JcU.A00(r2)
            if (r2 == 0) goto L_0x0bfe
            android.view.View r5 = r0.requireView()
            r2 = 2131442600(0x7f0b3ba8, float:1.8507244E38)
            X.JTR.A1C(r5, r2)
            android.view.View r5 = r0.requireView()
            r2 = 2131434956(0x7f0b1dcc, float:1.849174E38)
            android.view.View r10 = X.DbY.A0F(r5, r2)
            java.lang.String r2 = "null cannot be cast to non-null type com.instagram.ui.widget.interactive.InteractiveDrawableContainer"
            X.0qQ.A0C(r10, r2)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r10 = (com.instagram.ui.widget.interactive.InteractiveDrawableContainer) r10
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r40)
            android.content.res.Resources r5 = X.DbV.A05(r0)
            r2 = 2131165787(0x7f07025b, float:1.79458E38)
            int r6 = r5.getDimensionPixelSize(r2)
            X.0qQ.A0B(r11, r1)
            android.view.View r5 = r10.A0k
            android.view.ViewGroup$MarginLayoutParams r2 = X.DbX.A0G(r5)
            r2.bottomMargin = r6
            r5.setLayoutParams(r2)
            android.view.View r5 = r10.A0m
            r2 = 4
            r5.setVisibility(r2)
            boolean r2 = X.JWB.A01(r11)
            if (r2 != 0) goto L_0x0b71
            android.view.View r6 = r10.A0l
            android.content.Context r5 = r10.getContext()
            r2 = 2131240217(0x7f082519, float:1.8096763E38)
            X.DbU.A11(r5, r6, r2)
        L_0x0b71:
            r10.A0R = r7
            X.JcW r2 = A01(r0)
            r10.A0y(r2)
            r10.setMarginAlignmentGuideEnabled(r1)
            r0.A0T = r10
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r40)
            X.82q r2 = r0.A0G
            if (r2 == 0) goto L_0x0355
            java.util.ArrayList r2 = X.LTZ.A04(r5, r2, r1)
            int r11 = r2.size()
            X.2ff r10 = X.C226112fe.A0B
            androidx.fragment.app.FragmentActivity r6 = r0.requireActivity()
            X.ApN r5 = new X.ApN
            r2 = r19
            r5.<init>(r2, r0, r11)
            r10.A05(r6, r5)
            android.view.View r5 = r0.requireView()
            boolean r2 = r5 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0bb5
            r2 = 2131432000(0x7f0b1240, float:1.8485745E38)
            android.view.View r5 = r5.findViewById(r2)
            if (r5 == 0) goto L_0x0bb5
            r2 = 33
            X.LYF.A01(r5, r2, r0)
        L_0x0bb5:
            X.JcW r2 = A01(r0)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r5 = r2.A04()
            r2 = 26
            r5.EWl(r2, r1)
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r2 = r0.A0T
            if (r2 == 0) goto L_0x0bfe
            r2.setVisibility(r1)
            r2.A0O = r7
            r2.setLongPressEnabled(r1)
            X.AZi r5 = new X.AZi
            r5.<init>(r2)
            r0.A0E = r5
            java.util.ArrayList r15 = X.DbV.A14(r5)
            android.content.Context r11 = r0.requireContext()
            X.LlC r13 = new X.LlC
            r13.<init>()
            X.LlJ r5 = new X.LlJ
            r5.<init>(r2)
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r40)
            X.8Jj r2 = new X.8Jj
            r10 = r2
            r14 = r5
            r10.<init>(r11, r12, r13, r14, r15)
            r0.A0D = r2
            X.Lbz r5 = new X.Lbz
            r5.<init>(r2)
            r2 = r18
            r2.EjJ(r5)
        L_0x0bfe:
            androidx.fragment.app.FragmentActivity r5 = r0.requireActivity()
            r2 = 2131443820(0x7f0b406c, float:1.8509719E38)
            android.view.View r2 = r5.findViewById(r2)
            r0.A01 = r2
            X.JcW r2 = A01(r0)
            X.0Ud r5 = r2.A0R
            X.MGq r2 = new X.MGq
            r24 = r2
            r25 = r0
            r26 = r9
            r28 = r4
            r29 = r20
            r30 = r8
            r31 = r23
            r32 = r7
            r24.<init>((java.lang.Object) r25, (java.lang.Object) r26, (java.lang.Object) r27, (java.lang.Object) r28, (java.lang.Object) r29, (java.lang.Object) r30, (X.AnonymousClass4D7) r31, (int) r32)
            X.DbZ.A1C(r0, r2, r5)
            X.JcW r2 = A01(r0)
            X.0r6 r8 = r2.A0H
            r6 = 17
            X.MGX r5 = new X.MGX
            r2 = r23
            r5.<init>(r0, r2, r6)
            X.DbZ.A1C(r0, r5, r8)
            X.JcW r2 = A01(r0)
            X.0Ud r5 = r2.A0P
            r13 = 14
            X.MGj r2 = new X.MGj
            r8 = r2
            r9 = r3
            r10 = r18
            r11 = r0
            r12 = r23
            r8.<init>(r9, r10, r11, r12, r13)
            X.DbZ.A1C(r0, r2, r5)
            X.JcW r2 = A01(r0)
            X.0r6 r8 = r2.A0I
            r6 = 46
            X.JZr r5 = new X.JZr
            r5.<init>((X.AnonymousClass4D7) r12, (java.lang.Object) r0, (java.lang.Object) r4, (int) r6)
            X.DbZ.A1C(r0, r5, r8)
            X.JcW r2 = A01(r0)
            X.0r6 r6 = r2.A0G
            r5 = 18
            X.MGX r4 = new X.MGX
            r4.<init>(r0, r12, r5)
            X.DbZ.A1C(r0, r4, r6)
            boolean r2 = A0B(r0)
            if (r2 == 0) goto L_0x0c88
            X.JcW r2 = A01(r0)
            X.0r6 r6 = r2.A0F
            r5 = 19
            X.MGX r4 = new X.MGX
            r4.<init>(r0, r12, r5)
            X.DbZ.A1C(r0, r4, r6)
        L_0x0c88:
            X.JcW r2 = A01(r0)
            X.0r6 r6 = r2.A0J
            r5 = 20
            X.MGX r4 = new X.MGX
            r4.<init>(r0, r12, r5)
            X.DbZ.A1C(r0, r4, r6)
            boolean r2 = A0A(r0)
            if (r2 == 0) goto L_0x0cae
            X.JcW r2 = A01(r0)
            X.0Ud r6 = r2.A0Q
            r5 = 47
            X.JZr r4 = new X.JZr
            r4.<init>((X.AnonymousClass4D7) r12, (java.lang.Object) r0, (java.lang.Object) r3, (int) r5)
            X.DbZ.A1C(r0, r4, r6)
        L_0x0cae:
            boolean r2 = X.AnonymousClass7TF.A1Z(r39)
            if (r2 == 0) goto L_0x0cd8
            X.82q r2 = r0.A0G
            if (r2 == 0) goto L_0x0355
            X.JWE r2 = (X.JWE) r2
            com.instagram.creation.base.CreationSession r3 = r2.A01
            boolean r2 = r3.A0I
            if (r2 == 0) goto L_0x0cc4
            java.lang.String r2 = r3.A0C
            if (r2 == 0) goto L_0x0cd8
        L_0x0cc4:
            android.content.Context r2 = r0.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r40)
            boolean r0 = A0B(r0)
            java.lang.Boolean r0 = X.DbT.A0l(r0)
            X.C63200Kt7.A00(r2, r1, r0)
            return
        L_0x0cd8:
            boolean r2 = r0.A0d
            if (r2 != 0) goto L_0x0cc4
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r40)
            X.JaN r3 = X.JW1.A00(r2)
            X.82p r2 = r0.A0F
            if (r2 == 0) goto L_0x078f
            X.28D r2 = r2.A01
            java.lang.String r5 = r2.toString()
            X.0qQ.A0B(r5, r1)
            X.29E r4 = r3.A0B
            long r2 = r3.A06
            java.lang.String r1 = "PHOTO_FILTER_FRAGMENT_VIEW_CREATED : "
            X.JTP.A1L(r4, r1, r5, r2)
            r0.A0d = r7
            goto L_0x0cc4
        L_0x0cfd:
            r5 = 2131429291(0x7f0b07ab, float:1.848025E38)
            r2 = r20
            android.view.View r5 = r2.requireViewById(r5)
            r2 = 42
            X.LYF.A01(r5, r2, r0)
            r5 = 2131429299(0x7f0b07b3, float:1.8480267E38)
            r2 = r20
            android.view.View r6 = r2.requireViewById(r5)
            r5 = 43
            X.LYF r2 = new X.LYF
            r2.<init>((java.lang.Object) r0, (int) r5)
            goto L_0x0af0
        L_0x0d1d:
            X.82q r5 = r0.A0G
            if (r5 == 0) goto L_0x0355
            X.36W r10 = X.JWE.A04(r5)
            X.36W r5 = X.AnonymousClass36W.PROFILE_PHOTO
            if (r10 != r5) goto L_0x0d43
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r40)
            boolean r5 = X.C322606w6.A06(r5)
            if (r5 == 0) goto L_0x0d43
            android.content.res.Resources r5 = X.DbV.A05(r0)
            r2 = 2131960992(0x7f1324a0, float:1.9558668E38)
            java.lang.String r2 = r5.getString(r2)
            r12.setLabel(r2)
            goto L_0x0a82
        L_0x0d43:
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r40)
            X.0qQ.A0B(r5, r1)
            r10 = 36329041002905345(0x81111200023f01, double:3.037970043319228E-306)
            boolean r2 = X.182.A06(r2, r5, r10)
            if (r2 != 0) goto L_0x0d66
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r40)
            boolean r2 = X.C355698Qz.A00(r2)
            if (r2 != 0) goto L_0x0d66
            X.Khx r2 = X.C62567Khx.CREATION_ARROW
            r12.setEndAddOn(r2)
            goto L_0x0a82
        L_0x0d66:
            X.5pj r2 = X.C296235pj.CREATION_FLOW_FEED_PRIMARY
            r12.setButtonStyle(r2)
            X.Khx r2 = X.C62567Khx.CREATION_ARROW_FILLED
            r12.setEndAddOn(r2)
            r2 = r23
            r12.setLabel(r2)
            goto L_0x0a82
        L_0x0d77:
            boolean r11 = X.AnonymousClass7TF.A1Z(r39)
            r5 = 29
            X.LYF r2 = new X.LYF
            r2.<init>((java.lang.Object) r0, (int) r5)
            r5 = r20
            android.view.View r27 = X.JWN.A01(r2, r5, r10, r11)
            r2 = 17
            goto L_0x0a88
        L_0x0d8c:
            r4 = r23
            goto L_0x0a45
        L_0x0d90:
            boolean r4 = r0.A0Y
            if (r4 == 0) goto L_0x0d9d
            r4 = 2131430971(0x7f0b0e3b, float:1.8483658E38)
            android.view.View r8 = r3.requireViewById(r4)
            goto L_0x09ee
        L_0x0d9d:
            r5 = 2131237296(0x7f0819b0, float:1.8090838E38)
            r4 = 2131962411(0x7f132a2b, float:1.9561546E38)
            android.widget.ImageView r8 = r0.A00(r6, r5, r4, r1)
            goto L_0x09ee
        L_0x0da9:
            boolean r4 = r0.A0Y
            if (r4 == 0) goto L_0x0db6
            r4 = 2131430970(0x7f0b0e3a, float:1.8483656E38)
            android.view.View r9 = r3.requireViewById(r4)
            goto L_0x09e7
        L_0x0db6:
            r5 = 2131240181(0x7f0824f5, float:1.809669E38)
            r4 = 2131961425(0x7f132651, float:1.9559547E38)
            android.widget.ImageView r9 = r0.A00(r6, r5, r4, r1)
            goto L_0x09e7
        L_0x0dc2:
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r40)
            boolean r4 = X.AnonymousClass30D.A09(r4)
            if (r4 == 0) goto L_0x08a2
            boolean r4 = A0B(r0)
            if (r4 != 0) goto L_0x08a2
            boolean r4 = X.C59963JcW.A03(r0)
            if (r4 != 0) goto L_0x08a2
            android.content.Context r4 = r0.getThemedContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r4)
            r4 = 2131627712(0x7f0e0ec0, float:1.8882696E38)
            android.view.View r5 = r5.inflate(r4, r6, r1)
            java.lang.String r4 = "null cannot be cast to non-null type android.widget.ImageView"
            X.0qQ.A0C(r5, r4)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r0.A06 = r5
            if (r5 == 0) goto L_0x08a2
            r4 = 2131238581(0x7f081eb5, float:1.8093445E38)
            A03(r5, r0, r4)
            r6.addView(r5)
            goto L_0x08a2
        L_0x0dfd:
            java.lang.String r17 = "creationMainActionsFlipper"
            goto L_0x0355
        L_0x0e01:
            X.0qQ.A0F(r24)
            goto L_0x0358
        L_0x0e06:
            X.0qQ.A0F(r21)
            goto L_0x0358
        L_0x0e0b:
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59962JcV.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final C59963JcW A01(C59962JcV jcV) {
        return (C59963JcW) jcV.A0k.getValue();
    }

    public static void A02(Context context, C66534MVo mVo, Integer num, Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, new C61716KJh(context, mVo, num));
    }

    public static final void A04(AnonymousClass80Q r2, C59962JcV jcV) {
        AnonymousClass8BA r0;
        int ordinal = ((C62499Kgp) jcV.A0h.getValue()).ordinal();
        if (ordinal == 1) {
            JTS.A1P(jcV.A0I);
            if (jcV.A0I != null) {
                A01(jcV).A05();
            }
        } else if (ordinal == 2) {
            AnonymousClass80Q r02 = jcV.A0I;
            if (!(r02 == null || (r0 = r02.A00.A0e) == null)) {
                r0.A0y.A08();
            }
            A01(jcV).A07();
        } else if (ordinal == 3) {
            r2.A00.A0e.A0y.A02();
            A01(jcV).A06();
        } else if (ordinal == 4) {
            A07(jcV);
        }
    }

    public static final void A05(C59962JcV jcV) {
        ViewParent viewParent;
        if (jcV.A0N == null) {
            UserSession A0l = AnonymousClass7TE.A0l(jcV.A0i);
            Context requireContext = jcV.requireContext();
            CreationToolbarView creationToolbarView = jcV.A0Q;
            if (creationToolbarView != null) {
                viewParent = creationToolbarView.getParent();
            } else {
                viewParent = null;
            }
            0qQ.A0C(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
            jcV.A0N = new LOy(requireContext, (ViewGroup) viewParent, A0l);
        }
    }

    public static final void A06(C59962JcV jcV) {
        28D r3;
        String str;
        LinearLayout linearLayout;
        C59962JcV jcV2 = jcV;
        MediaEditActionBar mediaEditActionBar = jcV2.A0C;
        if (!(mediaEditActionBar == null || (linearLayout = mediaEditActionBar.A0A) == null)) {
            0kx r1 = new 0kx(linearLayout);
            while (r1.hasNext()) {
                ((View) r1.next()).setEnabled(false);
            }
        }
        jcV2.A0D();
        if (jcV2.getContext() != null) {
            C59963JcW A012 = A01(jcV2);
            Context requireContext = jcV2.requireContext();
            AnonymousClass3Q2 r8 = jcV2.A0S;
            C3499582p r7 = jcV2.A0F;
            if (r7 == null) {
                str = "cameraSession";
            } else {
                C273514mi r6 = jcV2.A0P;
                if (r6 == null) {
                    str = "provider";
                } else {
                    C353838Jj r22 = jcV2.A0D;
                    0KC.A0C(__redex_internal_original_name, "Next button tapped, call MediaSaveHelper#saveAndFinish()");
                    UserSession userSession = A012.A09;
                    C49061Eof.A00(userSession).A00(EWT.EDIT_PROFILE_PIC_FLOW, AnonymousClass05K.A15);
                    C322316vd.A00(userSession).A05("photo_filter_confirmed");
                    C59847JaN jaN = A012.A0B;
                    if (r8 != null) {
                        r3 = r8.A0i;
                    } else {
                        r3 = null;
                    }
                    29E r2 = jaN.A0B;
                    long A032 = r2.A03(288435925, jaN.A05);
                    jaN.A05 = A032;
                    r2.A0A(A032, "camera_destination", "feed");
                    if (r3 != null) {
                        JTQ.A1E(r2, r3, jaN.A05);
                    }
                    if (C59961JcU.A00(userSession)) {
                        C353838Jj r14 = r22;
                        C59963JcW jcW = A012;
                        Context context = requireContext;
                        AnonymousClass7TE.A1Z(new C66152MEu(context, r14, jcW, r8, r6, r7, __redex_internal_original_name, (AnonymousClass4D7) null, 0), C318116oQ.A00(A012));
                    } else {
                        LIb.A00(requireContext, userSession, r7, r6, A012.A0S);
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        JTS.A1O(jcV2.A0H, jcV2);
    }

    private final boolean A08() {
        MediaUploadMetadata mediaUploadMetadata;
        C3499682q r0 = this.A0G;
        String str = null;
        if (r0 == null) {
            0qQ.A0F("creationCameraSession");
            throw AnonymousClass00P.createAndThrow();
        } else if (JWE.A04(r0) != AnonymousClass36W.FOLLOWERS_SHARE) {
            return false;
        } else {
            AnonymousClass3Q2 r02 = this.A0S;
            if (!(r02 == null || (mediaUploadMetadata = r02.A13) == null)) {
                str = mediaUploadMetadata.A03;
            }
            if (!"com.instagram.barcelona".equals(str)) {
                return true;
            }
            UserSession A0l = AnonymousClass7TE.A0l(this.A0i);
            0qQ.A0B(A0l, 0);
            if (!AnonymousClass9HN.A00(A0l).booleanValue()) {
                return true;
            }
            return false;
        }
    }

    public final UserSession A0C() {
        return AnonymousClass7TE.A0l(this.A0i);
    }

    public final void DpX(Surface surface, int i, int i2) {
        0eP A0x;
        FilterGroupModel A042;
        Object obj;
        String str;
        Rect rect;
        CropInfo cropInfo;
        C273514mi r0 = this.A0P;
        C279284yO r8 = null;
        if (r0 == null) {
            str = "provider";
        } else {
            JWG jwg = ((MediaCaptureActivity) r0).A07;
            if (jwg != null) {
                if (!jwg.A03) {
                    jwg.A07.sendEmptyMessageDelayed(1, 1500);
                }
                int i3 = i2;
                int i4 = i;
                this.A0U = Integer.valueOf(Math.max(i4, i3));
                C59963JcW A012 = A01(this);
                LCk lCk = this.A0O;
                boolean z = this.A0b;
                UserSession userSession = A012.A09;
                if ((!2Ht.A02(userSession) || (!A012.A0S && !A012.A03)) && !z) {
                    A012.A03 = true;
                    SurfaceCropFilter A002 = C395019z4.A00(A012.A04(), "_onSurfaceTextureAvailable()");
                    if (!(A002 == null || lCk == null)) {
                        C3499682q r7 = A012.A0A;
                        CreationSession creationSession = ((JWE) r7).A01;
                        int A013 = creationSession.A01();
                        int A003 = creationSession.A00();
                        int ATT = r7.ATT();
                        PhotoSession A022 = creationSession.A02();
                        if (A022 == null || (cropInfo = A022.A05) == null || (rect = cropInfo.A02) == null || rect.right > A013 || rect.bottom > A003) {
                            AnonymousClass514 ANP = r7.ANP();
                            rect = JW0.A00(ANP.A00, A013, A003, ATT, ANP.A03);
                        }
                        A002.A0K(rect, A013, A003, ATT, false);
                        lCk.A00(r7.ANP(), A002, r7.E2g());
                    }
                }
                boolean A032 = 2Ht.A03(userSession);
                C61074JwC jwC = A012.A00;
                if (A032) {
                    obj = C59963JcW.A01(A012.A0A.ANP(), A012, i4);
                    A0x = AnonymousClass7TF.A0x(Integer.valueOf(i4), i3);
                    A042 = A012.A04();
                } else {
                    A0x = AnonymousClass7TF.A0x(Integer.valueOf(i4), i3);
                    A042 = A012.A04();
                    obj = jwC.A03;
                }
                C61074JwC jwC2 = new C61074JwC(8, jwC.A00, A042, A0x, obj);
                A012.A00 = jwC2;
                A012.A0C.FIG(jwC2);
                InteractiveDrawableContainer interactiveDrawableContainer = this.A0T;
                if (interactiveDrawableContainer != null) {
                    C59963JcW A014 = A01(this);
                    Context requireContext = requireContext();
                    AnonymousClass3Q2 r10 = this.A0S;
                    int width = interactiveDrawableContainer.getWidth();
                    int height = interactiveDrawableContainer.getHeight();
                    C3499582p r02 = this.A0F;
                    if (r02 == null) {
                        str = "cameraSession";
                    } else {
                        C357638Yz r03 = r02.A02.A01.A0X;
                        if (r03 != null) {
                            r8 = (C279284yO) r03.A08.A00;
                        }
                        AnonymousClass7TE.A1Z(new MFl(requireContext, r8, A014, r10, "photo_filter", (AnonymousClass4D7) null, width, height), C318116oQ.A00(A014));
                    }
                }
                AnonymousClass80Q r04 = this.A0I;
                if (r04 != null) {
                    A04(r04, this);
                }
                this.A0X.set(true);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0i);
    }

    public C59962JcV() {
        0eO r2 = 0eO.A02;
        this.A0j = AnonymousClass0eN.A00(r2, C59917Jbg.A00(this, 34));
        this.A0g = AnonymousClass0eN.A00(r2, C59917Jbg.A00(this, 19));
        this.A0h = AnonymousClass0eN.A00(r2, new C58719IwS(C62499Kgp.A04, this, "default_open_tool", 40));
        this.A0X = new AtomicBoolean(false);
        this.A0Y = true;
        C59917Jbg A002 = C59917Jbg.A00(this, 35);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r2, C59917Jbg.A00(C59917Jbg.A00(this, 28), 29));
        this.A0k = DbS.A0I(C59917Jbg.A00(A003, 30), A002, MMY.A00(A003, (Object) null, 0), DbS.A0z(C59963JcW.class));
        0sn r0 = 0sn.A00;
        this.A0V = r0;
        this.A0a = r0;
        this.A0e = AnonymousClass7TG.A0j();
        C59917Jbg A004 = C59917Jbg.A00(this, 18);
        AnonymousClass0eM A005 = AnonymousClass0eN.A00(r2, C59917Jbg.A00(C59917Jbg.A00(this, 31), 32));
        this.A0f = DbS.A0I(C59917Jbg.A00(A005, 33), A004, MMY.A00(A005, (Object) null, 1), DbS.A0z(C60188Jh7.class));
    }

    private final ImageView A00(ViewGroup viewGroup, int i, int i2, boolean z) {
        LayoutInflater from = LayoutInflater.from(getThemedContext());
        int i3 = R.layout.media_edit_button;
        if (z) {
            i3 = R.layout.multi_listener_media_edit_button;
        }
        View A0C2 = DbT.A0C(from, viewGroup, i3);
        0qQ.A0C(A0C2, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) A0C2;
        imageView.setImageResource(i);
        imageView.setContentDescription(getString(i2));
        2eK.A00(imageView, getThemedContext().getColor(2Yu.A0B(getThemedContext())), JTP.A02(getThemedContext(), getThemedContext(), R.attr.igds_color_creation_tools_blue), 255);
        viewGroup.addView(imageView);
        return imageView;
    }

    public static final void A07(C59962JcV jcV) {
        String str;
        A05(jcV);
        LOy lOy = jcV.A0N;
        if (lOy != null) {
            List list = jcV.A0a;
            FilterViewContainer filterViewContainer = jcV.A0B;
            if (filterViewContainer == null) {
                str = "filterViewContainer";
            } else {
                Integer num = AnonymousClass05K.A01;
                C64948Lkn lkn = new C64948Lkn(filterViewContainer, jcV, num);
                MXQ mxq = jcV.A0J;
                if (mxq == null) {
                    str = "imageRenderControllerManager";
                } else {
                    FilterGroupModel A042 = A01(jcV).A04();
                    C59917Jbg A002 = C59917Jbg.A00(jcV, 23);
                    C59917Jbg A003 = C59917Jbg.A00(jcV, 24);
                    AnonymousClass7TF.A1C(list, 0, A042);
                    C65062Lmg lmg = lOy.A01;
                    if (lmg == null) {
                        lmg = new C65062Lmg(lOy.A05, new C65156LoL(lkn, mxq, lOy, A042, list, A002, A003));
                        lOy.A01 = lmg;
                    }
                    lOy.A07.A00 = num;
                    BottomSheetViewController bottomSheetViewController = lOy.A06;
                    bottomSheetViewController.A03 = lmg;
                    bottomSheetViewController.A02();
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final boolean A09(View view, C66534MVo mVo, FilterViewContainer filterViewContainer, C59962JcV jcV, boolean z) {
        FilterGroupModel A042 = A01(jcV).A04();
        MXQ mxq = jcV.A0J;
        if (mxq == null) {
            0qQ.A0F("imageRenderControllerManager");
            throw AnonymousClass00P.createAndThrow();
        }
        boolean Dij = mVo.Dij(view, filterViewContainer, mxq, A042);
        if (Dij && z) {
            A01(jcV).A09(mVo, false);
        }
        return Dij;
    }

    public static final boolean A0A(C59962JcV jcV) {
        AnonymousClass3Q2 r0;
        if (jcV.A08() && !AnonymousClass7TF.A1Z(jcV.A0j) && ((r0 = jcV.A0S) == null || r0.A1J == null)) {
            UserSession A0l = AnonymousClass7TE.A0l(jcV.A0i);
            0qQ.A0B(A0l, 0);
            if (!AnonymousClass30D.A09(A0l) || !182.A06(0Tu.A05, A0l, 36326296518669999L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean A0B(C59962JcV jcV) {
        if (!jcV.A08() || AnonymousClass7TF.A1Z(jcV.A0j) || !AnonymousClass30D.A0B(AnonymousClass7TE.A0l(jcV.A0i)) || C59963JcW.A03(jcV)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.Object, com.instagram.model.people.PeopleTag, com.instagram.tagging.model.Tag] */
    /* JADX WARNING: type inference failed for: r6v7, types: [X.A6E, java.lang.Object] */
    public final void A0D() {
        A6E a6e;
        ArrayList arrayList;
        ArrayList arrayList2;
        C2802350v r2;
        C2802250u r22;
        C2802550x r1;
        AnonymousClass91O r23;
        C2802350v r24;
        C387369m6 r25;
        User user;
        PhotoSession A022;
        AnonymousClass8BA r0;
        C59963JcW A012 = A01(this);
        AnonymousClass80Q r02 = this.A0I;
        if (r02 == null || (r0 = r02.A00.A0e) == null) {
            a6e = null;
        } else {
            C370058vl r03 = new C370058vl(new C366678pU(r0.A0P(), (C364758lx) null, (C366688pV) null, (C366588pL) null, false));
            List list = r03.A03;
            C370078vn r12 = r03.A02;
            int i = r03.A00;
            ? obj = new Object();
            obj.A02 = list;
            obj.A01 = r12;
            obj.A00 = i;
            a6e = obj;
        }
        AnonymousClass3Q2 r3 = this.A0S;
        UserSession userSession = A012.A09;
        if (182.A06(0Tu.A05, userSession, 36323113947900771L) && (A022 = JWE.A02(A012.A0A)) != null) {
            A022.A06 = a6e;
        }
        if (182.A06(0Tu.A06, userSession, 36323113948490604L) && a6e != null) {
            List<A6D> list2 = a6e.A02;
            ArrayList arrayList3 = null;
            if (list2 != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (A6D a6d : list2) {
                    AnonymousClass513 r13 = a6d.A00;
                    if (r13 != null) {
                        r24 = r13.A00();
                    } else {
                        r24 = null;
                    }
                    if (!(!(r24 instanceof C387369m6) || (r25 = (C387369m6) r24) == null || (user = r25.A03) == null)) {
                        AnonymousClass7TF.A1I(user, a6d.A02, arrayList);
                    }
                }
            } else {
                arrayList = null;
            }
            List<A6D> list3 = a6e.A02;
            if (list3 != null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (A6D a6d2 : list3) {
                    AnonymousClass513 r14 = a6d2.A00;
                    if (r14 != null) {
                        r2 = r14.A00();
                    } else {
                        r2 = null;
                    }
                    if (!(!(r2 instanceof C2802250u) || (r22 = (C2802250u) r2) == null || (r1 = r22.A0D) == null)) {
                        List list4 = r1.A01;
                        ArrayList<C2802650z> A1C2 = AnonymousClass7TE.A1C();
                        for (Object next : list4) {
                            if (((C2802650z) next).A00() == AnonymousClass05K.A0N) {
                                A1C2.add(next);
                            }
                        }
                        ArrayList A1C3 = AnonymousClass7TE.A1C();
                        for (C2802650z A023 : A1C2) {
                            Object A024 = C18790W1s.A02((Context) null, A023, false);
                            if ((A024 instanceof AnonymousClass91O) && (r23 = (AnonymousClass91O) A024) != null) {
                                AnonymousClass7TF.A1I(r23.A00, a6d2.A02, A1C3);
                            }
                        }
                        A1C.add(A1C3);
                    }
                }
                arrayList3 = 0Yv.A1F(A1C);
            }
            if (arrayList == null) {
                arrayList = 0sn.A00;
            }
            if (arrayList3 == null) {
                arrayList3 = 0sn.A00;
            }
            ArrayList A0S2 = 00k.A0S(arrayList3, arrayList);
            ArrayList A0r = AnonymousClass7TG.A0r(A0S2);
            Iterator it = A0S2.iterator();
            while (it.hasNext()) {
                0eP A1A = JTO.A1A(it);
                User user2 = (User) A1A.A00;
                C369458un r10 = (C369458un) A1A.A01;
                float f = 0.0f;
                if (r10 != null) {
                    float f2 = r10.A01;
                    float f3 = r10.A03;
                    if (Float.valueOf(f3) != null) {
                        f = (f2 / (f3 - f2)) / 2.0f;
                    }
                }
                float f4 = f + 0.5f;
                float f5 = 0.0f;
                if (r10 != null) {
                    float f6 = r10.A02;
                    float f7 = r10.A04;
                    if (Float.valueOf(f7) != null) {
                        f5 = (f6 / (f7 - f6)) / 2.0f;
                    }
                }
                PointF pointF = new PointF(f4, f5 + 0.5f);
                ? obj2 = new Object();
                obj2.A03 = false;
                obj2.A00 = pointF;
                obj2.A00 = new PeopleTag.UserInfo(user2);
                obj2.A03 = true;
                A0r.add(obj2);
            }
            if (!A0r.isEmpty()) {
                if (r3 != null) {
                    arrayList2 = r3.A40;
                } else {
                    arrayList2 = null;
                }
                ArrayList A1D = AnonymousClass7TE.A1D(A0r);
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    Iterator A1G = AnonymousClass7TE.A1G(arrayList2);
                    while (A1G.hasNext()) {
                        PeopleTag peopleTag = (PeopleTag) AnonymousClass7TF.A0a(A1G);
                        if (!peopleTag.A03) {
                            A1D.add(peopleTag);
                        }
                    }
                }
                ArrayList A1C4 = AnonymousClass7TE.A1C();
                ArrayList A1C5 = AnonymousClass7TE.A1C();
                Iterator it2 = A1D.iterator();
                while (it2.hasNext()) {
                    PeopleTag peopleTag2 = (PeopleTag) it2.next();
                    if (!A1C4.contains(peopleTag2.A00.A04)) {
                        A1C5.add(peopleTag2);
                        String str = peopleTag2.A00.A04;
                        0qQ.A07(str);
                        A1C4.add(str);
                    }
                }
                if (r3 != null) {
                    ArrayList A1C6 = AnonymousClass7TE.A1C();
                    018.A16(A1C5, A1C6);
                    0qQ.A0B(A1C6, 0);
                    r3.A40 = A1C6;
                }
            }
        }
    }

    public final void DAX(View view, boolean z) {
        Object value;
        C59964JcX jcX;
        05G r6 = A01(this).A0M;
        do {
            value = r6.getValue();
            jcX = (C59964JcX) value;
        } while (!r6.AIY(value, C59964JcX.A00((Integer) jcX.A02, (Integer) jcX.A01, jcX.A03, false, jcX.A05)));
    }

    public final void DAe(View view, float f, float f2) {
        Object value;
        C59964JcX jcX;
        05G r6 = A01(this).A0M;
        do {
            value = r6.getValue();
            jcX = (C59964JcX) value;
        } while (!r6.AIY(value, C59964JcX.A00((Integer) jcX.A02, (Integer) jcX.A01, jcX.A03, true, jcX.A05)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        if (r0.getInteractiveDrawables().size() == 0) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ea, code lost:
        if (r1 != r3.ANP()) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0108, code lost:
        if (r1.A0A((android.content.DialogInterface.OnClickListener) null, X.AnonymousClass05K.A0Y) == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010a, code lost:
        r3 = A01(r10);
        r5 = r3.A0A;
        r2 = ((X.JWE) r5).A01;
        r1 = r2.A02();
        r1.getClass();
        r0 = r1.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011e, code lost:
        if (r0 == null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0120, code lost:
        r1.A07 = r0.E1g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0126, code lost:
        r0 = r2.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012a, code lost:
        if (r0 == null) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012c, code lost:
        r0 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012e, code lost:
        if (r0 == null) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0130, code lost:
        X.C364978mK.A02(r0.A02, r3.A04(), r2.A01(), r2.A00(), r5.ATT());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0145, code lost:
        r3 = X.AnonymousClass6SR.A01();
        r2 = r10.A0i;
        r3.A07(X.AnonymousClass7TE.A0l(r2), "edit_carousel", false);
        X.C59888JbD.A00(X.AnonymousClass7TE.A0l(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0174, code lost:
        if (r1.A0A((android.content.DialogInterface.OnClickListener) null, X.AnonymousClass05K.A0N) == false) goto L_0x010a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onBackPressed() {
        /*
            r10 = this;
            boolean r0 = X.C59963JcW.A03(r10)
            r2 = 0
            if (r0 != 0) goto L_0x003a
            java.lang.Object r0 = X.C61080JwI.A01(r10)
            if (r0 != 0) goto L_0x0039
            boolean r0 = A0B(r10)
            if (r0 == 0) goto L_0x003a
            X.JcX r0 = X.C59963JcW.A00(r10)
            java.lang.Object r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x0039
            X.JcX r0 = X.C59963JcW.A00(r10)
            java.lang.Object r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x0039
            X.0eM r0 = r10.A0j
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 != 0) goto L_0x003a
            X.JcX r0 = X.C59963JcW.A00(r10)
            java.lang.Object r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x003a
        L_0x0039:
            r2 = 1
        L_0x003a:
            r7 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0046
            X.JcW r0 = A01(r10)
            r0.A0A(r7)
        L_0x0045:
            return r6
        L_0x0046:
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            X.37D r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0060
            X.37F r0 = (X.AnonymousClass37F) r0
            boolean r0 = r0.A0g
            if (r0 != r6) goto L_0x0060
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            X.DbX.A10(r0, r1)
            return r6
        L_0x0060:
            X.LOy r1 = r10.A0N
            if (r1 == 0) goto L_0x0078
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r0 = r1.A06
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0078
            X.Jhn r2 = r1.A07
            X.3ju r1 = r2.A02
            X.KNU r0 = X.KNU.A00
            r1.FIG(r0)
            java.lang.String r0 = ""
            r2.A01 = r0
            return r6
        L_0x0078:
            X.JcW r8 = A01(r10)
            X.3Q2 r5 = r10.A0S
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r10.A0T
            if (r0 == 0) goto L_0x008d
            java.util.List r0 = r0.getInteractiveDrawables()
            int r0 = r0.size()
            r4 = 1
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            boolean r0 = r8.A0S
            if (r0 == 0) goto L_0x00ba
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r1 = r8.A04()
            X.82q r0 = r8.A0A
            com.instagram.creation.base.PhotoSession r0 = X.JWE.A02(r0)
            r0.getClass()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r0.A08
            r0.getClass()
            boolean r0 = X.C364978mK.A06(r1, r0)
            if (r0 == 0) goto L_0x00ed
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x00ac:
            int r0 = r0.intValue()
            java.lang.String r9 = "Required value was null."
            java.lang.String r8 = "provider"
            r5 = 0
            if (r0 == r7) goto L_0x0181
            if (r0 == r6) goto L_0x00f0
            return r7
        L_0x00ba:
            X.82q r3 = r8.A0A
            r0 = r3
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r2 = r0.A01
            X.36W r1 = r2.A0A
            r1.getClass()
            X.36W r0 = X.AnonymousClass36W.FOLLOWERS_SHARE
            if (r1 != r0) goto L_0x00ed
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r8.A04()
            boolean r0 = X.C364978mK.A05(r0)
            if (r0 != 0) goto L_0x00dc
            if (r5 == 0) goto L_0x00df
            boolean r0 = r5.A0r()
            if (r0 != r6) goto L_0x00df
        L_0x00dc:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x00ac
        L_0x00df:
            if (r4 != 0) goto L_0x00dc
            X.514 r1 = r2.A06
            r1.getClass()
            X.514 r0 = r3.ANP()
            if (r1 == r0) goto L_0x00ed
            goto L_0x00dc
        L_0x00ed:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x00ac
        L_0x00f0:
            X.3Q2 r0 = r10.A0S
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = r0.A3O
            if (r0 == 0) goto L_0x015c
            X.4mi r0 = r10.A0P
            if (r0 == 0) goto L_0x01bf
            com.instagram.creation.activity.MediaCaptureActivity r0 = (com.instagram.creation.activity.MediaCaptureActivity) r0
            X.JWG r1 = r0.A07
            if (r1 == 0) goto L_0x0177
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            boolean r0 = r1.A0A(r5, r0)
            if (r0 != 0) goto L_0x015c
        L_0x010a:
            X.JcW r3 = A01(r10)
            X.82q r5 = r3.A0A
            r0 = r5
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r2 = r0.A01
            com.instagram.creation.base.PhotoSession r1 = r2.A02()
            r1.getClass()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r1.A08
            if (r0 == 0) goto L_0x0126
            com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl r0 = r0.E1g()
            r1.A07 = r0
        L_0x0126:
            com.instagram.creation.base.PhotoSession r0 = r2.A02()
            if (r0 == 0) goto L_0x0145
            com.instagram.creation.base.CropInfo r0 = r0.A05
            if (r0 == 0) goto L_0x0145
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r4 = r3.A04()
            int r3 = r2.A01()
            int r2 = r2.A00()
            android.graphics.Rect r1 = r0.A02
            int r0 = r5.ATT()
            X.C364978mK.A02(r1, r4, r3, r2, r0)
        L_0x0145:
            X.6SR r3 = X.AnonymousClass6SR.A01()
            X.0eM r2 = r10.A0i
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.String r0 = "edit_carousel"
            r3.A07(r1, r0, r7)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r2)
            X.C59888JbD.A00(r0)
            return r6
        L_0x015c:
            X.3Q2 r0 = r10.A0S
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r0.A3O
            if (r0 != 0) goto L_0x0045
            X.4mi r0 = r10.A0P
            if (r0 == 0) goto L_0x01bf
            com.instagram.creation.activity.MediaCaptureActivity r0 = (com.instagram.creation.activity.MediaCaptureActivity) r0
            X.JWG r1 = r0.A07
            if (r1 == 0) goto L_0x017c
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            boolean r0 = r1.A0A(r5, r0)
            if (r0 != 0) goto L_0x0045
            goto L_0x010a
        L_0x0177:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x017c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0181:
            X.0eM r4 = r10.A0i
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36320390938632579(0x81093400002183, double:3.0324997078421174E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x01b7
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r4)
            r0 = 36320390938698116(0x81093400012184, double:3.032499707883563E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x01b4
            java.lang.Integer r1 = X.AnonymousClass05K.A09
        L_0x01a5:
            X.4mi r0 = r10.A0P
            if (r0 == 0) goto L_0x01bf
            com.instagram.creation.activity.MediaCaptureActivity r0 = (com.instagram.creation.activity.MediaCaptureActivity) r0
            X.JWG r0 = r0.A07
            if (r0 == 0) goto L_0x01ba
            boolean r0 = r0.A0A(r5, r1)
            return r0
        L_0x01b4:
            java.lang.Integer r1 = X.AnonymousClass05K.A07
            goto L_0x01a5
        L_0x01b7:
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            goto L_0x01a5
        L_0x01ba:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x01bf:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59962JcV.onBackPressed():boolean");
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        Object value;
        C59964JcX jcX;
        Window A0G2;
        String str;
        int A022 = AnonymousClass0fD.A02(232070288);
        C59962JcV.super.onCreate(bundle);
        AnonymousClass0eM r3 = this.A0i;
        JWB.A00(this, AnonymousClass7TE.A0l(r3));
        this.mLifecycleRegistry.A09(A01(this));
        this.A0O = new LCk();
        C267834cI requireActivity = requireActivity();
        0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.pendingmedia.model.PendingMediaProvider");
        C267834cI r1 = requireActivity;
        C3499682q r0 = this.A0G;
        if (r0 == null) {
            str = "creationCameraSession";
        } else {
            this.A0S = r1.BbQ(r0.E2M());
            C64833Liv A002 = C63270KuF.A00(AnonymousClass7TE.A0l(r3));
            Context requireContext = requireContext();
            AnonymousClass3Q2 r2 = this.A0S;
            A002.A02.Epw(0sl.A00);
            A002.A00.clear();
            A002.A01(requireContext, r2);
            C49061Eof.A00(AnonymousClass7TE.A0l(r3)).A00(EWT.EDIT_PROFILE_PIC_FLOW, AnonymousClass05K.A0u);
            C322316vd.A00(AnonymousClass7TE.A0l(r3)).A05("photo_filter_fragment_loaded");
            if (A0B(this)) {
                num = AnonymousClass05K.A0N;
            } else if (C59963JcW.A03(this)) {
                num = AnonymousClass05K.A0Y;
            } else {
                num = AnonymousClass05K.A00;
            }
            05G r6 = A01(this).A0M;
            do {
                value = r6.getValue();
                jcX = (C59964JcX) value;
            } while (!r6.AIY(value, C59964JcX.A00(num, num, jcX.A03, jcX.A04, jcX.A05)));
            C59953JcJ.A00(AnonymousClass7TE.A0l(r3)).A09(false);
            C64168LRo A003 = C59953JcJ.A00(AnonymousClass7TE.A0l(r3));
            requireContext();
            C3499582p r02 = this.A0F;
            if (r02 == null) {
                str = "cameraSession";
            } else {
                A003.A08(r02);
                this.A0b = requireArguments().getBoolean(AnonymousClass000.A00(3433), false);
                UserSession A0l = AnonymousClass7TE.A0l(r3);
                if (182.A06(DbS.A0J(A0l, 0), A0l, 36323113947900771L) && (A0G2 = DbV.A0G(this)) != null) {
                    A0G2.setSoftInputMode(48);
                }
                AnonymousClass0fD.A09(-1568808624, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(704898647);
        boolean A052 = JWN.A05(DbT.A06(this, layoutInflater, 0));
        this.A0Y = A052;
        int i = R.layout.fragment_filter_small;
        if (A052) {
            i = R.layout.fragment_filter_v2;
        }
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, i, false);
        AnonymousClass0fD.A09(-364097129, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1984027913);
        super.onDestroyView();
        A01(this).A0A(false);
        LG9 lg9 = this.A0L;
        if (lg9 != null) {
            lg9.A01.A07.A0F();
        }
        C60715Jq4 jq4 = this.A0A;
        if (jq4 != null) {
            jq4.A02 = null;
            jq4.setAdapter((2Rw) null);
        }
        this.A0A = null;
        this.A06 = null;
        C234502xy r0 = this.A0R;
        if (r0 != null) {
            r0.release();
        }
        this.A0C = null;
        this.A09 = null;
        this.A0Q = null;
        this.A0N = null;
        AnonymousClass0eM r3 = this.A0i;
        if (C59961JcU.A00(AnonymousClass7TE.A0l(r3))) {
            A01(this).A04().EWl(26, true);
            AnonymousClass80Q r02 = this.A0I;
            if (r02 != null) {
                AnonymousClass80R r2 = r02.A00;
                r2.A0v.A09.removeView(r2.A0U);
            }
        }
        String str = "creationCameraSession";
        if (2Ht.A03(AnonymousClass7TE.A0l(r3))) {
            C3499682q r22 = this.A0G;
            if (r22 != null) {
                CreationSession creationSession = ((JWE) r22).A01;
                if (creationSession.A07 != null && r22.COf()) {
                    creationSession.A0F = true;
                }
                MXQ mxq = this.A0J;
                if (mxq == null) {
                    str = "imageRenderControllerManager";
                } else {
                    mxq.AOu();
                    AnonymousClass0fD.A09(-1475935619, A022);
                    return;
                }
            }
        } else {
            boolean z = ((FilterGroupModelImpl) A01(this).A04()).A04;
            C3499682q r23 = this.A0G;
            if (r23 != null) {
                CreationSession creationSession2 = ((JWE) r23).A01;
                if (creationSession2.A07 != null) {
                    if (!r23.COf()) {
                        C273514mi r03 = this.A0P;
                        if (r03 == null) {
                            str = "provider";
                        } else {
                            String E2g = r23.E2g();
                            JWH jwh = ((MediaCaptureActivity) r03).A08;
                            jwh.getClass();
                            jwh.A0A.remove(E2g);
                        }
                    } else if (!z) {
                        creationSession2.A0F = true;
                    }
                }
                AnonymousClass0fD.A09(-1475935619, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1862588286);
        C59962JcV.super.onPause();
        C240053Jk.A03.A02(getActivity(), AnonymousClass7TE.A0l(this.A0i));
        C66534MVo mVo = (C66534MVo) C61080JwI.A01(this);
        if (mVo != null) {
            mVo.onPause();
        }
        C234502xy r0 = this.A0R;
        if (r0 != null && r0.isPlaying()) {
            C234502xy r02 = this.A0R;
            if (r02 != null) {
                r02.pause();
            }
            this.A0c = true;
        }
        AnonymousClass0fD.A09(442776641, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(2057623114);
        super.onResume();
        C240053Jk.A03.A03(getActivity(), AnonymousClass7TE.A0l(this.A0i));
        AnonymousClass80Q r0 = this.A0I;
        if (r0 != null) {
            r0.A01();
        }
        if (this.A0c && !this.A0Z) {
            C234502xy r02 = this.A0R;
            if (r02 != null) {
                r02.E2p();
            }
            this.A0c = false;
        }
        AnonymousClass0fD.A09(-669022180, A022);
    }
}
