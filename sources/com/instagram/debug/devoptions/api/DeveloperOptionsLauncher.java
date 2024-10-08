package com.instagram.debug.devoptions.api;

import X.0hq;
import X.1RH;
import X.1US;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.C273654mx;
import X.C358108aN;
import X.C59689JTv;
import X.DbS;
import X.Dba;
import X.PyB;
import X.PyC;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.section.localinjection.InjectMediaToolFragment;
import com.instagram.modal.ModalActivity;
import java.util.concurrent.Callable;

public class DeveloperOptionsLauncher {

    public interface VoltronCallbacks {
        void onFailure();

        void onSuccess();
    }

    public static /* synthetic */ Fragment lambda$launchMediaInjectionTool$0() {
        return new InjectMediaToolFragment();
    }

    public static void launchDirectInboxV2ExperimentSwitcherTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLauncherDeveloperOptionsModal(context, fragmentActivity, userSession, C273654mx.A00(2258));
    }

    public static void launchHomeDeliveryDebugTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, (0hq) null, fragmentActivity, userSession, new DeveloperOptionsLauncher$$ExternalSyntheticLambda3());
    }

    public static void launchMediaInjectionTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, (0hq) null, fragmentActivity, userSession, new DeveloperOptionsLauncher$$ExternalSyntheticLambda2());
    }

    public static void launchStoriesExperimentSwitcherTool(Context context, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, (0hq) null, fragmentActivity, userSession, new DeveloperOptionsLauncher$$ExternalSyntheticLambda0());
    }

    public static void loadAndLaunchDeveloperOptions(Context context, 0hq r2, FragmentActivity fragmentActivity, UserSession userSession) {
        loadAndLaunchDeveloperOption(context, r2, fragmentActivity, userSession, new DeveloperOptionsLauncher$$ExternalSyntheticLambda1());
    }

    public static void loadVoltronModule(FragmentActivity fragmentActivity, UserSession userSession, final VoltronCallbacks voltronCallbacks) {
        PyC pyC = new PyC(1US.A0M);
        pyC.A03 = AnonymousClass05K.A00;
        pyC.A02 = new C358108aN() {
            public void onFailure(String str, boolean z) {
                VoltronCallbacks.this.onFailure();
            }

            public void onSuccess() {
                try {
                    VoltronCallbacks.this.onSuccess();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        };
        pyC.A01 = fragmentActivity.getSupportFragmentManager();
        1RH.A00().A03(userSession, new PyB(pyC));
    }

    public static void loadAndLaunchDeveloperOption(final Context context, 0hq r3, final FragmentActivity fragmentActivity, final UserSession userSession, final Callable callable) {
        if (EndToEnd.A05()) {
            C59689JTv.A08(context, 2131958140, 1);
        } else {
            loadVoltronModule(fragmentActivity, userSession, new VoltronCallbacks() {
                public void onFailure() {
                    C59689JTv.A08(context, 2131957895, 1);
                }

                public void onSuccess() {
                    try {
                        Fragment fragment = (Fragment) callable.call();
                        if (fragment != null) {
                            Dba.A13(fragment, DbS.A0M(fragmentActivity, userSession));
                            return;
                        }
                        throw new NullPointerException();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }
    }

    public static void loadAndLauncherDeveloperOptionsModal(final Context context, final FragmentActivity fragmentActivity, final UserSession userSession, final String str) {
        if (EndToEnd.A05()) {
            C59689JTv.A08(context, 2131958140, 1);
        } else {
            loadVoltronModule(fragmentActivity, userSession, new VoltronCallbacks() {
                public void onFailure() {
                    C59689JTv.A08(context, 2131957895, 1);
                }

                public void onSuccess() {
                    String str = str;
                    Bundle A0a = AnonymousClass7TE.A0a();
                    Dba.A0K(fragmentActivity, A0a, userSession, ModalActivity.class, str).A0C(fragmentActivity);
                }
            });
        }
    }
}
