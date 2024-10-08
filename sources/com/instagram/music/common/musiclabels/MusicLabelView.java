package com.instagram.music.common.musiclabels;

import X.0qQ;
import X.2Yu;
import X.AnonymousClass7TE;
import X.C69624Np6;
import X.DbT;
import X.DbU;
import X.JTT;
import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class MusicLabelView extends TextView {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicLabelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void setLabelModel(C69624Np6 np6) {
        if (np6 != null) {
            0qQ.A07(getContext());
            throw AnonymousClass7TE.A11("getLabel");
        } else {
            setVisibility(8);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicLabelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        DbU.A11(context, this, R.drawable.label_bg);
        setMaxLines(1);
        setIncludeFontPadding(false);
        setTextSize(2, 7.0f);
        int A0H = AnonymousClass7TE.A0H(context.getResources());
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.annotation_hidden_location_pill_nub_padding);
        setPadding(A0H, dimensionPixelSize, A0H, dimensionPixelSize);
        setTypeface(Typeface.DEFAULT_BOLD);
        DbT.A17(context, this, 2Yu.A0A(context));
        setVisibility(8);
    }

    public /* synthetic */ MusicLabelView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MusicLabelView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
