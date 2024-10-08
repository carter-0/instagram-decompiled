package com.instagram.debug.devoptions.helper;

import X.0qQ;
import X.0sr;
import X.0xY;
import X.0xa;
import X.11S;
import X.AnonymousClass000;
import X.AnonymousClass0lh;
import X.AnonymousClass2Bh;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C309516Yo;
import X.C50989Fmc;
import X.C66579MXk;
import X.C66581MXm;
import X.DbS;
import X.DbU;
import X.DbV;
import X.PR9;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class DevOptionsHelper implements AnonymousClass0lh {
    public static final Companion Companion = new Object();
    public final Map _optionNameToMenuItems = new HashMap();
    public final Map _optionNameToSwitchItems = new HashMap();

    public final class Companion {
        public final DevOptionsHelper getInstance(UserSession userSession) {
            0qQ.A0B(userSession, 0);
            return (DevOptionsHelper) userSession.A01(DevOptionsHelper.class, DevOptionsHelper$Companion$getInstance$1.INSTANCE);
        }

        public final void launchFragment(UserSession userSession, Activity activity, String str) {
            AnonymousClass7TF.A1H(userSession, activity);
            try {
                Fragment newInstance = Class.forName(str).newInstance();
                0qQ.A0C(newInstance, AnonymousClass000.A00(19));
                launchFragment(userSession, activity, newInstance, false);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        public final void removePinnedItemInPrefs(String str) {
            0qQ.A0B(str, 0);
            0xa A0d = DbV.A0d();
            List convertToArray = convertToArray(A0d.getString("rageshake_pinned_items_as_json", (String) null));
            convertToArray.remove(str);
            String A0w = C66581MXm.A0w(",", convertToArray);
            0xY AR4 = A0d.AR4();
            AR4.E5g("rageshake_pinned_items_as_json", A0w);
            AR4.apply();
        }

        private final List convertToArray(String str) {
            if (str == null) {
                return new ArrayList();
            }
            String[] A1b = DbU.A1b(new 11S(",").A03(str), 0);
            return 0sr.A1M(Arrays.copyOf(A1b, A1b.length));
        }

        private final String convertToString(List list) {
            return C66581MXm.A0w(",", list);
        }

        public static /* synthetic */ void launchFragment$default(Companion companion, UserSession userSession, Activity activity, Fragment fragment, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            companion.launchFragment(userSession, activity, fragment, z);
        }

        /* access modifiers changed from: private */
        public final boolean isPinnedItem(String str) {
            return convertToArray(DbV.A0d().getString("rageshake_pinned_items_as_json", (String) null)).contains(str);
        }

        /* access modifiers changed from: private */
        public final void storePinnedItemInPrefs(String str) {
            0xa A0d = DbV.A0d();
            List convertToArray = convertToArray(A0d.getString("rageshake_pinned_items_as_json", (String) null));
            convertToArray.add(str);
            String A0w = C66581MXm.A0w(",", convertToArray);
            0xY AR4 = A0d.AR4();
            AR4.E5g("rageshake_pinned_items_as_json", A0w);
            AR4.apply();
        }

        public final C50989Fmc addLongPressToPin(C50989Fmc fmc, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AnonymousClass7TG.A1N(fmc, onPinnedDevOptionItemAdded);
            if (!AnonymousClass2Bh.A00()) {
                fmc.A06 = new DevOptionsHelper$Companion$addLongPressToPin$1$1(fmc, onPinnedDevOptionItemAdded);
            }
            return fmc;
        }

        public final void addMenuItem(UserSession userSession, List list, C50989Fmc fmc, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AnonymousClass7TG.A1U(list, fmc, onPinnedDevOptionItemAdded);
            addLongPressToPin(fmc, onPinnedDevOptionItemAdded);
            list.add(fmc);
        }

        public final void addSwitchItem(UserSession userSession, List list, PR9 pr9, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AnonymousClass7TG.A1U(list, pr9, onPinnedDevOptionItemAdded);
            addLongPressToPin(pr9, onPinnedDevOptionItemAdded);
            list.add(pr9);
        }

        public final List getPinnedItems() {
            return convertToArray(DbV.A0d().getString("rageshake_pinned_items_as_json", (String) null));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }

        private final void launchFragment(UserSession userSession, Activity activity, Fragment fragment, boolean z) {
            DbS.A1X(activity);
            C309516Yo A0M = DbV.A0M(fragment, (FragmentActivity) activity, userSession);
            if (z) {
                A0M.A08();
            }
            A0M.A04();
        }

        public final PR9 addLongPressToPin(PR9 pr9, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
            AnonymousClass7TG.A1N(pr9, onPinnedDevOptionItemAdded);
            if (!AnonymousClass2Bh.A00()) {
                pr9.A07 = new DevOptionsHelper$Companion$addLongPressToPin$2$1(pr9, onPinnedDevOptionItemAdded);
            }
            return pr9;
        }
    }

    public interface OnPinnedDevOptionItemAdded {
        void onMenuItemAdded();
    }

    public static final DevOptionsHelper getInstance(UserSession userSession) {
        return Companion.getInstance(userSession);
    }

    public static final List getPinnedItems() {
        return Companion.getPinnedItems();
    }

    public static final void launchFragment(UserSession userSession, Activity activity, String str) {
        Companion.launchFragment(userSession, activity, str);
    }

    public static final void removePinnedItemInPrefs(String str) {
        Companion.removePinnedItemInPrefs(str);
    }

    public static final void addMenuItem(UserSession userSession, List list, C50989Fmc fmc, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        Companion companion = Companion;
        AnonymousClass7TG.A1U(list, fmc, onPinnedDevOptionItemAdded);
        companion.addLongPressToPin(fmc, onPinnedDevOptionItemAdded);
        list.add(fmc);
    }

    public static final void addSwitchItem(UserSession userSession, List list, PR9 pr9, OnPinnedDevOptionItemAdded onPinnedDevOptionItemAdded) {
        Companion companion = Companion;
        AnonymousClass7TG.A1U(list, pr9, onPinnedDevOptionItemAdded);
        companion.addLongPressToPin(pr9, onPinnedDevOptionItemAdded);
        list.add(pr9);
    }

    public final Map getMenuItemMap() {
        return this._optionNameToMenuItems;
    }

    public final Map getSwitchItemMap() {
        return this._optionNameToSwitchItems;
    }

    public void onSessionWillEnd() {
        this._optionNameToMenuItems.clear();
    }

    public final void storeItems(Context context, List list) {
        AnonymousClass7TG.A1N(context, list);
        if (this._optionNameToMenuItems.isEmpty() && list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (next instanceof C50989Fmc) {
                    C50989Fmc fmc = (C50989Fmc) next;
                    Object obj = fmc.A08;
                    if (obj == null) {
                        obj = context.getString(fmc.A04);
                    }
                    if (obj.toString().length() > 0) {
                        arrayList.add(next);
                    }
                }
            }
            ArrayList<C50989Fmc> A0p = AnonymousClass7TF.A0p(arrayList);
            for (Object next2 : arrayList) {
                0qQ.A0C(next2, C66579MXk.A00(1008));
                A0p.add(next2);
            }
            for (C50989Fmc fmc2 : A0p) {
                Map map = this._optionNameToMenuItems;
                Object obj2 = fmc2.A08;
                if (obj2 == null) {
                    obj2 = context.getString(fmc2.A04);
                }
                map.put(obj2.toString(), fmc2);
            }
        }
        if (this._optionNameToSwitchItems.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next3 : list) {
                if (next3 instanceof PR9) {
                    PR9 pr9 = (PR9) next3;
                    Object obj3 = pr9.A0B;
                    if (obj3 == null) {
                        obj3 = context.getString(pr9.A04);
                    }
                    if (obj3.toString().length() > 0) {
                        arrayList2.add(next3);
                    }
                }
            }
            ArrayList<PR9> A0p2 = AnonymousClass7TF.A0p(arrayList2);
            for (Object next4 : arrayList2) {
                0qQ.A0C(next4, C66579MXk.A00(1009));
                A0p2.add(next4);
            }
            for (PR9 pr92 : A0p2) {
                Map map2 = this._optionNameToSwitchItems;
                Object obj4 = pr92.A0B;
                if (obj4 == null) {
                    obj4 = context.getString(pr92.A04);
                }
                map2.put(obj4.toString(), pr92);
            }
        }
    }
}
