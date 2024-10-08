package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.karaoke.editor.KaraokeStickerEditorController$layoutManager$1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.Lh1  reason: case insensitive filesystem */
public final class C64724Lh1 implements AnonymousClass4DR, B21, AnonymousClass8Z3, AnonymousClass84H {
    public View A00;
    public View A01;
    public View A02;
    public RecyclerView A03;
    public C347017w8 A04;
    public C61750KKp A05;
    public C66540MVu A06;
    public C306576Mr A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public boolean A0B;
    public View A0C;
    public ImageView A0D;
    public TextView A0E;
    public final Context A0F;
    public final View A0G;
    public final View A0H;
    public final UserSession A0I;
    public final AnonymousClass3E6 A0J;
    public final TargetViewSizeProvider A0K;
    public final L0K A0L;
    public final C63914LBz A0M = new Object();
    public final AnonymousClass8ME A0N;
    public final List A0O;
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q;
    public final View.OnClickListener A0R;
    public final ViewStub A0S;
    public final FragmentActivity A0T;
    public final AnonymousClass07Z A0U;
    public final C60449Jlh A0V;
    public final C354538Mk A0W;
    public final AnonymousClass8BQ A0X;
    public final AnonymousClass8AL A0Y;
    public final KaraokeStickerEditorController$layoutManager$1 A0Z;
    public final AnonymousClass80U A0a;
    public final AnonymousClass8Z5 A0b;

    public final void DMp() {
    }

    public final void DzC(int i, int i2) {
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.LBz, java.lang.Object] */
    public C64724Lh1(View view, FragmentActivity fragmentActivity, AnonymousClass07Z r6, UserSession userSession, AnonymousClass3E6 r8, C354538Mk r9, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8BQ r11, AnonymousClass8AL r12, C66540MVu mVu, AnonymousClass80U r14, AnonymousClass8ME r15) {
        C51969G9p.A1N(r9, 9, r12);
        this.A0U = r6;
        this.A06 = mVu;
        this.A0I = userSession;
        this.A0a = r14;
        this.A0K = targetViewSizeProvider;
        this.A0J = r8;
        this.A0N = r15;
        this.A0W = r9;
        this.A0Y = r12;
        this.A0X = r11;
        this.A0T = fragmentActivity;
        Context A0S2 = AnonymousClass7TE.A0S(view);
        this.A0F = A0S2;
        this.A0H = AnonymousClass7TE.A0b(view, R.id.text_overlay_edit_text_container);
        this.A0G = AnonymousClass7TE.A0b(view, R.id.done_button);
        this.A0S = (ViewStub) AnonymousClass7TE.A0b(view, R.id.karaoke_sticker_editor_stub);
        this.A0b = new AnonymousClass8Z5(A0S2, r8, this);
        this.A08 = AnonymousClass05K.A0C;
        this.A0Z = new KaraokeStickerEditorController$layoutManager$1(A0S2, this);
        this.A0L = new L0K(this);
        this.A0P = AnonymousClass0eN.A01(new MM9(this, 33));
        this.A0V = new C60449Jlh(0);
        this.A0Q = AnonymousClass0eN.A01(new MM9(this, 34));
        this.A0R = new LY0(this, 48);
        Integer num = AnonymousClass05K.A00;
        this.A09 = num;
        this.A0A = num;
        C306576Mr r2 = C306576Mr.DISABLED;
        this.A07 = r2;
        this.A0O = 0sr.A1P(new C306576Mr[]{r2, C306576Mr.DEFAULT, C306576Mr.INVERTED});
        AnonymousClass80V r0 = AnonymousClass80V.MEDIA_EDIT;
        AnonymousClass80W r1 = ((AnonymousClass80T) r14).A01;
        r1.A01(this, r0);
        r1.A01(this, AnonymousClass80V.EDIT_TIMED_ELEMENT_IN_STACKED_TIMELINE);
        A02(this);
    }

    public static final void A00(C64724Lh1 lh1) {
        LED BJn;
        Integer num;
        int intValue;
        String A0f;
        C66540MVu mVu = lh1.A06;
        if (mVu != null && (BJn = mVu.BJn()) != null && (num = BJn.A05) != null && BJn.A07.size() > (intValue = num.intValue())) {
            String str = ((C15092UOk) BJn.A07.get(intValue)).A05;
            C60651Joy joy = ((KG4) lh1.A0P.getValue()).A00;
            if (joy != null && (A0f = AnonymousClass7TF.A0f(joy.A01)) != null) {
                for (C15092UOk uOk : BJn.A07) {
                    if (0qQ.A0K(uOk.A05, str)) {
                        C66540MVu mVu2 = lh1.A06;
                        if (mVu2 != null) {
                            mVu2.EUl(str, A0f);
                        }
                        A06(lh1);
                        RecyclerView recyclerView = lh1.A03;
                        if (recyclerView == null) {
                            0qQ.A0F("editRecyclerView");
                            throw AnonymousClass00P.createAndThrow();
                        } else {
                            0nA.A0N(recyclerView);
                            return;
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
    }

    public static final void A01(C64724Lh1 lh1) {
        View inflate = lh1.A0S.inflate();
        lh1.A00 = inflate;
        String str = "captionEditor";
        if (inflate != null) {
            lh1.A0E = DbU.A0G(inflate, R.id.karaoke_sticker_transcribing_hint);
            View view = lh1.A0G;
            Context context = lh1.A0F;
            DbU.A12(context, view, 2131960992);
            03v.A0B(view, new U7D(1));
            View view2 = lh1.A00;
            if (view2 != null) {
                View requireViewById = view2.requireViewById(R.id.karaoke_sticker_preview);
                lh1.A02 = requireViewById;
                if (requireViewById != null) {
                    AnonymousClass0fU.A00(lh1.A0R, requireViewById);
                    lh1.A05 = new C61750KKp(context, lh1.A0K, lh1.A0Y, lh1);
                    View view3 = lh1.A00;
                    if (view3 != null) {
                        lh1.A0D = DbU.A0F(view3, R.id.karaoke_sticker_color_button);
                        A04(lh1);
                        ImageView imageView = lh1.A0D;
                        String str2 = "colorButton";
                        if (imageView != null) {
                            AnonymousClass3NG A0m = AnonymousClass7TE.A0m(imageView);
                            ImageView imageView2 = lh1.A0D;
                            if (imageView2 != null) {
                                View view4 = lh1.A02;
                                if (view4 != null) {
                                    A0m.A02(imageView2, view4);
                                    C61685KHt.A00(A0m, lh1, 19);
                                    View view5 = lh1.A00;
                                    if (view5 != null) {
                                        View requireViewById2 = view5.requireViewById(R.id.karaoke_sticker_emphasis_button);
                                        lh1.A01 = requireViewById2;
                                        str2 = "emphasisButton";
                                        if (requireViewById2 != null) {
                                            AnonymousClass3NG A0m2 = AnonymousClass7TE.A0m(requireViewById2);
                                            View view6 = lh1.A01;
                                            if (view6 != null) {
                                                View view7 = lh1.A02;
                                                if (view7 != null) {
                                                    A0m2.A02(view6, view7);
                                                    C61685KHt.A00(A0m2, lh1, 20);
                                                    View view8 = lh1.A00;
                                                    if (view8 != null) {
                                                        lh1.A0C = view8.requireViewById(R.id.karaoke_sticker_edit_hint);
                                                        View view9 = lh1.A00;
                                                        if (view9 != null) {
                                                            RecyclerView A0I2 = DbT.A0I(view9, R.id.karaoke_sticker_edit_word_list);
                                                            lh1.A03 = A0I2;
                                                            str = "editRecyclerView";
                                                            if (A0I2 != null) {
                                                                A0I2.setLayoutManager(lh1.A0Z);
                                                                RecyclerView recyclerView = lh1.A03;
                                                                if (recyclerView != null) {
                                                                    recyclerView.A11(lh1.A0V);
                                                                    RecyclerView recyclerView2 = lh1.A03;
                                                                    if (recyclerView2 != null) {
                                                                        AnonymousClass3AQ r2 = new AnonymousClass3AQ();
                                                                        r2.A01 = 500;
                                                                        recyclerView2.setItemAnimator(r2);
                                                                        RecyclerView recyclerView3 = lh1.A03;
                                                                        if (recyclerView3 != null) {
                                                                            recyclerView3.A0Z = false;
                                                                            AnonymousClass8Z5 r0 = lh1.A0b;
                                                                            r0.A02 = recyclerView3;
                                                                            r0.A06 = true;
                                                                            r0.A03 = true;
                                                                            return;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        0qQ.A0F(str2);
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                0qQ.A0F("stickerPreview");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C64724Lh1 lh1) {
        2Fk Ag2;
        2Fk C85;
        C66540MVu mVu = lh1.A06;
        if (!(mVu == null || (C85 = mVu.C85()) == null)) {
            Dba.A16(lh1.A0U, C85, new C66309MMs(lh1, 22), 63);
        }
        C66540MVu mVu2 = lh1.A06;
        if (mVu2 != null && (Ag2 = mVu2.Ag2()) != null) {
            Dba.A16(lh1.A0U, Ag2, new C66309MMs(lh1, 23), 63);
        }
    }

    public static final void A03(C64724Lh1 lh1) {
        if (lh1.A08 == AnonymousClass05K.A0C) {
            lh1.A0X.A02(false);
            C61750KKp kKp = lh1.A05;
            if (kKp != null) {
                kKp.A01(false);
                return;
            }
        } else {
            C61750KKp kKp2 = lh1.A05;
            if (kKp2 != null) {
                kKp2.CL9(false);
                AnonymousClass8BQ r2 = lh1.A0X;
                NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) lh1.A0K;
                r2.A00.setTranslationY(-((float) (nineSixteenLayoutConfigImpl.A04 - nineSixteenLayoutConfigImpl.A0K.getHeight())));
                r2.A03(false, true);
                return;
            }
        }
        0qQ.A0F("snapPickerController");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A04(C64724Lh1 lh1) {
        ImageView imageView = lh1.A0D;
        if (imageView == null) {
            0qQ.A0F("colorButton");
            throw AnonymousClass00P.createAndThrow();
        }
        Integer num = lh1.A08;
        Integer num2 = AnonymousClass05K.A0C;
        int i = R.drawable.instagram_text_typeface_outline_44;
        if (num == num2) {
            i = R.drawable.instagram_icons_exceptions_color_picker_filled_44;
        }
        imageView.setImageResource(i);
    }

    public static final void A05(C64724Lh1 lh1) {
        LED BJn;
        C64724Lh1 lh12 = lh1;
        C347017w8 r1 = lh12.A04;
        if (r1 != null) {
            Iterator it = r1.A06(AnonymousClass5MM.class).iterator();
            while (it.hasNext()) {
                AnonymousClass5MM r2 = (AnonymousClass5MM) it.next();
                C66540MVu mVu = lh12.A06;
                if (!(mVu == null || (BJn = mVu.BJn()) == null)) {
                    UOC A052 = r2.A05();
                    List A002 = lh12.A0M.A00(BJn.A00());
                    int i = A052.A01;
                    C16609Uy5 uy5 = A052.A02;
                    int i2 = A052.A00;
                    C306576Mr r8 = A052.A03;
                    Integer num = A052.A09;
                    String str = A052.A06;
                    boolean z = A052.A08;
                    Integer num2 = A052.A05;
                    Integer num3 = A052.A04;
                    DbY.A1S(A002, uy5);
                    0qQ.A0B(r8, 4);
                    r2.A08(new UOC(uy5, r8, num, num2, num3, str, A002, i, i2, z));
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.9cn, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r7 != r9.intValue()) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r9 != null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r11 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r2 = r1.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (X.LQE.A01(r2) == false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r5 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        r1 = (java.lang.String) X.C51968G9o.A10(r10, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r1 != null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r6 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r1.length() != 0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0064, code lost:
        r2 = r2.length();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        if (r2 >= 4) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        r2 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        r1 = X.00p.A0f("-", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0072, code lost:
        X.AnonymousClass7TG.A1Q(r5, r1);
        r0 = new java.lang.Object();
        r0.A00 = r7;
        r0.A01 = r5;
        r0.A02 = r1;
        r0.A03 = r6;
        r0.A04 = r11;
        r8.add(r0);
        r7 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        r5 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C64724Lh1 r14) {
        /*
            X.MVu r0 = r14.A06
            if (r0 == 0) goto L_0x00b0
            X.LED r4 = r0.BJn()
            if (r4 == 0) goto L_0x00b0
            X.LBz r0 = r14.A0M
            java.util.Map r10 = r4.A00()
            java.lang.Integer r9 = r4.A05
            r3 = 0
            X.0qQ.A0B(r10, r3)
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x008b
            java.util.ArrayList r8 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r13 = r0.iterator()
            r7 = 0
        L_0x0023:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0091
            java.lang.Object r1 = r13.next()
            int r12 = r7 + 1
            if (r7 >= 0) goto L_0x0039
            X.0sr.A1T()
        L_0x0034:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0039:
            X.UOk r1 = (X.C15092UOk) r1
            if (r9 == 0) goto L_0x0044
            int r0 = r9.intValue()
            r6 = 1
            if (r7 == r0) goto L_0x0048
        L_0x0044:
            r6 = 0
            r11 = 1
            if (r9 == 0) goto L_0x0049
        L_0x0048:
            r11 = r6
        L_0x0049:
            java.lang.String r2 = r1.A06
            boolean r0 = X.LQE.A01(r2)
            if (r0 == 0) goto L_0x0089
            java.lang.String r5 = ""
        L_0x0053:
            java.lang.Object r1 = X.C51968G9o.A10(r10, r7)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x005c
            r1 = r2
        L_0x005c:
            if (r6 != 0) goto L_0x0072
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0072
            int r2 = r2.length()
            java.lang.String r1 = "-"
            r0 = 4
            if (r2 >= r0) goto L_0x006e
            r2 = 4
        L_0x006e:
            java.lang.String r1 = X.00p.A0f(r1, r2)
        L_0x0072:
            X.AnonymousClass7TG.A1Q(r5, r1)
            X.9cn r0 = new X.9cn
            r0.<init>()
            r0.A00 = r7
            r0.A01 = r5
            r0.A02 = r1
            r0.A03 = r6
            r0.A04 = r11
            r8.add(r0)
            r7 = r12
            goto L_0x0023
        L_0x0089:
            r5 = r2
            goto L_0x0053
        L_0x008b:
            java.lang.String r0 = "tokens"
            X.0qQ.A0F(r0)
            goto L_0x0034
        L_0x0091:
            r4.A06 = r8
            java.lang.Integer r0 = r4.A05
            r4.A04 = r0
            X.0eM r0 = r14.A0Q
            java.lang.Object r2 = X.AnonymousClass7TE.A14(r0)
            X.2t9 r2 = (X.AnonymousClass2t9) r2
            com.instagram.common.recyclerview.ViewModelListUpdate r1 = X.DbS.A0R()
            java.util.List r0 = r4.A06
            r1.A01(r0)
            X.LhI r0 = new X.LhI
            r0.<init>(r3, r14, r4)
            r2.A06(r1, r0)
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64724Lh1.A06(X.Lh1):void");
    }

    public static final void A07(C64724Lh1 lh1, C306576Mr r2) {
        C347017w8 r1 = lh1.A04;
        if (r1 != null) {
            Iterator it = r1.A06(AnonymousClass5MM.class).iterator();
            while (it.hasNext()) {
                ((AnonymousClass5MM) it.next()).A09(r2);
            }
        }
    }

    public static final void A08(C64724Lh1 lh1, Integer num) {
        int i;
        Context context = lh1.A0F;
        int intValue = num.intValue();
        if (intValue != 0) {
            i = 2131964542;
            if (intValue != 1) {
                i = 2131964535;
            }
        } else {
            i = 2131964541;
        }
        C59689JTv.A0F(context, "handle_transcription_failure", i);
        if (lh1.A0B) {
            lh1.A0a.E3H(new Object());
        }
    }

    public static final void A09(C64724Lh1 lh1, Integer num) {
        View[] viewArr;
        lh1.A0A = num;
        int intValue = num.intValue();
        if (intValue != 0) {
            TextView textView = lh1.A0E;
            if (intValue != 1) {
                if (textView != null) {
                    View view = lh1.A02;
                    if (view != null) {
                        ImageView imageView = lh1.A0D;
                        if (imageView != null) {
                            C294975nL.A05(new View[]{textView, view, imageView}, true);
                            View view2 = lh1.A01;
                            if (view2 != null) {
                                AnonymousClass7TE.A1U(view2, true);
                                RecyclerView recyclerView = lh1.A03;
                                if (recyclerView != null) {
                                    View view3 = lh1.A0C;
                                    if (view3 != null) {
                                        viewArr = new View[]{recyclerView, view3};
                                    }
                                    0qQ.A0F("editHintView");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                0qQ.A0F("editRecyclerView");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            0qQ.A0F("emphasisButton");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("colorButton");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("stickerPreview");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("loadingView");
                throw AnonymousClass00P.createAndThrow();
            }
            if (textView != null) {
                RecyclerView recyclerView2 = lh1.A03;
                if (recyclerView2 != null) {
                    View view4 = lh1.A0C;
                    if (view4 != null) {
                        C294975nL.A05(new View[]{textView, recyclerView2, view4}, true);
                        View view5 = lh1.A02;
                        if (view5 != null) {
                            ImageView imageView2 = lh1.A0D;
                            if (imageView2 != null) {
                                C294975nL.A04((C295005nO) null, new View[]{view5, imageView2}, true);
                                View view6 = lh1.A01;
                                if (view6 != null) {
                                    C294975nL.A04((C295005nO) null, new View[]{view6}, true);
                                    C61750KKp kKp = lh1.A05;
                                    if (kKp != null) {
                                        kKp.A01(true);
                                        A04(lh1);
                                        A03(lh1);
                                        return;
                                    }
                                    0qQ.A0F("snapPickerController");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                0qQ.A0F("emphasisButton");
                                throw AnonymousClass00P.createAndThrow();
                            }
                            0qQ.A0F("colorButton");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("stickerPreview");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("editHintView");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("editRecyclerView");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("loadingView");
            throw AnonymousClass00P.createAndThrow();
        }
        TextView textView2 = lh1.A0E;
        if (textView2 != null) {
            textView2.setText(2131964544);
            View view7 = lh1.A02;
            if (view7 != null) {
                ImageView imageView3 = lh1.A0D;
                if (imageView3 != null) {
                    RecyclerView recyclerView3 = lh1.A03;
                    if (recyclerView3 != null) {
                        View view8 = lh1.A0C;
                        if (view8 != null) {
                            C294975nL.A05(new View[]{view7, imageView3, recyclerView3, view8}, true);
                            View view9 = lh1.A01;
                            if (view9 != null) {
                                AnonymousClass7TE.A1U(view9, true);
                                TextView textView3 = lh1.A0E;
                                if (textView3 != null) {
                                    viewArr = new View[]{textView3};
                                }
                            }
                            0qQ.A0F("emphasisButton");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        0qQ.A0F("editHintView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("editRecyclerView");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("colorButton");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("stickerPreview");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("loadingView");
        throw AnonymousClass00P.createAndThrow();
        C294975nL.A04((C295005nO) null, viewArr, true);
        C61750KKp kKp2 = lh1.A05;
        if (kKp2 != null) {
            kKp2.CL9(true);
            return;
        }
        0qQ.A0F("snapPickerController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A0A() {
        LED BJn;
        LED BJn2;
        C66540MVu mVu = this.A06;
        if (mVu != null) {
            mVu.reset();
        }
        this.A04 = null;
        C66540MVu mVu2 = this.A06;
        if (!(mVu2 == null || (BJn2 = mVu2.BJn()) == null)) {
            BJn2.A01 = 0;
        }
        C306576Mr r1 = C306576Mr.DISABLED;
        this.A07 = r1;
        if (!(mVu2 == null || (BJn = mVu2.BJn()) == null)) {
            0qQ.A0B(r1, 0);
            BJn.A03 = r1;
        }
        this.A09 = AnonymousClass05K.A00;
    }

    public final void A0B(int i, boolean z) {
        C66540MVu mVu;
        LED BJn;
        C347017w8 r1 = this.A04;
        if (r1 != null) {
            Iterator it = r1.A06(AnonymousClass5MM.class).iterator();
            while (it.hasNext()) {
                AnonymousClass5MM r12 = (AnonymousClass5MM) it.next();
                if (!(!z || (mVu = this.A06) == null || (BJn = mVu.BJn()) == null)) {
                    BJn.A00 = i;
                }
                r12.A07(i);
            }
        }
    }

    public final /* bridge */ /* synthetic */ boolean A76(Object obj, Object obj2) {
        if (this.A0A != AnonymousClass05K.A0C || this.A04 == null) {
            return true;
        }
        C66540MVu mVu = this.A06;
        if (mVu != null) {
            LED BJn = mVu.BJn();
            if (BJn == null || BJn.A05 == null) {
                LED BJn2 = mVu.BJn();
                if (BJn2 != null) {
                    BJn2.A05 = null;
                }
            } else {
                A00(this);
                return false;
            }
        }
        A05(this);
        C66540MVu mVu2 = this.A06;
        if (mVu2 != null) {
            mVu2.AIS(this.A0F);
        }
        A09(this, AnonymousClass05K.A01);
        return false;
    }

    public final void DCS(Object obj) {
        Integer num;
        String str;
        int i;
        if (this.A00 == null) {
            A01(this);
        }
        View view = this.A0H;
        View view2 = this.A00;
        if (view2 == null) {
            str = "captionEditor";
        } else {
            C294975nL.A04((C295005nO) null, new View[]{view, view2, this.A0G}, true);
            AnonymousClass8Z5 r1 = this.A0b;
            r1.A07.A9Y(r1);
            AnonymousClass0eM r12 = this.A0P;
            if (r12.CVQ()) {
                KG4 kg4 = (KG4) r12.getValue();
                kg4.A03.A9Y(kg4.A02);
            }
            int intValue = this.A09.intValue();
            if (intValue == 2 || intValue == 0 || intValue == 3) {
                C66540MVu mVu = this.A06;
                if (mVu != null) {
                    LED BJn = mVu.BJn();
                    if (BJn == null) {
                        A09(this, AnonymousClass05K.A00);
                        mVu.AUS(this.A0F);
                        num = AnonymousClass05K.A01;
                    } else if (BJn.A07.isEmpty()) {
                        A08(this, AnonymousClass05K.A01);
                    } else {
                        C63914LBz lBz = this.A0M;
                        lBz.A00 = BJn.A07;
                        A06(this);
                        C61750KKp kKp = this.A05;
                        str = "snapPickerController";
                        if (kKp != null) {
                            boolean isEmpty = kKp.A00.A02.isEmpty();
                            C61750KKp kKp2 = this.A05;
                            if (isEmpty) {
                                if (kKp2 != null) {
                                    C16609Uy5[] values = C16609Uy5.values();
                                    ArrayList A1C = AnonymousClass7TE.A1C();
                                    for (C16609Uy5 uy5 : values) {
                                        if (182.A06(0Tu.A05, this.A0I, 36323715243650478L) || uy5 != C16609Uy5.KARAOKE) {
                                            A1C.add(uy5);
                                        }
                                    }
                                    ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                                    Iterator it = A1C.iterator();
                                    while (it.hasNext()) {
                                        A0r.add(new C64541Ldi((C16609Uy5) it.next()));
                                    }
                                    int i2 = BJn.A02;
                                    kKp2.A01.A05(A0r);
                                    0nA.A0t(kKp2.A01.A0P, new MB5((Object) kKp2, i2, 0));
                                }
                            } else if (kKp2 != null) {
                                int i3 = BJn.A02;
                                if (i3 >= 0) {
                                    C387599mT r13 = kKp2.A01;
                                    if (i3 < Collections.unmodifiableList(r13.A02).size() && i3 != r13.A00) {
                                        kKp2.A01.A08(i3);
                                    }
                                }
                            }
                            A09(this, AnonymousClass05K.A01);
                            Context context = this.A0F;
                            UserSession userSession = this.A0I;
                            List A002 = lBz.A00(BJn.A00());
                            C66540MVu mVu2 = this.A06;
                            if (mVu2 != null) {
                                i = mVu2.C8i(context);
                            } else {
                                i = 0;
                            }
                            C347017w8 A003 = C18192Vn6.A00(context, userSession, A002, i, this.A0N.A1X(), 182.A06(0Tu.A05, userSession, 36323715243650478L));
                            this.A04 = A003;
                            A003.A0B(BJn.A02);
                            A0B(BJn.A00, false);
                            A07(this, BJn.A03);
                            View view3 = this.A02;
                            if (view3 == null) {
                                str = "stickerPreview";
                            } else {
                                view3.setBackground(new C380079Wn(A003));
                                C66540MVu mVu3 = this.A06;
                                if (mVu3 != null) {
                                    mVu3.FHa(context);
                                }
                            }
                        }
                    }
                } else {
                    num = AnonymousClass05K.A0N;
                }
                this.A09 = num;
                this.A0B = true;
                C354538Mk r14 = this.A0W;
                C317876nz r0 = C317876nz.A1e;
                r14.DnE("captions_sticker_id");
                return;
            }
            num = AnonymousClass05K.A0C;
            this.A09 = num;
            this.A0B = true;
            C354538Mk r142 = this.A0W;
            C317876nz r02 = C317876nz.A1e;
            r142.DnE("captions_sticker_id");
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DDW() {
        Object obj;
        2Fk C85;
        String str;
        AnonymousClass8Z5 r1 = this.A0b;
        r1.A07.EEH(r1);
        AnonymousClass0eM r12 = this.A0P;
        if (r12.CVQ()) {
            KG4 kg4 = (KG4) r12.getValue();
            kg4.A03.EEH(kg4.A02);
        }
        View view = this.A0H;
        View view2 = this.A00;
        if (view2 == null) {
            str = "captionEditor";
        } else {
            View view3 = this.A0G;
            View view4 = this.A02;
            if (view4 == null) {
                str = "stickerPreview";
            } else {
                ImageView imageView = this.A0D;
                if (imageView == null) {
                    str = "colorButton";
                } else {
                    C294975nL.A05(new View[]{view, view2, view3, view4, imageView}, true);
                    View view5 = this.A01;
                    if (view5 == null) {
                        str = "emphasisButton";
                    } else {
                        AnonymousClass7TE.A1U(view5, true);
                        C61750KKp kKp = this.A05;
                        if (kKp == null) {
                            str = "snapPickerController";
                        } else {
                            kKp.CL9(true);
                            this.A0X.A02(true);
                            C347017w8 r0 = this.A04;
                            if (r0 != null) {
                                UOC A002 = C63153KsM.A00(r0);
                                if (A002 != null) {
                                    C66540MVu mVu = this.A06;
                                    if (mVu == null || (C85 = mVu.C85()) == null) {
                                        obj = null;
                                    } else {
                                        obj = C85.A02();
                                    }
                                    if (!182.A06(0Tu.A06, this.A0I, 36323715243388330L) || !(obj instanceof C61758KKx)) {
                                        this.A0N.Dn8(A002, (String) null);
                                    } else {
                                        this.A0N.Dn8(A002, (String) null);
                                    }
                                } else {
                                    throw AnonymousClass7TE.A0y();
                                }
                            } else {
                                this.A0N.Dn7();
                            }
                            this.A0B = false;
                            C354538Mk r13 = this.A0W;
                            C317876nz r02 = C317876nz.A1e;
                            r13.Dn9("captions_sticker_id");
                            UserSession userSession = this.A0I;
                            1Av A003 = 1Au.A00(userSession);
                            0Tu r14 = 0Tu.A05;
                            if (JTQ.A1Q(r14, userSession)) {
                                FragmentActivity fragmentActivity = this.A0T;
                                LIK.A01(fragmentActivity, userSession, 27p.A01(userSession), A003, JTQ.A1R(r14, userSession));
                                LIK.A00(fragmentActivity, userSession, 27p.A01(userSession), A003);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        LED BJn;
        if (this.A0A != AnonymousClass05K.A0C || this.A04 == null) {
            return false;
        }
        C66540MVu mVu = this.A06;
        if (!(mVu == null || (BJn = mVu.BJn()) == null)) {
            BJn.A05 = null;
        }
        A05(this);
        C66540MVu mVu2 = this.A06;
        if (mVu2 != null) {
            mVu2.AIS(this.A0F);
        }
        A09(this, AnonymousClass05K.A01);
        return true;
    }
}
