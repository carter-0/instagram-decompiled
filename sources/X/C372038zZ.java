package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchGesturesListener$HitTestCallback;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.8zZ  reason: invalid class name and case insensitive filesystem */
public final class C372038zZ {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public HandlerThread A04;
    public ScaleGestureDetector A05;
    public C39705A5w A06;
    public ALp A07;
    public A8p A08;
    public A87 A09;
    public AH8 A0A;
    public C372048za A0B;
    public WeakReference A0C;
    public boolean A0D = false;
    public boolean A0E;
    public final Handler A0F = new Handler(Looper.getMainLooper());
    public final C372028zY A0G;
    public final List A0H;
    public final List A0I;
    public final Map A0J;
    public final Map A0K;
    public final Map A0L;
    public final Map A0M;
    public final Set A0N;
    public final Set A0O;
    public final Set A0P;
    public final Set A0Q;
    public final TouchGesturesListener$HitTestCallback A0R = new AS3(this);

    public static long A00(C372038zZ r5, Gesture.GestureType gestureType) {
        long j = r5.A03;
        r5.A03 = 1 + j;
        Map map = r5.A0K;
        Long valueOf = Long.valueOf(j);
        map.put(gestureType, valueOf);
        r5.A0L.put(valueOf, C390819rt.HIT_TESTING);
        return j;
    }

    public static void A01(C372038zZ r4) {
        List list = r4.A0I;
        LinkedHashSet<MotionEvent> linkedHashSet = new LinkedHashSet<>(list);
        list.clear();
        r4.A0N.addAll(linkedHashSet);
        for (MotionEvent motionEvent : linkedHashSet) {
            WeakReference weakReference = r4.A0C;
            if (!(weakReference == null || weakReference.get() == null)) {
                ((View) weakReference.get()).dispatchTouchEvent(motionEvent);
            }
        }
    }

    public static void A02(C372038zZ r1) {
        r1.A0K.clear();
        r1.A0L.clear();
        r1.A0M.clear();
        r1.A0I.clear();
        r1.A0O.clear();
        r1.A0N.clear();
        r1.A0H.clear();
        r1.A0D = false;
        r1.A01 = 0;
        r1.A00 = 0;
    }

    public static void A03(C372038zZ r2) {
        Set set = r2.A0Q;
        set.clear();
        if (r2.A0B.A05) {
            set.add(Gesture.GestureType.TAP);
        }
        if (r2.A0B.A01) {
            set.add(Gesture.GestureType.PAN);
        }
        if (r2.A0B.A02) {
            set.add(Gesture.GestureType.PINCH);
        }
        if (r2.A0B.A04) {
            set.add(Gesture.GestureType.ROTATE);
        }
        if (r2.A0B.A00) {
            set.add(Gesture.GestureType.LONG_PRESS);
        }
        if (r2.A0B.A03) {
            set.add(Gesture.GestureType.RAW_TOUCH);
            AH8 ah8 = r2.A0A;
            if (ah8 != null) {
                ah8.A08 = true;
            }
        }
    }

    public static void A04(C372038zZ r2, Gesture.GestureType gestureType) {
        Object remove;
        Object remove2;
        Map map = r2.A0K;
        if (map.containsKey(gestureType) && (remove = map.remove(gestureType)) != null && (remove2 = r2.A0L.remove(remove)) != null && remove2 == C390819rt.GESTURE_IS_HANDLED_BY_ENGINE) {
            r2.A00--;
        }
        Set set = r2.A0O;
        if (set.contains(gestureType)) {
            set.remove(gestureType);
        }
    }

    public static void A05(C372038zZ r3, Gesture gesture) {
        int ordinal;
        Set set;
        List list;
        Map map = r3.A0L;
        if (map.containsKey(Long.valueOf(gesture.id)) && (ordinal = ((C390819rt) map.get(Long.valueOf(gesture.id))).ordinal()) != 2) {
            if (ordinal == 3) {
                for (C41826B2h addGestureEvent : r3.A0G.A01()) {
                    addGestureEvent.addGestureEvent(gesture);
                }
                Gesture.GestureState gestureState = gesture.gestureState;
                if (gestureState == Gesture.GestureState.ENDED || gestureState == Gesture.GestureState.CANCELLED || gestureState == Gesture.GestureState.FAILED) {
                    Object gestureType = gesture.getGestureType();
                    if (gestureType == Gesture.GestureType.RAW_TOUCH) {
                        set = r3.A0P;
                        gestureType = Long.valueOf(gesture.id);
                    } else {
                        set = r3.A0O;
                    }
                    set.add(gestureType);
                }
            } else if (ordinal != 0) {
                Map map2 = r3.A0M;
                if (!map2.containsKey(Long.valueOf(gesture.id))) {
                    list = new LinkedList();
                    map2.put(Long.valueOf(gesture.id), list);
                } else {
                    list = (List) map2.get(Long.valueOf(gesture.id));
                }
                list.add(gesture);
            } else {
                r3.A01++;
                map.put(Long.valueOf(gesture.id), C390819rt.WAIT_HIT_TEST_RESULT);
                for (C41826B2h enqueueForHitTest : r3.A0G.A01()) {
                    enqueueForHitTest.enqueueForHitTest(gesture, r3.A0R);
                }
            }
        }
    }

    public static void A06(C372038zZ r1, TouchEvent touchEvent) {
        for (C41826B2h addTouchEvent : r1.A0G.A01()) {
            addTouchEvent.addTouchEvent(touchEvent);
        }
    }

    public static void A07(C372038zZ r2, Long l) {
        Object remove = r2.A0L.remove(l);
        if (remove != null && remove == C390819rt.GESTURE_IS_HANDLED_BY_ENGINE) {
            r2.A00--;
        }
        Set set = r2.A0P;
        if (set.contains(l)) {
            set.remove(l);
        }
    }

    public static boolean A08(C372038zZ r2, long j) {
        Map map = r2.A0L;
        Long valueOf = Long.valueOf(j);
        if (!map.containsKey(valueOf) || map.get(valueOf) != C390819rt.GESTURE_IS_HANDLED_BY_CLIENT) {
            return false;
        }
        return true;
    }

    public C372038zZ(C372028zY r9) {
        this.A0G = r9;
        this.A0Q = new HashSet();
        this.A0B = new C372048za(false, false, false, false, false, false, false);
        this.A0K = new HashMap();
        this.A0L = new HashMap();
        this.A0J = new HashMap();
        this.A0M = new HashMap();
        this.A0I = new LinkedList();
        this.A0H = new LinkedList();
        this.A0O = new HashSet();
        this.A0P = new HashSet();
        this.A0N = new LinkedHashSet();
    }
}
