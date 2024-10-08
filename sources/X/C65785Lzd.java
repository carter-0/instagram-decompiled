package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Lzd  reason: case insensitive filesystem */
public final class C65785Lzd implements MUM {
    public final /* synthetic */ LPF A00;

    public final boolean Dkr(GalleryItem galleryItem, int i, boolean z) {
        List list;
        boolean z2;
        Integer num;
        String str;
        AnonymousClass7Hf r1;
        C62812Kmo krk;
        if (AnonymousClass7TF.A1W(galleryItem.A09, AnonymousClass05K.A0N)) {
            MVI mvi = this.A00.A08;
            if (mvi == null) {
                return false;
            }
            mvi.D0u();
            return true;
        }
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            LPF lpf = this.A00;
            UserSession userSession = lpf.A05;
            AnonymousClass9PQ.A02(new C64573LeF(), remoteMedia, userSession, AnonymousClass05K.A00, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass7TE.A1C(), true);
            Context context = lpf.A04;
            C361568gR r2 = lpf.A06;
            0qQ.A0B(r2, 2);
            r2.A03(context, remoteMedia, userSession, (String) null, new C59104J6m(36, (Object) remoteMedia, (Object) context, (Object) userSession), new MP8(context, 18));
        }
        Medium medium = galleryItem.A00;
        if (medium == null) {
            return false;
        }
        LPF lpf2 = this.A00;
        L1G l1g = lpf2.A00;
        if (l1g != null) {
            K6K k6k = l1g.A00;
            C60150JgV jgV = (C60150JgV) k6k.A0k.getValue();
            DirectThreadKey directThreadKey = k6k.A0J;
            if (z) {
                if (directThreadKey == null) {
                    str = "Expected DirectThreadKey shouldn't be null for optimistic upload";
                } else {
                    if (medium.A05()) {
                        if (jgV.A00.A00(C66647MaG.A03(directThreadKey), true)) {
                            AnonymousClass3Q2 A01 = AnonymousClass9T3.A01(JTQ.A0Z());
                            C51967G9n.A1O(A01, jgV.A02, medium.A05);
                            r1 = jgV.A01;
                            krk = new KRJ(medium, A01);
                        }
                    } else if (!medium.CeS()) {
                        str = "Attempt to optimistically upload unsupported media type";
                    } else if (jgV.A00.A00(C66647MaG.A03(directThreadKey), false)) {
                        AnonymousClass3Q2 A02 = AnonymousClass9T3.A02(JTQ.A0Z());
                        C51967G9n.A1O(A02, jgV.A02, medium.A05);
                        r1 = jgV.A01;
                        krk = new KRK(medium, A02);
                    }
                    r1.FMa(krk, directThreadKey);
                }
                0KC.A0C("DirectMediaGalleryOptimisticUploadViewModel", str);
            } else {
                AnonymousClass3Q2 r22 = (AnonymousClass3Q2) C51968G9o.A10(jgV.A02, medium.A05);
                if (r22 == null) {
                    0KC.A0D("DirectMediaGalleryOptimisticUploadViewModel", 002.A0O("No uploading pending media found for required id: ", medium.A05));
                } else {
                    jgV.A01.AGW(new KRJ(medium, r22));
                }
            }
            C60235Jhs A0L = JTQ.A0L(k6k);
            K6G A002 = K6K.A00(k6k);
            String str2 = null;
            if (A002 != null) {
                list = A002.A00();
            } else {
                list = null;
            }
            05G r7 = A0L.A02;
            if (((C61082JwK) r7.getValue()).A00 != AnonymousClass05K.A0C) {
                if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((GalleryItem) it.next()).A06()) {
                                z2 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z2 = false;
                C61082JwK jwK = (C61082JwK) r7.getValue();
                if (z2) {
                    num = AnonymousClass05K.A01;
                } else {
                    num = AnonymousClass05K.A00;
                }
                boolean z3 = jwK.A01;
                0qQ.A0B(num, 1);
                r7.FIA(new C61082JwK(z3, num, 21));
            }
            if (z) {
                AnonymousClass7IR r23 = new AnonymousClass7IR(k6k, AnonymousClass7TE.A0l(k6k.A0l));
                C254783t2 r12 = k6k.A0K;
                if (medium.A05()) {
                    str2 = "photo";
                } else if (medium.CeS()) {
                    str2 = MediaStreamTrack.VIDEO_TRACK_KIND;
                }
                r23.A01(r12, DbS.A0j(i), str2);
            }
        }
        MVI mvi2 = lpf2.A08;
        if (mvi2 == null || !mvi2.Dkq(medium, medium.A0X)) {
            return false;
        }
        return true;
    }

    public C65785Lzd(LPF lpf) {
        this.A00 = lpf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r1.A0Y.size() < r1.A02) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DSe(int r5, int r6, boolean r7) {
        /*
            r4 = this;
            X.LPF r1 = r4.A00
            X.MT1 r0 = r1.A02
            if (r0 == 0) goto L_0x0009
            r0.DSd(r5, r6)
        L_0x0009:
            X.LGD r3 = r1.A07
            X.LFd r0 = r1.A0A
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x002e
            com.instagram.ui.widget.gallery.GalleryView r1 = r1.A03
            java.lang.String r0 = "galleryView"
            if (r1 != 0) goto L_0x001f
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001f:
            int r0 = r1.A02
            if (r0 == 0) goto L_0x002e
            java.util.LinkedHashSet r0 = r1.A0Y
            int r2 = r0.size()
            int r1 = r1.A02
            r0 = 1
            if (r2 >= r1) goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            r3.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65785Lzd.DSe(int, int, boolean):void");
    }
}
