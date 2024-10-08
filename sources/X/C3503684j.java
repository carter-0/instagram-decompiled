package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.84j  reason: invalid class name and case insensitive filesystem */
public final class C3503684j implements C3493580b {
    public float A00 = 1.0f;
    public int A01;
    public int A02 = 0;
    public ImageView A03;
    public ImageView A04;
    public TextView A05;
    public IgFrameLayout A06;
    public boolean A07 = false;
    public UserSession A08;
    public final int A09;
    public final View A0A;
    public final ViewStub A0B;
    public final ViewStub A0C;
    public final AnonymousClass82E A0D = new C3504084n(this);
    public final AnonymousClass82X A0E;
    public final 1Ng A0F;
    public final 1wn A0G = new C3503984m(this);
    public final Runnable A0H = new C3503884l(this);
    public final Runnable A0I = new C3503784k(this);
    public final List A0J = new ArrayList();
    public final Set A0K = new HashSet();
    public final ViewStub A0L;

    public final void A04(String str, long j) {
        A02(this, str, true);
        if (j > 0) {
            View view = this.A0A;
            Runnable runnable = this.A0I;
            view.removeCallbacks(runnable);
            view.postDelayed(runnable, j);
        }
    }

    public final void A06(boolean z) {
        this.A07 = true;
        this.A0A.removeCallbacks(this.A0H);
        ImageView imageView = this.A03;
        if (imageView == null) {
            return;
        }
        if (z) {
            C294975nL A002 = C294975nL.A00(imageView);
            A002.A0I(0.0f);
            A002.A05 = new C40630Afs(this);
            A002.A0H();
            return;
        }
        imageView.setVisibility(4);
    }

    public static void A00(C3503684j r4) {
        List list = r4.A0J;
        synchronized (list) {
            ImageView imageView = r4.A03;
            if (imageView == null || r4.A07) {
                r4.A02 = 0;
                return;
            }
            imageView.setImageBitmap((Bitmap) list.get(r4.A02));
            C294975nL.A01(r4.A03, 0).A0G();
            r4.A0B.setVisibility(0);
            r4.A03.setVisibility(0);
            r4.A03.setBackgroundColor(0);
            r4.A03.getClass();
            C294975nL A012 = C294975nL.A01(r4.A03, 0);
            A012.A0M(0.0f, 0.5f);
            A012.A05 = new C40631Aft(r4);
            A012.A0H();
        }
    }

    public static void A01(C3503684j r6) {
        if (r6.A05 == null) {
            TextView textView = (TextView) r6.A0L.inflate();
            r6.A05 = textView;
            r6.A01 = Color.alpha(textView.getShadowColor());
            TextView textView2 = r6.A05;
            int paddingLeft = textView2.getPaddingLeft();
            int i = r6.A09;
            textView2.setPadding(paddingLeft + i, r6.A05.getPaddingTop(), r6.A05.getPaddingRight() + i, r6.A05.getPaddingBottom());
        }
    }

    public final void A03() {
        this.A0F.A02(this.A0G, C359188c9.class);
        AnonymousClass82X r2 = this.A0E;
        AnonymousClass82E r1 = this.A0D;
        0qQ.A0B(r1, 0);
        r2.A05.A0R.remove(r1);
    }

    public final void A07(boolean z) {
        this.A0A.removeCallbacks(this.A0I);
        TextView textView = this.A05;
        if (textView != null) {
            if (z) {
                C294975nL A012 = C294975nL.A01(textView, 0);
                A012.A06 = new C348207y4(this);
                A012.A0I(0.0f);
                A012.A05 = new C348217y5(this);
                A012.A0H();
            } else {
                textView.setVisibility(4);
            }
        }
        for (AnonymousClass88A r0 : this.A0K) {
            View view = r0.A05.A04;
            if (view != null) {
                C294975nL A013 = C294975nL.A01(view, 0);
                A013.A0G();
                A013.A0I(1.0f);
                A013.A0H();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        int ordinal = ((AnonymousClass80V) obj2).ordinal();
        if (ordinal == 2) {
            this.A0F.A01(this.A0G, C359188c9.class);
            this.A0E.A08(this.A0D);
        } else if (ordinal == 11 || ordinal == 0) {
            A03();
        }
    }

    public C3503684j(View view, AnonymousClass07Z r4, AnonymousClass82X r5, UserSession userSession, C3495780x r7) {
        this.A09 = (int) view.getResources().getDimension(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        this.A0F = AnonymousClass1Nd.A00(userSession);
        this.A08 = userSession;
        this.A0A = view;
        this.A0L = (ViewStub) view.requireViewById(R.id.ar_effect_instruction_text_stub);
        this.A0B = (ViewStub) view.requireViewById(R.id.ar_effect_instruction_image_stub);
        this.A0C = (ViewStub) view.requireViewById(R.id.camera_instruction_keyframe_stub);
        this.A0E = r5;
        if (r7 != null && r4 != null) {
            AnonymousClass72Y.A00(C226292g8.A00(19B.A00, new C3504184o(r7, r7.A0B))).A06(r4, new C3504284p(this));
        }
    }

    public static void A02(C3503684j r7, String str, boolean z) {
        float height;
        A01(r7);
        TextView textView = r7.A05;
        textView.getClass();
        textView.setText(str);
        for (AnonymousClass88A r0 : r7.A0K) {
            View view = r0.A05.A04;
            if (view != null) {
                C294975nL A002 = C294975nL.A00(view);
                A002.A0G();
                A002.A0I(0.0f);
                A002.A0H();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        float scaleX = r7.A05.getScaleX();
        float f = r7.A00;
        if (scaleX != f) {
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            TextView textView2 = r7.A05;
            int height2 = r7.A0A.getHeight();
            if (i != 0) {
                height = (float) ((int) ((((double) height2) * 0.25d) - ((double) (((float) r7.A05.getHeight()) * 0.5f))));
            } else {
                height = ((float) (height2 - r7.A05.getHeight())) * 0.5f;
            }
            textView2.setY(height);
            r7.A05.setScaleX(r7.A00);
            r7.A05.setScaleY(r7.A00);
        }
        TextView textView3 = r7.A05;
        textView3.getClass();
        textView3.setVisibility(0);
        TextView textView4 = r7.A05;
        textView4.getClass();
        C294975nL.A01(textView4, 0).A0G();
        TextView textView5 = r7.A05;
        if (z) {
            textView5.getClass();
            C294975nL A012 = C294975nL.A01(r7.A05, 0);
            A012.A06 = new C348207y4(r7);
            A012.A0M(0.0f, 1.0f);
            A012.A0H();
            return;
        }
        textView5.getClass();
        textView5.setAlpha(1.0f);
        TextView textView6 = r7.A05;
        if (textView6 != null) {
            0mq.A04(r7.A05, (int) (textView6.getAlpha() * ((float) r7.A01)));
        }
    }

    public final void A05(boolean z) {
        A06(z);
        A07(z);
    }
}
