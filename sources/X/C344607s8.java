package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7s8  reason: invalid class name and case insensitive filesystem */
public final class C344607s8 implements Handler.Callback {
    public C344617s9 A00;
    public final Handler A01;
    public final Looper A02;
    public final HashMap A03;
    public final HashMap A04;

    public final void A00(C344487rw r7) {
        Handler handler = this.A01;
        if (handler != null) {
            handler.removeMessages(1, r7);
            HashMap hashMap = this.A03;
            if (0qQ.A0K(hashMap.get(r7), true)) {
                hashMap.put(r7, false);
                handler.sendMessage(handler.obtainMessage(2, r7));
            }
            handler.sendMessageDelayed(handler.obtainMessage(1, r7), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        }
    }

    public final boolean handleMessage(Message message) {
        Number number;
        Message message2 = message;
        0qQ.A0B(message2, 0);
        int i = message2.what;
        if (i == 1) {
            HashMap hashMap = this.A04;
            Object obj = message2.obj;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            hashMap.put(obj, Long.valueOf(System.currentTimeMillis()));
            HashMap hashMap2 = this.A03;
            Object obj2 = message2.obj;
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            hashMap2.put(obj2, true);
            C344617s9 r2 = this.A00;
            if (r2 != null) {
                Object obj3 = message2.obj;
                0qQ.A0C(obj3, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                C344487rw r1 = (C344487rw) obj3;
                0qQ.A0B(r1, 0);
                C344457rt r22 = r2.A00;
                C344037rD r3 = r22.A04;
                if (r3 != null) {
                    r3.CjJ((long) r1.hashCode(), "media_pipeline_render_stuck", r1.B0U(), (Map) null);
                }
                r22.A03.A00(C368978td.GL_RENDER_MONITOR_ELEMENT_STUCK);
            }
        } else if (i == 2) {
            HashMap hashMap3 = this.A04;
            Object obj4 = message2.obj;
            0qQ.A0C(obj4, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
            Number number2 = (Number) hashMap3.get(obj4);
            if (number2 != null) {
                long currentTimeMillis = (System.currentTimeMillis() - number2.longValue()) + LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                C344617s9 r12 = this.A00;
                if (r12 != null) {
                    Object obj5 = message2.obj;
                    0qQ.A0C(obj5, "null cannot be cast to non-null type com.facebook.onecamera.components.mediapipeline.gl.context.GlRenderMonitorElement");
                    C344487rw r32 = (C344487rw) obj5;
                    0qQ.A0B(r32, 0);
                    C344037rD r6 = r12.A00.A04;
                    if (r6 != null) {
                        HashMap hashMap4 = new HashMap();
                        hashMap4.put("render_stuck_time", String.valueOf(currentTimeMillis));
                        r6.CjJ((long) r32.hashCode(), "media_pipeline_render_stuck_time", r32.B0U(), hashMap4);
                        return true;
                    }
                }
            }
        } else if (i == 3) {
            HashMap hashMap5 = this.A04;
            for (Object next : hashMap5.keySet()) {
                0qQ.A07(next);
                C344487rw r9 = (C344487rw) next;
                if (0qQ.A0K(this.A03.get(r9), true) && (number = (Number) hashMap5.get(r9)) != null) {
                    long currentTimeMillis2 = (System.currentTimeMillis() - number.longValue()) + LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
                    C344617s9 r13 = this.A00;
                    if (r13 != null) {
                        0qQ.A0B(r9, 0);
                        C344037rD r132 = r13.A00.A04;
                        if (r132 != null) {
                            HashMap hashMap6 = new HashMap();
                            hashMap6.put("render_stuck_time", String.valueOf(currentTimeMillis2));
                            r132.CjJ((long) r9.hashCode(), "media_pipeline_render_stuck_forever", r9.B0U(), hashMap6);
                        }
                    }
                }
            }
            hashMap5.clear();
            this.A03.clear();
            return true;
        }
        return true;
    }

    public C344607s8(Looper looper) {
        Handler handler;
        this.A02 = looper;
        if (looper != null) {
            handler = new Handler(looper, this);
        } else {
            handler = null;
        }
        this.A01 = handler;
        this.A04 = new HashMap();
        this.A03 = new HashMap();
    }
}
