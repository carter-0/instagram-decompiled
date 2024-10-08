package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.api.schemas.CollectionPrivacyModeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.save.model.SavedCollection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.I6y  reason: case insensitive filesystem */
public abstract class C56669I6y {
    public static void A00(Context context, AnonymousClass0iw r12, UserSession userSession, SavedCollection savedCollection, SavedCollection savedCollection2, Runnable runnable, List list) {
        UserSession userSession2 = userSession;
        1Ng A00 = AnonymousClass1Nd.A00(userSession);
        SavedCollection savedCollection3 = savedCollection;
        SavedCollection savedCollection4 = savedCollection2;
        List list2 = list;
        I32.A02(savedCollection, savedCollection2, list2);
        C57077INr.A00(A00, savedCollection, list2);
        AnonymousClass0iw r5 = r12;
        String moduleName = r12.getModuleName();
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("collections/bulk_move/");
        JSONArray jSONArray = new JSONArray();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            jSONArray.put(C51975G9x.A0k(it));
        }
        A0N.A9m("media_ids", jSONArray.toString());
        A0N.A9m("source_collection_id", savedCollection.A0F);
        A0N.A9m("target_collection_id", savedCollection2.A0F);
        A0N.A9m("module_name", moduleName);
        A0N.A0R(1XP.class, 1XY.class);
        1OC A0M = A0N.A0M();
        A0M.A00 = new H4U(2, context, r5, userSession2, savedCollection4, savedCollection3, runnable, list2);
        1ES.A03(A0M);
    }

    public static void A02(Context context, AnonymousClass0iw r13, UserSession userSession, SavedCollection savedCollection, Runnable runnable, List list) {
        List list2 = list;
        I32.A00(AnonymousClass1Nd.A00(userSession), savedCollection, list2);
        FdI fdI = new FdI(2, list2, savedCollection, userSession, r13, runnable, context);
        1Xj A0T = DbZ.A0T(list2, 0);
        int size = list2.size();
        0qQ.A0B(context, 0);
        0qQ.A0B(A0T, 2);
        C310336ap A0a = DbS.A0a();
        A0a.A0D = context.getResources().getQuantityString(R.plurals.save_home_bulk_edit_remove_from_collection_failure_notification, size);
        C51970G9q.A1L(A0T, A0a);
        A0a.A0L = true;
        A0a.A0A(fdI);
        A0a.A0G = AnonymousClass7TF.A0d(context.getResources(), 2131972371);
        Dbb.A1Q(A0a);
    }

    public static void A03(Context context, AnonymousClass0iw r12, UserSession userSession, SavedCollection savedCollection, Runnable runnable, List list) {
        Context context2 = context;
        UserSession userSession2 = userSession;
        SavedCollection savedCollection2 = savedCollection;
        Runnable runnable2 = runnable;
        List list2 = list;
        try {
            I32.A01(AnonymousClass1Nd.A00(userSession), savedCollection, list2);
            String str = savedCollection.A0F;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                A1C.add(C51971G9r.A0v(it));
            }
            String moduleName = r12.getModuleName();
            1NY A0N = DbU.A0N(userSession);
            A0N.A0K("collections/%s/edit/", new Object[]{str});
            A0N.A9m("removed_media_ids", 0mh.A00(A1C));
            A0N.A9m("module_name", moduleName);
            A0N.A0R(SavedCollection.class, C18689Vwn.class);
            1OC A0U = DbT.A0U(A0N, true);
            A0U.A00 = new C15608Ufa(3, context2, userSession2, runnable2, savedCollection2, list2, r12);
            1ES.A03(A0U);
        } catch (IOException unused) {
            A02(context2, r12, userSession, savedCollection, runnable, list2);
        }
    }

    public static void A06(Context context, AnonymousClass0iw r9, UserSession userSession, SavedCollection savedCollection, List list) {
        I32.A01(AnonymousClass1Nd.A00(userSession), savedCollection, list);
        Context context2 = context;
        I6V.A02(context2, (1Xj) AnonymousClass7TE.A13(list), new C57277IVm(4, savedCollection, context2, list, userSession, r9), list.size());
    }

    public static void A07(Context context, AnonymousClass0iw r9, UserSession userSession, Runnable runnable, List list) {
        UserSession userSession2 = userSession;
        1Ng A00 = AnonymousClass1Nd.A00(userSession);
        List list2 = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C55116HcP.A00(userSession, C243373Ym.SAVED, C243373Ym.NOT_SAVED, C51966G9m.A0t(it));
        }
        A00.A00(new C57077INr(C54665HMw.ALL_MEDIA_AUTO_COLLECTION, (String) null, list));
        AnonymousClass0iw r6 = r9;
        String moduleName = r9.getModuleName();
        1NY A0N = DbU.A0N(userSession);
        A0N.A0A("collections/bulk_remove/");
        JSONArray jSONArray = new JSONArray();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jSONArray.put(C51975G9x.A0k(it2));
        }
        A0N.A9m("media_ids", jSONArray.toString());
        A0N.A9m("module_name", moduleName);
        A0N.A0R(1XP.class, 1XY.class);
        1OC A0M = A0N.A0M();
        A0M.A00 = new C54236H4f(4, list2, r6, userSession2, context, runnable);
        1ES.A03(A0M);
    }

    public static void A01(Context context, AnonymousClass0iw r28, UserSession userSession, SavedCollection savedCollection, Runnable runnable, String str, List list, int i) {
        UserSession userSession2 = userSession;
        SavedCollection savedCollection2 = savedCollection;
        List list2 = list;
        I32.A01(AnonymousClass1Nd.A00(userSession2), savedCollection2, list2);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A1C.add(C51971G9r.A0v(it));
        }
        Context context2 = context;
        AnonymousClass0iw r19 = r28;
        Runnable runnable2 = runnable;
        String str2 = str;
        int i2 = i;
        try {
            String str3 = savedCollection2.A0F;
            H4Y h4y = new H4Y(context, r28, userSession, savedCollection, runnable, new C57987Ijg(context2, r19, userSession2, savedCollection2, runnable2, str2, list2, i2), list, i);
            1NY A00 = C56641I5w.A00((CollectionPrivacyModeEnum) null, userSession2, (Boolean) null, false, str2, r19.getModuleName(), (String) null, (String) A1C.get(0), (String) null, (String) null, A1C);
            A00.A0A("collections/create_and_move/");
            1OC A0T = DbT.A0T(A00, "source_collection_id", str3);
            H51.A00(A0T, h4y, userSession2, 12);
            1ES.A03(A0T);
        } catch (IOException unused) {
            I32.A00(AnonymousClass1Nd.A00(userSession2), savedCollection2, list2);
            I6V.A03(context2, (1Xj) AnonymousClass7TE.A13(list2), new C57274IVj(context2, r19, userSession2, savedCollection2, runnable2, str2, list2, i2), list2.size());
        }
    }

    public static void A04(Context context, AnonymousClass0iw r20, UserSession userSession, SavedCollection savedCollection, String str, List list, int i) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        List list2 = list;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            A1C.add(C51971G9r.A0v(it));
        }
        Context context2 = context;
        AnonymousClass0iw r5 = r20;
        UserSession userSession2 = userSession;
        SavedCollection savedCollection2 = savedCollection;
        String str2 = str;
        int i2 = i;
        try {
            String str3 = str2;
            C56641I5w.A03((CollectionPrivacyModeEnum) null, new H4Y(context2, r5, userSession2, savedCollection2, (Runnable) null, new C57985Ije(context2, r5, userSession2, savedCollection2, str2, list2, i2), list2, i2), userSession2, str3, r5.getModuleName(), (String) A1C.get(0), A1C, false);
        } catch (IOException unused) {
            I6V.A02(context2, (1Xj) AnonymousClass7TE.A13(list2), new C57271IVg(context2, r5, userSession2, savedCollection2, str2, list2, i2), list2.size());
        }
    }

    public static void A05(Context context, AnonymousClass0iw r8, UserSession userSession, SavedCollection savedCollection, List list) {
        try {
            I32.A00(AnonymousClass1Nd.A00(userSession), savedCollection, list);
            String str = savedCollection.A0F;
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A1C.add(C51971G9r.A0v(it));
            }
            String moduleName = r8.getModuleName();
            1NY A0N = DbU.A0N(userSession);
            A0N.A0K("collections/%s/edit/", new Object[]{str});
            A0N.A9m("added_media_ids", 0mh.A00(A1C));
            A0N.A9m("module_name", moduleName);
            A0N.A0R(SavedCollection.class, C18689Vwn.class);
            1OC A0U = DbT.A0U(A0N, true);
            A0U.A00 = new C54236H4f(3, context, r8, userSession, savedCollection, list);
            1ES.A03(A0U);
        } catch (IOException unused) {
            A06(context, r8, userSession, savedCollection, list);
        }
    }
}
