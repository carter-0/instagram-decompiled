package com.facebook.video.grootplayer.loggersdk.debug;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass7TE;
import X.C11203SFd;
import X.C66580MXl;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SharedVideoLoggerWatchTimeDebugDialog$lifecycleCallbacks$1 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ C11203SFd A00;

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public SharedVideoLoggerWatchTimeDebugDialog$lifecycleCallbacks$1(C11203SFd sFd) {
        this.A00 = sFd;
    }

    public final void onActivityPaused(Activity activity) {
        C11203SFd sFd = this.A00;
        View view = sFd.A01;
        if (view != null) {
            WindowManager windowManager = sFd.A02;
            if (windowManager != null) {
                windowManager.removeView(view);
            }
            sFd.A06.set(false);
        }
    }

    public final void onActivityResumed(Activity activity) {
        Context context;
        Object obj;
        C11203SFd sFd = this.A00;
        AtomicBoolean atomicBoolean = sFd.A06;
        if (!atomicBoolean.get() && (context = sFd.A00) != null) {
            Object systemService = context.getSystemService("window");
            0qQ.A0C(systemService, AnonymousClass000.A00(14));
            sFd.A02 = (WindowManager) systemService;
            Context context2 = sFd.A00;
            if (context2 != null) {
                obj = context2.getSystemService("layout_inflater");
            } else {
                obj = null;
            }
            0qQ.A0C(obj, "null cannot be cast to non-null type android.view.LayoutInflater");
            sFd.A01 = ((LayoutInflater) obj).inflate(R.layout.shared_video_logger_watch_time_debug_view, (ViewGroup) null);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2038, 24, -3);
            WindowManager windowManager = sFd.A02;
            if (windowManager != null) {
                windowManager.addView(sFd.A01, layoutParams);
            }
            View view = sFd.A01;
            if (view != null) {
                View findViewById = view.findViewById(R.id.watch_time_table_view);
                0qQ.A0C(findViewById, "null cannot be cast to non-null type android.widget.TableLayout");
                ((ViewGroup) findViewById).removeAllViews();
                View view2 = sFd.A01;
                if (view2 == null) {
                    throw AnonymousClass7TE.A0z("mRootView is null.");
                } else if (sFd.A00 != null) {
                    ViewGroup viewGroup = (ViewGroup) view2.findViewById(R.id.watch_time_table_view);
                    TableLayout.LayoutParams layoutParams2 = new TableLayout.LayoutParams(-1, -2);
                    layoutParams2.setMargins(10, 0, 0, 0);
                    TableRow tableRow = new TableRow(sFd.A00);
                    TextView textView = new TextView(sFd.A00);
                    textView.setLayoutParams(new TableRow.LayoutParams(-2, -2));
                    textView.setPadding(20, 5, 0, 5);
                    textView.setText("TOT_TIME");
                    textView.setTextColor(-256);
                    TextView textView2 = new TextView(sFd.A00);
                    textView2.setLayoutParams(new TableRow.LayoutParams(-2, -1));
                    textView2.setPadding(20, 5, 0, 5);
                    textView2.setText("EVENT");
                    textView2.setTextColor(-65536);
                    TextView textView3 = new TextView(sFd.A00);
                    textView3.setLayoutParams(new TableRow.LayoutParams(-1, -1));
                    textView3.setPadding(20, 5, 0, 5);
                    textView3.setText("EL_TIME");
                    textView3.setTextColor(-16776961);
                    TextView textView4 = new TextView(sFd.A00);
                    textView4.setLayoutParams(new TableRow.LayoutParams(-1, -1));
                    textView4.setPadding(20, 5, 0, 5);
                    int length = "VID".length() - 6;
                    int i = 0;
                    if (0 < length) {
                        i = length;
                    }
                    textView4.setText(C66580MXl.A0z("VID", i));
                    textView4.setTextColor(-16711936);
                    tableRow.addView(textView);
                    tableRow.addView(textView2);
                    tableRow.addView(textView3);
                    tableRow.addView(textView4);
                    tableRow.setLayoutParams(layoutParams2);
                    if (viewGroup != null) {
                        viewGroup.addView(tableRow, 0);
                    }
                    sFd.A04 = AnonymousClass7TE.A1E();
                    sFd.A03 = AnonymousClass7TE.A1E();
                    atomicBoolean.set(true);
                } else {
                    throw AnonymousClass7TE.A0z("mContext is null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("mRootView is null.");
            }
        }
    }
}
