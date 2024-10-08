package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.Adapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;
import java.util.ArrayList;
import java.util.List;

public final class WDA implements SeekBar.OnSeekBarChangeListener, View.OnFocusChangeListener, B21, AnonymousClass8Z3, B20 {
    public int A00;
    public int A01;
    public C17575VaT A02;
    public final Context A03;
    public final View A04;
    public final ViewStub A05;
    public final UserSession A06;
    public final ReboundViewPager A07;
    public final TargetViewSizeProvider A08;
    public final AnonymousClass87F A09;
    public final U1U A0A;
    public final C16304UsX A0B = new C16304UsX();
    public final CirclePageIndicator A0C;
    public final ArrayList A0D;
    public final C354538Mk A0E;
    public final AnonymousClass8MF A0F;

    private void A00() {
        C17575VaT vaT = this.A02;
        if (vaT != null) {
            C315596kB.A08(new View[]{this.A04, vaT.A01, this.A07, this.A0C, vaT.A04}, false);
            C17575VaT vaT2 = this.A02;
            vaT2.getClass();
            vaT2.A03.clearFocus();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.WDA r6, int r7) {
        /*
            r6.A00 = r7
            X.VaT r0 = r6.A02
            r0.getClass()
            android.view.View r0 = r0.A00
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x0016
            int r0 = r6.A00
            r1.setColor(r0)
        L_0x0016:
            X.VaT r0 = r6.A02
            r0.getClass()
            android.widget.EditText r2 = r0.A03
            int r1 = r6.A00
            r3 = -1
            if (r1 == r3) goto L_0x00d8
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = X.0nH.A08(r1, r0)
        L_0x0028:
            r2.setTextColor(r0)
            int r5 = r6.A00
            java.util.ArrayList r1 = r6.A0D
            r4 = 0
            java.lang.Object r0 = r1.get(r4)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r2 = 1
            if (r5 == r0) goto L_0x00a1
            java.lang.Object r0 = r1.get(r2)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r5 == r0) goto L_0x00a1
            int r1 = X.0nH.A05(r5)
            X.VaT r0 = r6.A02
            r0.getClass()
            android.widget.SeekBar r0 = r0.A05
            android.graphics.drawable.Drawable r0 = r0.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            if (r0 == 0) goto L_0x005f
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r4)
            r0.setTint(r1)
        L_0x005f:
            X.VaT r0 = r6.A02
            r0.getClass()
            android.widget.EditText r0 = r0.A03
            int r0 = r0.getCurrentTextColor()
            r1 = -1
            if (r0 == r3) goto L_0x00c1
            X.VaT r0 = r6.A02
            r0.getClass()
            android.widget.SeekBar r0 = r0.A05
            android.graphics.drawable.Drawable r0 = r0.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            if (r0 == 0) goto L_0x0084
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r2)
            r0 = 0
            r1.setTintList(r0)
        L_0x0084:
            X.VaT r0 = r6.A02
            r0.getClass()
            android.widget.EditText r2 = r0.A03
            int r0 = r6.A00
            if (r0 == r3) goto L_0x0097
            int r0 = X.0nH.A05(r0)
        L_0x0093:
            r2.setHintTextColor(r0)
            return
        L_0x0097:
            android.content.Context r1 = r6.A03
            r0 = 2131100049(0x7f060191, float:1.7812468E38)
            int r0 = r1.getColor(r0)
            goto L_0x0093
        L_0x00a1:
            X.VaT r0 = r6.A02
            r0.getClass()
            android.widget.SeekBar r0 = r0.A05
            android.graphics.drawable.Drawable r0 = r0.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            if (r0 == 0) goto L_0x00b8
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r4)
            r0 = 0
            r1.setTintList(r0)
        L_0x00b8:
            android.content.Context r1 = r6.A03
            r0 = 2130970194(0x7f040652, float:1.7549091E38)
            int r1 = X.AnonymousClass7TF.A03(r1, r0)
        L_0x00c1:
            X.VaT r0 = r6.A02
            r0.getClass()
            android.widget.SeekBar r0 = r0.A05
            android.graphics.drawable.Drawable r0 = r0.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            if (r0 == 0) goto L_0x0084
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r2)
            r0.setTint(r1)
            goto L_0x0084
        L_0x00d8:
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WDA.A01(X.WDA, int):void");
    }

    public static void A02(WDA wda, String str) {
        C17575VaT vaT = wda.A02;
        vaT.getClass();
        SeekBar seekBar = vaT.A05;
        Context context = wda.A03;
        int width = ((NineSixteenLayoutConfigImpl) wda.A08).A0K.getWidth();
        AnonymousClass7TG.A1N(context, str);
        int A022 = AnonymousClass7TF.A02(context, R.dimen.slider_sticker_slider_handle_size);
        C306386Ly r1 = new C306386Ly(context, width);
        r1.A0M(str);
        r1.A0A((float) A022);
        seekBar.setThumb(r1);
        wda.A0A.A04 = str;
    }

    private void A03(C19472WaK waK) {
        int A0C2;
        C17575VaT vaT = this.A02;
        vaT.getClass();
        EditText editText = vaT.A03;
        if (waK == null) {
            this.A01 = 0;
            editText.setText("");
            A02(this, "😍");
            A0C2 = AnonymousClass7TE.A0M(this.A0D.get(0));
        } else {
            this.A01 = this.A0D.indexOf(Integer.valueOf(0nH.A0C(waK.A00.A05, 0)));
            editText.setText(waK.A02());
            JTR.A1F(editText);
            String str = waK.A00.A06;
            if (str == null) {
                str = "😍";
            }
            A02(this, str);
            A0C2 = 0nH.A0C(waK.A00.A05, 0);
        }
        A01(this, A0C2);
    }

    public final View Azx() {
        C17575VaT vaT = this.A02;
        if (vaT != null) {
            return vaT.A00;
        }
        return null;
    }

    public final Class Bza() {
        return C16145UpW.class;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.9jo, java.util.concurrent.Callable] */
    /* JADX WARNING: type inference failed for: r0v19, types: [X.Usa, java.lang.Object] */
    public final void DCS(Object obj) {
        if (this.A02 == null) {
            C17575VaT vaT = new C17575VaT(this.A05);
            this.A02 = vaT;
            View view = vaT.A00;
            this.A09.A03(view);
            0nA.A0t(view, new C385959jo(this, 3));
            C17575VaT vaT2 = this.A02;
            vaT2.getClass();
            EditText editText = vaT2.A03;
            editText.setOnFocusChangeListener(this);
            ABM.A01(editText);
            editText.setLetterSpacing(-0.03f);
            C16304UsX usX = this.A0B;
            C16302UsV usV = new C16302UsV(editText, 3);
            List list = usX.A00;
            list.add(usV);
            list.add(new C389999qZ(editText));
            Integer num = AnonymousClass05K.A00;
            ? obj2 = new Object();
            obj2.A00 = editText;
            obj2.A01 = num;
            list.add(obj2);
            C17575VaT vaT3 = this.A02;
            vaT3.getClass();
            vaT3.A05.setOnSeekBarChangeListener(this);
            A02(this, "😍");
            C17575VaT vaT4 = this.A02;
            vaT4.getClass();
            vaT4.A02.setBackground(this.A0A);
            ReboundViewPager reboundViewPager = this.A07;
            reboundViewPager.setAdapter((Adapter) new AnonymousClass9Xx(this.A03, this.A06, this.A08, this));
            CirclePageIndicator circlePageIndicator = this.A0C;
            circlePageIndicator.A01(0, 5);
            reboundViewPager.A0P(circlePageIndicator);
            C17575VaT vaT5 = this.A02;
            vaT5.getClass();
            ImageView imageView = vaT5.A04;
            AnonymousClass3NG A0W = C13989Tnp.A0W(imageView);
            C17575VaT vaT6 = this.A02;
            vaT6.getClass();
            A0W.A02(imageView, vaT6.A00);
            C15848UjY.A00(A0W, this, 21);
        }
        View view2 = this.A04;
        C17575VaT vaT7 = this.A02;
        vaT7.getClass();
        View view3 = vaT7.A01;
        ReboundViewPager reboundViewPager2 = this.A07;
        CirclePageIndicator circlePageIndicator2 = this.A0C;
        C17575VaT vaT8 = this.A02;
        vaT8.getClass();
        C315596kB.A09(new View[]{view2, view3, reboundViewPager2, circlePageIndicator2, vaT8.A04}, false);
        AnonymousClass87F r1 = this.A09;
        r1.A02(r1.A01);
        C17575VaT vaT9 = this.A02;
        vaT9.getClass();
        vaT9.A05.setProgress(10);
        A03(((AnonymousClass8TB) obj).A00);
        C17575VaT vaT10 = this.A02;
        vaT10.getClass();
        vaT10.A03.addTextChangedListener(this.A0B);
        this.A0E.DnE("slider_sticker_bundle_id");
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.WaK, X.50v, java.lang.Object] */
    public final void DDW() {
        String str;
        AnonymousClass8MF r3 = this.A0F;
        C17575VaT vaT = this.A02;
        vaT.getClass();
        C306386Ly r2 = (C306386Ly) vaT.A05.getThumb();
        C17575VaT vaT2 = this.A02;
        vaT2.getClass();
        EditText editText = vaT2.A03;
        if (r2 != null) {
            str = r2.A0F.toString();
        } else {
            str = "😍";
        }
        BHJ bhj = new BHJ((Boolean) null, (Boolean) null, (Float) null, (Float) null, (Integer) null, 0nH.A0F(this.A00), str, AnonymousClass7TF.A0f(editText).trim(), (String) null, 0nH.A0F(editText.getCurrentTextColor()));
        ? obj = new Object();
        obj.A00 = bhj;
        r3.Dn8(obj, (String) null);
        C17575VaT vaT3 = this.A02;
        vaT3.getClass();
        vaT3.A03.removeTextChangedListener(this.A0B);
        A03((C19472WaK) null);
        A00();
        this.A0E.Dn9("slider_sticker_bundle_id");
    }

    public final void DMp() {
        C17575VaT vaT = this.A02;
        vaT.getClass();
        vaT.A03.clearFocus();
        this.A0F.DMp();
    }

    public final void DzC(int i, int i2) {
        float f = (float) ((-this.A09.A03.A01) + AnonymousClass81Y.A00);
        this.A07.setTranslationY(f);
        this.A0C.setTranslationY(f);
    }

    public final void onFocusChange(View view, boolean z) {
        AnonymousClass87F r0 = this.A09;
        if (z) {
            r0.A00();
            C63183Ksq.A00(view);
            return;
        }
        r0.A01();
        0qQ.A0B(view, 0);
        0nA.A0N(view);
        A00();
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            C17575VaT vaT = this.A02;
            vaT.getClass();
            SeekBar seekBar2 = vaT.A05;
            C17575VaT vaT2 = this.A02;
            vaT2.getClass();
            View view = vaT2.A00;
            Drawable thumb = seekBar2.getThumb();
            if (thumb != null) {
                float x = view.getX() + ((float) view.getPaddingLeft()) + ((float) seekBar2.getPaddingLeft()) + ((float) thumb.getBounds().left);
                float y = view.getY() + ((float) view.getPaddingTop()) + ((float) seekBar2.getTop()) + ((float) thumb.getBounds().top);
                U1U u1u = this.A0A;
                u1u.A01 = x;
                u1u.A02 = y;
                C17592Vak vak = u1u.A03;
                if (vak != null) {
                    vak.A03 = x;
                    vak.A04 = y;
                }
                u1u.invalidateSelf();
                int i2 = u1u.A08;
                float f = ((float) i2) + ((((float) i) / 100.0f) * ((float) (u1u.A07 - i2)));
                u1u.A00 = f;
                C17592Vak vak2 = u1u.A03;
                if (vak2 != null) {
                    vak2.A01 = f;
                }
                u1u.invalidateSelf();
            }
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        this.A0A.A01();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        U1U u1u = this.A0A;
        u1u.A09.add(0, u1u.A03);
        u1u.A03 = null;
    }

    public WDA(View view, UserSession userSession, AnonymousClass3E6 r5, C354538Mk r6, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8MF r8) {
        this.A06 = userSession;
        Context context = view.getContext();
        this.A03 = context;
        this.A0E = r6;
        this.A08 = targetViewSizeProvider;
        this.A09 = new AnonymousClass87F(context, r5, this);
        this.A0F = r8;
        this.A04 = view.requireViewById(R.id.text_overlay_edit_text_container);
        this.A05 = DbU.A0D(view, R.id.slider_sticker_editor_stub);
        this.A07 = (ReboundViewPager) view.requireViewById(R.id.emoji_palette_pager);
        this.A0C = (CirclePageIndicator) view.requireViewById(R.id.emoji_palette_pager_indicator);
        this.A0A = new U1U(context);
        C20572Wup wup = new C20572Wup(this);
        this.A0D = wup;
        this.A00 = AnonymousClass7TE.A0M(wup.get(0));
    }
}
