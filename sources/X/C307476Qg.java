package X;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.view.Choreographer;
import com.instagram.android.R;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Qg  reason: invalid class name and case insensitive filesystem */
public abstract class C307476Qg {
    public static final C276574tY A00 = new C307486Qh();

    public static C276744tp A05(C307786Rm r2) {
        C276744tp r0;
        if (r2 != null && (r0 = (C276744tp) r2.A01.get(R.id.bk_context_key_interpreter_extensions)) != null) {
            return r0;
        }
        C276744tp r02 = C64361Kj.A00().A0B;
        r02.getClass();
        return r02;
    }

    public static String A07(C307786Rm r2) {
        if (r2 == null) {
            return null;
        }
        return (String) r2.A01.get(R.id.bk_context_key_logging_id);
    }

    public static boolean A0B(C307786Rm r2) {
        if (r2 == null) {
            return false;
        }
        return Boolean.TRUE.equals(r2.A01.get(R.id.bk_context_key_is_signals_enabled));
    }

    public static WKW A00(C307786Rm r1, String str) {
        return (WKW) ((AbstractMap) r1.A00(R.id.bk_context_key_videos)).get(str);
    }

    public static C307786Rm A01(Context context, SparseArray sparseArray, C307446Qd r7, C229392nJ r8, String str) {
        SparseArray clone = r8.AMV().clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            clone.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        clone.put(R.id.bk_context_key_states, new HashMap());
        if (r7 == null) {
            r7 = new C307446Qd(C3034368u.A04(new C276544tV(-1)), C229652no.A00, C307436Qc.A00);
        }
        clone.put(R.id.bk_context_key_tree, r7);
        clone.put(R.id.bk_context_key_scoped_client_id_mapper, new C307766Rj());
        clone.put(R.id.bk_context_key_animations, new HashMap());
        clone.put(R.id.bk_context_key_timers, new HashMap());
        clone.put(R.id.bk_context_key_videos, new HashMap());
        clone.put(R.id.bk_context_key_cleanup_callbacks, new HashSet());
        clone.put(R.id.bk_context_key_logging_id, str);
        if (context.getApplicationContext() != null) {
            clone.put(R.id.bk_context_key_bind_manager, new C307776Rk(context));
        }
        if (clone.get(R.id.bk_context_key_performance_logger) == null) {
            clone.put(R.id.bk_context_key_performance_logger, C12778T6m.A00);
        }
        clone.put(R.id.bk_context_key_controller_by_server_id, Collections.synchronizedMap(new HashMap()));
        return new C307786Rm(context, clone, r8);
    }

    public static C307446Qd A02(C307786Rm r1) {
        return (C307446Qd) r1.A00(R.id.bk_context_key_tree);
    }

    public static AnonymousClass6RV A03(C307786Rm r2, String str) {
        Map map = (Map) r2.A01.get(R.id.bk_context_key_data_modules);
        if (map == null) {
            map = Collections.emptyMap();
        }
        return (AnonymousClass6RV) map.get(str);
    }

    public static AnonymousClass6RZ A04(C307786Rm r1, String str) {
        Map map = (Map) r1.A00(R.id.bk_context_key_legacy_data_modules);
        if (map == null) {
            return null;
        }
        return (AnonymousClass6RZ) map.get(str);
    }

    public static Object A06(C307786Rm r3, C276544tV r4) {
        Object A01 = r3.A01(A00, r4, R.id.bk_context_key_controller_associated_object);
        String A0C = r4.A0C();
        if (A0C != null) {
            ((Map) r3.A00(R.id.bk_context_key_controller_by_server_id)).put(A0C, A01);
        }
        return A01;
    }

    public static void A08(Animator animator, C307786Rm r2) {
        ((AbstractMap) r2.A00(R.id.bk_context_key_animations)).values().remove(animator);
    }

    public static void A09(C307786Rm r4) {
        HashMap hashMap = (HashMap) r4.A00(R.id.bk_context_key_animations);
        for (Animator cancel : ((AbstractMap) hashMap.clone()).values()) {
            cancel.cancel();
        }
        if (!hashMap.isEmpty()) {
            hashMap.clear();
        }
        HashMap hashMap2 = (HashMap) r4.A00(R.id.bk_context_key_timers);
        for (C49699F2k A002 : ((AbstractMap) hashMap2.clone()).values()) {
            A002.A00();
        }
        if (!hashMap2.isEmpty()) {
            1Kn.A02("BloksTimer", "Timer map is non-empty after cleanup!");
            hashMap2.clear();
        }
        ((AbstractMap) r4.A00(R.id.bk_context_key_videos)).clear();
        HashSet hashSet = (HashSet) r4.A00(R.id.bk_context_key_cleanup_callbacks);
        for (G5U cleanup : (Set) hashSet.clone()) {
            cleanup.cleanup();
        }
        hashSet.clear();
        C307446Qd A02 = A02(r4);
        A02.A0N = true;
        A02.A07 = null;
        A02.A03 = null;
        List list = A02.A0E;
        synchronized (list) {
            list.clear();
        }
        List list2 = A02.A0F;
        synchronized (list2) {
            list2.clear();
        }
        C307776Rk r0 = A02.A02;
        if (r0 != null) {
            r0.A00();
        }
        AnonymousClass6QX r2 = (AnonymousClass6QX) r4.A01.get(R.id.bk_context_key_render_callback_queue);
        if (r2 != null) {
            r2.A00 = true;
            ((Handler) r2.A05.getValue()).removeCallbacksAndMessages(r2.A03);
            Choreographer.getInstance().removeFrameCallback(r2.A02);
        }
    }

    public static boolean A0A(C307786Rm r2) {
        Boolean bool = (Boolean) r2.A01.get(R.id.bk_context_key_clip_children_bool);
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
