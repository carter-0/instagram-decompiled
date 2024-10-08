package com.instagram.creation.capture.quickcapture.cameradestinationpicker.ui;

import X.03v;
import X.0Tu;
import X.0mi;
import X.0nA;
import X.0qQ;
import X.0sn;
import X.182;
import X.1Au;
import X.1Av;
import X.2eS;
import X.AnonymousClass80J;
import X.AnonymousClass80K;
import X.AnonymousClass80L;
import X.AnonymousClass80M;
import X.AnonymousClass80O;
import X.AnonymousClass9QA;
import X.C279284yO;
import X.C301505zQ;
import X.C301525zS;
import X.C301535zT;
import X.C301545zU;
import X.C3493980f;
import X.C3494080g;
import X.C3494180h;
import X.C3494280i;
import X.C363138jC;
import X.C379969Wa;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LegacyCameraDestinationScrollView extends FrameLayout {
    public float A00;
    public List A01;
    public boolean A02;
    public UserSession A03;
    public final View A04;
    public final LinearLayout A05;
    public final ReboundHorizontalScrollView A06;
    public final C301525zS A07;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LegacyCameraDestinationScrollView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public static final int A00(C279284yO r1) {
        0qQ.A0B(r1, 0);
        if (r1.equals(AnonymousClass80L.A00)) {
            return R.id.cam_dest_live;
        }
        if (r1.equals(AnonymousClass9QA.A00)) {
            return R.id.cam_dest_story;
        }
        if (r1.equals(AnonymousClass80M.A00)) {
            return R.id.cam_dest_direct;
        }
        if (r1 instanceof AnonymousClass80O) {
            return R.id.cam_dest_clips;
        }
        if (r1.equals(C363138jC.A00)) {
            return R.id.cam_dest_feed;
        }
        if (r1.equals(C3493980f.A00)) {
            return R.id.cam_dest_igtv;
        }
        if (r1.equals(C3494080g.A00)) {
            return R.id.cam_dest_template;
        }
        if (r1.equals(C3494180h.A00)) {
            return R.id.cam_dest_note;
        }
        if (r1.equals(C3494280i.A00)) {
            return R.id.cam_dest_profile;
        }
        if (r1.equals(AnonymousClass80J.A00)) {
            return R.id.cam_dest_potato;
        }
        if (r1.equals(AnonymousClass80K.A00)) {
            return R.id.cam_dest_quick_snap;
        }
        throw new RuntimeException();
    }

    public final TextView A02(C279284yO r12) {
        int i;
        0qQ.A0B(r12, 0);
        Context context = getContext();
        View inflate = View.inflate(context, R.layout.camera_destination_label, (ViewGroup) null);
        0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        Context context2 = textView.getContext();
        0qQ.A07(context2);
        if (r12.equals(AnonymousClass80L.A00)) {
            i = 2131954785;
        } else if (r12.equals(AnonymousClass9QA.A00)) {
            i = 2131954790;
        } else if (r12.equals(AnonymousClass80M.A00)) {
            i = 2131954782;
        } else if (r12 instanceof AnonymousClass80O) {
            i = 2131954781;
        } else if (r12.equals(C363138jC.A00)) {
            i = 2131954783;
        } else if (r12.equals(C3493980f.A00)) {
            i = 2131954784;
        } else if (r12.equals(C3494080g.A00)) {
            i = 2131954791;
        } else if (r12.equals(C3494180h.A00)) {
            i = 2131954786;
        } else if (r12.equals(C3494280i.A00)) {
            i = 2131954788;
        } else if (r12.equals(AnonymousClass80J.A00)) {
            i = 2131954787;
        } else if (r12.equals(AnonymousClass80K.A00)) {
            i = 2131954789;
        } else {
            throw new RuntimeException();
        }
        String string = context2.getString(i);
        0qQ.A07(string);
        String upperCase = string.toUpperCase(Locale.ROOT);
        0qQ.A07(upperCase);
        if (this.A01.contains(r12)) {
            03v.A0G(textView, context.getString(2131954780, new Object[]{Integer.valueOf(this.A01.indexOf(r12) + 1), Integer.valueOf(this.A01.size())}));
        } else {
            2eS.A01(textView);
        }
        UserSession userSession = this.A03;
        if (userSession != null && r12.equals(AnonymousClass80K.A00)) {
            1Av A002 = 1Au.A00(userSession);
            if (!((Boolean) A002.A4h.CDM(A002, 1Av.A8a[523])).booleanValue()) {
                UserSession userSession2 = this.A03;
                0Tu r8 = 0Tu.A05;
                if (Boolean.valueOf(182.A06(r8, userSession2, 36325557784294432L)).booleanValue() && Boolean.valueOf(182.A06(r8, this.A03, 36325557784818727L)).booleanValue() && 182.A06(r8, userSession, 36325557785343023L)) {
                    0qQ.A07(context);
                    textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new C379969Wa(context, false), (Drawable) null, new C379969Wa(context, true));
                }
            }
        }
        textView.setText(upperCase);
        textView.setContentDescription(upperCase);
        textView.setTag(r12);
        textView.setId(A00(r12));
        return textView;
    }

    public static final void A01(LegacyCameraDestinationScrollView legacyCameraDestinationScrollView, float f) {
        int dimension;
        View view = legacyCameraDestinationScrollView.A04;
        int i = 4;
        if (f > 0.0f) {
            i = 0;
        }
        view.setVisibility(i);
        view.setAlpha(0mi.A02(f, 0.1f, 0.9f, 0.0f, 1.0f));
        ReboundHorizontalScrollView reboundHorizontalScrollView = legacyCameraDestinationScrollView.A06;
        reboundHorizontalScrollView.setHorizontalFadingEdgeEnabled(true);
        float A022 = 0mi.A02(1.0f - f, 0.5f, 1.0f, 0.0f, 1.0f);
        Resources resources = legacyCameraDestinationScrollView.getResources();
        int dimension2 = (int) (resources.getDimension(R.dimen.action_button_settings_height) * A022);
        if (legacyCameraDestinationScrollView.A02) {
            dimension = 0;
        } else {
            dimension = (int) (A022 * resources.getDimension(R.dimen.abc_list_item_height_material));
        }
        if (0nA.A0B(reboundHorizontalScrollView) != dimension) {
            0nA.A0d(reboundHorizontalScrollView, dimension);
            0nA.A0U(reboundHorizontalScrollView, dimension);
        }
        if (reboundHorizontalScrollView.getHorizontalFadingEdgeLength() != dimension2) {
            reboundHorizontalScrollView.setFadingEdgeLength(dimension2);
        }
    }

    public void setLabelBackgroundProgress(float f) {
        this.A00 = f;
        A01(this, f);
    }

    public void setUserSession(UserSession userSession) {
        this.A03 = userSession;
        if (userSession != null && 182.A06(0Tu.A05, userSession, 36321971486926712L)) {
            this.A04.setBackgroundResource(R.drawable.camera_destination_label_background_2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyCameraDestinationScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        0qQ.A07(context2);
        this.A06 = new ReboundHorizontalScrollView(context2, (AttributeSet) null, 0);
        View view = new View(context2);
        this.A04 = view;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.A05 = linearLayout;
        this.A01 = 0sn.A00;
        C301505zQ r2 = new C301505zQ(this);
        this.A07 = r2;
        addView(linearLayout);
        ReboundHorizontalScrollView reboundHorizontalScrollView = this.A06;
        addView(reboundHorizontalScrollView);
        linearLayout.addView(view);
        reboundHorizontalScrollView.getViewTreeObserver().addOnScrollChangedListener(new C301535zT(this));
        reboundHorizontalScrollView.A0A(r2);
        reboundHorizontalScrollView.addOnLayoutChangeListener(new C301545zU(this));
        view.setBackgroundResource(R.drawable.camera_destination_label_background);
        view.setVisibility(4);
        0nA.A0f(linearLayout, -1);
        0nA.A0V(linearLayout, -1);
        linearLayout.setGravity(17);
        Resources resources = getResources();
        linearLayout.setBackgroundColor(resources.getColor(R.color.fds_transparent));
        0nA.A0f(reboundHorizontalScrollView, -1);
        0nA.A0V(reboundHorizontalScrollView, -1);
        reboundHorizontalScrollView.setGravity(17);
        reboundHorizontalScrollView.setBackgroundColor(resources.getColor(R.color.fds_transparent));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LegacyCameraDestinationScrollView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LegacyCameraDestinationScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
