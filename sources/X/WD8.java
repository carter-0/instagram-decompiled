package X;

import android.content.Context;
import android.os.Handler;
import android.widget.SeekBar;
import com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class WD8 implements SeekBar.OnSeekBarChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public WD8(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = obj;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int i2 = i;
        switch (this.A00) {
            case 0:
                C307786Rm r9 = (C307786Rm) this.A01;
                C276544tV r10 = (C276544tV) this.A02;
                VUN vun = (VUN) C307476Qg.A06(r9, r10);
                if (vun != null) {
                    V4Z v4z = vun.A02;
                    if (v4z != null) {
                        v4z.A00 = i2;
                        List list = v4z.A03;
                        ArrayList<Object> A0r = AnonymousClass7TG.A0r(list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            String A18 = AnonymousClass7TE.A18(it);
                            if (A18 != null) {
                                A0r.add(00l.A0G("/parameter", 00l.A0G("/value", A18)));
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                        VQM vqm = VQM.A01;
                        if (vqm == null) {
                            vqm = new VQM();
                            VQM.A01 = vqm;
                        }
                        Iterator it2 = vqm.A00.iterator();
                        while (it2.hasNext()) {
                            CommonSparkAvatarPreviewController commonSparkAvatarPreviewController = (CommonSparkAvatarPreviewController) it2.next();
                            float f = ((float) i2) / 100.0f;
                            HashMap hashMap = new HashMap();
                            for (Object put : A0r) {
                                hashMap.put(put, Float.valueOf(f));
                            }
                            FoaLiveEditingProvider foaLiveEditingProvider = commonSparkAvatarPreviewController.A00;
                            if (foaLiveEditingProvider != null) {
                                C18741VzM vzM = foaLiveEditingProvider.A02;
                                if (vzM == null) {
                                    0qQ.A0F("commonLiveEditingProvider");
                                    throw AnonymousClass00P.createAndThrow();
                                }
                                vzM.A0B.A0C(hashMap);
                            }
                        }
                    }
                    V4Z v4z2 = vun.A02;
                    if (v4z2 != null && !v4z2.A05) {
                        C277014uI A0A = r10.A0A(42);
                        AnonymousClass4CZ r0 = AnonymousClass12W.A01;
                        AnonymousClass7TE.A1Z(new MHP(r9, r10, A0A, (AnonymousClass4D7) null, i2), 19E.A02(AnonymousClass12y.A00));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Handler handler = C17136VJl.A00;
                VMD vmd = (VMD) this.A03;
                handler.removeMessages(0, vmd);
                vmd.A00 = new VVF((C307786Rm) this.A01, (C276544tV) this.A02, i2);
                AnonymousClass7TE.A1S(handler, vmd, 0);
                return;
            case 2:
                0qQ.A0B(seekBar, 0);
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) this.A01;
                boolean z2 = z;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onProgressChanged(seekBar, i2, z2);
                }
                if (z) {
                    C53989GxX.A00(C3019160o.A01(seekBar), seekBar.getMax(), i2);
                    return;
                }
                return;
            default:
                C19499Wal wal = (C19499Wal) this.A03;
                wal.A01 = i2;
                ((C357928a5) this.A02).Dhb(wal, i2);
                return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        switch (this.A00) {
            case 2:
                0qQ.A0B(seekBar, 0);
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) this.A01;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStartTrackingTouch(seekBar);
                    return;
                }
                return;
            case 3:
                ((C357928a5) this.A02).Dha((C19499Wal) this.A03);
                return;
            default:
                return;
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        V4Z v4z;
        switch (this.A00) {
            case 0:
                C307786Rm r4 = (C307786Rm) this.A01;
                C276544tV r2 = (C276544tV) this.A02;
                VUN vun = (VUN) C307476Qg.A06(r4, r2);
                if (vun != null && (v4z = vun.A02) != null && v4z.A05) {
                    C277014uI A0A = r2.A0A(42);
                    AnonymousClass4CZ r0 = AnonymousClass12W.A01;
                    AnonymousClass7TE.A1Z(new C66172MGj((Object) r2, (Object) v4z, (Object) r4, (Object) A0A, (AnonymousClass4D7) null, 2), 19E.A02(AnonymousClass12y.A00));
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = (SeekBar.OnSeekBarChangeListener) this.A01;
                if (onSeekBarChangeListener != null) {
                    onSeekBarChangeListener.onStopTrackingTouch((SeekBar) this.A02);
                    return;
                }
                return;
            default:
                C18534Vtm vtm = XAT.A00;
                Context context = (Context) this.A01;
                0qQ.A0A(context);
                C19499Wal wal = (C19499Wal) this.A03;
                2eQ.A07(wal.A03, vtm.A00(context, 2131967804, wal.A01, wal.A02));
                ((C357928a5) this.A02).DhZ(wal);
                return;
        }
    }
}
