package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7iL  reason: invalid class name and case insensitive filesystem */
public final class C338677iL extends AnonymousClass3NK implements C252213ok {
    public long A00;
    public AnonymousClass3NM A01;
    public AnonymousClass91c A02;
    public boolean A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final Handler A07;
    public final UserSession A08;
    public final C252063oV A09;
    public final C252063oV A0A;
    public final Runnable A0B = new C338697iN(this);
    public final Context A0C;
    public final EditText A0D;
    public final C358368an A0E;
    public final Runnable A0F = new C338687iM(this);

    public C338677iL(Context context, Handler handler, EditText editText, UserSession userSession, C252063oV r6, C252063oV r7, C358368an r8) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r7, 3);
        0qQ.A0B(handler, 5);
        0qQ.A0B(editText, 6);
        this.A0C = context;
        this.A09 = r6;
        this.A0A = r7;
        this.A08 = userSession;
        this.A07 = handler;
        this.A0D = editText;
        this.A0E = r8;
        if (!r7.CVM()) {
            r7.getView();
        }
    }

    public final void A06(View view, boolean z, boolean z2) {
        0qQ.A0B(view, 0);
        C252063oV r5 = this.A09;
        AnonymousClass3NG r1 = new AnonymousClass3NG(r5.getView());
        r1.A04 = this;
        r1.A07 = true;
        r1.A0C = true;
        this.A01 = r1.A00();
        r5.getView().setActivated(z);
        this.A06 = z;
        A03(z);
        if (r5.CVM()) {
            this.A07.postDelayed(new C41158ApI(view, this, z2), 2000);
        }
        C294975nL.A04((C295005nO) null, new View[]{r5.getView()}, false);
    }

    private final void A00() {
        EditText editText = this.A0D;
        editText.setAlpha(1.0f);
        editText.setCursorVisible(true);
        Editable text = editText.getText();
        0qQ.A07(text);
        for (AnonymousClass91R r0 : (AnonymousClass91R[]) C263324Kh.A06(text, AnonymousClass91R.class)) {
            r0.A04 = true;
        }
        Editable text2 = editText.getText();
        0qQ.A07(text2);
        C306576Mr A002 = C358948bj.A00(text2, 0, text2.length());
        Editable text3 = editText.getText();
        0qQ.A07(text3);
        C358848bZ[] r4 = (C358848bZ[]) C263324Kh.A06(text3, C358848bZ.class);
        for (C358848bZ r1 : r4) {
            r1.A03 = 255;
        }
        if (!this.A06 && (A002 == C306576Mr.OUTLINED || A002 == C306576Mr.INVERTED_OUTLINED)) {
            for (C358848bZ r02 : r4) {
                r02.A04 = true;
            }
        }
        C252063oV r12 = this.A0A;
        r12.setVisibility(8);
        AnonymousClass91c r03 = this.A02;
        if (r03 != null) {
            r03.A0Y();
        }
        this.A02 = null;
        if (r12.CVM()) {
            r12.getView().removeCallbacks(this.A0B);
        }
    }

    public static final void A01(C338677iL r8) {
        EditText editText = r8.A0D;
        editText.setAlpha(0.0f);
        editText.setCursorVisible(false);
        editText.setSelection(editText.length());
        Editable text = editText.getText();
        0qQ.A07(text);
        for (AnonymousClass91R r0 : (AnonymousClass91R[]) C263324Kh.A06(text, AnonymousClass91R.class)) {
            r0.A04 = false;
        }
        AnonymousClass91c r02 = r8.A02;
        if (r02 != null) {
            r02.A0Y();
        }
        C358368an r2 = r8.A0E;
        AnonymousClass91c A022 = C358368an.A02(r2, (C360728f3) null, ((C360778f8) r2.A1g.get()).A07());
        r2.A0e(A022);
        AnonymousClass9UR.A0B(A022, ((AnonymousClass91a) r2.A1Z.get()).A00);
        StaticLayout staticLayout = A022.A0G;
        if (staticLayout != null) {
            AnonymousClass9UR.A03(staticLayout, A022.A0F, AnonymousClass9UV.A00.A00(A022.A0E), A022.A0b.getTextSize());
        }
        if (A022 instanceof C15922Ukm) {
            A022.A0C(0.0f, A022.A0V());
        }
        r8.A02 = A022;
        C252063oV r3 = r8.A0A;
        r3.setVisibility(0);
        AnonymousClass91c r22 = r8.A02;
        if (r22 != null) {
            r8.A04 = AnonymousClass1GB.A01(r22.A00);
            r8.A05 = AnonymousClass1GB.A01(r22.A01);
            ImageView imageView = (ImageView) r3.getView().findViewById(R.id.text_animation_preview_view);
            imageView.setImageDrawable(r22);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            Layout.Alignment alignment = r22.A0E;
            0qQ.A07(alignment);
            int i = A2O.A00[alignment.ordinal()];
            int i2 = 3;
            if (i == 1) {
                i2 = 1;
            } else if (i != 2) {
                if (i == 3) {
                    i2 = 5;
                } else {
                    throw new RuntimeException();
                }
            }
            layoutParams2.gravity = i2;
            0nA.A0p(r3.getView(), new C40852AkM(r8));
            r3.getView().requestLayout();
        }
        r3.getView().requestLayout();
        if (r3.CVM()) {
            r3.getView().postOnAnimation(r8.A0B);
        }
        r8.A00 = System.currentTimeMillis();
    }

    public static final void A02(C338677iL r7) {
        C252063oV r4 = r7.A0A;
        if (r4.CFV() == 0) {
            int height = r4.getView().getHeight();
            EditText editText = r7.A0D;
            r4.getView().setY(editText.getY() - ((float) ((height - editText.getHeight()) / 2)));
            r4.getView().setScaleX(editText.getScaleX());
            r4.getView().setScaleY(editText.getScaleY());
            r4.getView().setPadding(editText.getPaddingLeft() - r7.A04, editText.getPaddingTop() - r7.A05, editText.getPaddingRight() - r7.A04, editText.getPaddingBottom() - r7.A05);
        }
    }

    private final void A03(boolean z) {
        if (z) {
            A01(this);
        } else {
            A00();
            this.A07.removeCallbacks(this.A0F);
        }
        C358368an r2 = this.A0E;
        C314676if r0 = r2.A1a;
        if (r0 != null && ((C338677iL) r0.get()).A07()) {
            27p.A01(r2.A1J).A1t(((C360778f8) r2.A1g.get()).A07().A09);
        }
    }

    public final void A04() {
        C252063oV r4 = this.A09;
        if (r4.CVM()) {
            C294975nL.A05(new View[]{r4.getView()}, false);
            AnonymousClass3NM r0 = this.A01;
            if (r0 != null) {
                r0.A03();
            }
        }
        this.A07.removeCallbacksAndMessages((Object) null);
        if (r4.CVM()) {
            r4.getView().setActivated(false);
        }
        C252063oV r1 = this.A0A;
        if (r1.CVM()) {
            A03(false);
            r1.getView().setBackground((Drawable) null);
        }
    }

    public final void A05() {
        Handler handler = this.A07;
        Runnable runnable = this.A0F;
        handler.removeCallbacks(runnable);
        if (A07()) {
            handler.postDelayed(runnable, 1000);
            A00();
        }
    }

    public final boolean A07() {
        C252063oV r1 = this.A09;
        if (!r1.CVM() || !r1.getView().isActivated()) {
            return false;
        }
        return true;
    }

    public final boolean Dqe(View view) {
        0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
        AR4.E5T("has_used_text_animation_button", true);
        AR4.apply();
        C252063oV r5 = this.A09;
        r5.getView().setActivated(!r5.getView().isActivated());
        boolean isActivated = r5.getView().isActivated();
        View view2 = r5.getView();
        Resources resources = r5.getView().getResources();
        int i = 2131975093;
        if (isActivated) {
            i = 2131975094;
        }
        view2.announceForAccessibility(resources.getString(i));
        this.A06 = r5.getView().isActivated();
        A03(r5.getView().isActivated());
        return true;
    }

    public final void DMr(int i, boolean z) {
        A02(this);
    }
}
