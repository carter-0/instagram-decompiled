package com.instagram.direct.wellbeing.unknowncontact.messagerequests.pendingthreads.rows.header;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;

public final class PendingThreadsMessageSettingsView extends IgLinearLayout {
    public TextView A00;
    public View A01;
    public TextView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context);
    }

    public final void setLinkToSettingsClickListener(View.OnClickListener onClickListener) {
        0qQ.A0B(onClickListener, 0);
        TextView textView = this.A02;
        if (textView == null) {
            0qQ.A0F("linkToSettingsView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setOnClickListener(onClickListener);
        }
    }

    public final void setLinkToSettingsText(String str) {
        0qQ.A0B(str, 0);
        TextView textView = this.A02;
        if (textView == null) {
            0qQ.A0F("linkToSettingsView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setText(str);
        }
    }

    public final void setTitleText(String str) {
        0qQ.A0B(str, 0);
        TextView textView = this.A00;
        if (textView == null) {
            0qQ.A0F("titleTextView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setText(str);
        }
    }

    public final void setDividerVisibility(int i) {
        View view = this.A01;
        if (view == null) {
            0qQ.A0F("divider");
            throw AnonymousClass00P.createAndThrow();
        } else {
            view.setVisibility(i);
        }
    }

    public final void setLinkToSettingsVisibility(int i) {
        TextView textView = this.A02;
        if (textView == null) {
            0qQ.A0F("linkToSettingsView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            textView.setVisibility(i);
        }
    }

    public final void A00(Context context) {
        LayoutInflater.from(context).inflate(R.layout.pending_threads_header_view, this, true);
        this.A00 = AnonymousClass7TE.A0d(this, R.id.header_title);
        this.A02 = AnonymousClass7TE.A0d(this, R.id.link_to_message_settings);
        this.A01 = findViewById(R.id.divider);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        0qQ.A0B(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PendingThreadsMessageSettingsView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context);
    }
}
