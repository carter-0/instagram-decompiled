package com.instagram.igtv.widget;

import X.0nA;
import X.0qQ;
import X.1Xj;
import X.2eS;
import X.AnonymousClass00P;
import X.AnonymousClass07i;
import X.AnonymousClass3E4;
import X.AnonymousClass3E6;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C228602lw;
import X.C252213ok;
import X.C252243on;
import X.C336207eF;
import X.C66402MQi;
import X.DbT;
import X.DbU;
import X.DbW;
import X.DbZ;
import X.JTU;
import X.K6u;
import X.LWP;
import X.LY6;
import X.LZH;
import X.M96;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

public class TitleDescriptionEditor extends ConstraintLayout implements C252243on, C252213ok {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public TextWatcher A07;
    public TextWatcher A08;
    public View.OnClickListener A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public ViewGroup A0D;
    public FrameLayout A0E;
    public FrameLayout A0F;
    public IgImageView A0G;
    public AnonymousClass3E6 A0H;
    public C66402MQi A0I;
    public IgAutoCompleteTextView A0J;
    public IgAutoCompleteTextView A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public final /* synthetic */ void ADC(View view) {
    }

    public final /* synthetic */ void D6z(View view) {
    }

    public final /* synthetic */ void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final /* synthetic */ void onCreate() {
    }

    public final /* synthetic */ void onDestroy() {
    }

    public final /* synthetic */ void onDestroyView() {
    }

    public final /* synthetic */ void onSaveInstanceState(Bundle bundle) {
    }

    public final /* synthetic */ void onStart() {
    }

    public final /* synthetic */ void onStop() {
    }

    public final /* synthetic */ void onViewStateRestored(Bundle bundle) {
    }

    public static void A00(TitleDescriptionEditor titleDescriptionEditor, boolean z) {
        IgAutoCompleteTextView igAutoCompleteTextView = titleDescriptionEditor.A0J;
        if (titleDescriptionEditor.A0I != null && igAutoCompleteTextView.getLayout() != null && titleDescriptionEditor.A0M) {
            ScrollView scrollView = ((K6u) titleDescriptionEditor.A0I).A02;
            if (scrollView == null) {
                0qQ.A0F("scrollView");
                throw AnonymousClass00P.createAndThrow();
            }
            int height = (scrollView.getHeight() - titleDescriptionEditor.A04) - titleDescriptionEditor.A05;
            int scrollY = scrollView.getScrollY();
            int selectionEnd = igAutoCompleteTextView.getSelectionEnd();
            Layout layout = igAutoCompleteTextView.getLayout();
            int lineForOffset = layout.getLineForOffset(selectionEnd);
            int lineTop = layout.getLineTop(lineForOffset) + igAutoCompleteTextView.getPaddingTop();
            int lineBottom = layout.getLineBottom(lineForOffset) + igAutoCompleteTextView.getPaddingTop();
            int top = igAutoCompleteTextView.getTop() - titleDescriptionEditor.A05;
            int i = (lineTop + top) - titleDescriptionEditor.A06;
            int baseline = ((top + lineBottom) + titleDescriptionEditor.A0J.getBaseline()) - (titleDescriptionEditor.A0D.getHeight() - (layout.getLineBottom(0) * 2));
            titleDescriptionEditor.A02 = baseline;
            int height2 = (height - baseline) - titleDescriptionEditor.A0D.getHeight();
            int min = Math.min(i, scrollY) + height2;
            titleDescriptionEditor.A00 = min;
            if (i >= scrollY) {
                int i2 = titleDescriptionEditor.A01;
                if (min < i2) {
                    i = i2 - height2;
                } else {
                    return;
                }
            }
            if (z) {
                scrollView.smoothScrollTo(0, i);
            } else {
                scrollView.scrollTo(0, i);
            }
        }
    }

    private void A01(IgAutoCompleteTextView igAutoCompleteTextView) {
        Fragment fragment = this.A0I;
        if (fragment != null) {
            Fragment fragment2 = (K6u) fragment;
            C336207eF A012 = C336207eF.A01(fragment2.requireContext(), fragment2, new C228602lw(fragment2.requireContext(), AnonymousClass07i.A00(fragment2), (Integer) null), AnonymousClass7TE.A0l(fragment2.A07), (1Xj) null, "igtv_edit_page");
            igAutoCompleteTextView.A07 = true;
            igAutoCompleteTextView.setAdapter(A012);
        }
    }

    public final void DMr(int i, boolean z) {
        String str;
        C66402MQi mQi = this.A0I;
        if (mQi != null) {
            FragmentActivity A0E2 = DbZ.A0E(mQi);
            K6u k6u = (K6u) mQi;
            ScrollView scrollView = k6u.A02;
            if (scrollView == null) {
                str = "scrollView";
            } else {
                View view = k6u.A00;
                if (view == null) {
                    str = "scrollViewContent";
                } else {
                    this.A04 = i;
                    view.setPadding(0, this.A05, 0, i + this.A03);
                    post(new M96(A0E2, scrollView, this));
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public String getDescriptionText() {
        return AnonymousClass7TF.A0f(this.A0J);
    }

    public IgImageView getMediaPreview() {
        return this.A0G;
    }

    public String getTitleText() {
        return AnonymousClass7TF.A0f(this.A0K);
    }

    public final void onPause() {
        AnonymousClass3E6 r1 = this.A0H;
        if (r1.isStarted()) {
            r1.onStop();
            this.A0H.EEH(this);
        }
        this.A0K.removeTextChangedListener(this.A08);
        this.A0J.removeTextChangedListener(this.A07);
        0nA.A0N(this.A0J);
    }

    public final void onResume() {
        FragmentActivity A0E2;
        C66402MQi mQi = this.A0I;
        if (!(mQi == null || (A0E2 = DbZ.A0E(mQi)) == null)) {
            this.A0H.DmJ(A0E2);
            this.A0H.A9Y(this);
        }
        this.A0K.addTextChangedListener(this.A08);
        this.A0J.addTextChangedListener(this.A07);
    }

    public void setDescriptionHint(int i) {
        this.A0J.setHint(i);
    }

    public void setDescriptionText(String str) {
        this.A0J.setText(str);
    }

    public void setMaxTitleLength(int i) {
        this.A0K.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public void setTitleHint(int i) {
        this.A0K.setHint(i);
    }

    public void setTitleText(String str) {
        this.A0K.setText(str);
    }

    public void setTitleVisibility(boolean z) {
        int i = 0;
        this.A0F.setVisibility(DbW.A01(z ? 1 : 0));
        View view = this.A0A;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    public TitleDescriptionEditor(Context context) {
        super(context);
        JTU.A1D(this);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        this.A0K = (IgAutoCompleteTextView) requireViewById(R.id.title_text);
        this.A0J = (IgAutoCompleteTextView) requireViewById(R.id.description_text);
        Resources resources = getResources();
        this.A01 = resources.getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height) * 2;
        A01(this.A0K);
        A01(this.A0J);
        this.A08 = new LWP((Object) this, 14);
        this.A07 = new LWP((Object) this, 15);
        this.A0J.setOnItemClickListener(new LZH(this, 2));
        this.A0C = requireViewById(R.id.title_error);
        this.A0B = requireViewById(R.id.title_error_icon);
        this.A0D = DbU.A0C(this, R.id.text_container);
        this.A0E = (FrameLayout) requireViewById(R.id.preview_container);
        this.A0G = DbT.A0b(this, R.id.preview);
        this.A0F = (FrameLayout) requireViewById(R.id.title_container);
        this.A0A = requireViewById(R.id.title_description_divider);
        this.A0E.setOnClickListener(LY6.A00(this, 35));
        if (this.A0N) {
            TypedValue typedValue = new TypedValue();
            resources.getValue(R.dimen.clips_minicountdown_view_parent_view_ratio, typedValue, true);
            int A092 = 0nA.A09(getContext());
            int i = (int) (((float) A092) * typedValue.getFloat());
            0nA.A0f(this.A0E, i);
            0nA.A0f(this.A0D, A092 - i);
            2eS.A01(this.A0E);
        } else {
            this.A0E.setVisibility(8);
        }
        this.A06 = Math.round(0nA.A04(getContext(), 14));
        this.A0H = AnonymousClass3E4.A01(this, false, false);
    }

    public void setAdjustScrollOnTextChange(boolean z) {
        this.A0M = z;
    }

    public void setDelegate(C66402MQi mQi) {
        this.A0I = mQi;
    }

    public void setFooterHeightPx(int i) {
        this.A03 = i;
    }

    public void setMediaPreviewClickListener(View.OnClickListener onClickListener) {
        this.A09 = onClickListener;
    }

    public void setScrollContentTopPadding(int i) {
        this.A05 = i;
    }

    public TitleDescriptionEditor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        JTU.A1D(this);
    }

    public TitleDescriptionEditor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        JTU.A1D(this);
    }
}
