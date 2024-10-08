package X;

import android.content.Context;
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

/* renamed from: X.7zP  reason: invalid class name and case insensitive filesystem */
public final class C348987zP implements C252213ok {
    public long A00;
    public C306386Ly A01;
    public int A02;
    public int A03;
    public int A04;
    public C349017zS A05;
    public final Handler A06;
    public final C252063oV A07;
    public final C358368an A08;
    public final Runnable A09 = new C349007zR(this);
    public final Runnable A0A = new C348997zQ(this);
    public final EditText A0B;

    public C348987zP(Context context, Handler handler, EditText editText, UserSession userSession, C252063oV r8, C358368an r9) {
        0qQ.A0B(context, 1);
        0qQ.A0B(editText, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(handler, 5);
        this.A0B = editText;
        this.A07 = r8;
        this.A06 = handler;
        this.A08 = r9;
        if (!r8.CVM()) {
            r8.getView();
        }
        0Tu r2 = 0Tu.A06;
        if (182.A06(r2, userSession, 36323139717901188L) || 182.A06(r2, userSession, 36323139718294410L)) {
            View findViewById = r8.getView().findViewById(R.id.text_animation_preview_view);
            0qQ.A07(findViewById);
            ((ViewGroup) r8.getView()).removeView(findViewById);
            C349017zS r1 = new C349017zS(userSession, context);
            this.A05 = r1;
            r1.setId(R.id.text_animation_preview_view);
            ((ViewGroup) r8.getView()).addView(r1);
        }
    }

    public static final void A00(C348987zP r9) {
        AnonymousClass91c r1;
        C349017zS r0 = r9.A05;
        if (r0 != null) {
            r0.A00();
        }
        EditText editText = r9.A0B;
        editText.setAlpha(1.0f);
        editText.setCursorVisible(true);
        Editable text = editText.getText();
        0qQ.A07(text);
        for (AnonymousClass91R r02 : (AnonymousClass91R[]) C263324Kh.A06(text, AnonymousClass91R.class)) {
            r02.A04 = true;
        }
        Editable text2 = editText.getText();
        0qQ.A07(text2);
        C306576Mr A002 = C358948bj.A00(text2, 0, text2.length());
        Editable text3 = editText.getText();
        0qQ.A07(text3);
        C358848bZ[] r4 = (C358848bZ[]) C263324Kh.A06(text3, C358848bZ.class);
        for (C358848bZ r12 : r4) {
            r12.A03 = 255;
        }
        if (A002 == C306576Mr.OUTLINED || A002 == C306576Mr.INVERTED_OUTLINED) {
            for (C358848bZ r03 : r4) {
                r03.A04 = true;
            }
        }
        C252063oV r2 = r9.A07;
        r2.setVisibility(8);
        C306386Ly r13 = r9.A01;
        if ((r13 instanceof AnonymousClass91c) && (r1 = (AnonymousClass91c) r13) != null) {
            r1.A0Y();
        }
        r9.A01 = null;
        if (r2.CVM()) {
            r2.getView().removeCallbacks(r9.A0A);
        }
    }

    public static final void A01(C348987zP r8) {
        float f;
        AnonymousClass91c r1;
        C349017zS r0 = r8.A05;
        if (r0 != null) {
            r0.A00();
        }
        C358368an r6 = r8.A08;
        if (r6.A0i()) {
            EditText editText = r8.A0B;
            editText.setAlpha(0.0f);
            editText.setCursorVisible(false);
            editText.setSelection(editText.length());
            Editable text = editText.getText();
            0qQ.A07(text);
            for (AnonymousClass91R r02 : (AnonymousClass91R[]) C263324Kh.A06(text, AnonymousClass91R.class)) {
                r02.A04 = false;
            }
            C306386Ly r12 = r8.A01;
            if ((r12 instanceof AnonymousClass91c) && (r1 = (AnonymousClass91c) r12) != null) {
                r1.A0Y();
            }
            C306386Ly A032 = C358368an.A03(r6, ((C360778f8) r6.A1g.get()).A07());
            r6.A0e(A032);
            AnonymousClass9UR.A0B(A032, ((AnonymousClass91a) r6.A1Z.get()).A00);
            StaticLayout staticLayout = A032.A0G;
            if (staticLayout != null) {
                AnonymousClass9UR.A03(staticLayout, A032.A0F, AnonymousClass9UV.A00.A00(A032.A0E), A032.A0b.getTextSize());
            }
            if (A032 instanceof C15927Ukr) {
                f = ((AnonymousClass91c) A032).A0V() + 0.0f;
            } else {
                f = 0.0f;
            }
            C306396Lz r13 = A032.A0I;
            if (r13 != null) {
                f += C39814AAl.A01(r13, A032.A0b.getTextSize());
            }
            A032.A0C(0.0f, f);
            r8.A01 = A032;
            C252063oV r4 = r8.A07;
            r4.setVisibility(0);
            C306386Ly r2 = r8.A01;
            if (r2 != null) {
                r8.A02 = r2.A06;
                r8.A03 = AnonymousClass1GB.A01(r2.A00);
                r8.A04 = AnonymousClass1GB.A01(r2.A01);
                ImageView imageView = (ImageView) r4.getView().findViewById(R.id.text_animation_preview_view);
                imageView.setImageDrawable(r2);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                Layout.Alignment alignment = r2.A0E;
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
                0nA.A0p(r4.getView(), new C40854AkO(r8));
            }
            r4.getView().requestLayout();
            if (r4.CVM()) {
                r4.getView().postOnAnimation(r8.A0A);
            }
            r8.A00 = System.currentTimeMillis();
        }
    }

    public static final void A02(C348987zP r7) {
        C252063oV r4 = r7.A07;
        if (r4.CFV() == 0) {
            int i = r7.A02;
            EditText editText = r7.A0B;
            r4.getView().setY(editText.getY() - ((float) ((i - editText.getHeight()) / 2)));
            r4.getView().setScaleX(editText.getScaleX());
            r4.getView().setScaleY(editText.getScaleY());
            r4.getView().setPadding(editText.getPaddingLeft() - r7.A03, editText.getPaddingTop() - r7.A04, editText.getPaddingRight() - r7.A03, editText.getPaddingBottom() - r7.A04);
        }
    }

    public final void A03() {
        Handler handler = this.A06;
        Runnable runnable = this.A09;
        handler.removeCallbacks(runnable);
        if (this.A08.A0i()) {
            handler.postDelayed(runnable, 1000);
            A00(this);
        }
    }

    public final void DMr(int i, boolean z) {
        A02(this);
    }
}
