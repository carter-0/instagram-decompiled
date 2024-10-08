package com.instagram.react.views.switchview;

import X.0Sd;
import X.0qQ;
import X.AnonymousClass2T1;
import X.C15989UmW;
import X.C18915WCk;
import X.C245003c8;
import X.C245103cK;
import X.C245193cT;
import X.QZK;
import X.QZL;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

public class ReactSwitchManager extends SimpleViewManager {
    public static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new C18915WCk();
    public static final String REACT_CLASS = "AndroidSwitch";

    public class ReactSwitchShadowNode extends LayoutShadowNode implements AnonymousClass2T1 {
        public int A00;
        public int A01;
        public boolean A02;

        /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.igds.components.switchbutton.IgdsSwitch, X.UmW, android.view.View] */
        public final long Cnu(C245103cK r6, C245103cK r7, C245003c8 r8, float f, float f2) {
            if (!this.A02) {
                int i = IgdsSwitch.A0M;
                QZL qzl = this.A0A;
                0Sd.A00(qzl);
                0qQ.A0B(qzl, 1);
                ? igdsSwitch = new IgdsSwitch(qzl, (AttributeSet) null, 0);
                igdsSwitch.A00 = true;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                igdsSwitch.measure(makeMeasureSpec, makeMeasureSpec);
                this.A01 = igdsSwitch.getMeasuredWidth();
                this.A00 = igdsSwitch.getMeasuredHeight();
                this.A02 = true;
            }
            return C245193cT.A00(this.A01, this.A00);
        }

        public ReactSwitchShadowNode() {
            A09(this);
        }
    }

    public ReactSwitchManager() {
        super((QZK) null);
    }

    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "on")
    public void setOn(C15989UmW umW, boolean z) {
        umW.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        umW.setOn(z);
        umW.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    public /* bridge */ /* synthetic */ void addEventEmitters(QZL qzl, View view) {
        ((CompoundButton) view).setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new ReactSwitchShadowNode();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.igds.components.switchbutton.IgdsSwitch, X.UmW] */
    public C15989UmW createViewInstance(QZL qzl) {
        int i = IgdsSwitch.A0M;
        0qQ.A0B(qzl, 1);
        ? igdsSwitch = new IgdsSwitch(qzl, (AttributeSet) null, 0);
        igdsSwitch.A00 = true;
        return igdsSwitch;
    }

    public Class getShadowNodeClass() {
        return ReactSwitchShadowNode.class;
    }

    @ReactProp(defaultBoolean = true, name = "enabled")
    public void setEnabled(C15989UmW umW, boolean z) {
        umW.setEnabled(z);
    }

    public void addEventEmitters(QZL qzl, C15989UmW umW) {
        umW.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }
}
