package com.instagram.debug.quickexperiment;

import X.002;
import X.0KC;
import X.0Tu;
import X.0lg;
import X.0mC;
import X.0qQ;
import X.0tM;
import X.0tS;
import X.0yN;
import X.0yO;
import X.182;
import X.183;
import X.1AA;
import X.1AW;
import X.2Ob;
import X.2Ru;
import X.2Yu;
import X.AnonymousClass0Dg;
import X.AnonymousClass1Nd;
import X.AnonymousClass5I0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C21258XRd;
import X.C267704c4;
import X.C293395kf;
import X.C309516Yo;
import X.C355148Ov;
import X.C367608rH;
import X.C367618rI;
import X.C50989Fmc;
import X.C59689JTv;
import X.C66580MXl;
import X.C66581MXm;
import X.C66583MXo;
import X.C71098OcY;
import X.DbS;
import X.DbV;
import X.DbX;
import X.PR7;
import X.PR9;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.refresh.AppRestartUtil;
import com.instagram.debug.devoptions.refresh.DevOptionsRefreshEvent;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStore;
import com.instagram.debug.quickexperiment.storage.QuickExperimentDebugStoreManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

public class QuickExperimentHelper {
    public static final double ALMOST_LOADED_NAMES_RATIO = 0.5d;
    public static final Object PARAMS_MAP_CACHE_LOCK = new Object();
    public static final String TAG = "QuickExperimentHelper";
    public static List mCachedExperimentParameters;
    public static C267704c4 mCachedParamsMap;

    public static C50989Fmc createSimpleMenuItem(Context context, 0lg r6, 0yN r7, QuickExperimentDebugStore quickExperimentDebugStore, 2Ru r9) {
        0yN r4 = r7;
        C50989Fmc fmc = new C50989Fmc(context, (View.OnClickListener) null, (CharSequence) getLabel(r6, r7, quickExperimentDebugStore));
        fmc.A05 = new QuickExperimentHelper$$ExternalSyntheticLambda6(context, r6, r4, r4.universeName, r4.name, fmc, quickExperimentDebugStore, r9);
        return fmc;
    }

    public static PR9 createSwitchItem(0lg r6, 0yN r7, QuickExperimentDebugStore quickExperimentDebugStore, 2Ru r9) {
        0yN r3 = r7;
        PR9 pr9 = new PR9((CompoundButton.OnCheckedChangeListener) null, (CharSequence) getLabel(r6, r7, quickExperimentDebugStore), AnonymousClass7TE.A1a(peek(r6, r7).value));
        QuickExperimentHelper$$ExternalSyntheticLambda2 quickExperimentHelper$$ExternalSyntheticLambda2 = new QuickExperimentHelper$$ExternalSyntheticLambda2(r3, quickExperimentDebugStore, pr9, r6, r9);
        QuickExperimentHelper$$ExternalSyntheticLambda3 quickExperimentHelper$$ExternalSyntheticLambda3 = new QuickExperimentHelper$$ExternalSyntheticLambda3(r6, r3);
        pr9.A08 = quickExperimentHelper$$ExternalSyntheticLambda2;
        pr9.A07 = quickExperimentHelper$$ExternalSyntheticLambda3;
        return pr9;
    }

    public static /* synthetic */ boolean lambda$createSwitchItem$3(0lg r5, 0yN r6, View view) {
        if (view != null) {
            Context context = view.getContext();
            UserSession userSession = (UserSession) r5;
            AnonymousClass7TF.A1B(context, 1, userSession);
            C355148Ov r1 = new C355148Ov(context, userSession, (Integer) null, false);
            r1.A02(getContextMenuItems(view, r6));
            r1.showAsDropDown(view, 0, 0);
        }
        return true;
    }

    /* renamed from: com.instagram.debug.quickexperiment.QuickExperimentHelper$7  reason: invalid class name */
    public abstract /* synthetic */ class AnonymousClass7 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$mobileconfig$factory$MobileConfigValueSource;
        public static final /* synthetic */ int[] $SwitchMap$com$instagram$configuration$intf$SynchronizationResult;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|(2:9|10)|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0024 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0029 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x003c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0045 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x004e */
        static {
            /*
                X.5kf[] r0 = X.C293395kf.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                $SwitchMap$com$instagram$configuration$intf$SynchronizationResult = r2
                r5 = 1
                r2[r5] = r5     // Catch:{ NoSuchFieldError -> 0x000c }
            L_0x000c:
                r4 = 2
                r0 = 0
                r2[r0] = r4     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r3 = 3
                r2[r3] = r3     // Catch:{ NoSuchFieldError -> 0x0013 }
            L_0x0013:
                r1 = 4
                r2[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                com.facebook.mobileconfig.factory.MobileConfigValueSource[] r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                $SwitchMap$com$facebook$mobileconfig$factory$MobileConfigValueSource = r2
                com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0024 }
                X.C66583MXo.A1K(r0, r2, r5)     // Catch:{ NoSuchFieldError -> 0x0024 }
            L_0x0024:
                com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.SERVER     // Catch:{ NoSuchFieldError -> 0x0029 }
                X.C66583MXo.A1K(r0, r2, r4)     // Catch:{ NoSuchFieldError -> 0x0029 }
            L_0x0029:
                com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.OVERRIDE     // Catch:{ NoSuchFieldError -> 0x002e }
                X.C66583MXo.A1K(r0, r2, r3)     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__ACCESSED_BEFORE_MC_INIT     // Catch:{ NoSuchFieldError -> 0x0033 }
                X.C66583MXo.A1K(r0, r2, r1)     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__ACCESSED_AFTER_MC_DISPOSE     // Catch:{ NoSuchFieldError -> 0x003c }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003c }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x003c }
            L_0x003c:
                com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__SERVER_RETURNED_NULL     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r0 = 6
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__NO_DATA_ON_DISK     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0 = 7
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                com.facebook.mobileconfig.factory.MobileConfigValueSource r0 = com.facebook.mobileconfig.factory.MobileConfigValueSource.DEFAULT__MISSING_SERVER_VALUE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0 = 8
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.QuickExperimentHelper.AnonymousClass7.<clinit>():void");
        }
    }

    public class ValueAndSource {
        public final Object defaultValue;
        public final Object latestValue;
        public final Object value;
        public final MobileConfigValueSource valueSource;

        public ValueAndSource(Object obj, Object obj2, Object obj3, MobileConfigValueSource mobileConfigValueSource) {
            this.value = obj;
            this.latestValue = obj2;
            this.defaultValue = obj3;
            this.valueSource = mobileConfigValueSource;
        }
    }

    public static List getAllExperiments() {
        ArrayList arrayList;
        synchronized (PARAMS_MAP_CACHE_LOCK) {
            List list = mCachedExperimentParameters;
            arrayList = list;
            if (list == null) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                C267704c4 paramsMap = getParamsMap();
                arrayList = A1C;
                if (paramsMap != null) {
                    for (AnonymousClass5I0 createExperimentParameterFromParamsMapEntry : paramsMap.A03) {
                        A1C.add(createExperimentParameterFromParamsMapEntry(createExperimentParameterFromParamsMapEntry));
                    }
                    arrayList = A1C;
                    if (mCachedParamsMap != null) {
                        mCachedExperimentParameters = A1C;
                        arrayList = A1C;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        throw new java.lang.Exception(java.lang.String.format("Unknown unitType(%d) or configIndex(%d) from specifier (%d)", new java.lang.Object[]{java.lang.Integer.valueOf(r2), java.lang.Integer.valueOf(r3), java.lang.Long.valueOf(r4)}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        X.0KC.A0M(TAG, "Failed to get category with specifier:%d", r3, new java.lang.Object[]{java.lang.Long.valueOf(r4)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005e, code lost:
        return X.C21258XRd.A0d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C21258XRd getCategory(X.0yN r7) {
        /*
            long r4 = r7.mobileConfigSpecifier
            r0 = 32
            long r6 = r4 >>> r0
            r0 = 65535(0xffff, double:3.23786E-319)
            long r6 = r6 & r0
            int r3 = (int) r6
            r0 = 54
            long r6 = r4 >>> r0
            r0 = 63
            long r6 = r6 & r0
            int r2 = (int) r6
            r0 = 3
            if (r2 >= r0) goto L_0x0017
            r2 = 1
        L_0x0017:
            int[][] r0 = X.XYV.A01     // Catch:{ IndexOutOfBoundsException -> 0x0030 }
            r0 = r0[r2]     // Catch:{ IndexOutOfBoundsException -> 0x0030 }
            r1 = r0[r3]     // Catch:{ IndexOutOfBoundsException -> 0x0030 }
            if (r1 < 0) goto L_0x002d
            X.XRd[] r0 = X.C21258XRd.values()     // Catch:{ IndexOutOfBoundsException -> 0x0030 }
            int r0 = r0.length     // Catch:{ IndexOutOfBoundsException -> 0x0030 }
            if (r1 >= r0) goto L_0x002d
            X.XRd[] r0 = X.C21258XRd.values()     // Catch:{ IndexOutOfBoundsException -> 0x0030 }
            r0 = r0[r1]     // Catch:{ IndexOutOfBoundsException -> 0x0030 }
            return r0
        L_0x002d:
            X.XRd r0 = X.C21258XRd.A0d     // Catch:{ IndexOutOfBoundsException -> 0x0030 }
            return r0
        L_0x0030:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ 0UC -> 0x004c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ 0UC -> 0x004c }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ 0UC -> 0x004c }
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}     // Catch:{ 0UC -> 0x004c }
            java.lang.String r0 = "Unknown unitType(%d) or configIndex(%d) from specifier (%d)"
            java.lang.String r1 = java.lang.String.format(r0, r1)     // Catch:{ 0UC -> 0x004c }
            X.0UC r0 = new X.0UC     // Catch:{ 0UC -> 0x004c }
            r0.<init>(r1)     // Catch:{ 0UC -> 0x004c }
            throw r0     // Catch:{ 0UC -> 0x004c }
        L_0x004c:
            r3 = move-exception
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "QuickExperimentHelper"
            java.lang.String r0 = "Failed to get category with specifier:%d"
            X.0KC.A0M(r1, r0, r3, r2)
            X.XRd r0 = X.C21258XRd.A0d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.QuickExperimentHelper.getCategory(X.0yN):X.XRd");
    }

    public static 1AA getDeviceSessionMobileConfig() {
        183 r0 = 183.A01;
        if (r0 == null) {
            return null;
        }
        return r0.A01().A01.A00;
    }

    public static 0mC getForceQESyncCallback(Context context, Boolean bool) {
        return new QuickExperimentHelper$$ExternalSyntheticLambda5(context, bool);
    }

    public static 0mC getForceQESyncCallbackWithResult(Context context, Function function) {
        return new QuickExperimentHelper$$ExternalSyntheticLambda7(context, function);
    }

    public static int getInputType(0yN r4) {
        int i = (int) ((r4.mobileConfigSpecifier >>> 48) & 63);
        if (i == 2) {
            return 4098;
        }
        if (i == 4) {
            return ReactTextInputManager.INPUT_TYPE_KEYBOARD_NUMBERED;
        }
        return 1;
    }

    public static double getNamedParamsRatio(C267704c4 r4) {
        List<AnonymousClass5I0> list = r4.A03;
        int i = 0;
        for (AnonymousClass5I0 r1 : list) {
            if (C71098OcY.A03(r1.A00) && C71098OcY.A03(r1.A01)) {
                i++;
            }
        }
        return ((double) i) / ((double) list.size());
    }

    public static String getNiceUniverseName(String str) {
        return str.replaceAll("^(ig_|android_|launcher_)+", "").replaceAll("(_launcher|_universe)$", "").replace("_", " ");
    }

    public static C267704c4 getParamsMap(1AA r0, boolean z) {
        if (z) {
            r0.A0D();
        }
        return r0.A0B();
    }

    public static Dialog getSimpleDialog(Context context, 0lg r10, final 0yN r11, String str, String str2, C50989Fmc fmc, QuickExperimentDebugStore quickExperimentDebugStore, 2Ru r16) {
        final EditText editText = new EditText(context);
        final 0yN r4 = r11;
        editText.setInputType(getInputType(r11));
        final 0lg r8 = r10;
        editText.setText(String.valueOf(peek(r10, r11).value));
        final C50989Fmc fmc2 = fmc;
        final QuickExperimentDebugStore quickExperimentDebugStore2 = quickExperimentDebugStore;
        final 2Ru r9 = r16;
        final QuickExperimentDebugStore quickExperimentDebugStore3 = quickExperimentDebugStore;
        final C50989Fmc fmc3 = fmc;
        final 0lg r14 = r8;
        final 2Ru r15 = r9;
        final 0yN r3 = r11;
        final QuickExperimentDebugStore quickExperimentDebugStore4 = quickExperimentDebugStore2;
        final C50989Fmc fmc4 = fmc2;
        final 0lg r6 = r8;
        final 2Ru r7 = r9;
        return new AlertDialog.Builder(context).setTitle(r11.universeName).setMessage(002.A0g("Override ", r11.name, ":")).setView(editText).setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(r4);
                if (!TextUtils.isEmpty(AnonymousClass7TF.A0f(editText))) {
                    quickExperimentDebugStore2.putOverriddenParameter(r4, AnonymousClass7TF.A0f(editText));
                    fmc2.A08 = QuickExperimentHelper.getLabel(r8, r4, quickExperimentDebugStore2);
                    r9.notifyDataSetChanged();
                }
                dialogInterface.dismiss();
            }
        }).setNeutralButton("Client Default", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(r11);
                QuickExperimentDebugStore quickExperimentDebugStore = quickExperimentDebugStore3;
                0yN r1 = r11;
                quickExperimentDebugStore.putOverriddenParameter(r1, String.valueOf(r1.getDefaultValue()));
                fmc3.A08 = QuickExperimentHelper.getLabel(r14, r11, quickExperimentDebugStore3);
                r15.notifyDataSetChanged();
                dialogInterface.dismiss();
            }
        }).setNegativeButton("No Override", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                RecentQuickExperimentManager.markRecentExperimentParameter(r3);
                quickExperimentDebugStore4.removeOverriddenParameter(r3);
                fmc4.A08 = QuickExperimentHelper.getLabel(r6, r3, quickExperimentDebugStore4);
                r7.notifyDataSetChanged();
                dialogInterface.dismiss();
            }
        }).create();
    }

    public static /* synthetic */ void lambda$setupMenuItems$1(UniverseCollapseTracker universeCollapseTracker, 0yN r2, Runnable runnable, View view) {
        universeCollapseTracker.toggleCollapsedState(r2.universeName);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static 0yN createExperimentParameterFromParamsMapEntry(AnonymousClass5I0 r9) {
        long A00 = r9.A00();
        int i = r9.A08;
        String str = r9.A01;
        if (str.isEmpty()) {
            str = 002.A0R("_", String.valueOf(r9.A04));
        }
        String str2 = r9.A00;
        if (str2.isEmpty()) {
            str2 = 002.A0R("_", String.valueOf(r9.A03));
        }
        if (i == 2) {
            AnonymousClass7TG.A1N(str, str2);
            return new 0yN(str, str2, 0yO.A03, A00);
        }
        AnonymousClass7TG.A1N(str, str2);
        return new 0yN(str, str2, 0yO.A02, A00);
    }

    public static void forceUserQESync(Context context, 183 r3, UserSession userSession, 0mC r5) {
        int i;
        if (0tS.A00().A0O() || 0tS.A00().A0P()) {
            i = 2131958337;
        } else {
            if (0tS.A00().A0Q()) {
                i = 2131957728;
            }
            r3.A07(userSession, true);
            r3.A00(userSession, 0yO.A03).A00(r5);
            AnonymousClass1Nd.A00(userSession).A00(DevOptionsRefreshEvent.INSTANCE);
        }
        C59689JTv.A08(context, i, 1);
        r3.A07(userSession, true);
        r3.A00(userSession, 0yO.A03).A00(r5);
        AnonymousClass1Nd.A00(userSession).A00(DevOptionsRefreshEvent.INSTANCE);
    }

    public static List getContextMenuItems(final View view, final 0yN r8) {
        String str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new C367618rI((Drawable) null, new C367608rH() {
            public void onTouch(MotionEvent motionEvent) {
            }

            public void onClick() {
                ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("QE Universe Name", r8.universeName));
                    C59689JTv.A09(view.getContext(), 002.A0R("Copied to clipboard: ", r8.universeName));
                }
            }
        }, "Copy Universe Name"));
        A1C.add(new C367618rI((Drawable) null, new C367608rH() {
            public void onTouch(MotionEvent motionEvent) {
            }

            public void onClick() {
                ClipboardManager clipboardManager = (ClipboardManager) view.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("QE Universe Name", r8.name));
                    C59689JTv.A09(view.getContext(), 002.A0R("Copied to clipboard: ", r8.name));
                }
            }
        }, "Copy Param Name"));
        0tS A00 = 0tS.A00();
        final HashSet A12 = C66580MXl.A12((Collection) A00.A24.CDM(A00, 0tS.A4G[253]));
        final String A0g = 002.A0g(r8.universeName, ".", r8.name);
        if (A12.contains(A0g)) {
            str = "Remove from Launcher Test Rig";
        } else {
            str = "Add to Launcher Test Rig";
        }
        A1C.add(new C367618rI((Drawable) null, new C367608rH() {
            public void onTouch(MotionEvent motionEvent) {
            }

            public void onClick() {
                boolean contains = A12.contains(A0g);
                Set set = A12;
                String str = A0g;
                if (contains) {
                    set.remove(str);
                } else {
                    set.add(str);
                }
                0tS A00 = 0tS.A00();
                Set set2 = A12;
                0qQ.A0B(set2, 0);
                DbS.A1a(A00, set2, A00.A24, 0tS.A4G, 253);
                C59689JTv.A09(view.getContext(), "Launcher Test Rig Defaults updated");
            }
        }, str));
        return A1C;
    }

    public static String getLabel(0lg r5, 0yN r6, QuickExperimentDebugStore quickExperimentDebugStore) {
        String str;
        ValueAndSource peek = peek(r5, r6);
        MobileConfigValueSource mobileConfigValueSource = peek.valueSource;
        switch (mobileConfigValueSource.ordinal()) {
            case 0:
                str = "unknown";
                break;
            case 1:
                str = "server";
                break;
            case 2:
                str = QuickExperimentDumperPlugin.OVERRIDE_CMD;
                break;
            case 3:
                str = "default[null server value]";
                break;
            case 4:
                str = "default[before mc init]";
                break;
            case 5:
                str = "default[no data]";
                break;
            case 6:
                str = "default[after mc dispose]";
                break;
            case 7:
                str = "default[missing server value]";
                break;
            default:
                str = 002.A0c("ValueSource[", "]", mobileConfigValueSource.getSource());
                break;
        }
        if ((mobileConfigValueSource == MobileConfigValueSource.SERVER || mobileConfigValueSource == MobileConfigValueSource.OVERRIDE) && 2Ob.A00(peek.value, peek.defaultValue)) {
            str = 002.A0R(str, ",default");
        }
        if (2Ob.A00(peek.value, peek.latestValue)) {
            str = 002.A0R(str, ",latest");
        }
        return 002.A13(r6.name.replace("_", " "), " = ", peek.value.toString(), "\n(", str, ")");
    }

    public static List getOverriddenExperimentParameters(QuickExperimentDebugStore quickExperimentDebugStore) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (0yN r1 : getAllExperiments()) {
            if (quickExperimentDebugStore.isParameterOverridden(r1)) {
                A1C.add(r1);
            }
        }
        return A1C;
    }

    public static /* synthetic */ void lambda$createSwitchItem$2(0yN r1, QuickExperimentDebugStore quickExperimentDebugStore, PR9 pr9, 0lg r4, 2Ru r5, CompoundButton compoundButton, boolean z) {
        RecentQuickExperimentManager.markRecentExperimentParameter(r1);
        quickExperimentDebugStore.putOverriddenParameter(r1, String.valueOf(z));
        pr9.A0B = getLabel(r4, r1, quickExperimentDebugStore);
        r5.notifyDataSetChanged();
    }

    public static /* synthetic */ void lambda$getForceQESyncCallback$7(C293395kf r1, Context context, Boolean bool) {
        String str;
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            str = "Network Error";
        } else if (ordinal == 0) {
            str = "Did not sync";
        } else if (ordinal == 3) {
            str = "Fetched latest launcher values; nothing updated";
        } else if (ordinal != 2) {
            return;
        } else {
            if (bool.booleanValue()) {
                AppRestartUtil.restartAppHard(context);
                return;
            }
            str = "launcher values will take effect at next cold start";
        }
        C59689JTv.A09(context, str);
    }

    public static /* synthetic */ void lambda$getForceQESyncCallback$8(Context context, Boolean bool, C293395kf r4) {
        r4.getClass();
        new Handler(context.getMainLooper()).post(new QuickExperimentHelper$$ExternalSyntheticLambda8(r4, context, bool));
    }

    public static /* synthetic */ void lambda$getForceQESyncCallbackWithResult$5(C293395kf r3, Context context, Function function) {
        String str;
        int ordinal = r3.ordinal();
        boolean z = true;
        if (ordinal == 1) {
            str = "Network Error";
        } else if (ordinal == 0) {
            str = "Did not sync";
        } else if (ordinal != 3) {
            if (ordinal == 2) {
                str = "launcher values will take effect at next cold start";
            }
            if (!(r3 == C293395kf.SUCCESS_DID_UPDATE || r3 == C293395kf.SUCCESS_DID_NOT_UPDATE)) {
                z = false;
            }
            function.apply(Boolean.valueOf(z));
        } else {
            str = "Fetched latest launcher values; nothing updated";
        }
        C59689JTv.A09(context, str);
        z = false;
        function.apply(Boolean.valueOf(z));
    }

    public static /* synthetic */ void lambda$getForceQESyncCallbackWithResult$6(Context context, Function function, C293395kf r4) {
        r4.getClass();
        new Handler(context.getMainLooper()).post(new QuickExperimentHelper$$ExternalSyntheticLambda4(r4, context, function));
    }

    public static /* synthetic */ void lambda$setupMenuItems$0(UserSession userSession, Fragment fragment, 0yN r3, View view) {
        AnonymousClass0Dg.A00(AnonymousClass7TE.A0a(), userSession);
        C309516Yo A0M = DbS.A0M(fragment.requireActivity(), userSession);
        A0M.A0E(QuickExperimentEditFragment.createWithUniverse(r3.universeName));
        A0M.A08();
        A0M.A04();
    }

    public static ValueAndSource peek(0lg r10, 0yN r11) {
        1AA A02;
        Object valueOf;
        Object defaultValue = r11.getDefaultValue();
        long j = r11.mobileConfigSpecifier;
        if (r11 instanceof 0tM) {
            A02 = 182.A02(r10, j);
        } else {
            A02 = 1AW.A02(j);
        }
        Object obj = null;
        if (A02 == null) {
            return new ValueAndSource((Object) null, (Object) null, defaultValue, MobileConfigValueSource.UNKNOWN);
        }
        0Tu A0G = C66581MXm.A0G();
        A0G.A03 = true;
        0Tu A00 = 0Tu.A00(A0G);
        A00.A02 = true;
        0Tu A0G2 = C66581MXm.A0G();
        A0G2.A03 = true;
        0Tu A002 = 0Tu.A00(A0G2);
        A002.A01 = true;
        int i = (int) ((j >>> 48) & 63);
        if (i == 1) {
            obj = Boolean.valueOf(A02.Ah0(A00, j));
            valueOf = Boolean.valueOf(A02.Ah0(A002, j));
        } else if (i == 2) {
            obj = Long.valueOf(A02.BOa(A00, j));
            valueOf = Long.valueOf(A02.BOa(A002, j));
        } else if (i == 3) {
            obj = A02.C1v(A00, j);
            valueOf = A02.C1v(A002, j);
        } else if (i != 4) {
            valueOf = null;
        } else {
            obj = Double.valueOf(A02.Aym(A00, j));
            valueOf = Double.valueOf(A02.Aym(A002, j));
        }
        return new ValueAndSource(obj, valueOf, defaultValue, A00.A00.A00);
    }

    public static List setupMenuItems(Fragment fragment, UserSession userSession, UniverseCollapseTracker universeCollapseTracker, Runnable runnable, List list, 2Ru r17, boolean z, boolean z2) {
        Object createSimpleMenuItem;
        String str;
        String str2;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (userSession == null) {
            str2 = "getMenuItems yield with unexpected null user session.";
        } else {
            Context context = fragment.getContext();
            if (context == null) {
                str2 = "Returning empty menu items due to null parent context, probably the research result returned after user left the search UI";
            } else {
                QuickExperimentDebugStore overrideStore = QuickExperimentDebugStoreManager.getOverrideStore(userSession);
                HashSet A1F = AnonymousClass7TE.A1F();
                C21258XRd xRd = null;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    0yN r8 = (0yN) it.next();
                    C21258XRd category = getCategory(r8);
                    if (category != xRd && z) {
                        if (xRd != null) {
                            DbV.A1W(A1C, true);
                        }
                        C66583MXo.A1J(category.A01, A1C);
                        xRd = category;
                    }
                    String niceUniverseName = getNiceUniverseName(r8.universeName);
                    if (!A1F.contains(r8.universeName)) {
                        if (z2) {
                            str = fragment.getString(2131963109);
                        } else {
                            str = "";
                        }
                        PR7 pr7 = new PR7(niceUniverseName, str);
                        if (z2) {
                            pr7.A03 = new QuickExperimentHelper$$ExternalSyntheticLambda0(userSession, fragment, r8);
                        }
                        if (universeCollapseTracker != null) {
                            boolean isCollapsed = universeCollapseTracker.isCollapsed(r8.universeName);
                            int i = R.drawable.instagram_chevron_down_pano_filled_24;
                            if (isCollapsed) {
                                i = R.drawable.instagram_chevron_right_pano_filled_24;
                            }
                            Drawable drawable = context.getDrawable(i);
                            DbX.A11(context, drawable, 2Yu.A0H(context, R.attr.igds_color_primary_icon));
                            pr7.A02 = drawable;
                            pr7.A04 = new QuickExperimentHelper$$ExternalSyntheticLambda1(universeCollapseTracker, r8, runnable);
                        }
                        A1C.add(pr7);
                        A1F.add(r8.universeName);
                    }
                    if (universeCollapseTracker == null || !universeCollapseTracker.isCollapsed(r8.universeName)) {
                        2Ru r1 = r17;
                        if (((int) ((r8.mobileConfigSpecifier >>> 48) & 63)) == 1) {
                            createSimpleMenuItem = createSwitchItem(userSession, r8, overrideStore, r1);
                        } else {
                            createSimpleMenuItem = createSimpleMenuItem(context, userSession, r8, overrideStore, r1);
                        }
                        A1C.add(createSimpleMenuItem);
                    }
                }
                return A1C;
            }
        }
        0KC.A0D(TAG, str2);
        return A1C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (getNamedParamsRatio(r3) > 0.5d) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C267704c4 getParamsMap() {
        /*
            java.lang.Object r8 = PARAMS_MAP_CACHE_LOCK
            monitor-enter(r8)
            X.4c4 r3 = mCachedParamsMap     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x0031
            X.1AA r7 = getDeviceSessionMobileConfig()     // Catch:{ all -> 0x0035 }
            r6 = 0
            if (r7 == 0) goto L_0x0033
            X.4c4 r3 = r7.A0B()     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0033
            double r1 = getNamedParamsRatio(r3)     // Catch:{ all -> 0x0035 }
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x002f
            r7.A0D()     // Catch:{ all -> 0x0035 }
            X.4c4 r3 = r7.A0B()     // Catch:{ all -> 0x0035 }
            if (r3 == 0) goto L_0x0033
            double r1 = getNamedParamsRatio(r3)     // Catch:{ all -> 0x0035 }
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
        L_0x002f:
            mCachedParamsMap = r3     // Catch:{ all -> 0x0035 }
        L_0x0031:
            monitor-exit(r8)     // Catch:{ all -> 0x0035 }
            return r3
        L_0x0033:
            monitor-exit(r8)     // Catch:{ all -> 0x0035 }
            return r6
        L_0x0035:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0035 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.quickexperiment.QuickExperimentHelper.getParamsMap():X.4c4");
    }

    public static List setupMenuItems(Fragment fragment, UserSession userSession, List list, 2Ru r11, boolean z) {
        return setupMenuItems(fragment, userSession, (UniverseCollapseTracker) null, (Runnable) null, list, r11, z, false);
    }
}
