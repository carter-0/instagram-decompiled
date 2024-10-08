package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.android.R;
import com.instagram.api.schemas.CameraTool;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.ui.text.ConstrainedEditText;
import com.instagram.ui.text.fittingtextview.FittingTextView;
import com.instagram.ui.widget.drawing.EyedropperColorPickerTool;
import com.instagram.ui.widget.drawing.StrokeWidthTool;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8an  reason: invalid class name and case insensitive filesystem */
public final class C358368an implements AnonymousClass8MF, C358378ao, AnonymousClass8LV, C252213ok, AnonymousClass8O5, C358388ap, C358398aq {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = 0;
    public Drawable A04;
    public View.OnTouchListener A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public ImageView A0B;
    public ImageView A0C;
    public TextView A0D;
    public TextView A0E;
    public C279284yO A0F;
    public C279284yO A0G;
    public C347017w8 A0H;
    public C358598bA A0I = null;
    public C314446iH A0J;
    public ClipsCreationViewModel A0K;
    public C306386Ly A0L;
    public C369458un A0M;
    public Boolean A0N;
    public Boolean A0O;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Integer A0S;
    public Runnable A0T = null;
    public String A0U = "";
    public List A0V;
    public List A0W;
    public Set A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c = false;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public int A0g;
    public View A0h;
    public TextView A0i = null;
    public 2Fk A0j;
    public Boolean A0k;
    public boolean A0l;
    public boolean A0m;
    public final float A0n;
    public final float A0o;
    public final int A0p;
    public final Context A0q;
    public final Resources A0r;
    public final Handler A0s;
    public final GestureDetector A0t;
    public final View A0u;
    public final View A0v;
    public final View A0w;
    public final View A0x;
    public final View A0y;
    public final View A0z;
    public final View A10;
    public final View A11;
    public final View A12;
    public final View A13;
    public final View A14;
    public final View A15;
    public final ViewGroup A16;
    public final ViewStub A17;
    public final ViewStub A18;
    public final ViewStub A19;
    public final ViewStub A1A;
    public final TextView A1B;
    public final TextView A1C;
    public final RecyclerView A1D;
    public final RecyclerView A1E;
    public final RecyclerView A1F;
    public final RecyclerView A1G;
    public final 28D A1H;
    public final AnonymousClass4DH A1I;
    public final UserSession A1J;
    public final IgImageView A1K;
    public final AnonymousClass3E6 A1L;
    public final C252063oV A1M;
    public final C252063oV A1N;
    public final C354538Mk A1O;
    public final TargetViewSizeProvider A1P;
    public final C3499582p A1Q;
    public final AnonymousClass8BQ A1R;
    public final C358558b6 A1S;
    public final C358628bD A1T;
    public final C358408ar A1U;
    public final C358418as A1V;
    public final AnonymousClass80U A1W;
    public final AnonymousClass8MG A1X;
    public final C314676if A1Y;
    public final C314676if A1Z;
    public final C314676if A1a;
    public final C314676if A1b;
    public final C314676if A1c;
    public final C314676if A1d;
    public final C314676if A1e;
    public final C314676if A1f;
    public final C314676if A1g;
    public final C314676if A1h;
    public final 1Av A1i;
    public final ConstrainedEditText A1j;
    public final FittingTextView A1k;
    public final EyedropperColorPickerTool A1l;
    public final StrokeWidthTool A1m;
    public final InteractiveDrawableContainer A1n;
    public final String A1o;
    public final Map A1p = new HashMap();
    public final Map A1q = new 01r(0);
    public final Map A1r = new 01r(0);
    public final Drawable A1s;
    public final ViewStub A1t;
    public final ViewStub A1u;
    public final AnonymousClass8AL A1v;
    public final C358458aw A1w;
    public final C358678bI A1x;
    public final C358358am A1y;
    public final boolean A1z;

    public static void A0H(C358368an r15, String str, Map map, boolean z) {
        C358088aL r0;
        CameraTool cameraTool;
        C358088aL r02;
        C358368an r3 = r15;
        r15.A0e = false;
        A0A(r15);
        r15.A0V();
        ConstrainedEditText constrainedEditText = r15.A1j;
        constrainedEditText.requestFocus();
        constrainedEditText.setOnFocusChangeListener(new C358818bW(r15));
        SpannableString spannableString = new SpannableString(constrainedEditText.getText());
        String str2 = str;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        for (Object obj : spannableString.getSpans(0, spannableString.length(), Object.class)) {
            spannableStringBuilder.setSpan(obj, 0, str2.length(), spannableString.getSpanFlags(obj));
        }
        constrainedEditText.setText(spannableStringBuilder);
        C3499482o r7 = r15.A1Q.A02;
        C357638Yz r03 = r7.A01.A0X;
        if (r03 != null) {
            Set set = (Set) r03.A09.A00;
            if (z) {
                r02 = C358088aL.A0N;
            } else {
                r02 = C358088aL.A08;
            }
            set.add(r02);
        }
        C352218Cl r6 = r7.A00().A02;
        Map map2 = map;
        String str3 = (String) map2.getOrDefault(AnonymousClass000.A00(817), "");
        String str4 = (String) map2.getOrDefault(TraceFieldType.RequestID, "");
        String str5 = (String) map2.getOrDefault("response_id", "");
        if (r6 != null) {
            List list = r6.A0p;
            if (list == null) {
                list = new ArrayList();
                r6.A0p = list;
            }
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                arrayList.addAll(list);
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((LMH) it.next()).A01.A08.equals(str3)) {
                            break;
                        }
                    } else {
                        if (z) {
                            cameraTool = CameraTool.IMAGE_TO_TEXT_WITH_META_AI_INTENT;
                        } else {
                            cameraTool = CameraTool.AI_REWRITE_WITH_META_AI_INTENT;
                        }
                        arrayList.add(new LMH(cameraTool, new LN5("", "", str2, "", "", str3, "", str4, str5)));
                    }
                }
                r6.A0p = arrayList;
            }
        }
        C349307zv r62 = r7.A00().A03;
        if (r62 != null) {
            List list2 = r62.A0x;
            if (list2 == null) {
                list2 = new ArrayList();
                r62.A0x = list2;
            }
            ArrayList arrayList2 = new ArrayList();
            if (list2 != null) {
                arrayList2.addAll(list2);
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((LMH) it2.next()).A01.A08.equals(str3)) {
                            break;
                        }
                    } else {
                        arrayList2.add(new LMH(CameraTool.AI_REWRITE_WITH_META_AI_INTENT, new LN5("", "", str2, "", "", str3, "", str4, str5)));
                        break;
                    }
                }
                r62.A0x = arrayList2;
            }
        }
        27r A012 = 27p.A01(r3.A1J);
        String str6 = r3.A0U;
        if (z) {
            r0 = C358088aL.A0N;
        } else {
            r0 = C358088aL.A08;
        }
        A012.A1c(r0, str6);
    }

    public final void A0Z() {
        List list;
        this.A00 = -1;
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A1l;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(-1);
        }
        AnonymousClass8BQ r4 = this.A1R;
        if (182.A06(0Tu.A06, r4.A05, 36331124061914019L)) {
            list = AnonymousClass8BR.A04;
        } else {
            list = AnonymousClass8BR.A03;
        }
        r4.A01(list);
        1Av r42 = this.A1i;
        int i = this.A00;
        r42.A8C.Epx(r42, Integer.valueOf(i), 1Av.A8a[62]);
    }

    public final /* synthetic */ void D0n(boolean z) {
    }

    public final /* synthetic */ void DDq() {
    }

    public final /* synthetic */ void DDu() {
    }

    public final void DMr(int i, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.A0Z = true;
        if (!this.A0c && !this.A0e) {
            int i6 = 0;
            if (i <= 0 || this.A0a || A0O()) {
                i2 = 0;
            } else {
                i2 = AnonymousClass81Y.A00;
            }
            if (!A0P() || i <= 0 || A0N()) {
                i3 = 0;
            } else {
                i3 = this.A03;
            }
            C314676if r8 = this.A1g;
            int height = ((C360778f8) r8.get()).A08.getHeight();
            ViewGroup viewGroup = this.A16;
            int max = Math.max(height, viewGroup.getHeight());
            EyedropperColorPickerTool eyedropperColorPickerTool = this.A1l;
            int height2 = eyedropperColorPickerTool.getHeight();
            C387659mZ r1 = ((C360778f8) r8.get()).A02;
            if (r1 != null) {
                AnonymousClass8AL r5 = r1.A01;
                int height3 = r5.A0P.getHeight();
                View view = r5.A0J;
                0qQ.A07(view);
                i4 = height3 + 0nA.A0C(view);
            } else {
                i4 = 0;
            }
            int max2 = Math.max(height2, i4) + i3;
            if (z) {
                i6 = (-i) + i2;
            }
            this.A0g = i6;
            if (A0S(this)) {
                viewGroup.setTranslationY((float) (this.A0g - i3));
                this.A1G.setTranslationY((float) (this.A0g - i3));
                this.A1E.setTranslationY((float) (this.A0g - i3));
                this.A1F.setTranslationY((float) (this.A0g - i3));
            }
            View view2 = this.A14;
            if (view2 != null && !A0N()) {
                view2.setTranslationY((float) this.A0g);
            }
            ConstrainedEditText constrainedEditText = this.A1j;
            float f = (float) (-i3);
            constrainedEditText.setTranslationY(f);
            constrainedEditText.DMr(-this.A0g, z);
            constrainedEditText.A01 = max;
            constrainedEditText.A00 = max2;
            ConstrainedEditText.A00(constrainedEditText);
            C314676if r12 = this.A1d;
            if (r12 == null || !A0Q(this)) {
                C314676if r0 = this.A1a;
                if (r0 != null) {
                    C338677iL.A02((C338677iL) r0.get());
                }
            } else {
                C348987zP.A02((C348987zP) r12.get());
            }
            this.A1v.A0J.setTranslationY(f);
            boolean A0S2 = A0S(this);
            int i7 = this.A0g;
            if (A0S2) {
                i7 = (i7 - this.A0r.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin)) - i3;
            }
            StrokeWidthTool strokeWidthTool = this.A1m;
            strokeWidthTool.setTranslationY((float) i7);
            boolean A0S3 = A0S(this);
            int i8 = this.A0g;
            if (A0S3) {
                Resources resources = this.A0r;
                i8 = ((i8 - viewGroup.getHeight()) - resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap)) - resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
            }
            int i9 = i8 - i3;
            if (A0S(this)) {
                i5 = i9 - this.A0r.getDimensionPixelSize(R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
            } else {
                i5 = i9;
            }
            AnonymousClass8BQ r7 = this.A1R;
            float f2 = (float) i9;
            r7.A00.setTranslationY(f2);
            r7.A02.setTranslationY((float) i5);
            int i10 = i - i2;
            C387659mZ r02 = ((C360778f8) r8.get()).A02;
            if (r02 != null) {
                View view3 = r02.A01.A0J;
                0qQ.A07(view3);
                if (!z) {
                    i10 = 0;
                }
                0nA.A0X(view3, i10);
            }
            if (this.A1X.Erm()) {
                int top = strokeWidthTool.getTop() + (strokeWidthTool.getHeight() / 2);
                boolean A0S4 = A0S(this);
                int height4 = ((this.A15.getHeight() - i) / 2) - top;
                if (A0S4) {
                    height4 = (height4 - this.A0r.getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin)) - i3;
                }
                strokeWidthTool.setTranslationY((float) height4);
            } else {
                strokeWidthTool.setTranslationY(0.0f);
                f2 = (float) (i9 - this.A0g);
            }
            eyedropperColorPickerTool.setTranslationY(f2);
            View view4 = this.A0z;
            if (view4 != null) {
                view4.setTranslationY((float) (this.A0g - i3));
            }
            C358678bI r03 = this.A1x;
            if (r03 != null) {
                int i11 = this.A0g;
                r03.A00 = i11;
                C71662eb r13 = r03.A02;
                if (r13.A04()) {
                    r13.A01().setTranslationY((float) i11);
                }
            }
            C314676if r14 = this.A1Y;
            if (r14 != null && r14.A03) {
                ((C379049Sf) r14.get()).DMr(i + i3, z);
            }
        }
    }

    public final void DrL() {
    }

    public final void DrM(float f, float f2) {
    }

    private float A00() {
        C314676if r2 = this.A1g;
        return (float) AnonymousClass37Q.A04((double) this.A1m.getCurrentRatio(), 0.0d, 1.0d, (double) (((C360778f8) r2.get()).A07().A06.A00 * 12.0f), (double) (((C360778f8) r2.get()).A07().A06.A00 * 64.0f));
    }

    public static C279284yO A01(C358368an r0) {
        C357638Yz r02 = r0.A1Q.A02.A01.A0X;
        r02.getClass();
        return (C279284yO) r02.A08.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r1 > 0) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass91c A02(X.C358368an r5, X.C360728f3 r6, X.C358868bb r7) {
        /*
            com.instagram.common.session.UserSession r2 = r5.A1J
            android.content.Context r1 = r5.A0q
            X.8bi r0 = r7.A06
            int r0 = r0.A00(r1)
            if (r6 == 0) goto L_0x0040
            X.91c r4 = X.C39813AAk.A00(r1, r2, r6, r0)
        L_0x0010:
            r5.A0K(r4)
            boolean r0 = r4 instanceof X.C15927Ukr
            if (r0 == 0) goto L_0x0038
            X.4yO r0 = A01(r5)
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0038
            android.graphics.drawable.Drawable r3 = r5.A04
            r2 = 0
            if (r3 == 0) goto L_0x0039
            boolean r0 = r3 instanceof X.AnonymousClass5MI
            if (r0 == 0) goto L_0x0039
            X.5MI r3 = (X.AnonymousClass5MI) r3
            int r1 = r3.B1e()
            int r0 = r3.Byn()
            int r1 = r1 - r0
            if (r1 <= 0) goto L_0x0039
        L_0x0035:
            r4.EXC(r2, r1)
        L_0x0038:
            return r4
        L_0x0039:
            X.8MG r0 = r5.A1X
            int r1 = r0.AoK()
            goto L_0x0035
        L_0x0040:
            X.91c r4 = X.C39813AAk.A01(r1, r2, r7, r0)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A02(X.8an, X.8f3, X.8bb):X.91c");
    }

    public static C306386Ly A03(C358368an r4, C358868bb r5) {
        C360728f3 r0;
        C314676if r1 = r4.A1b;
        if (r1 == null || !A0Q(r4) || ((C349057zW) r1.get()).A00 == 0) {
            C314676if r12 = r4.A1a;
            if (r12 == null || A0Q(r4) || !((C338677iL) r12.get()).A07()) {
                C358938bi r02 = r5.A06;
                UserSession userSession = r4.A1J;
                Context context = r4.A0q;
                AnonymousClass9UM r03 = new AnonymousClass9UM(context, userSession, r02.A00(context));
                r4.A0K(r03);
                return r03;
            }
            r0 = null;
        } else {
            r0 = ((C349057zW) r1.get()).A00();
        }
        return A02(r4, r0, r5);
    }

    public static HashSet A04(C358368an r3, Boolean bool, Boolean bool2) {
        ArrayList arrayList;
        if (!r3.A1Q.A02.A0F()) {
            List B9U = r3.A1X.B9U();
            if (bool.booleanValue()) {
                arrayList = AnonymousClass9UR.A01(r3.A1J, r3.A1j.getText().toString());
            } else {
                arrayList = new ArrayList();
            }
            if (!bool2.booleanValue() || !arrayList.isEmpty()) {
                HashSet hashSet = new HashSet(B9U);
                hashSet.addAll(arrayList);
                return hashSet;
            }
        }
        return new HashSet();
    }

    private void A05() {
        View view;
        ImageView imageView = this.A0C;
        if (imageView != null && this.A0B != null) {
            imageView.setBackgroundDrawable((Drawable) null);
            this.A0B.setBackgroundDrawable((Drawable) null);
            C252063oV r4 = this.A1M;
            if (r4 != null && r4.CVM()) {
                r4.getView().setBackgroundDrawable((Drawable) null);
            }
            C252063oV r3 = this.A1N;
            if (r3 != null && r3.CVM()) {
                r3.getView().setBackgroundDrawable((Drawable) null);
            }
            if (A0S(this)) {
                Drawable drawable = this.A0r.getDrawable(R.drawable.text_tool_controls_menu_item_background_selected);
                int intValue = this.A0R.intValue();
                if (intValue == 2) {
                    view = this.A0C;
                } else if (intValue == 1) {
                    view = this.A0B;
                } else if (intValue != 3) {
                    if (intValue == 4 && r3 != null && r3.CVM()) {
                        view = r3.getView();
                    } else {
                        return;
                    }
                } else if (r4 != null && r4.CVM()) {
                    view = r4.getView();
                } else {
                    return;
                }
                view.setBackgroundDrawable(drawable);
            }
        }
    }

    private void A06(Spannable spannable, int i, int i2) {
        Spannable spannable2 = spannable;
        int i3 = i;
        int i4 = i2;
        C358838bY.A03(this.A0q, spannable2, i3, i4, this.A00, 0nH.A04(this.A00));
        int i5 = this.A00;
        this.A1m.setColour(i5);
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A1l;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(i5);
        }
    }

    public static void A07(C358368an r2) {
        if (r2.A0C == null && r2.A0q != null) {
            ImageView imageView = (ImageView) r2.A1A.inflate();
            r2.A0C = imageView;
            AnonymousClass0fU.A00(new AMR(r2), imageView);
        }
        if (r2.A0C != null && A0S(r2)) {
            r2.A0C.setVisibility(0);
            r2.A0C.setAlpha(1.0f);
        }
    }

    public static void A08(C358368an r2) {
        if (r2.A0B == null) {
            ImageView imageView = (ImageView) r2.A18.inflate();
            r2.A0B = imageView;
            imageView.setImageResource(R.drawable.instagram_icons_exceptions_color_picker_filled_44);
            AnonymousClass0fU.A00(new AMT(r2), r2.A0B);
        }
        if (r2.A0B != null && A0S(r2)) {
            r2.A0B.setVisibility(0);
            r2.A0B.setAlpha(1.0f);
        }
    }

    public static void A0B(C358368an r7) {
        Set set = r7.A0X;
        C358628bD r6 = r7.A1T;
        if (r6 != null && set.size() >= 2) {
            UserSession userSession = r7.A1J;
            if (182.A06(0Tu.A05, userSession, 36321743853463207L)) {
                1Av A002 = 1Au.A00(userSession);
                if (!((Boolean) A002.A5D.CDM(A002, 1Av.A8a[235])).booleanValue()) {
                    ArrayList arrayList = new ArrayList(set);
                    Bundle bundle = new Bundle(0);
                    bundle.putParcelableArrayList(AnonymousClass000.A00(3761), new ArrayList(arrayList));
                    AnonymousClass0Dg.A00(bundle, userSession);
                    E6I e6i = new E6I();
                    e6i.setArguments(bundle);
                    C331127Pr r2 = new C331127Pr(userSession);
                    r2.A0a = false;
                    r2.A14 = false;
                    Resources resources = r7.A0r;
                    r2.A0g = resources.getString(2131966116);
                    r2.A0h = resources.getString(2131966117);
                    r2.A1J = true;
                    r2.A1N = true;
                    r2.A0V = new C40651AgR(r6);
                    C331157Pu A003 = r2.A00();
                    ANS ans = new ANS(r6, A003);
                    ANT ant = new ANT(r6, A003);
                    BottomSheetFragment bottomSheetFragment = A003.A03;
                    C331127Pr r0 = bottomSheetFragment.A03;
                    if (r0 != null) {
                        r0.A0K = ans;
                        r0.A0L = ant;
                    }
                    bottomSheetFragment.A0Q();
                    A003.A02(r7.A1I.requireActivity(), e6i);
                    0wc r22 = r7.A1w.A00;
                    0Aj A004 = r22.A00(r22.A00, "direct_group_story_mention_nux_impression");
                    if (A004.isSampled()) {
                        A004.Cgf();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x023f, code lost:
        if (r26 == null) goto L_0x0241;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.C358368an r28) {
        /*
            r2 = r28
            java.lang.Integer r0 = r2.A0R
            int r1 = r0.intValue()
            r0 = 1
            r14 = 2
            if (r1 == r14) goto L_0x02d6
            if (r1 == r0) goto L_0x02ce
            r9 = 3
            if (r1 == r9) goto L_0x01aa
            r8 = 4
            if (r1 != r8) goto L_0x0300
            X.6if r1 = r2.A1e
            if (r1 == 0) goto L_0x0300
            java.lang.Object r5 = r1.get()
            X.7zg r5 = (X.C349157zg) r5
            X.6if r1 = r2.A1g
            java.lang.Object r1 = r1.get()
            X.8f8 r1 = (X.C360778f8) r1
            X.8bb r1 = r1.A07()
            X.0qQ.A0B(r1, r0)
            X.8an r4 = r5.A04
            X.4yO r3 = A01(r4)
            boolean r3 = r3 instanceof X.AnonymousClass80O
            if (r3 == 0) goto L_0x0171
            com.instagram.common.session.UserSession r7 = r5.A03
            X.0Tu r6 = X.0Tu.A05
            r3 = 36323139718556558(0x810bb4000d2b8e, double:3.03423804733449E-306)
            X.182.A06(r6, r7, r3)
            r3 = 36323139718491021(0x810bb4000c2b8d, double:3.034238047293044E-306)
            X.182.A06(r6, r7, r3)
            r3 = 36323139718622095(0x810bb4000e2b8f, double:3.034238047375936E-306)
        L_0x0050:
            X.182.A06(r6, r7, r3)
        L_0x0053:
            r5.A01 = r1
            X.7zX r7 = r5.A05
            com.instagram.common.recyclerview.ViewModelListUpdate r6 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r6.<init>()
            java.util.List r4 = r1.A0B
            r1 = 0
            if (r4 != 0) goto L_0x016e
            r5.A00 = r1
            r11 = 0
        L_0x0064:
            int r10 = r5.A00
            if (r4 == 0) goto L_0x016b
            int r3 = r4.size()
        L_0x006c:
            int r3 = r3 + 1
            if (r10 <= r3) goto L_0x0072
            r5.A00 = r1
        L_0x0072:
            android.content.Context r3 = r5.A02
            r10 = 2131975116(0x7f135bcc, float:1.9587315E38)
            java.lang.String r22 = r3.getString(r10)
            r10 = 2131238125(0x7f081ced, float:1.809252E38)
            android.graphics.drawable.Drawable r17 = r3.getDrawable(r10)
            r16 = 0
            int r10 = r5.A00
            r23 = 0
            if (r10 != 0) goto L_0x008c
            r23 = 1
        L_0x008c:
            java.lang.String r21 = ""
            X.7zc r15 = new X.7zc
            r18 = r16
            r19 = r16
            r20 = r16
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23)
            r6.A00(r15)
            if (r11 == 0) goto L_0x01a6
            if (r4 == 0) goto L_0x01a6
            int r15 = r4.size()
            r10 = 0
        L_0x00a5:
            if (r10 >= r15) goto L_0x01a6
            java.lang.Object r12 = r4.get(r10)
            X.6Lz r12 = (X.C306396Lz) r12
            if (r12 == 0) goto L_0x0114
            int r11 = r12.ordinal()
            if (r11 == r1) goto L_0x0162
            if (r11 == r0) goto L_0x0159
            if (r11 == r14) goto L_0x0150
            if (r11 == r9) goto L_0x0147
            if (r11 != r8) goto L_0x01a0
            android.content.res.Resources r13 = r3.getResources()
            r11 = 2131975113(0x7f135bc9, float:1.958731E38)
        L_0x00c4:
            java.lang.String r23 = r13.getString(r11)
            X.0qQ.A07(r23)
            int r11 = r12.ordinal()
            if (r11 == r1) goto L_0x013f
            if (r11 == r0) goto L_0x0137
            if (r11 == r14) goto L_0x012f
            if (r11 == r9) goto L_0x0127
            if (r11 != r8) goto L_0x019a
            android.content.res.Resources r13 = r3.getResources()
            r11 = 2131975112(0x7f135bc8, float:1.9587307E38)
        L_0x00e0:
            java.lang.String r24 = r13.getString(r11)
            X.0qQ.A07(r24)
            int r11 = r12.ordinal()
            if (r11 == r1) goto L_0x0123
            if (r11 == r0) goto L_0x011f
            if (r11 == r14) goto L_0x011b
            if (r11 == r9) goto L_0x0117
            if (r11 != r8) goto L_0x0194
            r11 = 2131238889(0x7f081fe9, float:1.809407E38)
        L_0x00f8:
            android.graphics.drawable.Drawable r19 = r3.getDrawable(r11)
            int r12 = r5.A00
            int r11 = r10 + 1
            r25 = 0
            if (r12 != r11) goto L_0x0106
            r25 = 1
        L_0x0106:
            X.7zc r11 = new X.7zc
            r17 = r11
            r21 = r16
            r22 = r16
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            r6.A00(r11)
        L_0x0114:
            int r10 = r10 + 1
            goto L_0x00a5
        L_0x0117:
            r11 = 2131238892(0x7f081fec, float:1.8094076E38)
            goto L_0x00f8
        L_0x011b:
            r11 = 2131238893(0x7f081fed, float:1.8094078E38)
            goto L_0x00f8
        L_0x011f:
            r11 = 2131238890(0x7f081fea, float:1.8094071E38)
            goto L_0x00f8
        L_0x0123:
            r11 = 2131238894(0x7f081fee, float:1.809408E38)
            goto L_0x00f8
        L_0x0127:
            android.content.res.Resources r13 = r3.getResources()
            r11 = 2131975117(0x7f135bcd, float:1.9587317E38)
            goto L_0x00e0
        L_0x012f:
            android.content.res.Resources r13 = r3.getResources()
            r11 = 2131975119(0x7f135bcf, float:1.9587321E38)
            goto L_0x00e0
        L_0x0137:
            android.content.res.Resources r13 = r3.getResources()
            r11 = 2131975114(0x7f135bca, float:1.9587311E38)
            goto L_0x00e0
        L_0x013f:
            android.content.res.Resources r13 = r3.getResources()
            r11 = 2131975121(0x7f135bd1, float:1.9587325E38)
            goto L_0x00e0
        L_0x0147:
            android.content.res.Resources r13 = r3.getResources()
            r11 = 2131975118(0x7f135bce, float:1.958732E38)
            goto L_0x00c4
        L_0x0150:
            android.content.res.Resources r13 = r3.getResources()
            r11 = 2131975120(0x7f135bd0, float:1.9587323E38)
            goto L_0x00c4
        L_0x0159:
            android.content.res.Resources r13 = r3.getResources()
            r11 = 2131975115(0x7f135bcb, float:1.9587313E38)
            goto L_0x00c4
        L_0x0162:
            android.content.res.Resources r13 = r3.getResources()
            r11 = 2131975122(0x7f135bd2, float:1.9587327E38)
            goto L_0x00c4
        L_0x016b:
            r3 = 0
            goto L_0x006c
        L_0x016e:
            r11 = 1
            goto L_0x0064
        L_0x0171:
            X.4yO r3 = A01(r4)
            boolean r3 = r3 instanceof X.AnonymousClass9QA
            if (r3 == 0) goto L_0x0053
            com.instagram.common.session.UserSession r7 = r5.A03
            X.0Tu r6 = X.0Tu.A05
            r3 = 36323139718818706(0x810bb400112b92, double:3.0342380475002735E-306)
            X.182.A06(r6, r7, r3)
            r3 = 36323139718753169(0x810bb400102b91, double:3.0342380474588277E-306)
            X.182.A06(r6, r7, r3)
            r3 = 36323139718687632(0x810bb4000f2b90, double:3.034238047417382E-306)
            goto L_0x0050
        L_0x0194:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x019a:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x01a0:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x01a6:
            int r4 = r5.A00
            goto L_0x02e4
        L_0x01aa:
            X.6if r1 = r2.A1b
            if (r1 == 0) goto L_0x0300
            java.lang.Object r5 = r1.get()
            X.7zW r5 = (X.C349057zW) r5
            X.6if r1 = r2.A1g
            java.lang.Object r1 = r1.get()
            X.8f8 r1 = (X.C360778f8) r1
            X.8bb r1 = r1.A07()
            X.0qQ.A0B(r1, r0)
            r5.A01 = r1
            X.7zX r7 = r5.A07
            com.instagram.common.recyclerview.ViewModelListUpdate r6 = new com.instagram.common.recyclerview.ViewModelListUpdate
            r6.<init>()
            java.util.List r4 = r1.A0A
            r1 = 0
            if (r4 != 0) goto L_0x02cb
            r5.A00 = r1
            r9 = 0
        L_0x01d4:
            int r8 = r5.A00
            if (r4 == 0) goto L_0x02c8
            int r3 = r4.size()
        L_0x01dc:
            int r3 = r3 + 1
            if (r8 <= r3) goto L_0x01e2
            r5.A00 = r1
        L_0x01e2:
            android.content.Context r3 = r5.A03
            r8 = 2131975099(0x7f135bbb, float:1.958728E38)
            java.lang.String r20 = r3.getString(r8)
            r8 = 2131238125(0x7f081ced, float:1.809252E38)
            android.graphics.drawable.Drawable r15 = r3.getDrawable(r8)
            r14 = 0
            int r8 = r5.A00
            r21 = 0
            if (r8 != 0) goto L_0x01fb
            r21 = 1
        L_0x01fb:
            java.lang.String r19 = ""
            X.7zc r13 = new X.7zc
            r16 = r14
            r17 = r14
            r18 = r14
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            r6.A00(r13)
            if (r9 == 0) goto L_0x02e2
            if (r4 == 0) goto L_0x02e2
            int r11 = r4.size()
            r9 = 0
        L_0x0214:
            if (r9 >= r11) goto L_0x02e2
            java.lang.Object r10 = r4.get(r9)
            X.8f3 r10 = (X.C360728f3) r10
            if (r10 == 0) goto L_0x0287
            r13 = 10
            int[] r8 = X.A2O.A00
            int r12 = r10.ordinal()
            if (r12 == r13) goto L_0x02bf
            r8 = 9
            if (r12 == r8) goto L_0x02bf
            r8 = 11
            if (r12 == r8) goto L_0x02b6
            r8 = 12
            if (r12 != r8) goto L_0x0241
            android.content.res.Resources r12 = r3.getResources()
            r8 = 2131975098(0x7f135bba, float:1.9587279E38)
        L_0x023b:
            java.lang.String r26 = r12.getString(r8)
            if (r26 != 0) goto L_0x0243
        L_0x0241:
            r26 = r19
        L_0x0243:
            int r12 = r10.ordinal()
            if (r12 == r13) goto L_0x02a2
            r8 = 9
            if (r12 == r8) goto L_0x02a2
            r8 = 11
            if (r12 == r8) goto L_0x029a
            r8 = 12
            if (r12 == r8) goto L_0x02aa
            r27 = 0
        L_0x0257:
            int r10 = r10.ordinal()
            if (r10 == r13) goto L_0x028e
            r8 = 9
            if (r10 == r8) goto L_0x028e
            r8 = 11
            if (r10 == r8) goto L_0x0292
            r8 = 12
            if (r10 == r8) goto L_0x028a
            r22 = 0
        L_0x026b:
            int r10 = r5.A00
            int r8 = r9 + 1
            r28 = 0
            if (r10 != r8) goto L_0x0275
            r28 = 1
        L_0x0275:
            X.7zc r8 = new X.7zc
            r20 = r8
            r21 = r14
            r23 = r14
            r24 = r14
            r25 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A00(r8)
        L_0x0287:
            int r9 = r9 + 1
            goto L_0x0214
        L_0x028a:
            r8 = 2131238879(0x7f081fdf, float:1.809405E38)
            goto L_0x0295
        L_0x028e:
            r8 = 2131238883(0x7f081fe3, float:1.8094057E38)
            goto L_0x0295
        L_0x0292:
            r8 = 2131238882(0x7f081fe2, float:1.8094055E38)
        L_0x0295:
            android.graphics.drawable.Drawable r22 = r3.getDrawable(r8)
            goto L_0x026b
        L_0x029a:
            android.content.res.Resources r12 = r3.getResources()
            r8 = 2131975100(0x7f135bbc, float:1.9587283E38)
            goto L_0x02b1
        L_0x02a2:
            android.content.res.Resources r12 = r3.getResources()
            r8 = 2131975102(0x7f135bbe, float:1.9587287E38)
            goto L_0x02b1
        L_0x02aa:
            android.content.res.Resources r12 = r3.getResources()
            r8 = 2131975097(0x7f135bb9, float:1.9587277E38)
        L_0x02b1:
            java.lang.String r27 = r12.getString(r8)
            goto L_0x0257
        L_0x02b6:
            android.content.res.Resources r12 = r3.getResources()
            r8 = 2131975101(0x7f135bbd, float:1.9587285E38)
            goto L_0x023b
        L_0x02bf:
            android.content.res.Resources r12 = r3.getResources()
            r8 = 2131975103(0x7f135bbf, float:1.9587289E38)
            goto L_0x023b
        L_0x02c8:
            r3 = 0
            goto L_0x01dc
        L_0x02cb:
            r9 = 1
            goto L_0x01d4
        L_0x02ce:
            X.8BQ r1 = r2.A1R
            r1.A03(r0, r0)
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r1 = r2.A1l
            goto L_0x02f8
        L_0x02d6:
            X.6if r1 = r2.A1g
            java.lang.Object r1 = r1.get()
            X.8f8 r1 = (X.C360778f8) r1
            r1.A08()
            goto L_0x0300
        L_0x02e2:
            int r4 = r5.A00
        L_0x02e4:
            boolean r3 = r7.A03
            if (r3 != 0) goto L_0x02f6
            X.2t9 r3 = r7.A08
            r3.A05(r6)
            r3.notifyDataSetChanged()
            X.C349067zX.A01(r7, r4, r0, r1)
            X.C349067zX.A00(r7)
        L_0x02f6:
            androidx.recyclerview.widget.RecyclerView r1 = r7.A07
        L_0x02f8:
            android.view.View[] r3 = new android.view.View[]{r1}
            r1 = 0
            X.C294975nL.A04(r1, r3, r0)
        L_0x0300:
            A0J(r2, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0C(X.8an):void");
    }

    public static void A0D(C358368an r6) {
        float f;
        float f2;
        float f3;
        IgImageView igImageView = r6.A1K;
        if (igImageView != null && igImageView.getVisibility() == 0) {
            int width = (igImageView.getWidth() - ((igImageView.getHeight() * igImageView.A02) / igImageView.A01)) / 2;
            int intValue = ((AnonymousClass91a) r6.A1Z.get()).A00.intValue();
            if (intValue == 1) {
                f = r6.A1j.getPivotX();
                f2 = ((float) igImageView.getWidth()) / 2.0f;
                f3 = f - f2;
            } else if (intValue == 0) {
                f = r6.A0q.getResources().getDimension(R.dimen.abc_dialog_padding_material);
                f2 = (float) width;
                f3 = f - f2;
            } else if (intValue == 2) {
                f3 = ((((float) r6.A1j.getRight()) - r6.A0q.getResources().getDimension(R.dimen.abc_dialog_padding_material)) - ((float) igImageView.getWidth())) + ((float) width);
            } else {
                return;
            }
            igImageView.setX(f3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cd, code lost:
        if ((r4 instanceof X.C389959qV) != false) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0E(X.C358368an r6) {
        /*
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r6.A1K
            if (r3 == 0) goto L_0x0086
            android.view.View r0 = r6.A0x
            int r1 = r0.getHeight()
            android.view.ViewGroup r0 = r6.A16
            int r0 = r0.getHeight()
            int r0 = java.lang.Math.max(r1, r0)
            com.instagram.ui.text.ConstrainedEditText r2 = r6.A1j
            float r1 = r2.getY()
            float r0 = (float) r0
            float r1 = java.lang.Math.max(r1, r0)
            int r0 = r2.getHeight()
            float r4 = (float) r0
            float r0 = r2.getScaleY()
            float r4 = r4 * r0
            float r1 = r1 + r4
            float r5 = r6.A00()
            android.text.Editable r4 = r2.getText()
            X.0qQ.A07(r4)
            java.lang.Class<X.8bb> r0 = X.C358868bb.class
            java.lang.Object r0 = X.C263324Kh.A00(r4, r0)
            X.8bb r0 = (X.C358868bb) r0
            if (r0 != 0) goto L_0x0046
            java.lang.String r4 = "classic"
            r0 = 0
            X.8bb r0 = X.C358878bc.A01(r4, r0, r0, r0, r0)
        L_0x0046:
            X.8f1 r4 = r0.A04
            if (r4 == 0) goto L_0x00d7
            boolean r0 = r4 instanceof X.C360868fH
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r4 instanceof X.C360808fB
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r4 instanceof X.C360848fF
            if (r0 == 0) goto L_0x0087
            r0 = 1050253722(0x3e99999a, float:0.3)
        L_0x0059:
            float r5 = r5 * r0
        L_0x005a:
            float r1 = r1 + r5
            android.content.Context r5 = r6.A0q
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            float r0 = r4.getDimension(r0)
            float r1 = r1 + r0
            android.content.res.Resources r4 = r5.getResources()
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            float r0 = r4.getDimension(r0)
            float r1 = r1 - r0
            r3.setY(r1)
            float r0 = r2.getScaleY()
            r3.setScaleY(r0)
            float r0 = r2.getScaleX()
            r3.setScaleX(r0)
        L_0x0086:
            return
        L_0x0087:
            boolean r0 = r4 instanceof X.C360858fG
            if (r0 == 0) goto L_0x008f
            r0 = 1060320051(0x3f333333, float:0.7)
            goto L_0x0059
        L_0x008f:
            boolean r0 = r4 instanceof X.C360838fE
            if (r0 == 0) goto L_0x0097
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            goto L_0x0059
        L_0x0097:
            boolean r0 = r4 instanceof X.C360788f9
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r4 instanceof X.C360798fA
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r4 instanceof X.C360898fK
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r4 instanceof X.C360828fD
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r4 instanceof X.C360818fC
            if (r0 == 0) goto L_0x00af
            r0 = -1092196762(0xffffffffbee66666, float:-0.45)
            goto L_0x0059
        L_0x00af:
            boolean r0 = r4 instanceof X.C349277zs
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r4 instanceof X.C349287zt
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r4 instanceof X.C360688ez
            if (r0 == 0) goto L_0x00c3
            r0 = 1063675494(0x3f666666, float:0.9)
            goto L_0x0059
        L_0x00bf:
            r0 = -1110651699(0xffffffffbdcccccd, float:-0.1)
            goto L_0x0059
        L_0x00c3:
            boolean r0 = r4 instanceof X.C349267zr
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r4 instanceof X.C360878fI
            if (r0 != 0) goto L_0x00d3
            boolean r0 = r4 instanceof X.C389959qV
            if (r0 == 0) goto L_0x00d7
        L_0x00cf:
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            goto L_0x0059
        L_0x00d3:
            r0 = 1053609165(0x3ecccccd, float:0.4)
            goto L_0x0059
        L_0x00d7:
            r5 = 0
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0E(X.8an):void");
    }

    public static void A0F(C358368an r12) {
        UserSession userSession = r12.A1J;
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, userSession, 36321743853463207L)) {
            if (!r12.A0d) {
                HashSet A042 = A04(r12, false, false);
                r12.A0X = A042;
                if (A042.size() > 1) {
                    C358628bD r3 = r12.A1T;
                    if (r3 != null) {
                        r3.A00 = r12.A0X.size();
                        View view = r3.A02;
                        if (view.getVisibility() != 0) {
                            0wc r2 = r3.A04.A00;
                            0Aj A002 = r2.A00(r2.A00, "direct_group_story_mention_toggle_impression");
                            if (A002.isSampled()) {
                                A002.Cgf();
                            }
                        }
                        view.setVisibility(0);
                        if (182.A06(r6, userSession, 36321743853659818L) && !r3.A01) {
                            HashSet hashSet = new HashSet();
                            Iterator it = A042.iterator();
                            while (it.hasNext()) {
                                hashSet.add(((User) it.next()).getId());
                            }
                            Boolean bool = (Boolean) r12.A1p.get(hashSet);
                            if (bool == null) {
                                C71129OdS.A05(userSession, ThreadFetchReason.UPDATE_STORY_MENTION_SETTINGS, new C40502AdB(r3, r12, hashSet), new ArrayList(hashSet), false, false);
                                return;
                            }
                            r3.A00(bool.booleanValue(), false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            C358628bD r0 = r12.A1T;
            if (r0 != null) {
                r0.A02.setVisibility(8);
            }
        }
    }

    public static void A0G(C358368an r14, Integer num) {
        String str;
        ImageView imageView;
        C295005nO r0;
        29Z r6;
        0Aj A002;
        AnonymousClass80P r1;
        if (r14.A0R != num) {
            UserSession userSession = r14.A1J;
            AnonymousClass8A2 A012 = AnonymousClass8A1.A01(userSession);
            int intValue = num.intValue();
            switch (intValue) {
                case 0:
                    str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                    break;
                case 1:
                    str = "COLOR_PICKER";
                    break;
                case 2:
                    str = "FORMAT_PICKER";
                    break;
                case 3:
                    str = "ANIMATION_PICKER";
                    break;
                default:
                    str = "EFFECT_PICKER";
                    break;
            }
            String lowerCase = str.toLowerCase();
            0qQ.A0B(lowerCase, 0);
            long j = A012.A04;
            if (j != 17643726) {
                A012.A0K.A0D(lowerCase, j, (String) null, (String) null, (String) null, (String) null);
            }
            A0I(r14, false);
            r14.A0R = num;
            if (intValue == 2) {
                29Z r7 = 27p.A01(userSession).A0F;
                0wc r5 = r7.A01;
                0Aj A003 = r5.A00(r5.A00, "ig_camera_ui_tool_click");
                if (A003.isSampled()) {
                    A003.A8M(AnonymousClass80P.TEXT_FORMAT, "tool_type");
                    A003.AAJ("legacy_falco_event_name", "IG_CAMERA_EDIT_TEXT_FORMAT");
                    AnonymousClass283 r62 = r7.A04;
                    String str2 = r62.A0L;
                    if (str2 == null) {
                        str2 = "";
                    }
                    A003.AAJ("camera_session_id", str2);
                    A003.A8k("event_type", 2);
                    A003.A8M(r62.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A003.A8M(r62.A0C, "surface");
                    A003.AAJ("module", 27x.A08.getModuleName());
                    A003.A8M(r7.A0J(), "camera_destination");
                    A003.AAJ("composition_str_id", r62.A0M);
                    A003.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A003.Cgf();
                }
                if (!A0S(r14)) {
                    imageView = r14.A0C;
                    imageView.getClass();
                    r0 = new C40635Afx(r14);
                    C294975nL.A03(imageView, r0, 8, false);
                }
            } else if (intValue != 1) {
                if (intValue == 3) {
                    r6 = 27p.A01(userSession).A0F;
                    0wc r4 = r6.A01;
                    A002 = r4.A00(r4.A00, "ig_camera_ui_tool_click");
                    if (A002.isSampled()) {
                        r1 = AnonymousClass80P.TEXT_ANIMATION_BUTTON;
                    }
                } else if (intValue == 4) {
                    r6 = 27p.A01(userSession).A0F;
                    0wc r42 = r6.A01;
                    A002 = r42.A00(r42.A00, "ig_camera_ui_tool_click");
                    if (A002.isSampled()) {
                        r1 = AnonymousClass80P.TEXT_GRAPHIC_EFFECT_BUTTON;
                    }
                }
                A002.A8M(r1, "tool_type");
                AnonymousClass283 r52 = r6.A04;
                String str3 = r52.A0L;
                if (str3 == null) {
                    str3 = "";
                }
                A002.AAJ("camera_session_id", str3);
                A002.A8k("event_type", 2);
                A002.A8M(r52.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A002.AAJ("module", 27x.A08.getModuleName());
                A002.A8M(r52.A0C, "surface");
                A002.A8M(r6.A0J(), "camera_destination");
                A002.AAJ("composition_str_id", r52.A0M);
                A002.A8M(r52.A0A, "composition_media_type");
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.Cgf();
            } else {
                29Z r63 = 27p.A01(userSession).A0F;
                0wc r53 = r63.A01;
                0Aj A004 = r53.A00(r53.A00, "ig_camera_ui_tool_click");
                if (A004.isSampled()) {
                    A004.A8M(AnonymousClass80P.TEXT_COLOR_EDIT, "tool_type");
                    A004.AAJ("legacy_falco_event_name", "IG_CAMERA_EDIT_TEXT_COLOR");
                    AnonymousClass283 r72 = r63.A04;
                    String str4 = r72.A0L;
                    if (str4 == null) {
                        str4 = "";
                    }
                    A004.AAJ("camera_session_id", str4);
                    A004.A8M(r72.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A004.A8k("event_type", 2);
                    A004.AAJ("module", 27x.A08.getModuleName());
                    A004.A8M(r72.A0C, "surface");
                    A004.A8M(r63.A0J(), "camera_destination");
                    A004.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                    A004.Cgf();
                }
                if (!A0S(r14)) {
                    imageView = r14.A0B;
                    imageView.getClass();
                    r0 = new C40636Afy(r14);
                    C294975nL.A03(imageView, r0, 8, false);
                }
            }
            r14.A05();
            C314676if r12 = r14.A1Y;
            if (r12 != null && r12.A03 && ((C379049Sf) r12.get()).A0G.getItemCount() > 0) {
                ((C379049Sf) r12.get()).A02(true);
                C294975nL.A04((C295005nO) null, new View[]{r14.A1m}, true);
            }
            if (r14.A02 > 0) {
                RecyclerView recyclerView = r14.A1D;
                if (recyclerView != null) {
                    recyclerView.A0o(0);
                }
                C294975nL.A05(new View[]{r14.A0z}, true);
                C358678bI r02 = r14.A1x;
                if (r02 != null) {
                    C71662eb r13 = r02.A02;
                    if (r13.A04()) {
                        C294975nL.A05(new View[]{r13.A01()}, true);
                    }
                }
                C294975nL.A04((C295005nO) null, new View[]{r14.A1m}, true);
                r14.A02 = 0;
            }
            if (r14.A0R != AnonymousClass05K.A00) {
                A0C(r14);
            }
        }
    }

    public static void A0I(C358368an r4, boolean z) {
        View[] viewArr;
        View view;
        C349067zX r0;
        C314676if r02;
        int intValue = r4.A0R.intValue();
        if (intValue != 2) {
            if (intValue != 1) {
                if (intValue == 3) {
                    C314676if r03 = r4.A1b;
                    if (r03 != null) {
                        r0 = ((C349057zW) r03.get()).A07;
                    }
                } else if (intValue == 4 && (r02 = r4.A1e) != null) {
                    r0 = ((C349157zg) r02.get()).A05;
                }
                viewArr = new View[1];
                view = r0.A07;
            } else {
                r4.A1R.A02(z);
                viewArr = new View[1];
                view = r4.A1l;
            }
            viewArr[0] = view;
            C294975nL.A05(viewArr, z);
        } else {
            ((C360778f8) r4.A1g.get()).A0A(z);
        }
        A0J(r4, false, z);
    }

    public static void A0J(C358368an r6, boolean z, boolean z2) {
        ViewGroup viewGroup;
        if (!r6.A1z) {
            UserSession userSession = r6.A1J;
            if (182.A06(0Tu.A05, userSession, 36321743853725355L) && z != r6.A0m) {
                if (A0S(r6) && ((viewGroup = r6.A16) == null || viewGroup.getVisibility() != 0)) {
                    return;
                }
                if (A04(r6, true, true).size() <= 1 || !z) {
                    View view = r6.A0h;
                    if (view != null) {
                        C294975nL.A05(new View[]{view}, z2);
                        return;
                    }
                    return;
                }
                if (r6.A0h == null) {
                    r6.A0h = r6.A1u.inflate();
                }
                if (A0S(r6)) {
                    C71492dQ r5 = (C71492dQ) r6.A0h.getLayoutParams();
                    ViewGroup viewGroup2 = r6.A16;
                    r5.A0G = viewGroup2.getId();
                    r5.bottomMargin = Math.round(((float) viewGroup2.getTop()) - viewGroup2.getY());
                    int dimensionPixelSize = r6.A0r.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                    r6.A0h.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                    r6.A0h.requestLayout();
                }
                r6.A0m = true;
                0xa r3 = 1Au.A00(userSession).A01;
                0xY AR4 = r3.AR4();
                AR4.E5Z("preference_show_mention_thread_send_setting_helper_text_seen_count", r3.getInt("preference_show_mention_thread_send_setting_helper_text_seen_count", 0) + 1);
                AR4.apply();
            }
        }
    }

    private void A0K(C306386Ly r5) {
        C314676if r1 = this.A1c;
        if (!r1.A03 || ((A9W) r1.get()).A01 != AnonymousClass05K.A00) {
            r5.A0K = null;
            r5.A0b.clearShadowLayer();
            r5.A0R();
        } else {
            r5.A0D(this.A0o, 0.0f, this.A0n, this.A0p);
        }
        r5.A0I(AnonymousClass0qo.A00(this.A0q).A02(0qm.A0z));
        r5.A09();
    }

    private void A0L(boolean z) {
        ConstrainedEditText constrainedEditText = this.A1j;
        int selectionStart = constrainedEditText.getSelectionStart();
        int selectionEnd = constrainedEditText.getSelectionEnd();
        A06(constrainedEditText.getText(), selectionStart, selectionEnd);
        constrainedEditText.setSelection(selectionStart, selectionEnd);
        this.A1X.FJt(z);
    }

    private boolean A0P() {
        C357638Yz r2 = this.A1Q.A02.A01.A0X;
        r2.getClass();
        if (r2.A08.A00 != AnonymousClass9QA.A00 || r2.A0V(C358088aL.A0p) || this.A0a) {
            return false;
        }
        return true;
    }

    public final C306576Mr A0T() {
        Editable text = this.A1j.getText();
        0qQ.A0B(text, 0);
        return C358948bj.A00(text, 0, text.length());
    }

    public final void A0U() {
        ConstrainedEditText constrainedEditText = this.A1j;
        if (constrainedEditText.hasFocus()) {
            constrainedEditText.clearFocus();
        }
    }

    public final void A0V() {
        Integer A002;
        ConstrainedEditText constrainedEditText = this.A1j;
        0nA.A0v(constrainedEditText, true);
        boolean z = false;
        this.A1U.A01 = false;
        C314676if r1 = this.A1c;
        if (r1.A03) {
            A9W a9w = (A9W) r1.get();
            C306386Ly r0 = this.A0L;
            if (r0 == null) {
                A002 = AnonymousClass05K.A00;
                z = true;
            } else {
                A002 = C306496Mj.A00(r0);
            }
            a9w.A00(A002, z);
        }
        C314676if r02 = this.A1Y;
        if (r02 != null) {
            C379049Sf r12 = (C379049Sf) r02.get();
            Editable text = constrainedEditText.getText();
            r12.A00 = this.A1X.B9T();
            Set set = r12.A0L;
            set.clear();
            Collections.addAll(set, C263324Kh.A06(text, C15915Ukf.class));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        r2 = (X.C64145LQi) r1.get();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0W() {
        /*
            r3 = this;
            X.80U r0 = r3.A1W
            boolean r0 = r0.CZe()
            if (r0 != 0) goto L_0x0015
            X.6if r0 = r3.A1Z
            java.lang.Object r1 = r0.get()
            X.91a r1 = (X.AnonymousClass91a) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A00(r0)
        L_0x0015:
            X.6if r1 = r3.A1h
            if (r1 == 0) goto L_0x002e
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x002e
            java.lang.Object r2 = r1.get()
            X.LQi r2 = (X.C64145LQi) r2
            com.instagram.creation.capture.quickcapture.sundial.bottomsheet.BottomSheetViewController r1 = r2.A01
            if (r1 == 0) goto L_0x002e
            r0 = 0
            r2.A02 = r0
            r0 = 1
            r1.A03(r0)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0W():void");
    }

    public final void A0X() {
        Drawable drawable = this.A04;
        if (drawable == null) {
            drawable = this.A0L;
        }
        int i = 0;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
        ConstrainedEditText constrainedEditText = this.A1j;
        for (int i2 = 0; i2 < ((AnonymousClass91P[]) C263324Kh.A06(constrainedEditText.getText(), AnonymousClass91P.class)).length; i2++) {
        }
        View view = this.A0w;
        C294975nL.A04((C295005nO) null, new View[]{view, this.A16}, true);
        C294975nL.A04((C295005nO) null, new View[]{constrainedEditText}, !(this.A0L instanceof AnonymousClass91c));
        view.setEnabled(true);
        if (!this.A1W.CZe()) {
            i = this.A15.getContext().getColor(R.color.direct_light_mode_sticker_loading_end_color);
        }
        view.setBackgroundColor(i);
        if (this.A0a) {
            constrainedEditText.setFocusableInTouchMode(true);
        }
        constrainedEditText.requestFocus();
    }

    public final void A0Y() {
        int i;
        ConstrainedEditText constrainedEditText = this.A1j;
        String obj = constrainedEditText.getText().toString();
        if (!(obj == null || obj.length() == 0)) {
            constrainedEditText.setText("");
        }
        constrainedEditText.setTextColor(-1);
        constrainedEditText.setGravity(17);
        if (this.A0l) {
            i = this.A1i.A09();
        } else {
            i = -1;
        }
        A0a(i);
        C314676if r1 = this.A1c;
        if (r1.A03) {
            ((A9W) r1.get()).A00(AnonymousClass05K.A00, true);
        }
        int i2 = this.A00;
        this.A1m.setColour(i2);
        EyedropperColorPickerTool eyedropperColorPickerTool = this.A1l;
        if (eyedropperColorPickerTool != null) {
            eyedropperColorPickerTool.setColor(i2);
        }
        this.A0L = null;
        this.A04 = null;
        C294975nL.A05(new View[]{eyedropperColorPickerTool}, false);
        A0F(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (X.182.A06(X.0Tu.A06, r8.A1J, 36323139718425484L) == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (X.182.A06(X.0Tu.A06, r8.A1J, 36323139717835651L) == false) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0a(int r9) {
        /*
            r8 = this;
            r8.A00 = r9
            r3 = 1
            r8.A0L(r3)
            X.6if r4 = r8.A1c
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r4.get()
            X.A9W r0 = (X.A9W) r0
            r0.A00 = r9
        L_0x0014:
            X.6if r6 = r8.A1d
            if (r6 == 0) goto L_0x0093
            X.4yO r0 = A01(r8)
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0030
            com.instagram.common.session.UserSession r5 = r8.A1J
            X.0Tu r2 = X.0Tu.A06
            r0 = 36323139717835651(0x810bb400022b83, double:3.0342380468785856E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r7 = 1
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r7 = 0
        L_0x0031:
            X.4yO r0 = A01(r8)
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0049
            com.instagram.common.session.UserSession r5 = r8.A1J
            X.0Tu r2 = X.0Tu.A06
            r0 = 36323139718425484(0x810bb4000b2b8c, double:3.0342380472515984E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            r1 = 1
            if (r0 != 0) goto L_0x004a
        L_0x0049:
            r1 = 0
        L_0x004a:
            boolean r0 = r8.A0O()
            if (r0 == 0) goto L_0x0093
            if (r7 != 0) goto L_0x0054
            if (r1 == 0) goto L_0x0093
        L_0x0054:
            java.lang.Object r0 = r6.get()
            X.7zP r0 = (X.C348987zP) r0
            r0.A03()
        L_0x005d:
            com.instagram.ui.text.ConstrainedEditText r0 = r8.A1j
            boolean r0 = r0.hasSelection()
            if (r0 != 0) goto L_0x0072
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r4.get()
            X.A9W r0 = (X.A9W) r0
            r0.A01(r3)
        L_0x0072:
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r0 = r8.A1l
            if (r0 == 0) goto L_0x0079
            r0.setColor(r9)
        L_0x0079:
            X.1Av r4 = r8.A1i
            int r0 = r4.A09()
            int r3 = r8.A00
            if (r0 == r3) goto L_0x0092
            X.0s0 r2 = r4.A8C
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 62
            r1 = r1[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.Epx(r4, r0, r1)
        L_0x0092:
            return
        L_0x0093:
            X.6if r0 = r8.A1a
            if (r0 == 0) goto L_0x005d
            java.lang.Object r0 = r0.get()
            X.7iL r0 = (X.C338677iL) r0
            r0.A05()
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0a(int):void");
    }

    public final void A0b(Drawable drawable) {
        if (!(drawable instanceof C306386Ly)) {
            if (drawable instanceof AnonymousClass5MH) {
                drawable = ((AnonymousClass5MH) drawable).A0A;
                if (!(drawable instanceof C306386Ly)) {
                    return;
                }
            } else {
                return;
            }
        }
        if (drawable != null) {
            this.A1r.put(drawable, Float.valueOf(1.0f));
            this.A1q.put(drawable, new PointF(0.5f, 0.5f));
        }
    }

    public final void A0c(C360728f3 r4) {
        if (r4 != null) {
            27p.A01(this.A1J).A1t(r4.A00);
        }
        C314676if r0 = this.A1d;
        if (r0 != null) {
            C348987zP r2 = (C348987zP) r0.get();
            if (r2.A08.A0i()) {
                C348987zP.A01(r2);
                return;
            }
            C348987zP.A00(r2);
            r2.A06.removeCallbacks(r2.A09);
        }
    }

    public final void A0d(C306396Lz r7) {
        if (r7 != null) {
            29Z r4 = 27p.A01(this.A1J).A0F;
            String str = r7.A00;
            0qQ.A0B(str, 0);
            0wc r2 = r4.A01;
            0Aj A002 = r2.A00(r2.A00, "ig_camera_ui_tool_click");
            if (A002.isSampled()) {
                A002.A8M(AnonymousClass80P.TEXT_GRAPHIC_EFFECT, "tool_type");
                AnonymousClass283 r3 = r4.A04;
                String str2 = r3.A0L;
                if (str2 == null) {
                    str2 = "";
                }
                A002.AAJ("camera_session_id", str2);
                A002.AAJ("text_graphic_effect", str);
                A002.A8k("event_type", 2);
                A002.A8M(r3.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A002.AAJ("module", 27x.A08.getModuleName());
                A002.A8M(r3.A0C, "surface");
                A002.A8M(r4.A0J(), "camera_destination");
                A002.AAJ("composition_str_id", r3.A0M);
                A002.A8M(r3.A0A, "composition_media_type");
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.Cgf();
            }
        }
        C314676if r1 = this.A1d;
        if (r1 != null && A0Q(this)) {
            C348987zP r22 = (C348987zP) r1.get();
            if (r22.A08.A0i()) {
                C348987zP.A01(r22);
                return;
            }
            C348987zP.A00(r22);
            r22.A06.removeCallbacks(r22.A09);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x007c, code lost:
        if (A0T() == X.C306576Mr.INVERTED_OUTLINED) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0e(X.C306386Ly r9) {
        /*
            r8 = this;
            com.instagram.common.session.UserSession r0 = r8.A1J
            X.8A2 r1 = X.AnonymousClass8A1.A01(r0)
            java.lang.String r0 = "TextToolController#applyTextToolSettings"
            r1.A09(r0)
            com.instagram.ui.text.ConstrainedEditText r3 = r8.A1j
            android.content.Context r1 = r3.getContext()
            float r0 = r8.A00()
            float r0 = X.0nA.A03(r1, r0)
            r9.A0A(r0)
            X.6if r1 = r8.A1c
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x010e
            java.lang.Object r0 = r1.get()
            X.A9W r0 = (X.A9W) r0
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x010e
            float r4 = r8.A0o
            r2 = 0
            float r1 = r8.A0n
            int r0 = r8.A0p
            r9.A0D(r4, r2, r1, r0)
        L_0x0038:
            X.6if r4 = r8.A1e
            if (r4 == 0) goto L_0x009a
            boolean r0 = A0R(r8)
            if (r0 == 0) goto L_0x009a
            X.6if r0 = r8.A1g
            java.lang.Object r0 = r0.get()
            X.8f8 r0 = (X.C360778f8) r0
            X.8bb r1 = r0.A07()
            X.8bh r5 = r1.A05
            android.content.Context r0 = r8.A0q
            X.0qq r0 = X.AnonymousClass0qo.A00(r0)
            android.graphics.Typeface r0 = X.AnonymousClass91U.A01(r0, r5)
            r9.A0I(r0)
            X.8bi r0 = r1.A06
            float r0 = r0.A00
            r9.A04 = r0
            float r0 = X.AnonymousClass91U.A00(r5)
            r9.A05 = r0
            int r0 = r8.A00
            r9.A09 = r0
            X.6Mr r1 = r8.A0T()
            X.6Mr r0 = X.C306576Mr.OUTLINED
            if (r1 == r0) goto L_0x007e
            X.6Mr r2 = r8.A0T()
            X.6Mr r1 = X.C306576Mr.INVERTED_OUTLINED
            r0 = 0
            if (r2 != r1) goto L_0x007f
        L_0x007e:
            r0 = 1
        L_0x007f:
            r9.A0P = r0
            float r1 = r5.A00
            android.text.TextPaint r0 = r9.A0b
            r0.setLetterSpacing(r1)
            r9.A0R()
            java.lang.Object r0 = r4.get()
            X.7zg r0 = (X.C349157zg) r0
            X.6Lz r0 = r0.A00()
            r9.A0I = r0
            r9.A0R()
        L_0x009a:
            float r1 = r3.getLineSpacingExtra()
            float r0 = r3.getLineSpacingMultiplier()
            r9.A0B(r1, r0)
            android.text.Editable r2 = r3.getText()
            java.util.List r1 = X.A2N.A00
            int r0 = r1.size()
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.Class[] r1 = (java.lang.Class[]) r1
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r0 = 1
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = r2.toString()
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>(r0)
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.Class[] r0 = (java.lang.Class[]) r0
            X.C263324Kh.A04(r4, r2, r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r2 = r8.A0K
            if (r2 == 0) goto L_0x0167
            com.instagram.common.session.UserSession r0 = r2.A0J
            X.8A2 r1 = X.AnonymousClass8A1.A01(r0)
            java.lang.String r0 = "ClipsCreationViewModel#updateTextForTextDrawable"
            r1.A09(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.83d r7 = r2.A0N
            X.0Ud r0 = r7.A0E
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x00f4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x011b
            java.lang.Object r1 = r2.next()
            X.5MI r1 = (X.AnonymousClass5MI) r1
            android.graphics.drawable.Drawable r0 = r1.AfT()
            boolean r0 = X.0qQ.A0K(r0, r9)
            if (r0 == 0) goto L_0x00f4
            r3.add(r1)
            goto L_0x00f4
        L_0x010e:
            r0 = 0
            r9.A0K = r0
            android.text.TextPaint r0 = r9.A0b
            r0.clearShadowLayer()
            r9.A0R()
            goto L_0x0038
        L_0x011b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r2 = r3.iterator()
        L_0x0124:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0139
            java.lang.Object r1 = r2.next()
            X.5MI r1 = (X.AnonymousClass5MI) r1
            X.LnV r0 = new X.LnV
            r0.<init>(r1)
            r6.add(r0)
            goto L_0x0124
        L_0x0139:
            r9.A0L(r4)
            r1 = 0
            java.util.Iterator r5 = r3.iterator()
        L_0x0141:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r4 = r5.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto L_0x0157
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0157:
            java.lang.Object r2 = r6.get(r1)
            X.0V2 r1 = r7.A09
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r4)
            r1.FIA(r0)
            r1 = r3
            goto L_0x0141
        L_0x0167:
            r9.A0L(r4)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0e(X.6Ly):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:225:0x063e, code lost:
        if (r8.A8D.CDM(r8, X.1Av.A8a[61]) == null) goto L_0x0600;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x07f5, code lost:
        r7 = X.C358878bc.A01(r3, false, false, false, false);
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x031a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0560  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x05eb  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0661  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x070b  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x070f  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0713  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0723  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x072d  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0731  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x07b8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0297  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0f(java.lang.Integer r33) {
        /*
            r32 = this;
            r2 = r32
            com.instagram.common.session.UserSession r6 = r2.A1J
            r1 = 0
            X.0Tu r18 = X.0Tu.A05
            r3 = 36324028775935676(0x810c8300002ebc, double:3.034800290800991E-306)
            r0 = r18
            X.182.A06(r0, r6, r3)
            X.4yO r0 = A01(r2)
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x080b
            r3 = 36323139717770114(0x810bb400012b82, double:3.03423804683714E-306)
            r0 = r18
            X.182.A06(r0, r6, r3)
            r3 = 36323139717835651(0x810bb400022b83, double:3.0342380468785856E-306)
            X.182.A06(r0, r6, r3)
            r3 = 36323139717901188(0x810bb400032b84, double:3.0342380469200315E-306)
        L_0x0030:
            r0 = r18
            X.182.A06(r0, r6, r3)
        L_0x0035:
            X.4yO r0 = r2.A0F
            r2.A0G = r0
            X.4yO r0 = A01(r2)
            r2.A0F = r0
            com.instagram.ui.text.ConstrainedEditText r0 = r2.A1j
            r31 = r0
            r0 = 1
            r3 = r31
            r3.A02 = r0
            A09(r2)
            A0A(r2)
            com.instagram.ui.widget.drawing.StrokeWidthTool r5 = r2.A1m
            android.graphics.drawable.Drawable r3 = r2.A1s
            r5.setCollapsedIcon(r3)
            r5.setStrokeWidthButtonShowing(r1)
            boolean r3 = r2.A0P()
            if (r3 == 0) goto L_0x008a
            android.view.View r3 = r2.A14
            if (r3 == 0) goto L_0x008a
            android.view.View[] r4 = new android.view.View[]{r3}
            r3 = 0
            X.C294975nL.A04(r3, r4, r0)
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r4 = 0
            r7 = r33
            if (r7 == r3) goto L_0x0072
            r4 = 1
        L_0x0072:
            android.view.View r3 = r2.A10
            r3.getClass()
            r3.setEnabled(r4)
            android.widget.TextView r3 = r2.A1B
            r3.getClass()
            r3.setEnabled(r4)
            android.view.View r3 = r2.A11
            r3.getClass()
            r3.setEnabled(r4)
        L_0x008a:
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r2.A1K
            if (r4 == 0) goto L_0x009a
            r3 = 0
            r4.setY(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.setScaleX(r3)
            r4.setScaleY(r3)
        L_0x009a:
            com.instagram.ui.text.fittingtextview.FittingTextView r3 = r2.A1k
            r3.getClass()
            android.view.View[] r4 = new android.view.View[]{r3}
            r19 = 0
            r3 = r19
            X.C294975nL.A04(r3, r4, r0)
            android.view.View[] r4 = new android.view.View[]{r5}
            X.C294975nL.A04(r3, r4, r0)
            X.6if r3 = r2.A1g
            r30 = r3
            java.lang.Object r4 = r30.get()
            X.8f8 r4 = (X.C360778f8) r4
            X.6Ly r3 = r2.A0L
            if (r3 == 0) goto L_0x00f5
            android.text.Spannable r7 = r3.A0F
            X.0qQ.A07(r7)
            java.lang.Class<X.8bb> r3 = X.C358868bb.class
            java.lang.Object r7 = X.C263324Kh.A00(r7, r3)
            X.8bb r7 = (X.C358868bb) r7
            java.util.ArrayList r3 = X.C360778f8.A03(r4)
            boolean r3 = X.00k.A0u(r3, r7)
            if (r3 != 0) goto L_0x07f9
            if (r7 == 0) goto L_0x00e3
            java.lang.String r7 = r7.A09
            if (r7 == 0) goto L_0x00e3
            int r3 = r7.hashCode()
            switch(r3) {
                case -1068799201: goto L_0x07bf;
                case -891980137: goto L_0x07ca;
                case -394174419: goto L_0x07d5;
                case 3377622: goto L_0x07e0;
                case 853620882: goto L_0x07eb;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            r3 = 0
        L_0x00e4:
            X.C360778f8.A05(r4, r3, r1)
            r4.A09()
            X.8ao r7 = r4.A0D
            X.8bb r4 = r4.A07()
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r7.Dr2(r4, r3)
        L_0x00f5:
            java.lang.Object r7 = r30.get()
            X.8f8 r7 = (X.C360778f8) r7
            boolean r3 = r7.A0F
            if (r3 == 0) goto L_0x010c
            android.view.View r3 = r7.A08
            android.view.View[] r4 = new android.view.View[]{r3}
            X.2co r3 = X.C315596kB.A02
            r3 = r19
            X.C294975nL.A04(r3, r4, r0)
        L_0x010c:
            r7.A09()
            android.text.Editable r3 = r31.getText()
            java.lang.String r3 = r3.toString()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x012a
            boolean r3 = r2.A0l
            if (r3 == 0) goto L_0x07bc
            X.1Av r3 = r2.A1i
            int r3 = r3.A09()
        L_0x0127:
            r2.A0a(r3)
        L_0x012a:
            r5.A0J = r2
            X.4yO r3 = A01(r2)
            boolean r3 = r3 instanceof X.AnonymousClass80O
            if (r3 == 0) goto L_0x07b8
            boolean r3 = A0S(r2)
            if (r3 == 0) goto L_0x07b8
            java.lang.Integer r7 = X.AnonymousClass05K.A00
        L_0x013c:
            X.6Ly r3 = r2.A0L
            if (r3 == 0) goto L_0x0731
            android.content.Context r4 = r2.A0q
            android.text.TextPaint r3 = r3.A0b
            float r3 = r3.getTextSize()
            float r3 = X.0nA.A02(r4, r3)
            double r10 = (double) r3
            java.lang.Object r3 = r30.get()
            X.8f8 r3 = (X.C360778f8) r3
            X.8bb r3 = r3.A07()
            X.8bi r3 = r3.A06
            float r4 = r3.A00
            r3 = 1094713344(0x41400000, float:12.0)
            float r4 = r4 * r3
            double r8 = (double) r4
            java.lang.Object r3 = r30.get()
            X.8f8 r3 = (X.C360778f8) r3
            X.8bb r3 = r3.A07()
            X.8bi r3 = r3.A06
            float r4 = r3.A00
            r3 = 1115684864(0x42800000, float:64.0)
            float r4 = r4 * r3
            double r3 = (double) r4
            r26 = 0
            r28 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r20 = r10
            r22 = r8
            r24 = r3
            double r3 = X.AnonymousClass37Q.A04(r20, r22, r24, r26, r28)
            float r8 = (float) r3
            r5.setCurrentRatio(r8)
            X.6Ly r4 = r2.A0L
            boolean r3 = r4 instanceof X.AnonymousClass9UM
            if (r3 == 0) goto L_0x018d
            X.9UM r4 = (X.AnonymousClass9UM) r4
            java.lang.Integer r7 = r4.A01
        L_0x018d:
            r2.A0R = r7
            boolean r3 = A0S(r2)
            if (r3 == 0) goto L_0x019b
            A08(r2)
            A07(r2)
        L_0x019b:
            boolean r3 = A0Q(r2)
            if (r3 == 0) goto L_0x0229
            X.3oV r5 = r2.A1M
            if (r5 == 0) goto L_0x0229
            X.6if r7 = r2.A1b
            if (r7 == 0) goto L_0x0229
            X.80U r3 = r2.A1W
            boolean r3 = r3.CZe()
            if (r3 != 0) goto L_0x0229
            boolean r3 = r5.CVM()
            if (r3 != 0) goto L_0x01ba
            r5.getView()
        L_0x01ba:
            android.view.View r4 = r5.getView()
            X.AMS r3 = new X.AMS
            r3.<init>(r2)
            X.AnonymousClass0fU.A00(r3, r4)
            android.view.View r3 = r5.getView()
            android.view.View[] r4 = new android.view.View[]{r3}
            r3 = r19
            X.C294975nL.A04(r3, r4, r1)
            java.lang.Object r9 = r7.get()
            X.7zW r9 = (X.C349057zW) r9
            java.lang.Object r3 = r30.get()
            X.8f8 r3 = (X.C360778f8) r3
            X.8bb r4 = r3.A07()
            X.6Ly r8 = r2.A0L
            X.0qQ.A0B(r4, r1)
            r9.A01 = r4
            if (r8 == 0) goto L_0x072d
            boolean r3 = r8 instanceof X.AnonymousClass91c
            if (r3 == 0) goto L_0x072a
            java.util.List r4 = r4.A0A
            if (r4 == 0) goto L_0x0727
            X.91c r8 = (X.AnonymousClass91c) r8
            X.8f3 r3 = r8.A0X()
            int r3 = r4.indexOf(r3)
        L_0x01fe:
            int r3 = r3 + 1
        L_0x0200:
            r9.A00 = r3
        L_0x0202:
            X.8an r4 = r9.A06
            X.8f3 r3 = r9.A00()
            r4.A0c(r3)
            java.lang.Object r8 = r7.get()
            X.7zW r8 = (X.C349057zW) r8
            android.view.ViewGroup r4 = r2.A16
            android.view.View r3 = r5.getView()
            X.0qQ.A0B(r4, r1)
            X.0qQ.A0B(r3, r0)
            android.os.Handler r7 = r8.A04
            X.ApJ r5 = new X.ApJ
            r5.<init>(r4, r3, r8)
            r3 = 2000(0x7d0, double:9.88E-321)
            r7.postDelayed(r5, r3)
        L_0x0229:
            boolean r3 = A0R(r2)
            if (r3 == 0) goto L_0x0291
            X.3oV r7 = r2.A1N
            if (r7 == 0) goto L_0x0291
            X.6if r5 = r2.A1e
            if (r5 == 0) goto L_0x0291
            X.80U r3 = r2.A1W
            boolean r3 = r3.CZe()
            if (r3 != 0) goto L_0x0291
            boolean r3 = r7.CVM()
            if (r3 != 0) goto L_0x0248
            r7.getView()
        L_0x0248:
            android.view.View r4 = r7.getView()
            X.AMV r3 = new X.AMV
            r3.<init>(r2)
            X.AnonymousClass0fU.A00(r3, r4)
            android.view.View r3 = r7.getView()
            android.view.View[] r4 = new android.view.View[]{r3}
            r3 = r19
            X.C294975nL.A04(r3, r4, r1)
            java.lang.Object r5 = r5.get()
            X.7zg r5 = (X.C349157zg) r5
            java.lang.Object r3 = r30.get()
            X.8f8 r3 = (X.C360778f8) r3
            X.8bb r4 = r3.A07()
            X.6Ly r3 = r2.A0L
            X.0qQ.A0B(r4, r1)
            r5.A01 = r4
            if (r3 == 0) goto L_0x0723
            java.util.List r4 = r4.A0B
            if (r4 == 0) goto L_0x0720
            X.6Lz r3 = r3.A0I
            int r3 = r4.indexOf(r3)
        L_0x0284:
            int r3 = r3 + 1
            r5.A00 = r3
        L_0x0288:
            X.8an r4 = r5.A04
            X.6Lz r3 = r5.A00()
            r4.A0d(r3)
        L_0x0291:
            boolean r3 = A0S(r2)
            if (r3 != 0) goto L_0x02b0
            java.lang.Integer r3 = r2.A0R
            int r4 = r3.intValue()
            r3 = 2
            if (r4 == r3) goto L_0x0717
            if (r4 != r0) goto L_0x02b0
            android.view.View[] r4 = new android.view.View[r0]
            A07(r2)
            android.widget.ImageView r3 = r2.A0C
        L_0x02a9:
            r4[r1] = r3
            r3 = r19
            X.C294975nL.A04(r3, r4, r1)
        L_0x02b0:
            X.6if r4 = r2.A1a
            if (r4 == 0) goto L_0x02d5
            X.80U r3 = r2.A1W
            boolean r3 = r3.CZe()
            if (r3 != 0) goto L_0x02d5
            boolean r3 = A0Q(r2)
            if (r3 != 0) goto L_0x02d5
            X.6Ly r3 = r2.A0L
            boolean r7 = r3 instanceof X.AnonymousClass91c
            java.lang.Object r5 = r4.get()
            X.7iL r5 = (X.C338677iL) r5
            android.view.ViewGroup r4 = r2.A16
            boolean r3 = A0S(r2)
            r5.A06(r4, r7, r3)
        L_0x02d5:
            boolean r3 = A0S(r2)
            if (r3 == 0) goto L_0x0502
            X.4yO r4 = r2.A0G
            if (r4 == 0) goto L_0x02e3
            X.4yO r3 = r2.A0F
            if (r3 == r4) goto L_0x0502
        L_0x02e3:
            X.4yO r3 = A01(r2)
            boolean r3 = r3 instanceof X.AnonymousClass80O
            if (r3 == 0) goto L_0x0713
            java.lang.Integer r3 = X.AnonymousClass05K.A00
        L_0x02ed:
            r2.A0R = r3
            android.view.ViewGroup r8 = r2.A16
            r8.removeAllViews()
            android.widget.ImageView r14 = r2.A0C
            if (r14 != 0) goto L_0x02fa
            android.view.ViewStub r14 = r2.A1A
        L_0x02fa:
            android.widget.ImageView r12 = r2.A0B
            if (r12 != 0) goto L_0x0300
            android.view.ViewStub r12 = r2.A18
        L_0x0300:
            X.3oV r10 = r2.A1M
            if (r10 == 0) goto L_0x070f
            android.view.ViewStub r11 = r2.A17
            if (r11 == 0) goto L_0x070f
            boolean r3 = r10.CVM()
            if (r3 == 0) goto L_0x0312
            android.view.View r11 = r10.getView()
        L_0x0312:
            X.3oV r4 = r2.A1N
            if (r4 == 0) goto L_0x070b
            android.view.ViewStub r15 = r2.A19
            if (r15 == 0) goto L_0x070b
            boolean r3 = r4.CVM()
            if (r3 == 0) goto L_0x0324
            android.view.View r15 = r4.getView()
        L_0x0324:
            boolean r3 = A0S(r2)
            r7 = -1
            if (r3 == 0) goto L_0x0661
            android.content.res.Resources r13 = r2.A0r
            r3 = 2131165251(0x7f070043, float:1.7944714E38)
            int r4 = r13.getDimensionPixelSize(r3)
            r3 = 2131165219(0x7f070023, float:1.7944649E38)
            int r3 = r13.getDimensionPixelSize(r3)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r4, r3)
            r14.setLayoutParams(r5)
            r12.setLayoutParams(r5)
            if (r11 == 0) goto L_0x034b
            r11.setLayoutParams(r5)
        L_0x034b:
            if (r15 == 0) goto L_0x0350
            r15.setLayoutParams(r5)
        L_0x0350:
            android.view.View r4 = r2.A0u
            r4.setLayoutParams(r5)
            android.view.View r3 = r2.A0y
            r3.setLayoutParams(r5)
            r8.addView(r14)
            r8.addView(r12)
            if (r11 == 0) goto L_0x0365
            r8.addView(r11)
        L_0x0365:
            if (r15 == 0) goto L_0x036a
            r8.addView(r15)
        L_0x036a:
            r8.addView(r4)
            r8.addView(r3)
            android.widget.ImageView r3 = r2.A0C
            if (r3 == 0) goto L_0x0385
            android.content.Context r4 = r2.A0q
            r3 = 2131238899(0x7f081ff3, float:1.809409E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r3)
            r4.setTint(r7)
            android.widget.ImageView r3 = r2.A0C
            r3.setImageDrawable(r4)
        L_0x0385:
            X.8BQ r3 = r2.A1R
            X.8BS r3 = r3.A01
            r3.A00 = r0
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r3 = r2.A1l
            r3.setIsRectangular(r0)
            if (r10 == 0) goto L_0x03b3
            boolean r3 = r10.CVM()
            if (r3 == 0) goto L_0x03b3
            boolean r3 = A0Q(r2)
            if (r3 == 0) goto L_0x03b3
            android.content.Context r4 = r2.A0q
            r3 = 2131238881(0x7f081fe1, float:1.8094053E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r3)
            r4.setTint(r7)
            android.view.View r3 = r10.getView()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r3.setImageDrawable(r4)
        L_0x03b3:
            r3 = 2131240076(0x7f08248c, float:1.8096477E38)
            android.graphics.drawable.Drawable r3 = r13.getDrawable(r3)
            r8.setBackgroundDrawable(r3)
            android.view.View r3 = r2.A14
            r17 = r3
            r12 = -2
            if (r3 == 0) goto L_0x04e0
            boolean r3 = r2.A0N()
            if (r3 == 0) goto L_0x04e0
            r3 = r17
            r3.setBackgroundColor(r1)
            r3 = 2131165184(0x7f070000, float:1.7944578E38)
            int r11 = r13.getDimensionPixelSize(r3)
            r3 = 2131165207(0x7f070017, float:1.7944625E38)
            int r10 = r13.getDimensionPixelOffset(r3)
            r3 = 2131165195(0x7f07000b, float:1.79446E38)
            int r9 = r13.getDimensionPixelOffset(r3)
            android.view.View r15 = r2.A12
            r5 = 1094713344(0x41400000, float:12.0)
            r4 = 2
            if (r15 == 0) goto L_0x0411
            android.view.View r14 = r2.A13
            if (r14 == 0) goto L_0x0411
            android.widget.TextView r3 = r2.A1C
            r16 = r3
            if (r3 == 0) goto L_0x0411
            X.0nA.A0f(r15, r12)
            X.0nA.A0P(r15)
            X.0nA.A0U(r15, r9)
            r15.setPadding(r10, r10, r10, r10)
            r3 = 2131240073(0x7f082489, float:1.809647E38)
            r15.setBackgroundResource(r3)
            X.0nA.A0f(r14, r11)
            X.0nA.A0V(r14, r11)
            r3 = r16
            r3.setTextSize(r4, r5)
        L_0x0411:
            android.view.View r15 = r2.A10
            if (r15 == 0) goto L_0x043c
            android.view.View r14 = r2.A11
            if (r14 == 0) goto L_0x043c
            android.widget.TextView r3 = r2.A1B
            r16 = r3
            if (r3 == 0) goto L_0x043c
            X.0nA.A0f(r15, r12)
            X.0nA.A0P(r15)
            X.0nA.A0U(r15, r9)
            r15.setPadding(r10, r10, r10, r10)
            r3 = 2131240073(0x7f082489, float:1.809647E38)
            r15.setBackgroundResource(r3)
            X.0nA.A0f(r14, r11)
            X.0nA.A0V(r14, r11)
            r3 = r16
            r3.setTextSize(r4, r5)
        L_0x043c:
            android.view.View r14 = r2.A08
            if (r14 == 0) goto L_0x047d
            android.view.View r3 = r2.A09
            if (r3 == 0) goto L_0x047d
            android.widget.TextView r3 = r2.A0E
            if (r3 == 0) goto L_0x047d
            X.0nA.A0f(r14, r12)
            android.view.View r3 = r2.A08
            X.0nA.A0P(r3)
            android.view.View r3 = r2.A08
            X.0nA.A0U(r3, r9)
            android.view.View r3 = r2.A08
            r3.setPadding(r10, r10, r10, r10)
            android.view.View r14 = r2.A08
            r3 = 2131240073(0x7f082489, float:1.809647E38)
            r14.setBackgroundResource(r3)
            android.view.View r3 = r2.A09
            X.0nA.A0f(r3, r11)
            android.view.View r3 = r2.A09
            X.0nA.A0V(r3, r11)
            android.widget.TextView r3 = r2.A0E
            r3.setTextSize(r4, r5)
            android.widget.TextView r14 = r2.A0E
            r3 = 2131975208(0x7f135c28, float:1.9587502E38)
            java.lang.String r3 = r13.getString(r3)
            r14.setText(r3)
        L_0x047d:
            android.view.View r14 = r2.A06
            if (r14 == 0) goto L_0x04be
            android.view.View r3 = r2.A07
            if (r3 == 0) goto L_0x04be
            android.widget.TextView r3 = r2.A0D
            if (r3 == 0) goto L_0x04be
            X.0nA.A0f(r14, r12)
            android.view.View r3 = r2.A06
            X.0nA.A0P(r3)
            android.view.View r3 = r2.A06
            X.0nA.A0U(r3, r9)
            android.view.View r3 = r2.A06
            r3.setPadding(r10, r10, r10, r10)
            android.view.View r9 = r2.A06
            r3 = 2131240073(0x7f082489, float:1.809647E38)
            r9.setBackgroundResource(r3)
            android.view.View r3 = r2.A07
            X.0nA.A0f(r3, r11)
            android.view.View r3 = r2.A07
            X.0nA.A0V(r3, r11)
            android.widget.TextView r3 = r2.A0D
            r3.setTextSize(r4, r5)
            android.widget.TextView r4 = r2.A0D
            r3 = 2131975202(0x7f135c22, float:1.958749E38)
            java.lang.String r3 = r13.getString(r3)
            r4.setText(r3)
        L_0x04be:
            r3 = 2131165218(0x7f070022, float:1.7944647E38)
            int r5 = r13.getDimensionPixelSize(r3)
            android.view.ViewGroup$LayoutParams r4 = r17.getLayoutParams()
            X.2dQ r4 = (X.C71492dQ) r4
            r4.A0F = r7
            r4.A0u = r1
            r4.A0s = r1
            r4.A0M = r1
            r4.topMargin = r5
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x0656
            r4.leftMargin = r5
        L_0x04dd:
            r17.requestLayout()
        L_0x04e0:
            android.view.ViewGroup$LayoutParams r4 = r8.getLayoutParams()
            X.2dQ r4 = (X.C71492dQ) r4
            r4.A0F = r1
            r4.A0u = r7
            r3 = 2131165218(0x7f070022, float:1.7944647E38)
            int r3 = r13.getDimensionPixelSize(r3)
            r4.bottomMargin = r3
            r4.height = r12
            r3 = 2131165190(0x7f070006, float:1.794459E38)
            int r3 = r13.getDimensionPixelSize(r3)
            r8.setPadding(r3, r3, r3, r3)
        L_0x04ff:
            r8.requestLayout()
        L_0x0502:
            r2.A05()
            A0C(r2)
            X.6if r5 = r2.A1Z
            java.lang.Object r3 = r5.get()
            X.91a r3 = (X.AnonymousClass91a) r3
            android.widget.ImageView r3 = r3.A01
            android.view.View[] r4 = new android.view.View[]{r3}
            r3 = r19
            X.C294975nL.A04(r3, r4, r1)
            X.6if r4 = r2.A1c
            java.lang.Object r3 = r30.get()
            X.8f8 r3 = (X.C360778f8) r3
            X.AnonymousClass9UR.A06(r3, r4, r0)
            X.6Ly r8 = r2.A0L
            java.lang.Object r3 = r30.get()
            X.8f8 r3 = (X.C360778f8) r3
            X.8bb r7 = r3.A07()
            float r4 = r2.A00()
            r3 = r31
            X.AnonymousClass9UR.A07(r3, r7, r8, r4)
            java.lang.Object r3 = r30.get()
            X.8f8 r3 = (X.C360778f8) r3
            X.8bb r10 = r3.A07()
            X.6Ly r8 = r2.A0L
            java.lang.Object r3 = r5.get()
            X.91a r3 = (X.AnonymousClass91a) r3
            java.lang.Integer r7 = r3.A00
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r4 = r2.A1n
            java.util.Map r3 = r2.A1q
            r9 = r31
            r11 = r8
            r12 = r4
            r13 = r7
            r14 = r3
            X.AnonymousClass9UR.A08(r9, r10, r11, r12, r13, r14)
            X.6Ly r3 = r2.A0L
            if (r3 == 0) goto L_0x05eb
            android.text.Editable r3 = r31.getText()
            boolean r3 = X.C358948bj.A05(r3)
            if (r3 == 0) goto L_0x056f
            android.content.Context r4 = r2.A0q
            X.AnonymousClass9UR.A02(r4, r9)
        L_0x056f:
            java.lang.Object r8 = r30.get()
            X.8f8 r8 = (X.C360778f8) r8
            X.6if r4 = r2.A1f
            java.lang.Object r7 = r4.get()
            X.91N r7 = (X.AnonymousClass91N) r7
            android.view.ViewGroup r6 = r2.A16
            X.4yO r3 = A01(r2)
            boolean r3 = r3 instanceof X.AnonymousClass80O
            boolean r11 = A0S(r2)
            r10 = r3
            X.AnonymousClass9UR.A04(r6, r7, r8, r9, r10, r11)
            X.6if r7 = r2.A1Y
            if (r7 == 0) goto L_0x05b1
            boolean r3 = r7.A03
            if (r3 == 0) goto L_0x05b1
            java.lang.Object r6 = r7.get()
            X.9Sf r6 = (X.C379049Sf) r6
            android.view.View r3 = r6.A08
            X.AnonymousClass7TG.A1A(r3, r1)
            androidx.recyclerview.widget.RecyclerView r3 = r6.A0B
            r3.A0o(r1)
            java.lang.Object r3 = r7.get()
            X.9Sf r3 = (X.C379049Sf) r3
            X.A6B r3 = r3.A0I
            r3.A00 = r1
            r3.A01 = r1
        L_0x05b1:
            X.8bI r6 = r2.A1x
            if (r6 == 0) goto L_0x05c5
            X.4yO r3 = A01(r2)
            boolean r3 = r3 instanceof X.AnonymousClass80O
            if (r3 == 0) goto L_0x05c5
            boolean r3 = A0S(r2)
            if (r3 != 0) goto L_0x05c5
            r6.A01 = r0
        L_0x05c5:
            android.view.ViewStub r3 = r2.A1t
            if (r3 == 0) goto L_0x05d3
            android.view.View r0 = r2.A0A
            if (r0 != 0) goto L_0x05d3
            android.view.View r0 = r3.inflate()
            r2.A0A = r0
        L_0x05d3:
            X.8as r0 = r2.A1V
            r0.A00 = r1
            r0.A01 = r1
            java.lang.Object r1 = r4.get()
            X.91N r1 = (X.AnonymousClass91N) r1
            java.lang.Object r0 = r5.get()
            X.91a r0 = (X.AnonymousClass91a) r0
            java.lang.Integer r0 = r0.A00
            r1.A01(r0)
            return
        L_0x05eb:
            X.4yO r3 = A01(r2)
            boolean r3 = r3 instanceof X.AnonymousClass80O
            if (r3 == 0) goto L_0x061b
            r3 = 36325424640308173(0x810dc8000033cd, double:3.035683041050853E-306)
            r7 = r18
            boolean r3 = X.182.A06(r7, r6, r3)
            if (r3 == 0) goto L_0x061b
        L_0x0600:
            X.6Mr r4 = X.C306576Mr.OUTLINED
        L_0x0602:
            java.lang.Object r3 = r5.get()
            X.91a r3 = (X.AnonymousClass91a) r3
            java.lang.Integer r8 = r3.A00
            X.4yO r7 = A01(r2)
            X.C358948bj.A04(r9, r6, r7, r4, r8)
            android.content.Context r4 = r2.A0q
            X.AnonymousClass9UR.A02(r4, r9)
            r2.A0L(r1)
            goto L_0x056f
        L_0x061b:
            X.4yO r3 = A01(r2)
            boolean r3 = r3 instanceof X.AnonymousClass80O
            if (r3 == 0) goto L_0x0641
            r3 = 36325424640373710(0x810dc8000133ce, double:3.0356830410922987E-306)
            r7 = r18
            boolean r3 = X.182.A06(r7, r6, r3)
            if (r3 == 0) goto L_0x0641
            X.1Av r8 = r2.A1i
            X.0s0 r7 = r8.A8D
            X.0YZ[] r4 = X.1Av.A8a
            r3 = 61
            r3 = r4[r3]
            java.lang.Object r3 = r7.CDM(r8, r3)
            if (r3 != 0) goto L_0x0641
            goto L_0x0600
        L_0x0641:
            X.1Av r8 = r2.A1i
            X.0s0 r7 = r8.A8D
            X.0YZ[] r4 = X.1Av.A8a
            r3 = 61
            r3 = r4[r3]
            java.lang.Object r3 = r7.CDM(r8, r3)
            java.lang.String r3 = (java.lang.String) r3
            X.6Mr r4 = X.A1S.A00(r3)
            goto L_0x0602
        L_0x0656:
            r4 = r17
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3 = 17
            r4.setGravity(r3)
            goto L_0x04dd
        L_0x0661:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r2.A0R = r3
            android.content.res.Resources r4 = r2.A0r
            r3 = 2131165193(0x7f070009, float:1.7944596E38)
            int r9 = r4.getDimensionPixelSize(r3)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r9, r9)
            r5.setMargins(r1, r1, r1, r1)
            r14.setLayoutParams(r5)
            r12.setLayoutParams(r5)
            if (r11 == 0) goto L_0x0681
            r11.setLayoutParams(r5)
        L_0x0681:
            if (r15 == 0) goto L_0x0686
            r15.setLayoutParams(r5)
        L_0x0686:
            android.view.View r4 = r2.A0u
            r4.setLayoutParams(r5)
            android.view.View r3 = r2.A0y
            r3.setLayoutParams(r5)
            r8.addView(r4)
            r8.addView(r14)
            r8.addView(r12)
            r8.addView(r3)
            if (r11 == 0) goto L_0x06a1
            r8.addView(r11)
        L_0x06a1:
            android.view.View r3 = r2.A0v
            r8.addView(r3)
            android.widget.ImageView r5 = r2.A0C
            if (r5 == 0) goto L_0x06b6
            android.content.Context r4 = r2.A0q
            r3 = 2131238905(0x7f081ff9, float:1.8094102E38)
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r3)
            r5.setImageDrawable(r3)
        L_0x06b6:
            X.8BQ r3 = r2.A1R
            X.8BS r3 = r3.A01
            r3.A00 = r1
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r3 = r2.A1l
            r3.setIsRectangular(r1)
            if (r10 == 0) goto L_0x06f3
            boolean r3 = r10.CVM()
            if (r3 == 0) goto L_0x06f3
            r3 = 36323139717835651(0x810bb400022b83, double:3.0342380468785856E-306)
            r5 = r18
            boolean r3 = X.182.A06(r5, r6, r3)
            if (r3 != 0) goto L_0x06e1
            r3 = 36323139718425484(0x810bb4000b2b8c, double:3.0342380472515984E-306)
            boolean r3 = X.182.A06(r5, r6, r3)
            if (r3 == 0) goto L_0x06f3
        L_0x06e1:
            android.view.View r5 = r10.getView()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.content.Context r4 = r2.A0q
            r3 = 2131240067(0x7f082483, float:1.8096459E38)
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r3)
            r5.setImageDrawable(r3)
        L_0x06f3:
            r3 = r19
            r8.setBackgroundDrawable(r3)
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            X.2dQ r3 = (X.C71492dQ) r3
            r3.A0F = r7
            r3.A0u = r1
            r3.bottomMargin = r1
            r3.height = r9
            r8.setPadding(r1, r1, r1, r1)
            goto L_0x04ff
        L_0x070b:
            r15 = r19
            goto L_0x0324
        L_0x070f:
            r11 = r19
            goto L_0x0312
        L_0x0713:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            goto L_0x02ed
        L_0x0717:
            android.view.View[] r4 = new android.view.View[r0]
            A08(r2)
            android.widget.ImageView r3 = r2.A0B
            goto L_0x02a9
        L_0x0720:
            r3 = -1
            goto L_0x0284
        L_0x0723:
            r5.A00 = r1
            goto L_0x0288
        L_0x0727:
            r3 = -1
            goto L_0x01fe
        L_0x072a:
            r3 = 0
            goto L_0x0200
        L_0x072d:
            r9.A00 = r1
            goto L_0x0202
        L_0x0731:
            java.lang.Object r3 = r30.get()
            X.8f8 r3 = (X.C360778f8) r3
            X.8bb r3 = r3.A07()
            X.8bi r3 = r3.A06
            float r4 = r3.A00
            r3 = 1103101952(0x41c00000, float:24.0)
            float r4 = r4 * r3
            double r10 = (double) r4
            java.lang.Object r3 = r30.get()
            X.8f8 r3 = (X.C360778f8) r3
            X.8bb r3 = r3.A07()
            X.8bi r3 = r3.A06
            float r4 = r3.A00
            r3 = 1094713344(0x41400000, float:12.0)
            float r4 = r4 * r3
            double r8 = (double) r4
            java.lang.Object r3 = r30.get()
            X.8f8 r3 = (X.C360778f8) r3
            X.8bb r3 = r3.A07()
            X.8bi r3 = r3.A06
            float r4 = r3.A00
            r3 = 1115684864(0x42800000, float:64.0)
            float r4 = r4 * r3
            double r3 = (double) r4
            r26 = 0
            r28 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r20 = r10
            r22 = r8
            r24 = r3
            double r3 = X.AnonymousClass37Q.A04(r20, r22, r24, r26, r28)
            float r11 = (float) r3
            X.1Av r10 = r2.A1i
            X.0s0 r9 = r10.A8F
            X.0YZ[] r13 = X.1Av.A8a
            r12 = 63
            r3 = r13[r12]
            java.lang.Object r3 = r9.CDM(r10, r3)
            java.lang.Number r3 = (java.lang.Number) r3
            float r8 = r3.floatValue()
            boolean r3 = r2.A0l
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r3 == 0) goto L_0x0795
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x0795
            r11 = r8
        L_0x0795:
            r5.setCurrentRatio(r11)
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x018d
            X.0Tu r8 = X.0Tu.A06
            r3 = 36324028776001213(0x810c8300012ebd, double:3.034800290842437E-306)
            boolean r3 = X.182.A06(r8, r6, r3)
            if (r3 != 0) goto L_0x018d
            float r3 = r5.getCurrentRatio()
            r4 = r13[r12]
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r9.Epx(r10, r3, r4)
            goto L_0x018d
        L_0x07b8:
            java.lang.Integer r7 = X.AnonymousClass05K.A0C
            goto L_0x013c
        L_0x07bc:
            r3 = -1
            goto L_0x0127
        L_0x07bf:
            java.lang.String r3 = "modern"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x00e3
            java.lang.String r3 = "modern_v2"
            goto L_0x07f5
        L_0x07ca:
            java.lang.String r3 = "strong"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x00e3
            java.lang.String r3 = "strong_v2"
            goto L_0x07f5
        L_0x07d5:
            java.lang.String r3 = "typewriter"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x00e3
            java.lang.String r3 = "typewriter_v2"
            goto L_0x07f5
        L_0x07e0:
            java.lang.String r3 = "neon"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x00e3
            java.lang.String r3 = "neon_v2"
            goto L_0x07f5
        L_0x07eb:
            java.lang.String r3 = "classic"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x00e3
            java.lang.String r3 = "classic_v2"
        L_0x07f5:
            X.8bb r7 = X.C358878bc.A01(r3, r1, r1, r1, r1)
        L_0x07f9:
            if (r7 == 0) goto L_0x00e3
            java.util.ArrayList r3 = X.C360778f8.A03(r4)
            boolean r3 = r3.contains(r7)
            if (r3 == 0) goto L_0x00e3
            int r3 = X.C360778f8.A01(r4, r7)
            goto L_0x00e4
        L_0x080b:
            X.4yO r0 = A01(r2)
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x082c
            r3 = 36323139718228873(0x810bb400082b89, double:3.034238047127261E-306)
            r0 = r18
            X.182.A06(r0, r6, r3)
            r3 = 36323139718425484(0x810bb4000b2b8c, double:3.0342380472515984E-306)
            X.182.A06(r0, r6, r3)
            r3 = 36323139718294410(0x810bb400092b8a, double:3.0342380471687066E-306)
            goto L_0x0030
        L_0x082c:
            X.4yO r0 = A01(r2)
            boolean r0 = r0 instanceof X.C363138jC
            if (r0 == 0) goto L_0x0035
            r3 = 36323139719277465(0x810bb400182b99, double:3.0342380477903946E-306)
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0f(java.lang.Integer):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r3.A0O != false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b5, code lost:
        if (r3.A0O != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b7, code lost:
        r1 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0g(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r3 = r6 instanceof X.C356178Sw
            if (r3 == 0) goto L_0x001d
            X.8Sw r6 = (X.C356178Sw) r6
            X.6Ly r0 = r6.A01
            r5.A0L = r0
            android.graphics.drawable.Drawable r0 = r6.A00
            r5.A04 = r0
            r1 = 0
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0043
            r1.getClass()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001d:
            r0 = 0
            r5.A0L = r0
            r5.A04 = r0
            boolean r0 = r6 instanceof X.AnonymousClass8TM
            if (r0 == 0) goto L_0x0043
            X.8TM r6 = (X.AnonymousClass8TM) r6
            java.lang.CharSequence r0 = r6.A01
            com.instagram.ui.text.TextColorScheme r2 = r6.A00
            com.instagram.ui.text.ConstrainedEditText r1 = r5.A1j
            r1.setHint(r0)
            X.6if r0 = r5.A1g
            java.lang.Object r0 = r0.get()
            X.8f8 r0 = (X.C360778f8) r0
            X.8bb r0 = r0.A07()
            X.AEU.A02(r1, r0)
            X.AEU.A01(r1, r2)
        L_0x0043:
            X.6Ly r1 = r5.A0L
            if (r1 == 0) goto L_0x00ba
            if (r3 == 0) goto L_0x00ba
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r0 = r5.A1n
            X.8un r0 = r0.A0O(r1)
        L_0x004f:
            r5.A0M = r0
            X.6Ly r3 = r5.A0L
            com.instagram.ui.text.ConstrainedEditText r1 = r5.A1j
            if (r3 == 0) goto L_0x00db
            android.text.Spannable r0 = r3.A0F
            r1.setText(r0)
            boolean r0 = r3 instanceof X.AnonymousClass91c
            if (r0 == 0) goto L_0x0066
            r0 = r3
            X.91c r0 = (X.AnonymousClass91c) r0
            r0.A0Y()
        L_0x0066:
            android.text.Layout$Alignment r2 = r3.A0E
            int[] r1 = X.A2M.A00
            int r0 = r2.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L_0x00b3
            r0 = 2
            if (r1 == r0) goto L_0x00b0
            r0 = 3
            if (r1 != r0) goto L_0x00c4
            boolean r0 = r3.A0O
            if (r0 == 0) goto L_0x00b7
        L_0x007d:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x007f:
            X.6if r0 = r5.A1Z
            java.lang.Object r0 = r0.get()
            X.91a r0 = (X.AnonymousClass91a) r0
            r0.A00(r1)
            X.6if r0 = r5.A1f
            java.lang.Object r2 = r0.get()
            X.91N r2 = (X.AnonymousClass91N) r2
            android.text.Spannable r1 = r3.A0F
            if (r1 == 0) goto L_0x00bc
            java.lang.Class<X.6MP> r0 = X.AnonymousClass6MP.class
            java.lang.Object[] r4 = X.C263324Kh.A06(r1, r0)
            X.6MP[] r4 = (X.AnonymousClass6MP[]) r4
            android.widget.EditText r0 = r2.A02
            android.view.ViewTreeObserver r3 = r0.getViewTreeObserver()
            r2 = 0
            int r1 = r4.length
        L_0x00a6:
            if (r2 >= r1) goto L_0x0101
            r0 = r4[r2]
            r3.addOnPreDrawListener(r0)
            int r2 = r2 + 1
            goto L_0x00a6
        L_0x00b0:
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x007f
        L_0x00b3:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L_0x007d
        L_0x00b7:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x007f
        L_0x00ba:
            r0 = 0
            goto L_0x004f
        L_0x00bc:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00c4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown alignment: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00db:
            java.lang.String r0 = ""
            r1.setText(r0)
            X.80U r0 = r5.A1W
            boolean r0 = r0.CZe()
            if (r0 != 0) goto L_0x0101
            X.6if r0 = r5.A1Z
            java.lang.Object r1 = r0.get()
            X.91a r1 = (X.AnonymousClass91a) r1
            X.6if r0 = r5.A1g
            java.lang.Object r0 = r0.get()
            X.8f8 r0 = (X.C360778f8) r0
            X.8bb r0 = r0.A07()
            java.lang.Integer r0 = r0.A07
            r1.A00(r0)
        L_0x0101:
            r5.A0X()
            X.8b6 r1 = r5.A1S
            boolean r0 = r1 instanceof X.C358548b5
            if (r0 == 0) goto L_0x0142
            X.8b5 r1 = (X.C358548b5) r1
            boolean r0 = r5.AFr()
            r1.A01 = r0
            boolean r0 = r5.AFr()
            if (r0 == 0) goto L_0x0142
            X.2Fk r0 = r5.A0j
            if (r0 != 0) goto L_0x0142
            X.8am r1 = r5.A1y
            X.82p r0 = r5.A1Q
            X.82o r0 = r0.A02
            X.82Y r0 = r0.A01
            java.lang.String r0 = r0.A05()
            X.0r6 r1 = r1.A00(r0)
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r2 = X.C226292g8.A00(r0, r1)
            r5.A0j = r2
            X.4DH r0 = r5.A1I
            X.07Z r1 = r0.getViewLifecycleOwner()
            X.APk r0 = new X.APk
            r0.<init>(r5)
            r2.A06(r1, r0)
        L_0x0142:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0g(java.lang.Object):void");
    }

    public final void A0h(boolean z) {
        int i;
        int i2;
        if (z) {
            ConstrainedEditText constrainedEditText = this.A1j;
            if (!TextUtils.isEmpty(constrainedEditText.getText())) {
                i = 0;
                i2 = 0;
                for (AnonymousClass91P r1 : (AnonymousClass91P[]) C263324Kh.A06(constrainedEditText.getText(), AnonymousClass91P.class)) {
                    if (r1 instanceof AnonymousClass91O) {
                        i++;
                    }
                    if (r1 instanceof C15915Ukf) {
                        i2++;
                    }
                }
            } else {
                i = 0;
                i2 = 0;
            }
            27r A012 = 27p.A01(this.A1J);
            int length = constrainedEditText.getText().length();
            AnonymousClass29Q r7 = A012.A07;
            0wc r2 = r7.A01;
            0Aj A002 = r2.A00(r2.A00, "ig_camera_end_session");
            if (r7.A0P() && A002.isSampled()) {
                A002.AAJ("entity", "TEXT");
                A002.AAJ("legacy_falco_event_name", "IG_CAMERA_END_TEXT_SESSION");
                AnonymousClass283 r3 = r7.A04;
                String str = r3.A0L;
                if (str == null) {
                    str = "";
                }
                A002.AAJ("camera_session_id", str);
                A002.A8M(r7.A0J(), "camera_destination");
                int i3 = 2;
                if (r3.A01 != 2) {
                    i3 = 1;
                }
                A002.A8k("camera_position", Integer.valueOf(i3));
                A002.A9F("capture_format_index", 0L);
                A002.A8M(r7.A0I(), "capture_type");
                A002.A8M(r3.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                A002.A8k("event_type", 2);
                boolean z2 = false;
                if (length > 0) {
                    z2 = true;
                }
                A002.A7p("has_text", Boolean.valueOf(z2));
                A002.A8M(28t.A04, "media_type");
                A002.AAJ("module", 27x.A08.getModuleName());
                A002.A9F("text_count", Long.valueOf((long) length));
                A002.A8M(r3.A0C, "surface");
                A002.A9F("mention_count", Long.valueOf((long) i));
                A002.A9F("hashtag_count", Long.valueOf((long) i2));
                A002.AAJ("discovery_session_id", r3.A0O);
                A002.AAJ("search_session_id", r3.A0P);
                A002.AAJ("composition_str_id", r3.A0M);
                A002.A8M(r3.A0A, "composition_media_type");
                A002.AAJ("nav_chain", AnonymousClass1QI.A00.A02.A00);
                A002.AAJ("device_aspect_ratio_category", C254473sX.A00);
                A002.AAJ("device_fold_orientation", C254483sY.A00);
                A002.AAJ("device_fold_state", C254493sZ.A00);
                A002.A7p("device_is_in_multi_window_mode", C254503sa.A00);
                A002.Cgf();
            }
        }
        C314676if r22 = this.A1f;
        EditText editText = ((AnonymousClass91N) r22.get()).A02;
        Editable text = editText.getText();
        0qQ.A07(text);
        AnonymousClass6MP[] r5 = (AnonymousClass6MP[]) C263324Kh.A06(text, AnonymousClass6MP.class);
        ViewTreeObserver viewTreeObserver = editText.getViewTreeObserver();
        for (AnonymousClass6MP removeOnPreDrawListener : r5) {
            viewTreeObserver.removeOnPreDrawListener(removeOnPreDrawListener);
        }
        ConstrainedEditText constrainedEditText2 = this.A1j;
        constrainedEditText2.A02 = false;
        constrainedEditText2.setFocusableInTouchMode(true);
        View view = this.A0w;
        view.setEnabled(false);
        View view2 = this.A14;
        if (view2 != null) {
            C294975nL.A05(new View[]{view2}, true);
            this.A1v.A0J.setTranslationY(0.0f);
        }
        C294975nL.A05(new View[]{view, this.A16}, true);
        A0I(this, false);
        ImageView imageView = this.A0B;
        if (imageView != null) {
            C294975nL.A05(new View[]{imageView}, false);
        }
        ImageView imageView2 = this.A0C;
        if (imageView2 != null) {
            C294975nL.A05(new View[]{imageView2}, false);
        }
        C252063oV r0 = this.A1N;
        if (r0 != null) {
            C294975nL.A05(new View[]{r0.getView()}, false);
        }
        if (!this.A1W.CZe() || this.A0L != null) {
            C294975nL.A05(new View[]{constrainedEditText2}, false);
        }
        C294975nL.A05(new View[]{this.A1m}, false);
        C294975nL.A05(new View[]{((AnonymousClass91a) this.A1Z.get()).A01}, false);
        C314676if r12 = this.A1c;
        if (r12.A03) {
            C294975nL.A05(new View[]{((A9W) r12.get()).A06}, false);
        }
        View view3 = this.A08;
        if (view3 != null) {
            view3.setVisibility(8);
        }
        C294975nL.A05(new View[]{((AnonymousClass91N) r22.get()).A01}, false);
        C314676if r02 = this.A1a;
        if (r02 != null) {
            C338677iL r23 = (C338677iL) r02.get();
            C252063oV r13 = r23.A09;
            if (r13.CVM()) {
                C294975nL.A05(new View[]{r13.getView()}, false);
                AnonymousClass3NM r03 = r23.A01;
                if (r03 != null) {
                    r03.A03();
                }
            }
        }
        C360778f8 r14 = (C360778f8) this.A1g.get();
        if (r14.A0F) {
            C315596kB.A08(new View[]{r14.A08}, false);
        }
        View view4 = this.A0z;
        if (view4 != null) {
            C294975nL.A05(new View[]{view4}, false);
        }
        C358678bI r24 = this.A1x;
        if (r24 != null) {
            C71662eb r15 = r24.A02;
            if (r15.A04()) {
                C294975nL.A05(new View[]{r15.A01()}, true);
            }
            r24.A01 = false;
        }
        C314676if r16 = this.A1Y;
        if (r16 != null && r16.A03) {
            ((C379049Sf) r16.get()).A02(false);
        }
        IgImageView igImageView = this.A1K;
        if (igImageView != null) {
            igImageView.setVisibility(8);
            igImageView.setImageDrawable((Drawable) null);
        }
        View view5 = this.A0A;
        if (view5 != null) {
            view5.setVisibility(8);
        }
        2Fk r17 = this.A0j;
        if (r17 != null) {
            r17.A05(this.A1I.getViewLifecycleOwner());
            this.A0j = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (((X.C349057zW) r0.get()).A00 == 0) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1 == 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0i() {
        /*
            r4 = this;
            X.6if r0 = r4.A1b
            r3 = 1
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r0.get()
            X.7zW r0 = (X.C349057zW) r0
            int r0 = r0.A00
            r2 = 1
            if (r0 != 0) goto L_0x0011
        L_0x0010:
            r2 = 0
        L_0x0011:
            X.6if r0 = r4.A1e
            if (r0 == 0) goto L_0x0020
            java.lang.Object r0 = r0.get()
            X.7zg r0 = (X.C349157zg) r0
            int r1 = r0.A00
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            if (r2 != 0) goto L_0x0026
            if (r0 != 0) goto L_0x0026
            r3 = 0
        L_0x0026:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0i():boolean");
    }

    public final boolean AFr() {
        if (!this.A0Y || !this.A1X.AFr()) {
            return false;
        }
        return true;
    }

    public final int C5G() {
        return this.A1j.length();
    }

    public final void D9o() {
        this.A1X.D9o();
    }

    public final void DDs(int i) {
        this.A1X.DDs(i);
    }

    public final void DDt() {
        this.A1X.DDt();
        ConstrainedEditText constrainedEditText = this.A1j;
        C294975nL.A05(new View[]{constrainedEditText}, false);
        constrainedEditText.setHint("");
        constrainedEditText.setOnTouchListener(this.A05);
    }

    public final void DDv(int i) {
        if (this.A0L != null) {
            A0a(i);
            Spannable spannable = this.A0L.A0F;
            AnonymousClass6MO[] r3 = (AnonymousClass6MO[]) C263324Kh.A06(spannable, AnonymousClass6MO.class);
            int length = r3.length;
            int i2 = 0;
            if (length <= 0) {
                A06(spannable, 0, 0);
            } else {
                do {
                    r3[i2].ESD(i, i);
                    i2++;
                } while (i2 < length);
            }
            this.A0L.A0R();
        }
    }

    public final void DMp() {
        this.A1X.DMp();
    }

    public final void Dn7() {
        this.A1X.Dn7();
    }

    public final void Dn8(C2802350v r2, String str) {
        this.A1X.Dn8(r2, str);
    }

    public final void Dqz(Integer num) {
        for (AnonymousClass91Q r0 : (AnonymousClass91Q[]) C263324Kh.A06(this.A1j.getText(), AnonymousClass91Q.class)) {
            r0.A00 = num;
        }
        this.A1q.remove(this.A0L);
        C314676if r1 = this.A1c;
        if (r1.A03) {
            ((A9W) r1.get()).A01(false);
        }
        C314676if r12 = this.A1d;
        if (r12 == null || !A0Q(this)) {
            C314676if r02 = this.A1a;
            if (r02 != null) {
                ((C338677iL) r02.get()).A05();
            }
        } else {
            ((C348987zP) r12.get()).A03();
        }
        ((AnonymousClass91N) this.A1f.get()).A01(((AnonymousClass91a) this.A1Z.get()).A00);
        A0D(this);
        this.A0M = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r1 != r14.getText().length()) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r0 == r1) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dr1() {
        /*
            r17 = this;
            r2 = r17
            com.instagram.ui.text.ConstrainedEditText r14 = r2.A1j
            X.6if r6 = r2.A1Z
            java.lang.Object r0 = r6.get()
            X.91a r0 = (X.AnonymousClass91a) r0
            java.lang.Integer r5 = r0.A00
            com.instagram.common.session.UserSession r4 = r2.A1J
            X.4yO r1 = A01(r2)
            r3 = 0
            X.0qQ.A0B(r14, r3)
            r0 = 0
            X.C358948bj.A04(r14, r4, r1, r0, r5)
            X.6if r1 = r2.A1d
            if (r1 == 0) goto L_0x0155
            boolean r0 = A0Q(r2)
            if (r0 == 0) goto L_0x0155
            java.lang.Object r0 = r1.get()
            X.7zP r0 = (X.C348987zP) r0
            r0.A03()
        L_0x002f:
            int r0 = r14.getSelectionStart()
            int r1 = r14.getSelectionEnd()
            r10 = 0
            r5 = 1
            if (r0 < 0) goto L_0x003e
            r9 = 1
            if (r0 != r1) goto L_0x003f
        L_0x003e:
            r9 = 0
        L_0x003f:
            if (r0 != 0) goto L_0x004c
            android.text.Editable r0 = r14.getText()
            int r0 = r0.length()
            r8 = 1
            if (r1 == r0) goto L_0x004d
        L_0x004c:
            r8 = 0
        L_0x004d:
            X.6if r7 = r2.A1g
            java.lang.Object r0 = r7.get()
            X.8f8 r0 = (X.C360778f8) r0
            X.8bb r0 = r0.A07()
            X.8f1 r0 = r0.A04
            r0.getClass()
            boolean r0 = r0.A03()
            if (r9 == 0) goto L_0x006b
            if (r8 != 0) goto L_0x006b
            if (r0 != 0) goto L_0x006b
            r14.setSelection(r1)
        L_0x006b:
            java.lang.Object r13 = r7.get()
            X.8f8 r13 = (X.C360778f8) r13
            X.6if r1 = r2.A1f
            java.lang.Object r12 = r1.get()
            X.91N r12 = (X.AnonymousClass91N) r12
            android.view.ViewGroup r11 = r2.A16
            X.4yO r0 = A01(r2)
            boolean r15 = r0 instanceof X.AnonymousClass80O
            boolean r16 = A0S(r2)
            X.AnonymousClass9UR.A04(r11, r12, r13, r14, r15, r16)
            android.content.Context r0 = r2.A0q
            X.AnonymousClass9UR.A02(r0, r14)
            java.lang.Object r0 = r7.get()
            X.8f8 r0 = (X.C360778f8) r0
            r0.A09()
            java.lang.Object r1 = r1.get()
            X.91N r1 = (X.AnonymousClass91N) r1
            java.lang.Object r0 = r6.get()
            X.91a r0 = (X.AnonymousClass91a) r0
            java.lang.Integer r0 = r0.A00
            r1.A01(r0)
            r2.A0L(r5)
            android.text.Editable r1 = r14.getText()
            X.0qQ.A0B(r1, r3)
            int r0 = r1.length()
            X.6Mr r0 = X.C358948bj.A00(r1, r3, r0)
            X.1Av r3 = r2.A1i
            java.lang.String r5 = r0.A00
            X.0s0 r2 = r3.A8D
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 61
            r0 = r1[r0]
            r2.Epx(r3, r5, r0)
            if (r9 == 0) goto L_0x00cc
            if (r8 == 0) goto L_0x00cd
        L_0x00cc:
            r10 = 1
        L_0x00cd:
            X.27r r0 = X.27p.A01(r4)
            X.29Z r4 = r0.A0F
            X.0wc r2 = r4.A01
            java.lang.String r1 = "ig_camera_ui_tool_click"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0154
            X.80P r1 = X.AnonymousClass80P.TEXT_EFFECT
            java.lang.String r0 = "tool_type"
            r2.A8M(r1, r0)
            java.lang.String r1 = "IG_CAMERA_TEXT_EFFECT_SELECTED"
            java.lang.String r0 = "legacy_falco_event_name"
            r2.AAJ(r0, r1)
            X.283 r3 = r4.A04
            java.lang.String r1 = r3.A0L
            if (r1 != 0) goto L_0x00f9
            java.lang.String r1 = ""
        L_0x00f9:
            java.lang.String r0 = "camera_session_id"
            r2.AAJ(r0, r1)
            X.28D r1 = r3.A09
            java.lang.String r0 = "entry_point"
            r2.A8M(r1, r0)
            r0 = 2
            java.lang.String r1 = "event_type"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A8k(r1, r0)
            X.0iw r0 = X.27x.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "module"
            r2.AAJ(r0, r1)
            X.JVj r1 = r3.A0C
            java.lang.String r0 = "surface"
            r2.A8M(r1, r0)
            java.lang.String r0 = "text_effect"
            r2.AAJ(r0, r5)
            X.4yP r1 = r4.A0J()
            java.lang.String r0 = "camera_destination"
            r2.A8M(r1, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            java.lang.String r0 = "is_applied_on_full_caption"
            r2.A7p(r0, r1)
            X.28t r1 = r3.A0A
            java.lang.String r0 = "composition_media_type"
            r2.A8M(r1, r0)
            java.lang.String r1 = r3.A0M
            java.lang.String r0 = "composition_str_id"
            r2.AAJ(r0, r1)
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "nav_chain"
            r2.AAJ(r0, r1)
            r2.Cgf()
        L_0x0154:
            return
        L_0x0155:
            X.6if r0 = r2.A1a
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r0.get()
            X.7iL r0 = (X.C338677iL) r0
            r0.A05()
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.Dr1():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x014b, code lost:
        if (r1.equals(r0) == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01d6, code lost:
        if (r1.equals("modern_v2") != false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01e2, code lost:
        if (X.C10031RlQ.A00.contains(r11.getLanguage()) == false) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01e4, code lost:
        r12 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dr2(X.C358868bb r24, java.lang.Integer r25) {
        /*
            r23 = this;
            r8 = r23
            X.1Av r1 = r8.A1i
            r7 = r24
            java.lang.String r0 = r7.A09
            r1.A0y(r0)
            X.6if r0 = r8.A1Z
            r22 = r0
            java.lang.Object r0 = r22.get()
            X.91a r0 = (X.AnonymousClass91a) r0
            r9 = 1
            android.widget.ImageView r0 = r0.A01
            r6 = 0
            android.view.View[] r0 = new android.view.View[]{r0}
            r2 = 0
            X.C294975nL.A04(r2, r0, r6)
            X.6if r10 = r8.A1c
            X.6if r5 = r8.A1g
            java.lang.Object r0 = r5.get()
            X.8f8 r0 = (X.C360778f8) r0
            X.AnonymousClass9UR.A06(r0, r10, r6)
            com.instagram.ui.text.ConstrainedEditText r4 = r8.A1j
            java.lang.Object r11 = r5.get()
            X.8f8 r11 = (X.C360778f8) r11
            X.6if r3 = r8.A1f
            java.lang.Object r1 = r3.get()
            X.91N r1 = (X.AnonymousClass91N) r1
            android.view.ViewGroup r15 = r8.A16
            X.4yO r0 = A01(r8)
            boolean r0 = r0 instanceof X.AnonymousClass80O
            boolean r20 = A0S(r8)
            r16 = r1
            r17 = r11
            r18 = r4
            r19 = r0
            X.AnonymousClass9UR.A04(r15, r16, r17, r18, r19, r20)
            java.lang.Object r0 = r5.get()
            X.8f8 r0 = (X.C360778f8) r0
            X.8bb r17 = r0.A07()
            X.6Ly r12 = r8.A0L
            java.lang.Object r0 = r22.get()
            X.91a r0 = (X.AnonymousClass91a) r0
            java.lang.Integer r11 = r0.A00
            com.instagram.ui.widget.interactive.InteractiveDrawableContainer r1 = r8.A1n
            java.util.Map r0 = r8.A1q
            r16 = r4
            r18 = r12
            r19 = r1
            r20 = r11
            r21 = r0
            X.AnonymousClass9UR.A08(r16, r17, r18, r19, r20, r21)
            X.6if r1 = r8.A1b
            if (r1 == 0) goto L_0x0097
            boolean r0 = A0Q(r8)
            if (r0 == 0) goto L_0x0097
            java.lang.Object r1 = r1.get()
            X.7zW r1 = (X.C349057zW) r1
            X.8bb r0 = r1.A01
            r1.A01 = r7
            if (r0 == 0) goto L_0x01f9
            java.util.List r1 = r0.A0A
        L_0x0092:
            java.util.List r0 = r7.A0A
            X.0qQ.A0K(r1, r0)
        L_0x0097:
            X.6if r1 = r8.A1e
            if (r1 == 0) goto L_0x00b4
            boolean r0 = A0R(r8)
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r1 = r1.get()
            X.7zg r1 = (X.C349157zg) r1
            X.8bb r0 = r1.A01
            r1.A01 = r7
            if (r0 == 0) goto L_0x00af
            java.util.List r2 = r0.A0B
        L_0x00af:
            java.util.List r0 = r7.A0B
            X.0qQ.A0K(r2, r0)
        L_0x00b4:
            X.6if r1 = r8.A1d
            if (r1 == 0) goto L_0x00c7
            boolean r0 = A0Q(r8)
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r0 = r1.get()
            X.7zP r0 = (X.C348987zP) r0
            r0.A03()
        L_0x00c7:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1 = r25
            if (r1 != r0) goto L_0x0266
            android.text.Editable r14 = r4.getText()
            android.content.Context r1 = r8.A0q
            int r0 = r8.A00
            X.0qQ.A0B(r14, r9)
            r2 = 2
            X.0qQ.A0B(r1, r2)
            java.lang.Class<X.8bZ> r2 = X.C358848bZ.class
            java.lang.Object[] r13 = X.C263324Kh.A06(r14, r2)
            X.8bZ[] r13 = (X.C358848bZ[]) r13
            int r12 = r13.length
            r11 = 0
            if (r12 != 0) goto L_0x01e9
            X.8bd r11 = r7.A03
            X.8bZ r2 = new X.8bZ
            r2.<init>(r1, r11, r0)
            int r1 = r14.length()
            r0 = 18
            r14.setSpan(r2, r6, r1, r0)
        L_0x00f8:
            boolean r0 = r10.A03
            if (r0 == 0) goto L_0x0107
            java.lang.Object r1 = r10.get()
            X.A9W r1 = (X.A9W) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r1.A00(r0, r9)
        L_0x0107:
            X.6if r1 = r8.A1a
            if (r1 == 0) goto L_0x0169
            boolean r0 = A0Q(r8)
            if (r0 != 0) goto L_0x0169
            java.lang.Object r0 = r5.get()
            X.8f8 r0 = (X.C360778f8) r0
            java.lang.Object r10 = r1.get()
            X.7iL r10 = (X.C338677iL) r10
            boolean r2 = A0S(r8)
            java.util.Locale r11 = r4.getTextLocale()
            X.8bb r0 = r0.A07()
            X.0qQ.A0B(r11, r6)
            X.0qQ.A0B(r0, r9)
            java.lang.String r1 = r0.A09
            int r13 = r1.hashCode()
            r0 = -2004336740(0xffffffff88883f9c, float:-8.200157E-34)
            r12 = 1
            if (r13 == r0) goto L_0x01d0
            r0 = -555649727(0xffffffffdee17541, float:-8.1229813E18)
            if (r13 == r0) goto L_0x01cc
            r0 = 3347760(0x331530, float:4.691211E-39)
            if (r13 != r0) goto L_0x014d
            java.lang.String r0 = "meme"
        L_0x0147:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x01d8
        L_0x014d:
            X.3oV r11 = r10.A09
            int r0 = r11.CFV()
            r1 = 0
            if (r0 != 0) goto L_0x0157
            r1 = 1
        L_0x0157:
            r0 = 8
            if (r12 == 0) goto L_0x015c
            r0 = 0
        L_0x015c:
            r11.setVisibility(r0)
            if (r12 == 0) goto L_0x01c8
            if (r1 != 0) goto L_0x0166
            r10.A06(r15, r6, r2)
        L_0x0166:
            r10.A05()
        L_0x0169:
            X.80U r0 = r8.A1W
            boolean r0 = r0.CZe()
            if (r0 == 0) goto L_0x0174
            X.AEU.A02(r4, r7)
        L_0x0174:
            java.lang.Object r11 = r3.get()
            X.91N r11 = (X.AnonymousClass91N) r11
            X.4yO r14 = A01(r8)
            java.lang.Object r0 = r22.get()
            X.91a r0 = (X.AnonymousClass91a) r0
            java.lang.Integer r10 = r0.A00
            X.0qQ.A0B(r14, r6)
            android.widget.EditText r13 = r11.A02
            android.text.Editable r15 = r13.getText()
            X.0qQ.A0A(r15)
            java.lang.Class<X.6MP> r0 = X.AnonymousClass6MP.class
            java.lang.Object[] r12 = X.C263324Kh.A06(r15, r0)
            X.6MP[] r12 = (X.AnonymousClass6MP[]) r12
            int r7 = r12.length
            r2 = 0
            if (r7 == 0) goto L_0x021b
            X.0qQ.A0B(r15, r6)
            java.lang.Class<X.8bb> r0 = X.C358868bb.class
            java.lang.Object r0 = X.C263324Kh.A00(r15, r0)
            X.8bb r0 = (X.C358868bb) r0
            if (r0 == 0) goto L_0x01fc
            X.8f1 r0 = r0.A04
            if (r0 == 0) goto L_0x021b
            int r0 = r15.length()
            X.6Mr r1 = X.C358948bj.A00(r15, r6, r0)
        L_0x01b7:
            if (r2 >= r7) goto L_0x0204
            r6 = r12[r2]
            android.view.ViewTreeObserver r0 = r13.getViewTreeObserver()
            r0.removeOnPreDrawListener(r6)
            r15.removeSpan(r6)
            int r2 = r2 + 1
            goto L_0x01b7
        L_0x01c8:
            r10.A04()
            goto L_0x0169
        L_0x01cc:
            java.lang.String r0 = "modern_refreshed_v2"
            goto L_0x0147
        L_0x01d0:
            java.lang.String r0 = "modern_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x014d
        L_0x01d8:
            java.util.Set r1 = X.C10031RlQ.A00
            java.lang.String r0 = r11.getLanguage()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x014d
            r12 = 0
            goto L_0x014d
        L_0x01e7:
            if (r11 >= r12) goto L_0x00f8
        L_0x01e9:
            r2 = r13[r11]
            X.8bd r1 = r7.A03
            int r0 = r2.A05
            com.instagram.ui.text.TextColors r0 = r1.ALC(r0)
            r2.A00(r0)
            int r11 = r11 + 1
            goto L_0x01e7
        L_0x01f9:
            r1 = r2
            goto L_0x0092
        L_0x01fc:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0204:
            com.instagram.common.session.UserSession r0 = r11.A03
            X.C358948bj.A04(r13, r0, r14, r1, r10)
            android.content.Context r0 = r13.getContext()
            X.AnonymousClass9UR.A02(r0, r13)
            X.6Mr r0 = X.C306576Mr.OUTLINED
            if (r1 == r0) goto L_0x0218
            X.6Mr r0 = X.C306576Mr.INVERTED_OUTLINED
            if (r1 != r0) goto L_0x021b
        L_0x0218:
            r11.A01(r10)
        L_0x021b:
            X.6Ly r2 = r8.A0L
            java.lang.Object r0 = r5.get()
            X.8f8 r0 = (X.C360778f8) r0
            X.8bb r1 = r0.A07()
            float r0 = r8.A00()
            X.AnonymousClass9UR.A07(r4, r1, r2, r0)
            java.lang.Object r1 = r3.get()
            X.91N r1 = (X.AnonymousClass91N) r1
            java.lang.Object r0 = r22.get()
            X.91a r0 = (X.AnonymousClass91a) r0
            java.lang.Integer r0 = r0.A00
            r1.A01(r0)
            r8.A0L(r9)
            android.graphics.drawable.Drawable r2 = r8.A04
            if (r2 != 0) goto L_0x024a
            X.6Ly r2 = r8.A0L
            if (r2 == 0) goto L_0x0266
        L_0x024a:
            boolean r0 = r2 instanceof X.AnonymousClass5MH
            if (r0 == 0) goto L_0x0261
            r1 = r2
            X.5MH r1 = (X.AnonymousClass5MH) r1
            int r0 = r1.A01
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0Q = r0
            int r0 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8.A0P = r0
        L_0x0261:
            X.8MG r0 = r8.A1X
            r0.EDV(r2, r9)
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.Dr2(X.8bb, java.lang.Integer):void");
    }

    public final void Dwz(float f, float f2) {
        C314676if r1 = this.A1d;
        if (r1 == null || !A0Q(this)) {
            C314676if r0 = this.A1a;
            if (r0 != null) {
                ((C338677iL) r0.get()).A05();
            }
        } else {
            ((C348987zP) r1.get()).A03();
        }
        C306386Ly r3 = this.A0L;
        AnonymousClass9UR.A07(this.A1j, ((C360778f8) this.A1g.get()).A07(), r3, A00());
        C314676if r12 = this.A1c;
        if (r12.A03) {
            A9W a9w = (A9W) r12.get();
            a9w.A07.post(a9w.A08);
        }
        ((AnonymousClass91N) this.A1f.get()).A01(((AnonymousClass91a) this.A1Z.get()).A00);
        if (!182.A06(0Tu.A06, this.A1J, 36324028776001213L)) {
            1Av r4 = this.A1i;
            float currentRatio = this.A1m.getCurrentRatio();
            r4.A8F.Epx(r4, Float.valueOf(currentRatio), 1Av.A8a[63]);
        }
    }

    public static void A09(C358368an r7) {
        View view;
        View view2;
        C226262fy r0;
        boolean z = false;
        if ((A01(r7) instanceof AnonymousClass9QA) && r7.A1Q.A02.A01() == C365758nd.A04) {
            Boolean bool = r7.A0N;
            if (bool == null) {
                bool = Boolean.valueOf(182.A06(0Tu.A05, r7.A1J, 36324591416651949L));
                r7.A0N = bool;
            }
            z = bool.booleanValue();
        }
        if (!z || (view2 = r7.A14) == null) {
            view = r7.A06;
            if (view == null) {
                return;
            }
        } else {
            if (r7.A06 == null) {
                r7.A06 = view2.requireViewById(R.id.ai_filter_picker);
                r7.A0D = (TextView) view2.requireViewById(R.id.ai_filter_picker_title);
                r7.A07 = view2.requireViewById(R.id.ai_filter_image_view);
                AnonymousClass0fU.A00(new AMU(r7), r7.A06);
            }
            ConstrainedEditText constrainedEditText = r7.A1j;
            if (constrainedEditText.length() <= 1 || constrainedEditText.length() >= 20) {
                view = r7.A06;
            } else {
                r7.A06.getVisibility();
                r7.A06.setVisibility(0);
                if (r7.A0D != null) {
                    r7.A0D.setText(r7.A0r.getString(2131975202));
                }
                UserSession userSession = r7.A1J;
                1Av A002 = 1Au.A00(userSession);
                0s0 r1 = A002.A2E;
                AnonymousClass0YZ[] r6 = 1Av.A8a;
                if (!((Boolean) r1.CDM(A002, r6[75])).booleanValue()) {
                    AnonymousClass5Gt r12 = new AnonymousClass5Gt(r7.A1I.requireActivity(), new C315476jx((CharSequence) r7.A0r.getString(2131975205)));
                    if (r7.A0N()) {
                        r0 = C226262fy.BELOW_ANCHOR;
                    } else {
                        r0 = C226262fy.ABOVE_ANCHOR;
                    }
                    r12.A05 = r0;
                    r12.A03(r7.A06);
                    r12.A0A = true;
                    r12.A00().A06();
                    1Av A003 = 1Au.A00(userSession);
                    A003.A2E.Epx(A003, true, r6[75]);
                    return;
                }
                return;
            }
        }
        view.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        if (r7.A0M() == false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r0.booleanValue() == false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.C358368an r7) {
        /*
            boolean r0 = r7.A0M()
            if (r0 == 0) goto L_0x00a1
            android.view.View r2 = r7.A14
            if (r2 == 0) goto L_0x00a1
            android.view.View r0 = r7.A08
            if (r0 != 0) goto L_0x004b
            r0 = 2131427912(0x7f0b0248, float:1.8477454E38)
            android.view.View r0 = r2.requireViewById(r0)
            r7.A08 = r0
            r0 = 2131427913(0x7f0b0249, float:1.8477456E38)
            android.view.View r0 = r2.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.A0E = r0
            r1 = 2131427901(0x7f0b023d, float:1.8477431E38)
            android.view.View r0 = r2.requireViewById(r1)
            r7.A09 = r0
            android.view.View r2 = r2.requireViewById(r1)
            boolean r0 = r7.A0O()
            if (r0 == 0) goto L_0x0041
            android.content.Context r1 = r7.A0q
            r0 = 16
            float r0 = X.0nA.A04(r1, r0)
            int r0 = (int) r0
            X.0nA.A0g(r2, r0, r0)
        L_0x0041:
            android.view.View r1 = r7.A08
            X.AMW r0 = new X.AMW
            r0.<init>(r7)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x004b:
            com.instagram.ui.text.ConstrainedEditText r1 = r7.A1j
            int r0 = r1.length()
            r5 = 0
            r4 = 1
            if (r0 <= r4) goto L_0x005c
            boolean r0 = r7.A0M()
            r6 = 1
            if (r0 != 0) goto L_0x005d
        L_0x005c:
            r6 = 0
        L_0x005d:
            int r0 = r1.length()
            if (r0 >= r4) goto L_0x0095
            X.4yO r0 = A01(r7)
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 != 0) goto L_0x0095
            X.82p r0 = r7.A1Q
            X.82o r0 = r0.A02
            X.8nd r1 = r0.A01()
            X.8nd r0 = X.C365758nd.A04
            if (r1 != r0) goto L_0x0095
            java.lang.Boolean r0 = r7.A0O
            if (r0 != 0) goto L_0x008e
            com.instagram.common.session.UserSession r3 = r7.A1J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325111107760747(0x810d7f0001326b, double:3.0354847618053664E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.A0O = r0
        L_0x008e:
            boolean r0 = r0.booleanValue()
            r3 = 1
            if (r0 != 0) goto L_0x0096
        L_0x0095:
            r3 = 0
        L_0x0096:
            if (r6 != 0) goto L_0x00a2
            if (r3 != 0) goto L_0x00a2
            android.view.View r1 = r7.A08
            r0 = 8
            r1.setVisibility(r0)
        L_0x00a1:
            return
        L_0x00a2:
            android.view.View r0 = r7.A08
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00c1
            com.instagram.common.session.UserSession r0 = r7.A1J
            X.27r r2 = X.27p.A01(r0)
            if (r3 == 0) goto L_0x014b
            X.80P r1 = X.AnonymousClass80P.IMAGE_TO_TEXT_WITH_META_AI_INTENT
        L_0x00b4:
            X.4yO r0 = A01(r7)
            boolean r0 = r0 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x013b
            X.4yP r0 = X.C279294yP.CLIPS
        L_0x00be:
            r2.A14(r0, r1)
        L_0x00c1:
            android.view.View r0 = r7.A08
            r0.setVisibility(r5)
            android.widget.TextView r0 = r7.A0E
            if (r0 == 0) goto L_0x00dd
            android.content.res.Resources r1 = r7.A0r
            r0 = 2131975207(0x7f135c27, float:1.95875E38)
            if (r3 == 0) goto L_0x00d4
            r0 = 2131975208(0x7f135c28, float:1.9587502E38)
        L_0x00d4:
            java.lang.String r1 = r1.getString(r0)
            android.widget.TextView r0 = r7.A0E
            r0.setText(r1)
        L_0x00dd:
            com.instagram.common.session.UserSession r3 = r7.A1J
            X.1Av r2 = X.1Au.A00(r3)
            X.0s0 r1 = r2.A2G
            X.0YZ[] r6 = X.1Av.A8a
            r5 = 74
            r0 = r6[r5]
            java.lang.Object r0 = r1.CDM(r2, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00a1
            X.4DH r0 = r7.A1I
            androidx.fragment.app.FragmentActivity r2 = r0.requireActivity()
            android.content.res.Resources r1 = r7.A0r
            r0 = 2131975209(0x7f135c29, float:1.9587504E38)
            java.lang.String r1 = r1.getString(r0)
            X.6jx r0 = new X.6jx
            r0.<init>((java.lang.CharSequence) r1)
            X.5Gt r1 = new X.5Gt
            r1.<init>(r2, r0)
            boolean r0 = r7.A0N()
            if (r0 == 0) goto L_0x0138
            X.2fy r0 = X.C226262fy.BELOW_ANCHOR
        L_0x0118:
            r1.A05 = r0
            android.view.View r0 = r7.A08
            r1.A03(r0)
            r1.A0A = r4
            X.5Gv r0 = r1.A00()
            r0.A06()
            X.1Av r3 = X.1Au.A00(r3)
            X.0s0 r2 = r3.A2G
            r1 = r6[r5]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.Epx(r3, r0, r1)
            return
        L_0x0138:
            X.2fy r0 = X.C226262fy.ABOVE_ANCHOR
            goto L_0x0118
        L_0x013b:
            X.4yO r0 = A01(r7)
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0147
            X.4yP r0 = X.C279294yP.STORY
            goto L_0x00be
        L_0x0147:
            X.4yP r0 = X.C279294yP.FEED
            goto L_0x00be
        L_0x014b:
            X.80P r1 = X.AnonymousClass80P.AI_REWRITE_WITH_META_AI_INTENT
            goto L_0x00b4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0A(X.8an):void");
    }

    private boolean A0M() {
        if (!(A01(this) instanceof AnonymousClass9QA)) {
            return false;
        }
        Boolean bool = this.A0k;
        if (bool == null) {
            bool = Boolean.valueOf(182.A06(0Tu.A05, this.A1J, 36325111107826284L));
            this.A0k = bool;
        }
        return bool.booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.182.A06(X.0Tu.A05, r5.A1J, 36323139719211928L) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0N() {
        /*
            r5 = this;
            X.4yO r0 = A01(r5)
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            r4 = 1
            if (r0 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r3 = r5.A1J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323139719211928(0x810bb400172b98, double:3.034238047748949E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            boolean r0 = A0S(r5)
            if (r0 == 0) goto L_0x0023
            if (r1 == 0) goto L_0x0023
            return r4
        L_0x0023:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0N():boolean");
    }

    private boolean A0O() {
        if ((A01(this) instanceof AnonymousClass80O) && AnonymousClass8IK.A09(this.A1J)) {
            return true;
        }
        if (A01(this) instanceof AnonymousClass9QA) {
            if (182.A06(0Tu.A06, this.A1J, 36323139718228873L)) {
                return true;
            }
        }
        if (!(A01(this) instanceof C363138jC)) {
            return false;
        }
        if (182.A06(0Tu.A06, this.A1J, 36323139719277465L)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A1J, 36323139717835651L) == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A1J, 36323139718425484L) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0Q(X.C358368an r6) {
        /*
            X.4yO r0 = A01(r6)
            boolean r0 = r0 instanceof X.AnonymousClass80O
            r5 = 1
            if (r0 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r3 = r6.A1J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323139717835651(0x810bb400022b83, double:3.0342380468785856E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            X.4yO r0 = A01(r6)
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0032
            com.instagram.common.session.UserSession r3 = r6.A1J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323139718425484(0x810bb4000b2b8c, double:3.0342380472515984E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            boolean r0 = A0S(r6)
            if (r0 == 0) goto L_0x003e
            if (r4 != 0) goto L_0x003d
            if (r1 == 0) goto L_0x003e
        L_0x003d:
            return r5
        L_0x003e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0Q(X.8an):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A1J, 36323139717901188L) == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (X.182.A06(X.0Tu.A05, r6.A1J, 36323139718294410L) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0R(X.C358368an r6) {
        /*
            X.4yO r0 = A01(r6)
            boolean r0 = r0 instanceof X.AnonymousClass80O
            r5 = 1
            if (r0 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r3 = r6.A1J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323139717901188(0x810bb400032b84, double:3.0342380469200315E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r4 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            X.4yO r0 = A01(r6)
            boolean r0 = r0 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x0032
            com.instagram.common.session.UserSession r3 = r6.A1J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36323139718294410(0x810bb400092b8a, double:3.0342380471687066E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            boolean r0 = A0Q(r6)
            if (r0 == 0) goto L_0x003e
            if (r4 != 0) goto L_0x003d
            if (r1 == 0) goto L_0x003e
        L_0x003d:
            return r5
        L_0x003e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.A0R(X.8an):boolean");
    }

    public static boolean A0S(C358368an r4) {
        if (A01(r4) instanceof AnonymousClass80O) {
            if (182.A06(0Tu.A05, r4.A1J, 36323139717770114L)) {
                return true;
            }
        }
        if (A01(r4) instanceof AnonymousClass9QA) {
            if (182.A06(0Tu.A05, r4.A1J, 36323139718228873L)) {
                return true;
            }
        }
        if (!(A01(r4) instanceof C363138jC)) {
            return false;
        }
        if (182.A06(0Tu.A05, r4.A1J, 36323139719277465L)) {
            return true;
        }
        return false;
    }

    public final boolean CQC() {
        return A01(this) instanceof AnonymousClass80O;
    }

    public final boolean CTU() {
        return A01(this) instanceof C363138jC;
    }

    public final boolean Ccc() {
        return A01(this) instanceof AnonymousClass9QA;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x02ad, code lost:
        if (X.182.A06(X.0Tu.A06, r7, 36319265657199709L) != false) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x02ff, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36325270021485359L) == false) goto L_0x0301;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C358368an(android.content.Context r20, android.view.View r21, X.28D r22, X.AnonymousClass4DH r23, com.instagram.common.session.UserSession r24, X.AnonymousClass3E6 r25, X.C354538Mk r26, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r27, X.C3499582p r28, X.AnonymousClass8BQ r29, X.AnonymousClass8AL r30, X.C314446iH r31, X.AnonymousClass80U r32, X.AnonymousClass8MG r33, X.C358358am r34, X.C337257fy r35, com.instagram.ui.widget.interactive.InteractiveDrawableContainer r36, java.lang.Integer r37, java.lang.String r38, java.util.List r39, boolean r40, boolean r41, boolean r42) {
        /*
            r19 = this;
            r9 = r19
            r9.<init>()
            r2 = 0
            r9.A0T = r2
            r6 = 0
            r9.A03 = r6
            r9.A0I = r2
            r9.A0i = r2
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r9.A1p = r0
            X.0yf r0 = new X.0yf
            r0.<init>(r6)
            r9.A1q = r0
            X.0yf r0 = new X.0yf
            r0.<init>(r6)
            r9.A1r = r0
            java.lang.String r0 = ""
            r9.A0U = r0
            r9.A0c = r6
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r9.A0R = r1
            r9.A0g = r6
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r9.A0X = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r9.A0S = r0
            r4 = r41
            r18 = r21
            if (r41 == 0) goto L_0x0526
            r3 = 2131442599(0x7f0b3ba7, float:1.8507242E38)
            r0 = r18
            android.view.View r5 = r0.requireViewById(r3)
        L_0x004c:
            r9.A15 = r5
            r10 = r20
            r9.A0q = r10
            r7 = r24
            r9.A1J = r7
            r15 = r28
            r9.A1Q = r15
            r9.A0a = r4
            r0 = r42
            r9.A0f = r0
            r0 = 2131442627(0x7f0b3bc3, float:1.85073E38)
            android.view.View r4 = r5.requireViewById(r0)
            com.instagram.ui.text.ConstrainedEditText r4 = (com.instagram.ui.text.ConstrainedEditText) r4
            r9.A1j = r4
            r0 = r26
            r9.A1O = r0
            r11 = 1
            java.lang.String r0 = "image/*"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r4.setSupportedContentMimeTypes(r0)
            r0 = r37
            r9.A0S = r0
            r0 = 2131442628(0x7f0b3bc4, float:1.8507301E38)
            android.view.View r0 = r5.requireViewById(r0)
            r9.A0w = r0
            r0 = 2131432000(0x7f0b1240, float:1.8485745E38)
            android.view.View r0 = r5.findViewById(r0)
            com.instagram.ui.text.fittingtextview.FittingTextView r0 = (com.instagram.ui.text.fittingtextview.FittingTextView) r0
            r9.A1k = r0
            X.8ar r0 = new X.8ar
            r0.<init>(r10, r7)
            r9.A1U = r0
            r0 = 2131442005(0x7f0b3955, float:1.8506038E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.ui.widget.drawing.StrokeWidthTool r0 = (com.instagram.ui.widget.drawing.StrokeWidthTool) r0
            r9.A1m = r0
            r0 = r32
            r9.A1W = r0
            r0 = r33
            r9.A1X = r0
            r0 = r25
            r9.A1L = r0
            r0 = r36
            r9.A1n = r0
            r0 = r38
            r9.A1o = r0
            X.1Av r14 = X.1Au.A00(r7)
            r9.A1i = r14
            r17 = r30
            r0 = r17
            r9.A1v = r0
            r0 = r27
            r9.A1P = r0
            r0 = r31
            r9.A0J = r0
            X.8as r0 = new X.8as
            r8 = r23
            r0.<init>(r8, r7)
            r9.A1V = r0
            X.8aw r0 = new X.8aw
            r0.<init>(r8, r7)
            r9.A1w = r0
            r9.A1I = r8
            r0 = r29
            r9.A1R = r0
            r0 = 2131438027(0x7f0b29cb, float:1.849797E38)
            android.view.View r3 = r5.requireViewById(r0)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r9.A16 = r3
            r0 = 2131438026(0x7f0b29ca, float:1.8497967E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r9.A1A = r0
            r0 = 2131438022(0x7f0b29c6, float:1.849796E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r9.A18 = r0
            r0 = 2131432566(0x7f0b1476, float:1.8486893E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.ui.widget.drawing.EyedropperColorPickerTool r0 = (com.instagram.ui.widget.drawing.EyedropperColorPickerTool) r0
            r9.A1l = r0
            boolean r0 = r9.A0a
            r12 = r22
            if (r0 == 0) goto L_0x04e7
            r9.A17 = r2
            r9.A1M = r2
            r9.A19 = r2
            r9.A1N = r2
        L_0x011b:
            r0 = 2131438018(0x7f0b29c2, float:1.8497951E38)
            android.view.View r0 = r3.requireViewById(r0)
            r9.A0u = r0
            r0 = 2131438025(0x7f0b29c9, float:1.8497965E38)
            android.view.View r0 = r3.requireViewById(r0)
            r9.A0y = r0
            r0 = 2131438021(0x7f0b29c5, float:1.8497957E38)
            android.view.View r0 = r3.requireViewById(r0)
            r9.A0v = r0
            r0 = 2131442654(0x7f0b3bde, float:1.8507354E38)
            android.view.View r0 = r5.requireViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r9.A1G = r0
            r0 = 2131442652(0x7f0b3bdc, float:1.850735E38)
            android.view.View r0 = r5.requireViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r9.A1E = r0
            r0 = 2131442653(0x7f0b3bdd, float:1.8507352E38)
            android.view.View r0 = r5.requireViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r9.A1F = r0
            r0 = 2131442620(0x7f0b3bbc, float:1.8507285E38)
            android.view.View r3 = r5.findViewById(r0)
            boolean r0 = r3 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x04e3
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
            r9.A14 = r3
        L_0x016a:
            if (r3 == 0) goto L_0x0174
            X.8ax r0 = new X.8ax
            r0.<init>(r9)
            r3.addOnLayoutChangeListener(r0)
        L_0x0174:
            r0 = 2131442616(0x7f0b3bb8, float:1.8507277E38)
            android.view.View r3 = r5.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            r9.A1K = r3
            X.8ay r0 = new X.8ay
            r0.<init>(r9)
            X.AnonymousClass0fU.A00(r0, r3)
            r0 = 2131442617(0x7f0b3bb9, float:1.8507279E38)
            android.view.View r3 = r5.findViewById(r0)
            r9.A10 = r3
            if (r3 == 0) goto L_0x04dd
            X.8az r0 = new X.8az
            r0.<init>(r9)
            X.AnonymousClass0fU.A00(r0, r3)
            r0 = 2131442619(0x7f0b3bbb, float:1.8507283E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.A1B = r0
            r0 = 2131442618(0x7f0b3bba, float:1.850728E38)
            android.view.View r0 = r3.requireViewById(r0)
            r9.A11 = r0
            r0 = 2131975107(0x7f135bc3, float:1.9587297E38)
            java.lang.String r0 = r10.getString(r0)
            r3.setContentDescription(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r3, r0)
        L_0x01bd:
            r0 = 2131442621(0x7f0b3bbd, float:1.8507287E38)
            android.view.View r3 = r5.findViewById(r0)
            r9.A12 = r3
            if (r3 == 0) goto L_0x04d7
            X.8b0 r0 = new X.8b0
            r0.<init>(r9)
            X.AnonymousClass0fU.A00(r0, r3)
            r0 = 2131442623(0x7f0b3bbf, float:1.8507291E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.A1C = r0
            r0 = 2131442622(0x7f0b3bbe, float:1.850729E38)
            android.view.View r0 = r3.requireViewById(r0)
            r9.A13 = r0
            r0 = 2131975108(0x7f135bc4, float:1.9587299E38)
            java.lang.String r0 = r10.getString(r0)
            r3.setContentDescription(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r3, r0)
        L_0x01f3:
            android.view.ViewTreeObserver r3 = r4.getViewTreeObserver()
            X.8b1 r0 = new X.8b1
            r0.<init>(r9)
            r3.addOnGlobalLayoutListener(r0)
            r0 = 2131436103(0x7f0b2247, float:1.8494067E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r9.A1t = r0
            r0 = 2131436122(0x7f0b225a, float:1.8494105E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r9.A1u = r0
            X.1Av r0 = X.1Au.A00(r7)
            X.0xa r3 = r0.A01
            java.lang.String r0 = "preference_show_mention_thread_send_setting_helper_text_seen_count"
            int r13 = r3.getInt(r0, r6)
            r3 = 3
            r0 = 0
            if (r13 < r3) goto L_0x0226
            r0 = 1
        L_0x0226:
            r9.A0m = r0
            X.0t1 r0 = X.0eE.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            boolean r0 = r0.A2L()
            r9.A1z = r0
            X.1Av r0 = X.1Au.A00(r7)
            X.0xa r0 = r0.A01
            X.0xY r3 = r0.AR4()
            java.lang.String r0 = "allow_story_mention_group_thread_creation"
            r3.E5T(r0, r6)
            r3.apply()
            android.content.res.Resources r3 = r10.getResources()
            r9.A0r = r3
            r0 = 2131099783(0x7f060087, float:1.7811929E38)
            int r0 = r3.getColor(r0)
            r9.A0p = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.0nA.A03(r10, r0)
            r9.A0o = r0
            r9.A0n = r0
            r0 = 2131240071(0x7f082487, float:1.8096467E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r0.getClass()
            r9.A1s = r0
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r3)
            r9.A0s = r0
            r0 = r34
            r9.A1y = r0
            r9.A1H = r12
            r0 = r40
            r9.A0l = r0
            X.82o r0 = r15.A02
            boolean r10 = r0.A0F()
            X.0t1 r0 = X.0eE.A00(r7)
            com.instagram.user.model.User r0 = r0.A00()
            java.lang.Integer r0 = r0.A0N()
            r3 = 0
            if (r0 != r1) goto L_0x0298
            r3 = 1
        L_0x0298:
            boolean r0 = r9.A0a
            if (r0 != 0) goto L_0x02af
            if (r10 != 0) goto L_0x02af
            if (r3 == 0) goto L_0x02af
            X.0Tu r12 = X.0Tu.A06
            r0 = 36319265657199709(0x81082e00001c5d, double:3.031788075332826E-306)
            boolean r0 = X.182.A06(r12, r7, r0)
            r16 = 1
            if (r0 == 0) goto L_0x02b1
        L_0x02af:
            r16 = 0
        L_0x02b1:
            r13 = r35
            if (r35 == 0) goto L_0x04c1
            r0 = 2131442655(0x7f0b3bdf, float:1.8507356E38)
            android.view.View r12 = r5.requireViewById(r0)
            r9.A0z = r12
            r0 = 2131436109(0x7f0b224d, float:1.849408E38)
            android.view.View r2 = r12.requireViewById(r0)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            r9.A1D = r2
            android.content.Context r1 = r5.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r1, r6, r6)
            r2.setLayoutManager(r0)
            X.8b2 r1 = new X.8b2
            r1.<init>(r8, r15, r9)
            X.6id[] r0 = new X.C314656id[r6]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            r9.A1Y = r0
            X.0Tu r15 = X.0Tu.A06
            r0 = 36317453180998809(0x81068800001499, double:3.030641858085121E-306)
            boolean r0 = X.182.A06(r15, r7, r0)
            r9.A0Y = r0
            boolean r0 = r9.A0a
            if (r0 != 0) goto L_0x0301
            X.0Tu r15 = X.0Tu.A05
            r0 = 36325270021485359(0x810da40000332f, double:3.035585259484705E-306)
            boolean r1 = X.182.A06(r15, r7, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0302
        L_0x0301:
            r0 = 0
        L_0x0302:
            r9.A0b = r0
            com.instagram.common.session.UserSession r15 = r9.A1J
            X.8b3 r0 = new X.8b3
            r0.<init>(r8, r9)
            X.8b5 r1 = new X.8b5
            r1.<init>(r8, r15, r0, r13)
            r9.A1S = r1
            r1.setHasStableIds(r11)
            X.8b7 r0 = new X.8b7
            r0.<init>(r9, r10, r3)
            r1.registerAdapterDataObserver(r0)
            r2.setAdapter(r1)
            r4.addTextChangedListener(r1)
            X.8b8 r1 = new X.8b8
            r1.<init>(r9)
            java.util.List r0 = r4.A07
            r0.add(r1)
            if (r16 == 0) goto L_0x04a5
            r0 = 2131436105(0x7f0b2249, float:1.849407E38)
            android.view.View r3 = r12.requireViewById(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320983644185598(0x8109be000123fe, double:3.0328745372204803E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            r1 = 2131966133(0x7f1338b5, float:1.9569096E38)
            if (r0 == 0) goto L_0x0349
            r1 = 2131966134(0x7f1338b6, float:1.9569098E38)
        L_0x0349:
            X.8bA r0 = new X.8bA
            r0.<init>(r3, r7, r1)
            r9.A0I = r0
        L_0x0350:
            boolean r0 = r9.A0a
            if (r0 == 0) goto L_0x0495
            r1 = 0
        L_0x0355:
            r9.A1T = r1
        L_0x0357:
            X.8bH r2 = new X.8bH
            r2.<init>(r9)
            r0 = 2131430256(0x7f0b0b70, float:1.8482208E38)
            android.view.View r0 = r5.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.2eb r1 = new X.2eb
            r1.<init>(r0)
            X.8bI r0 = new X.8bI
            r0.<init>(r1, r2)
            r9.A1x = r0
            r4.addTextChangedListener(r0)
            X.8bJ r1 = new X.8bJ
            r1.<init>(r7, r9)
            X.6id[] r0 = new X.C314656id[r6]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            r9.A1Z = r0
            X.8bK r1 = new X.8bK
            r1.<init>(r9)
            X.6id[] r0 = new X.C314656id[r6]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            r9.A1c = r0
            X.8bL r1 = new X.8bL
            r1.<init>(r9)
            X.6id[] r0 = new X.C314656id[r6]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            r9.A1f = r0
            r0 = 2131431539(0x7f0b1073, float:1.848481E38)
            android.view.View r0 = r5.requireViewById(r0)
            r9.A0x = r0
            X.8bM r1 = new X.8bM
            r0 = r17
            r1.<init>(r0, r9)
            X.6id[] r0 = new X.C314656id[r6]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            r9.A1g = r0
            r0 = 2131442578(0x7f0b3b92, float:1.85072E38)
            android.view.View r0 = r5.requireViewById(r0)
            X.3oV r2 = X.2b1.A01(r0, r6, r6)
            X.3oV r0 = r9.A1M
            if (r0 != 0) goto L_0x0488
            r0 = 0
        L_0x03c3:
            r9.A1a = r0
            boolean r0 = r9.A0a
            if (r0 == 0) goto L_0x047b
            r0 = 0
        L_0x03ca:
            r9.A1b = r0
            boolean r0 = r9.A0a
            if (r0 == 0) goto L_0x046e
            r0 = 0
        L_0x03d1:
            r9.A1e = r0
            boolean r0 = r9.A0a
            if (r0 == 0) goto L_0x0461
            r0 = 0
        L_0x03d8:
            r9.A1d = r0
            X.8bR r1 = new X.8bR
            r1.<init>(r8, r9)
            X.6id[] r0 = new X.C314656id[r6]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            r9.A1h = r0
            android.content.Context r3 = r5.getContext()
            X.8bS r2 = new X.8bS
            r2.<init>(r9)
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r3, r2, r1)
            r9.A0t = r0
            X.8bT r0 = new X.8bT
            r0.<init>(r9)
            r9.A05 = r0
            android.view.View r1 = r9.A0w
            X.8bU r0 = new X.8bU
            r0.<init>(r9)
            r1.setOnTouchListener(r0)
            com.instagram.ui.text.ConstrainedEditText r1 = r9.A1j
            android.view.View$OnTouchListener r0 = r9.A05
            r1.setOnTouchListener(r0)
            X.8bV r0 = new X.8bV
            r0.<init>(r9)
            r1.addOnLayoutChangeListener(r0)
            r1.requestFocus()
            X.8bW r0 = new X.8bW
            r0.<init>(r9)
            r1.setOnFocusChangeListener(r0)
            X.8bX r0 = new X.8bX
            r0.<init>(r9)
            r1.addTextChangedListener(r0)
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            X.82v r0 = new X.82v
            r0.<init>(r7, r1)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r2)
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel> r0 = com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel.class
            X.2YL r0 = r1.A00(r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r0
            r9.A0K = r0
            r0 = r39
            r9.A0W = r0
            boolean r0 = r9.A0l
            if (r0 == 0) goto L_0x045f
            int r0 = r14.A09()
        L_0x045b:
            r9.A0a(r0)
            return
        L_0x045f:
            r0 = -1
            goto L_0x045b
        L_0x0461:
            X.8bQ r1 = new X.8bQ
            r1.<init>(r2, r9)
            X.6id[] r0 = new X.C314656id[r6]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            goto L_0x03d8
        L_0x046e:
            X.8bP r1 = new X.8bP
            r1.<init>(r9)
            X.6id[] r0 = new X.C314656id[r6]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            goto L_0x03d1
        L_0x047b:
            X.8bO r1 = new X.8bO
            r1.<init>(r9)
            X.6id[] r0 = new X.C314656id[r6]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            goto L_0x03ca
        L_0x0488:
            X.8bN r1 = new X.8bN
            r1.<init>(r2, r9)
            X.6id[] r0 = new X.C314656id[r6]
            X.6if r0 = X.C314666ie.A00(r1, r0)
            goto L_0x03c3
        L_0x0495:
            r1 = 2131436102(0x7f0b2246, float:1.8494065E38)
            r0 = r18
            android.view.View r0 = r0.requireViewById(r1)
            X.8bD r1 = new X.8bD
            r1.<init>(r0, r8, r7)
            goto L_0x0355
        L_0x04a5:
            boolean r0 = r9.A0a
            if (r0 == 0) goto L_0x0350
            r0 = 2131432809(0x7f0b1569, float:1.8487386E38)
            android.view.View r1 = r12.requireViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r9.A0i = r1
            r0 = 2131962379(0x7f132a0b, float:1.9561481E38)
            r1.setText(r0)
            android.widget.TextView r0 = r9.A0i
            r0.setVisibility(r6)
            goto L_0x0350
        L_0x04c1:
            X.Agc r1 = new X.Agc
            r1.<init>(r9)
            java.util.List r0 = r4.A07
            r0.add(r1)
            r9.A1S = r2
            r9.A1T = r2
            r9.A0z = r2
            r9.A1D = r2
            r9.A1Y = r2
            goto L_0x0357
        L_0x04d7:
            r9.A1C = r2
            r9.A13 = r2
            goto L_0x01f3
        L_0x04dd:
            r9.A1B = r2
            r9.A11 = r2
            goto L_0x01bd
        L_0x04e3:
            r9.A14 = r3
            goto L_0x016a
        L_0x04e7:
            X.28D r0 = X.28D.A2y
            if (r12 != r0) goto L_0x0502
            r9.A17 = r2
            r9.A1M = r2
            r0 = 2131438024(0x7f0b29c8, float:1.8497963E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r9.A19 = r0
            X.3oV r0 = X.2b1.A01(r0, r6, r6)
            r9.A1N = r0
            goto L_0x011b
        L_0x0502:
            r0 = 2131438020(0x7f0b29c4, float:1.8497955E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r9.A17 = r0
            X.3oV r0 = X.2b1.A01(r0, r6, r6)
            r9.A1M = r0
            r0 = 2131438024(0x7f0b29c8, float:1.8497963E38)
            android.view.View r0 = r3.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r9.A19 = r0
            X.3oV r0 = X.2b1.A01(r0, r6, r6)
            r9.A1N = r0
            goto L_0x011b
        L_0x0526:
            r5 = r18
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C358368an.<init>(android.content.Context, android.view.View, X.28D, X.4DH, com.instagram.common.session.UserSession, X.3E6, X.8Mk, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.82p, X.8BQ, X.8AL, X.6iH, X.80U, X.8MG, X.8am, X.7fy, com.instagram.ui.widget.interactive.InteractiveDrawableContainer, java.lang.Integer, java.lang.String, java.util.List, boolean, boolean, boolean):void");
    }
}
