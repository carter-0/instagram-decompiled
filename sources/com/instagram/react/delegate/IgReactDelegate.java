package com.instagram.react.delegate;

import X.0I1;
import X.2Yu;
import X.AnonymousClass0wW;
import X.C10323RqL;
import X.C13428TaF;
import X.C13567Tcn;
import X.C13571Tcr;
import X.C7372Q9d;
import X.C8817RAt;
import X.DbT;
import X.DbU;
import X.DbV;
import X.Q6H;
import X.RBH;
import X.SSW;
import X.T7S;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.instagram.android.R;
import com.instagram.react.modules.exceptionmanager.IgReactExceptionManager;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class IgReactDelegate extends C8817RAt implements C13567Tcn {
    public int A00;
    public Bundle A01;
    public C13428TaF A02;
    public C7372Q9d A03;
    public C13571Tcr A04;
    public AnonymousClass0wW A05;
    public T7S A06;
    public IgReactExceptionManager A07;
    @Deprecated
    public C10323RqL A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public FrameLayout mFrameLayout;
    public View mInlineNavBar;
    public View mInlineNavCloseButton;
    public TextView mInlineNavTitle;
    public SpinnerImageView mLoadingIndicator;

    public interface RCTViewEventEmitter extends JavaScriptModule {
        void emit(String str, Object obj);
    }

    public static void A00(IgReactDelegate igReactDelegate) {
        FrameLayout frameLayout;
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (igReactDelegate.A0C) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            Fragment fragment = igReactDelegate.A00;
            layoutParams.topMargin = DbV.A05(fragment).getDimensionPixelOffset(R.dimen.abc_alert_dialog_button_dimen);
            igReactDelegate.mFrameLayout.addView(igReactDelegate.A03, layoutParams);
            View inflate = LayoutInflater.from(fragment.getContext()).inflate(R.layout.react_inline_nav_bar, igReactDelegate.mFrameLayout, false);
            igReactDelegate.mInlineNavBar = inflate;
            TextView A0G = DbU.A0G(inflate, R.id.react_inline_title);
            igReactDelegate.mInlineNavTitle = A0G;
            A0G.setText(fragment.mArguments.getString("IgReactFragment.ARGUMENT_TITLE"));
            igReactDelegate.mInlineNavCloseButton = igReactDelegate.mInlineNavBar.findViewById(R.id.react_inline_close_button);
            C10323RqL rqL = igReactDelegate.A08;
            if (rqL != null) {
                RBH rbh = rqL.A00;
                TextView textView = ((IgReactDelegate) rbh.A00).mInlineNavTitle;
                if (textView != null) {
                    textView.setGravity(17);
                    textView.setTextColor(rbh.requireContext().getColor(2Yu.A0E(rbh.getContext())));
                    ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
                    if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        marginLayoutParams.leftMargin = 0;
                    }
                    textView.setText(rbh.getText(2131963957));
                    textView.setTextSize(0, DbV.A05(rbh).getDimension(R.dimen.abc_text_size_menu_header_material));
                    View view2 = ((IgReactDelegate) rbh.A00).mInlineNavBar;
                    if (view2 != null) {
                        view2.setBackgroundResource(R.drawable.iglive_ssi_banner);
                    }
                }
            }
            frameLayout = igReactDelegate.mFrameLayout;
            view = igReactDelegate.mInlineNavBar;
        } else {
            frameLayout = igReactDelegate.mFrameLayout;
            view = igReactDelegate.A03;
        }
        frameLayout.addView(view);
        C10323RqL rqL2 = igReactDelegate.A08;
        if (rqL2 != null) {
            RBH rbh2 = rqL2.A00;
            C7372Q9d q9d = ((IgReactDelegate) rbh2.A00).A03;
            if (q9d != null) {
                DbT.A16(rbh2.requireContext(), q9d, 2Yu.A0C(q9d.getContext()));
            }
        }
    }

    public static void A01(IgReactDelegate igReactDelegate) {
        FrameLayout frameLayout = igReactDelegate.mFrameLayout;
        if (!(frameLayout == null || igReactDelegate.A03 == null)) {
            frameLayout.removeAllViews();
            View A0C2 = DbT.A0C(LayoutInflater.from(igReactDelegate.A00.getContext()), frameLayout, R.layout.react_error_layout);
            A0C2.setBackgroundColor(-1);
            frameLayout.addView(A0C2);
            igReactDelegate.A03 = null;
        }
        igReactDelegate.A09 = true;
    }

    public final boolean CIn(int i, KeyEvent keyEvent) {
        if (this.A09) {
            return false;
        }
        this.A06.A01();
        return false;
    }

    public final boolean onBackPressed() {
        if (this.A0A || this.A09) {
            return false;
        }
        SSW A012 = this.A06.A01();
        Q6H q6h = A012.A0G;
        if (q6h == null) {
            0I1.A04("ReactInstanceManager", "Instance detached from instance manager");
            C13571Tcr tcr = A012.A03;
            if (tcr == null) {
                return true;
            }
            tcr.CNy();
            return true;
        }
        DeviceEventManagerModule deviceEventManagerModule = (DeviceEventManagerModule) q6h.A03(DeviceEventManagerModule.class);
        if (deviceEventManagerModule == null) {
            return true;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    public final void handleException(Exception exc) {
        A01(this);
    }
}
