package com.instagram.debug.devoptions.metadata.view;

import X.0qQ;
import X.AnonymousClass0fU;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C249703kE;
import X.Dba;
import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride;

public final class ThreadMetadataOverrideViewHolder extends C249703kE {
    public final Delegate delegate;
    public final View editFieldContainer;
    public final IgTextView metadataBoolValue;
    public final IgTextView metadataName;
    public final IgEditText metadataValue;

    public interface Delegate {
        void onMetadataOverrideValueChanged();
    }

    public final void bind(ThreadMetadataOverride threadMetadataOverride) {
        Context context;
        int i;
        0qQ.A0B(threadMetadataOverride, 0);
        this.metadataName.setText(threadMetadataOverride.name);
        if (0qQ.A0K(threadMetadataOverride.returnType, Boolean.TYPE)) {
            setupForBoolField(threadMetadataOverride);
        } else {
            setupForValueField(threadMetadataOverride);
        }
        View view = this.editFieldContainer;
        boolean z = threadMetadataOverride.hasOverridden;
        if (z) {
            context = this.metadataName.getContext();
            i = R.attr.igds_color_success;
        } else if (!z) {
            context = this.metadataName.getContext();
            i = R.attr.igds_color_primary_background;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        view.setBackgroundColor(AnonymousClass7TF.A03(context, i));
    }

    private final void setupForBoolField(ThreadMetadataOverride threadMetadataOverride) {
        String str;
        IgTextView igTextView = this.metadataBoolValue;
        Object obj = threadMetadataOverride.value;
        if (obj == null || (str = obj.toString()) == null) {
            str = "n/a";
        }
        igTextView.setText(str);
        AnonymousClass0fU.A00(new ThreadMetadataOverrideViewHolder$setupForBoolField$1(threadMetadataOverride, this), this.metadataBoolValue);
        this.metadataBoolValue.setVisibility(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (X.0qQ.A0K(r1, java.lang.Long.TYPE) != false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupForValueField(com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride r4) {
        /*
            r3 = this;
            com.instagram.common.ui.base.IgEditText r2 = r3.metadataValue
            java.lang.Class r1 = r4.returnType
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0044
            java.lang.Object r1 = r4.value
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
        L_0x0010:
            X.0qQ.A0C(r1, r0)
        L_0x0013:
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r2.setHint(r0)
            com.instagram.common.ui.base.IgEditText r2 = r3.metadataValue
            java.lang.Class r1 = r4.returnType
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x002f
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x0030
        L_0x002f:
            r0 = 2
        L_0x0030:
            r2.setInputType(r0)
            com.instagram.common.ui.base.IgEditText r1 = r3.metadataValue
            com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder$setupForValueField$1 r0 = new com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder$setupForValueField$1
            r0.<init>(r4, r3)
            r1.setOnEditorActionListener(r0)
            com.instagram.common.ui.base.IgEditText r1 = r3.metadataValue
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x0044:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x004f
            java.lang.Object r1 = r4.value
            goto L_0x0013
        L_0x004f:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0060
            java.lang.Object r1 = r4.value
            r0 = 17
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x0010
        L_0x0060:
            java.lang.String r1 = "n/a"
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideViewHolder.setupForValueField(com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreadMetadataOverrideViewHolder(View view, Delegate delegate2) {
        super(view);
        AnonymousClass7TG.A1O(view, delegate2);
        this.delegate = delegate2;
        this.metadataName = Dba.A0E(view, R.id.metadata_name);
        this.metadataValue = (IgEditText) AnonymousClass7TE.A0b(view, R.id.metadata_value_value_field);
        this.metadataBoolValue = Dba.A0E(view, R.id.metadata_name_boolean_field);
        this.editFieldContainer = AnonymousClass7TE.A0b(view, R.id.editfields_container);
    }
}
