package com.instagram.direct.ui.polls;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TG;
import X.C71273OhE;
import X.C71402Ok1;
import X.C71411OkA;
import X.C74457PvC;
import X.DbT;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.widget.imageview.IgImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PollMessageOptionView extends FrameLayout {
    public IgEditText A00;
    public C74457PvC A01;
    public int A02;
    public IgImageView A03;
    public final View.OnFocusChangeListener A04;
    public final C71273OhE A05;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PollMessageOptionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public static final void A00(PollMessageOptionView pollMessageOptionView, boolean z) {
        IgImageView igImageView = pollMessageOptionView.A03;
        if (z) {
            if (igImageView != null) {
                igImageView.setVisibility(0);
                IgEditText igEditText = pollMessageOptionView.A00;
                if (igEditText != null) {
                    igEditText.setPaddingRelative(igEditText.getPaddingStart(), igEditText.getPaddingTop(), pollMessageOptionView.A02, igEditText.getPaddingBottom());
                    return;
                }
                0qQ.A0F("editText");
                throw AnonymousClass00P.createAndThrow();
            }
        } else if (igImageView != null) {
            igImageView.setVisibility(8);
            IgEditText igEditText2 = pollMessageOptionView.A00;
            if (igEditText2 != null) {
                igEditText2.setPaddingRelative(igEditText2.getPaddingStart(), igEditText2.getPaddingTop(), 0, igEditText2.getPaddingBottom());
                return;
            }
            0qQ.A0F("editText");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("removeButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setText(String str) {
        0qQ.A0B(str, 0);
        IgEditText igEditText = this.A00;
        if (igEditText == null) {
            0qQ.A0F("editText");
            throw AnonymousClass00P.createAndThrow();
        }
        igEditText.setText(str);
        A00(this, false);
    }

    public final C74457PvC getListener() {
        return this.A01;
    }

    public final void setListener(C74457PvC pvC) {
        this.A01 = pvC;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PollMessageOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        C71273OhE ohE = new C71273OhE(this, 23);
        this.A05 = ohE;
        C71411OkA okA = new C71411OkA(this, 2);
        this.A04 = okA;
        View.inflate(context, R.layout.direct_poll_message_option, this);
        this.A02 = AnonymousClass7TG.A06(context);
        IgEditText igEditText = (IgEditText) requireViewById(R.id.input);
        this.A00 = igEditText;
        String str = "editText";
        if (igEditText != null) {
            igEditText.addTextChangedListener(ohE);
            IgEditText igEditText2 = this.A00;
            if (igEditText2 != null) {
                igEditText2.setOnFocusChangeListener(okA);
                IgImageView A0b = DbT.A0b(this, R.id.remove_button);
                this.A03 = A0b;
                if (A0b == null) {
                    str = "removeButton";
                } else {
                    A0b.setOnClickListener(new C71402Ok1((Object) this, 11));
                    setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public /* synthetic */ PollMessageOptionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PollMessageOptionView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
