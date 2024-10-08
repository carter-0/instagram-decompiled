package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.BaseAdapter;
import com.instagram.common.gallery.Draft;
import com.instagram.common.gallery.GeneratedMediaMetadata;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.realtimeclient.RealtimeConstants;
import com.instagram.ui.widget.gallery.GalleryView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.JeM  reason: case insensitive filesystem */
public final class C60054JeM extends BaseAdapter implements C361688gd, C361658ga, MUN {
    public LR6 A00;
    public ConcurrentHashMap A01;
    public List A02 = AnonymousClass7TE.A1C();
    public final L5G A03;
    public final HashMap A04 = AnonymousClass7TE.A1E();
    public final HashMap A05 = AnonymousClass7TE.A1E();
    public final boolean A06;
    public final AnonymousClass0iw A07 = DbS.A0O("DirectGalleryGridAdapter");
    public final C355608Qq A08;

    public C60054JeM(C355608Qq r2, L5G l5g) {
        0qQ.A0B(l5g, 2);
        this.A08 = r2;
        this.A03 = l5g;
        this.A06 = 0oI.A0E(l5g.A00);
        this.A01 = new ConcurrentHashMap();
    }

    public final Integer A02(GalleryItem galleryItem) {
        0qQ.A0B(galleryItem, 0);
        LR6 lr6 = this.A00;
        if (lr6 == null) {
            return null;
        }
        int i = 0;
        Iterator it = lr6.A02.iterator();
        while (true) {
            if (it.hasNext()) {
                if (0qQ.A0K(it.next(), galleryItem)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return Integer.valueOf(i);
    }

    public final void A03(ArrayList arrayList) {
        HashMap hashMap = this.A04;
        hashMap.clear();
        Iterator A1G = AnonymousClass7TE.A1G(arrayList);
        while (A1G.hasNext()) {
            LR6 lr6 = (LR6) AnonymousClass7TF.A0a(A1G);
            String str = lr6.A01;
            hashMap.put(str, lr6);
            LR6 lr62 = this.A00;
            if (lr62 != null && 0qQ.A0K(lr62.A01, str)) {
                A00(this, lr6);
            }
        }
        if (this.A00 == null && !hashMap.isEmpty()) {
            A00(this, (LR6) arrayList.get(0));
        }
        0fE.A00(this, -2023625151);
    }

    public final int Bqm(int i) {
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r3 = r0.A02.indexOf(r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DLv(X.AnonymousClass9I9 r5, com.instagram.common.gallery.model.GalleryItem r6) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            boolean r0 = r4.A01(r6)
            if (r0 != 0) goto L_0x001e
            java.lang.Integer r1 = r6.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x001f
            X.L5G r0 = r4.A03
            com.instagram.ui.widget.gallery.GalleryView r0 = r0.A01
            X.MUM r2 = r0.A0F
            if (r2 == 0) goto L_0x001e
            boolean r1 = r5.A02
            r0 = -1
            r2.Dkr(r6, r0, r1)
        L_0x001e:
            return
        L_0x001f:
            X.LR6 r0 = r4.A00
            if (r0 == 0) goto L_0x001e
            java.util.List r0 = r0.A02
            int r3 = r0.indexOf(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L_0x001e
            if (r3 < 0) goto L_0x001e
            X.L5G r0 = r4.A03
            com.instagram.ui.widget.gallery.GalleryView r1 = r0.A01
            boolean r0 = r1.A0H
            if (r0 == 0) goto L_0x003f
            int r0 = r3 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L_0x003f:
            int r2 = r2.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            com.instagram.ui.widget.gallery.GalleryView.A03(r6, r1, r0)
            X.MUM r1 = r1.A0F
            if (r1 == 0) goto L_0x001e
            boolean r0 = r5.A02
            r1.Dkr(r6, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60054JeM.DLv(X.9I9, com.instagram.common.gallery.model.GalleryItem):void");
    }

    public final boolean DM5(View view, AnonymousClass9I9 r23, GalleryItem galleryItem) {
        MUM mum;
        MVI mvi;
        Integer num;
        View view2 = view;
        GalleryItem galleryItem2 = galleryItem;
        boolean A1U = AnonymousClass7TF.A1U(0, view2, galleryItem2);
        if (A01(galleryItem2) || (mum = this.A03.A01.A0F) == null) {
            return false;
        }
        C65785Lzd lzd = (C65785Lzd) mum;
        if (galleryItem2.A09 == AnonymousClass05K.A0N) {
            MVI mvi2 = lzd.A00.A08;
            if (mvi2 == null) {
                return false;
            }
            mvi2.D0u();
        } else {
            RemoteMedia remoteMedia = galleryItem2.A04;
            if (remoteMedia != null) {
                LPF lpf = lzd.A00;
                UserSession userSession = lpf.A05;
                AnonymousClass9PQ.A02(new C64573LeF(), remoteMedia, userSession, AnonymousClass05K.A01, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, AnonymousClass7TE.A1C(), A1U);
                Context context = lpf.A04;
                C361568gR r14 = lpf.A06;
                0qQ.A0B(r14, 2);
                r14.A03(context, remoteMedia, userSession, (String) null, new C59104J6m(36, (Object) remoteMedia, (Object) context, (Object) userSession), new MP8(context, 18));
                mvi = lpf.A08;
            } else if (galleryItem2.A00 == null) {
                return false;
            } else {
                LPF lpf2 = lzd.A00;
                C71012OYk.A00(C61890KQj.A00, C63234Ktf.A00(lpf2.A05));
                if (lpf2.A0A.A0F) {
                    GalleryView galleryView = lpf2.A03;
                    if (galleryView == null) {
                        0qQ.A0F("galleryView");
                        throw AnonymousClass00P.createAndThrow();
                    } else if (galleryView.A02 == 0 || galleryView.A03 == 0) {
                        lpf2.A04();
                        if (galleryView.A02 == 0) {
                            LPF.A00(lpf2);
                        } else {
                            galleryView.setMaxMultiSelectCount(0);
                        }
                        C60054JeM jeM = galleryView.A0C;
                        if (jeM != null) {
                            num = jeM.A02(galleryItem2);
                        } else {
                            num = null;
                        }
                        GalleryView.A03(galleryItem2, galleryView, num);
                    }
                } else {
                    mvi = lpf2.A08;
                }
            }
            if (mvi == null || mvi.DHW(view2, galleryItem2) != A1U) {
                return false;
            }
        }
        return true;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public static final void A00(C60054JeM jeM, LR6 lr6) {
        String str;
        int i;
        GalleryItem galleryItem;
        jeM.A00 = lr6;
        List list = jeM.A02;
        list.clear();
        L5G l5g = jeM.A03;
        GalleryView galleryView = l5g.A01;
        if (galleryView.A0L && lr6 != null) {
            LR6 lr62 = jeM.A00;
            if (lr62 != null) {
                i = lr62.A02.size();
            } else {
                i = 0;
            }
            2HZ A0B = C229632nm.A0B(C229632nm.A0C(0, i), 3);
            int i2 = A0B.A00;
            int i3 = A0B.A01;
            int i4 = A0B.A02;
            if (i4 <= 0 ? !(i4 >= 0 || i3 > i2) : i2 <= i3) {
                while (true) {
                    LR6 lr63 = jeM.A00;
                    if (!(lr63 == null || (galleryItem = (GalleryItem) lr63.A02.get(i2)) == null)) {
                        Context context = l5g.A00;
                        Date date = new Date(C64153LQs.A00.A01(galleryItem));
                        SimpleDateFormat simpleDateFormat = C362978ip.A00;
                        list.add(C362978ip.A00(AnonymousClass7TE.A16(context, 2131975436), AnonymousClass7TE.A16(context, 2131976949), (Calendar) null, date));
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2 += i4;
                }
            }
        }
        C60194JhD jhD = galleryView.A0D;
        if (jhD != null) {
            jhD.A03.Epw(lr6);
            LR6 lr64 = (LR6) jhD.A03.getValue();
            if (lr64 != null && (str = lr64.A00) != null) {
                jhD.A02.A05(str, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, (0sP) null);
            }
        }
    }

    private final boolean A01(GalleryItem galleryItem) {
        L5G l5g = this.A03;
        UserSession userSession = l5g.A01.A07;
        Context context = l5g.A00;
        if (userSession == null) {
            return false;
        }
        boolean A042 = galleryItem.A04();
        boolean A062 = galleryItem.A06();
        int A002 = C64153LQs.A00(galleryItem);
        if (!A042 || !A062 || !AJ5.A06(userSession, A002)) {
            return false;
        }
        AnonymousClass0iw r2 = this.A07;
        AnonymousClass7TG.A1N(userSession, r2);
        AnonymousClass9PQ.A08(r2, userSession, AnonymousClass000.A00(1489), RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, (Map) null);
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A09(2131956208);
        String A16 = AnonymousClass7TE.A16(context, 2131956207);
        A0Y.A0Z(new C50025FJk(context, userSession, 10), AnonymousClass7TE.A16(context, 2131956205), A16);
        A0Y.A04();
        A0Y.A0H((DialogInterface.OnClickListener) null, 2131956206);
        DbT.A1V(A0Y);
        return true;
    }

    public final int AJv(int i) {
        return i / this.A03.A01.A01;
    }

    public final int AJz(int i) {
        return i * this.A03.A01.A01;
    }

    public final int Bom() {
        LR6 lr6 = this.A00;
        int i = 0;
        if (!(lr6 == null || lr6.A02.size() == 0)) {
            i = lr6.A02.size() / this.A03.A01.A01;
        }
        if (this.A03.A01.A0H) {
            return i + 1;
        }
        return i;
    }

    public final List Bqr() {
        return this.A02;
    }

    public final int getCount() {
        int i;
        LR6 lr6 = this.A00;
        if (lr6 != null) {
            i = lr6.A02.size();
        } else {
            i = 0;
        }
        if (this.A03.A01.A0H) {
            return i + 1;
        }
        return i;
    }

    public final Object getItem(int i) {
        List list;
        if (!this.A03.A01.A0H) {
            LR6 lr6 = this.A00;
            if (lr6 != null) {
                list = lr6.A02;
            }
            return null;
        } else if (i == 0) {
            return new GalleryItem((Draft) null, (GeneratedMediaMetadata) null, (Medium) null, (RemoteMedia) null, (AnonymousClass8y3) null, (ImageUrl) null, (C352218Cl) null, (C349307zv) null, AnonymousClass05K.A0N, AnonymousClass7TG.A0j(), -1);
        } else {
            LR6 lr62 = this.A00;
            if (lr62 != null) {
                list = lr62.A02;
                i--;
            }
            return null;
        }
        return list.get(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a2, code lost:
        if (r1 == r2) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x017d, code lost:
        if (r3 != null) goto L_0x017f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r24, android.view.View r25, android.view.ViewGroup r26) {
        /*
            r23 = this;
            r4 = r25
            r0 = 2
            r1 = r26
            X.0qQ.A0B(r1, r0)
            r6 = r23
            if (r25 != 0) goto L_0x0204
            int r0 = com.instagram.ui.widget.mediapicker.MediaPickerItemView.A0X
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r1)
            r1 = 0
            X.L5G r0 = r6.A03
            com.instagram.ui.widget.gallery.GalleryView r0 = r0.A01
            float r0 = r0.A00
            com.instagram.ui.widget.mediapicker.MediaPickerItemView r4 = new com.instagram.ui.widget.mediapicker.MediaPickerItemView
            r4.<init>((android.content.Context) r2, (X.MUN) r1, (float) r0)
            X.LQQ r0 = new X.LQQ
            r0.<init>(r6, r4)
            r4.setTag(r0)
        L_0x0026:
            int r1 = r6.getCount()
            int r1 = r1 + -1
            r7 = r24
            if (r7 != r1) goto L_0x004e
            X.L5G r1 = r6.A03
            com.instagram.ui.widget.gallery.GalleryView r1 = r1.A01
            X.JhD r2 = r1.A0D
            if (r2 == 0) goto L_0x004e
            X.05G r1 = r2.A03
            java.lang.Object r1 = r1.getValue()
            X.LR6 r1 = (X.LR6) r1
            if (r1 == 0) goto L_0x004e
            java.lang.String r5 = r1.A00
            if (r5 == 0) goto L_0x004e
            X.8gT r3 = r2.A02
            r2 = 0
            java.lang.String r1 = "direct"
            r3.A05(r5, r1, r2)
        L_0x004e:
            java.lang.Object r14 = r6.getItem(r7)
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.common.gallery.model.GalleryItem"
            X.0qQ.A0C(r14, r1)
            com.instagram.common.gallery.model.GalleryItem r14 = (com.instagram.common.gallery.model.GalleryItem) r14
            X.8Qq r8 = r6.A08
            X.L5G r1 = r6.A03
            com.instagram.ui.widget.gallery.GalleryView r1 = r1.A01
            com.instagram.common.session.UserSession r3 = r1.A07
            r7 = 0
            boolean r2 = X.AnonymousClass7TF.A1U(r7, r14, r8)
            X.9I9 r18 = X.LQQ.A01(r14, r0)
            com.instagram.ui.widget.mediapicker.MediaPickerItemView r12 = r0.A00
            X.JeM r5 = r0.A01
            r16 = 8
            X.LXb r1 = new X.LXb
            r15 = r1
            r17 = r14
            r19 = r0
            r20 = r5
            r15.<init>(r16, r17, r18, r19, r20)
            X.AnonymousClass0fU.A00(r1, r12)
            X.LYX r1 = new X.LYX
            r15 = r1
            r16 = r2
            r15.<init>(r16, r17, r18, r19, r20)
            r12.setOnLongClickListener(r1)
            boolean r1 = r14.A02()
            if (r1 == 0) goto L_0x0198
            X.9I9 r16 = X.LQQ.A01(r14, r0)
            X.L5G r1 = r5.A03
            com.instagram.ui.widget.gallery.GalleryView r7 = r1.A01
            int r1 = r7.A02
            r19 = 0
            if (r1 == 0) goto L_0x0194
            r19 = 1
            r20 = 1
            if (r1 != r2) goto L_0x0194
        L_0x00a4:
            boolean r6 = r7.A0I
            boolean r1 = r7.A0K
            r15 = r12
            r17 = r8
            r18 = r14
            r21 = r6
            r22 = r1
            r15.A03(r16, r17, r18, r19, r20, r21, r22)
            if (r3 == 0) goto L_0x00f5
            java.util.concurrent.ConcurrentHashMap r9 = r5.A01
            java.lang.String r8 = r14.A0A
            java.lang.Object r1 = r9.get(r8)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            boolean r1 = X.0qQ.A0K(r1, r10)
            if (r1 != 0) goto L_0x00f5
            X.2el r7 = X.AnonymousClass2hM.A00(r12)
            if (r7 == 0) goto L_0x00f5
            com.instagram.common.gallery.Medium r11 = r14.A00
            X.L7C r6 = new X.L7C
            r6.<init>(r11, r14, r0)
            r1 = 0
            X.L5F r2 = new X.L5F
            r2.<init>(r0)
            if (r11 == 0) goto L_0x00e3
            int r1 = r11.A05
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L_0x00e3:
            X.30a r2 = X.AnonymousClass30Y.A00(r6, r2, r1)
            X.Ljv r1 = new X.Ljv
            r1.<init>(r14, r3, r0)
            r2.A00(r1)
            X.C51967G9n.A0z(r12, r2, r7)
            r9.put(r8, r10)
        L_0x00f5:
            boolean r7 = r14.A04()
            if (r7 == 0) goto L_0x0190
            if (r3 == 0) goto L_0x018c
            int r1 = X.C64153LQs.A00(r14)
            boolean r1 = X.AJ5.A06(r3, r1)
            if (r1 == 0) goto L_0x018c
            X.JbN r1 = X.C59898JbN.CLOUD_WARNING
        L_0x0109:
            r12.setBottomLeftIcon(r1)
            X.0rm r6 = X.C51965G9l.A11()
            com.instagram.common.gallery.Medium r2 = r14.A00
            r1 = 0
            if (r2 == 0) goto L_0x0119
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r2.A0G
            java.lang.String r1 = r1.A03
        L_0x0119:
            r6.A00 = r1
            if (r7 == 0) goto L_0x014e
            com.instagram.common.gallery.RemoteMedia r1 = r14.A04
            if (r1 == 0) goto L_0x014e
            com.instagram.common.gallery.metadata.MediaUploadMetadata r1 = r1.A02
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r1 = r1.A00
            if (r1 == 0) goto L_0x014e
            java.lang.String r1 = r1.A00
            if (r1 == 0) goto L_0x014e
            if (r3 == 0) goto L_0x014e
            X.0Tu r7 = X.0Tu.A05
            r1 = 36323689473977738(0x810c3400072d8a, double:3.034585714876532E-306)
            boolean r1 = X.182.A06(r7, r3, r1)
            if (r1 == 0) goto L_0x014e
            X.JbN r0 = X.C59898JbN.CUBE
        L_0x013c:
            r12.setTopLeftIcon(r0)
            boolean r0 = com.instagram.ui.widget.gallery.GalleryView.A09(r14)
            if (r0 == 0) goto L_0x014b
            X.JbM r0 = X.C59897JbM.FADED
        L_0x0147:
            r12.setViewRenderMode(r0)
            return r4
        L_0x014b:
            X.JbM r0 = X.C59897JbM.ENABLE
            goto L_0x0147
        L_0x014e:
            java.lang.Object r1 = r6.A00
            if (r1 != 0) goto L_0x017d
            if (r3 == 0) goto L_0x017a
            boolean r1 = r5.A06
            if (r1 == 0) goto L_0x017f
            X.0Tu r5 = X.0Tu.A05
            r1 = 36329285816041433(0x81114b00023fd9, double:3.038124864132273E-306)
            boolean r1 = X.182.A06(r5, r3, r1)
            if (r1 == 0) goto L_0x017f
            com.instagram.common.gallery.Medium r2 = r14.A00
            r16 = 21
            X.IxF r1 = new X.IxF
            r15 = r1
            r17 = r14
            r18 = r0
            r19 = r3
            r20 = r6
            r15.<init>(r16, r17, r18, r19, r20)
            X.C59737JVv.A05(r2, r3, r1)
        L_0x017a:
            X.JbN r0 = X.C59898JbN.A06
            goto L_0x013c
        L_0x017d:
            if (r3 == 0) goto L_0x017a
        L_0x017f:
            java.lang.Object r0 = r6.A00
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.C59737JVv.A06(r3, r0)
            if (r0 == 0) goto L_0x017a
            X.JbN r0 = X.C59898JbN.GLASSES_CAPTURE
            goto L_0x013c
        L_0x018c:
            X.JbN r1 = X.C59898JbN.CLOUD
            goto L_0x0109
        L_0x0190:
            X.JbN r1 = X.C59898JbN.A06
            goto L_0x0109
        L_0x0194:
            r20 = 0
            goto L_0x00a4
        L_0x0198:
            boolean r1 = r14.A04()
            if (r1 == 0) goto L_0x01bf
            X.9I9 r13 = X.LQQ.A01(r14, r0)
            X.L5G r1 = r5.A03
            com.instagram.ui.widget.gallery.GalleryView r6 = r1.A01
            int r1 = r6.A02
            boolean r16 = X.AnonymousClass7TF.A1P(r1)
            boolean r1 = r6.A0I
            X.Lzm r15 = X.C65794Lzm.A00
            r19 = r2
            r20 = r2
            r21 = r7
            r17 = r1
            r18 = r2
            r12.A04(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x00f5
        L_0x01bf:
            java.lang.Integer r6 = r14.A09
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r6 != r1) goto L_0x00f5
            X.9I9 r6 = X.LQQ.A01(r14, r0)
            X.L5G r1 = r5.A03
            com.instagram.ui.widget.gallery.GalleryView r1 = r1.A01
            int r1 = r1.A02
            boolean r1 = X.AnonymousClass7TF.A1P(r1)
            r12.A0C = r1
            r12.setEnabled(r2)
            r12.A0B = r2
            r12.A02 = r6
            r12.A04 = r14
            android.content.Context r2 = r12.A0I
            r1 = 2131238040(0x7f081c98, float:1.8092347E38)
            android.graphics.drawable.Drawable r6 = r2.getDrawable(r1)
            if (r6 == 0) goto L_0x0211
            int r2 = X.AnonymousClass7TE.A09(r2)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r6.setColorFilter(r2, r1)
            android.graphics.Bitmap r1 = X.1MF.A0D(r6)
            r12.A00 = r1
            java.lang.String r1 = r14.A0A
            r12.A09 = r1
            r1 = 0
            r12.A03 = r1
            r12.invalidate()
            goto L_0x00f5
        L_0x0204:
            java.lang.Object r0 = r4.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.ui.widget.gallery.DirectGalleryGridAdapter.ViewHolder"
            X.0qQ.A0C(r0, r1)
            X.LQQ r0 = (X.LQQ) r0
            goto L_0x0026
        L_0x0211:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60054JeM.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
