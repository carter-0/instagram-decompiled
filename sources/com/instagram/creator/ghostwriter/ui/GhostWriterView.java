package com.instagram.creator.ghostwriter.ui;

import X.0qQ;
import X.AnonymousClass7TF;
import X.C267014am;
import X.C60165Jgk;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GhostWriterView extends IgFrameLayout {
    public C60165Jgk A00;
    public final IgTextView A01;
    public final IgImageView A02;
    public final ComposerAutoCompleteTextView A03;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GhostWriterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    private final GradientDrawable A00(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(AnonymousClass7TF.A03(getContext(), R.attr.igds_color_primary_button_on_media));
        gradientDrawable.setAlpha(i);
        this.A02.setElevation(8.0f);
        gradientDrawable.setCornerRadius(500.0f);
        return gradientDrawable;
    }

    public final ComposerAutoCompleteTextView getEditText() {
        return this.A03;
    }

    public final IgTextView getSubmit() {
        return this.A01;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GhostWriterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Bitmap bitmap;
        0qQ.A0B(context, 1);
        View.inflate(context, R.layout.ghost_writer_composer, this);
        IgImageView findViewById = findViewById(R.id.ghost_writer_composer_generate_button);
        this.A02 = findViewById;
        this.A01 = findViewById(R.id.ghost_writer_button_submit);
        this.A03 = (ComposerAutoCompleteTextView) findViewById(R.id.ghost_writer_composer_edittext);
        Resources resources = getResources();
        Drawable drawable = context.getDrawable(R.drawable.instagram_sparkles_filled_16);
        if (drawable != null) {
            bitmap = C267014am.A01(context, drawable);
        } else {
            bitmap = null;
        }
        findViewById.setImageDrawable(new BitmapDrawable(resources, bitmap));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, A00(179));
        stateListDrawable.addState(new int[]{16842910}, A00(255));
        stateListDrawable.addState(new int[0], A00(77));
        findViewById.setBackground(stateListDrawable);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GhostWriterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GhostWriterView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
