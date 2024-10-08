package X;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.bugreporter.BugReportComposerViewModel;
import com.instagram.bugreporter.BugReporterActivity;
import com.instagram.bugreporter.model.BugReport;

/* renamed from: X.OtM  reason: case insensitive filesystem */
public final class C71936OtM implements 0lT {
    public Activity A00;
    public Dialog A01;
    public Dialog A02;
    public BugReportComposerViewModel A03;
    public C74547Pwg A04;
    public BugReport A05;
    public NMP A06;
    public final 0lg A07;

    public final void Ctd(Activity activity) {
    }

    public final void Cte(Activity activity) {
    }

    public final void Ctf(Activity activity) {
        0qQ.A0B(activity, 0);
        if (activity.isFinishing() && (activity instanceof BugReporterActivity) && this.A05 == null && AnonymousClass2Bh.A00()) {
            0lU.A08(this);
        }
    }

    public final void Ctm(Activity activity) {
        0qQ.A0B(activity, 0);
        this.A00 = activity;
        if (activity instanceof BugReporterActivity) {
            this.A05 = null;
        }
        if (this.A05 != null) {
            int color = activity.getColor(R.color.bugreporter_take_screenshot);
            Activity activity2 = this.A00;
            if (activity2 != null) {
                View inflate = LayoutInflater.from(activity2).inflate(R.layout.bugreporter_screen_capture_button, (ViewGroup) null, false);
                0qQ.A0C(inflate, "null cannot be cast to non-null type android.widget.ImageButton");
                ImageView imageView = (ImageView) inflate;
                imageView.setImageResource(R.drawable.take_screenshot_icon);
                2eS.A01(imageView);
                C71403Ok2.A01(imageView, 15, this);
                Activity activity3 = this.A00;
                if (activity3 != null) {
                    Dialog dialog = new Dialog(activity3);
                    dialog.setContentView(imageView);
                    Window window = dialog.getWindow();
                    if (window != null) {
                        window.addFlags(40);
                        window.clearFlags(2);
                        window.setGravity(85);
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        Activity activity4 = this.A00;
                        if (activity4 != null) {
                            attributes.x = activity4.getResources().getDimensionPixelOffset(R.dimen.account_discovery_bottom_gap);
                            Activity activity5 = this.A00;
                            if (activity5 != null) {
                                attributes.y = activity5.getResources().getDimensionPixelOffset(R.dimen.abc_list_item_height_material);
                                window.setAttributes(attributes);
                                this.A02 = dialog;
                                View inflate2 = LayoutInflater.from(this.A00).inflate(R.layout.bugreporter_cancel_banner, (ViewGroup) null, false);
                                0qQ.A0C(inflate2, "null cannot be cast to non-null type android.widget.Button");
                                TextView textView = (TextView) inflate2;
                                textView.setText(2131954345);
                                textView.setBackgroundColor(color);
                                C71403Ok2.A01(textView, 16, this);
                                Activity activity6 = this.A00;
                                if (activity6 != null) {
                                    Dialog dialog2 = new Dialog(activity6);
                                    this.A01 = dialog2;
                                    dialog2.setContentView(textView);
                                    Dialog dialog3 = this.A01;
                                    if (dialog3 != null) {
                                        Window window2 = dialog3.getWindow();
                                        if (window2 != null) {
                                            window2.addFlags(40);
                                            window2.clearFlags(2);
                                            window2.setGravity(48);
                                            WindowManager.LayoutParams attributes2 = window2.getAttributes();
                                            attributes2.width = -1;
                                            attributes2.height = -2;
                                            window2.setAttributes(attributes2);
                                            Dialog dialog4 = this.A02;
                                            if (dialog4 != null) {
                                                AnonymousClass0fN.A00(dialog4);
                                                Dialog dialog5 = this.A01;
                                                if (dialog5 != null) {
                                                    AnonymousClass0fN.A00(dialog5);
                                                    return;
                                                }
                                                throw AnonymousClass7TE.A0z("Required value was null.");
                                            }
                                            throw AnonymousClass7TE.A0z("Required value was null.");
                                        }
                                        throw AnonymousClass7TE.A0z("Required value was null.");
                                    }
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final void Ctn(Activity activity) {
    }

    public final void Cto(Activity activity) {
    }

    public final void Ctp(Activity activity, boolean z) {
    }

    public static final void A00(Bitmap bitmap, C71936OtM otM) {
        C67623Mqv mqv = C67620Mqs.A04;
        0lg r7 = otM.A07;
        Activity activity = otM.A00;
        if (activity != null) {
            BugReport bugReport = otM.A05;
            if (bugReport != null) {
                BugReportComposerViewModel bugReportComposerViewModel = otM.A03;
                if (bugReportComposerViewModel != null) {
                    C74547Pwg pwg = otM.A04;
                    if (pwg == null) {
                        0qQ.A0F("userFlowLoggerV2");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    NMP nmp = new NMP(activity, bitmap, bugReportComposerViewModel, pwg, bugReport, r7);
                    otM.A06 = nmp;
                    nmp.A02(new Void[0]);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void Cth(Activity activity) {
        NMP nmp = this.A06;
        if (nmp != null) {
            nmp.A06();
        }
        this.A06 = null;
        Dialog dialog = this.A02;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.A02 = null;
        Dialog dialog2 = this.A01;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        this.A01 = null;
        this.A00 = null;
    }

    public C71936OtM(0lg r1) {
        this.A07 = r1;
    }
}
