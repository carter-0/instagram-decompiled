package com.instagram.debug.devoptions.metadata.view;

import X.0qQ;
import X.C249703kE;
import X.DbV;
import android.view.KeyEvent;
import android.widget.TextView;
import com.instagram.debug.devoptions.metadata.model.ThreadMetadataOverride;

public final class ThreadMetadataOverrideViewHolder$setupForValueField$1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ ThreadMetadataOverride $model;
    public final /* synthetic */ ThreadMetadataOverrideViewHolder this$0;

    public ThreadMetadataOverrideViewHolder$setupForValueField$1(ThreadMetadataOverride threadMetadataOverride, ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder) {
        this.$model = threadMetadataOverride;
        this.this$0 = threadMetadataOverrideViewHolder;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Object obj;
        if (i != 6) {
            return true;
        }
        Class cls = this.$model.returnType;
        if (0qQ.A0K(cls, Integer.TYPE)) {
            obj = Integer.valueOf(Integer.parseInt(DbV.A0y(textView)));
        } else {
            boolean A0K = 0qQ.A0K(cls, Long.TYPE);
            String A0y = DbV.A0y(textView);
            obj = A0y;
            if (A0K) {
                obj = DbV.A0q(A0y);
            }
        }
        this.$model.update(obj);
        ThreadMetadataOverrideViewHolder threadMetadataOverrideViewHolder = this.this$0;
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        threadMetadataOverrideViewHolder.delegate.onMetadataOverrideValueChanged();
        return true;
    }
}
