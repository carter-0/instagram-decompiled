package com.instagram.direct.messagethread.voice.transcription;

import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass7TE;
import X.C68893NaV;
import X.C69612Nou;
import X.C73920Pm0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.direct.messagethread.util.text.ExpandableTextView;

public final class VoiceMessageTranscriptionTextView extends LinearLayout {
    public int A00 = -16777216;
    public int A01 = -16777216;
    public C69612Nou A02 = C68893NaV.A00;
    public final String A03;
    public final AnonymousClass0eM A04 = C73920Pm0.A00(this, 22);
    public final AnonymousClass0eM A05 = C73920Pm0.A00(this, 23);
    public final AnonymousClass0eM A06 = C73920Pm0.A00(this, 24);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceMessageTranscriptionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A03 = AnonymousClass7TE.A16(context, 2131960599);
        View.inflate(context, R.layout.voice_message_transcription_text_view, this);
        setTranscribedMessageTextColor(-16777216);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, com.instagram.direct.messagethread.util.text.ExpandableTextView] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setTranscriptionTextAndHandleLoadMore(java.lang.String r9, java.lang.String r10, X.0sP r11) {
        /*
            r8 = this;
            r5 = 0
            if (r9 == 0) goto L_0x0064
            int r0 = r9.length()
            if (r0 == 0) goto L_0x0064
            android.view.ViewParent r0 = r8.getParent()
            boolean r0 = r0 instanceof android.view.View
            r4 = 0
            if (r0 == 0) goto L_0x001d
            android.view.ViewParent r1 = r8.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x001d
            r4 = r1
            android.view.View r4 = (android.view.View) r4
        L_0x001d:
            int r0 = r8.getWidth()
            if (r0 != 0) goto L_0x005f
            if (r4 == 0) goto L_0x005f
            int r3 = r4.getWidth()
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x005d
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.getMarginStart()
        L_0x0037:
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            boolean r0 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0045
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r5 = r1.getMarginEnd()
        L_0x0045:
            int r2 = r2 + r5
            int r3 = r3 - r2
        L_0x0047:
            com.instagram.direct.messagethread.util.text.ExpandableTextView r1 = r8.getTranscriptionResultTextView()
            android.text.SpannableString r2 = X.C66580MXl.A0D(r9)
            int r4 = r8.A00
            r5 = 10
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
            r3 = r10
            r7 = r11
            r1.setText(r2, r3, r4, r5, r6, r7)
            return
        L_0x005d:
            r2 = 0
            goto L_0x0037
        L_0x005f:
            int r3 = r8.getWidth()
            goto L_0x0047
        L_0x0064:
            com.instagram.direct.messagethread.util.text.ExpandableTextView r0 = r8.getTranscriptionResultTextView()
            X.DbS.A1C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView.setTranscriptionTextAndHandleLoadMore(java.lang.String, java.lang.String, X.0sP):void");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.direct.messagethread.util.text.ExpandableTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.direct.messagethread.util.text.ExpandableTextView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v19, types: [android.widget.TextView, com.instagram.direct.messagethread.util.text.ExpandableTextView] */
    /* JADX WARNING: type inference failed for: r0v21, types: [com.instagram.direct.messagethread.util.text.ExpandableTextView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0044, code lost:
        if (r3.length() == 0) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setStatus(X.C69612Nou r6) {
        /*
            r5 = this;
            r1 = 0
            X.0qQ.A0B(r6, r1)
            r5.A02 = r6
            boolean r0 = r6 instanceof X.C68893NaV
            r2 = 8
            if (r0 == 0) goto L_0x0035
            r5.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r0 = r5.getErrorMessageTextView()
            java.lang.String r1 = ""
            r0.setText(r1)
            com.instagram.direct.messagethread.util.text.ExpandableTextView r0 = r5.getTranscriptionResultTextView()
            r0.setText(r1)
            com.instagram.common.ui.base.IgTextView r0 = r5.getErrorMessageTextView()
            r0.setVisibility(r2)
            com.instagram.direct.messagethread.util.text.ExpandableTextView r0 = r5.getTranscriptionResultTextView()
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r0 = r5.getLowConfidenceMessageTextView()
            r0.setVisibility(r2)
            return
        L_0x0035:
            boolean r0 = r6 instanceof X.C68892NaU
            if (r0 == 0) goto L_0x0087
            X.NaU r6 = (X.C68892NaU) r6
            java.lang.String r3 = r6.A01
            if (r3 == 0) goto L_0x0046
            int r1 = r3.length()
            r0 = 0
            if (r1 != 0) goto L_0x0047
        L_0x0046:
            r0 = 1
        L_0x0047:
            r4 = r0 ^ 1
            int r0 = X.DbW.A01(r4)
            r5.setVisibility(r0)
            com.instagram.direct.messagethread.util.text.ExpandableTextView r1 = r5.getTranscriptionResultTextView()
            int r0 = X.DbW.A01(r4)
            r1.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r5.getErrorMessageTextView()
            java.lang.String r0 = r5.A03
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r5.getErrorMessageTextView()
            r0 = r4 ^ 1
            int r0 = X.DbW.A01(r0)
            r1.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r5.getLowConfidenceMessageTextView()
            if (r4 == 0) goto L_0x007c
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x007c
            r2 = 0
        L_0x007c:
            r1.setVisibility(r2)
            java.lang.String r1 = r6.A00
            X.0sP r0 = r6.A02
            r5.setTranscriptionTextAndHandleLoadMore(r3, r1, r0)
            return
        L_0x0087:
            boolean r0 = r6 instanceof X.C68891NaT
            if (r0 == 0) goto L_0x00ad
            r5.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r0 = r5.getLowConfidenceMessageTextView()
            r0.setVisibility(r2)
            com.instagram.direct.messagethread.util.text.ExpandableTextView r0 = r5.getTranscriptionResultTextView()
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgTextView r0 = r5.getErrorMessageTextView()
            r0.setVisibility(r1)
            com.instagram.common.ui.base.IgTextView r1 = r5.getErrorMessageTextView()
            java.lang.String r0 = r5.A03
            r1.setText(r0)
            return
        L_0x00ad:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionTextView.setStatus(X.Nou):void");
    }

    private final IgTextView getErrorMessageTextView() {
        return (IgTextView) AnonymousClass7TE.A14(this.A04);
    }

    private final IgTextView getLowConfidenceMessageTextView() {
        return (IgTextView) AnonymousClass7TE.A14(this.A05);
    }

    private final ExpandableTextView getTranscriptionResultTextView() {
        return (ExpandableTextView) AnonymousClass7TE.A14(this.A06);
    }

    public final int getContextMessageTextColor() {
        return this.A00;
    }

    public final C69612Nou getStatus() {
        return this.A02;
    }

    public final int getTranscribedMessageTextColor() {
        return this.A01;
    }

    public final void setContextMessageTextColor(int i) {
        getErrorMessageTextView().setTextColor(i);
        getLowConfidenceMessageTextView().setTextColor(i);
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, com.instagram.direct.messagethread.util.text.ExpandableTextView] */
    public final void setTranscribedMessageTextColor(int i) {
        getTranscriptionResultTextView().setTextColor(i);
        this.A01 = i;
    }
}
