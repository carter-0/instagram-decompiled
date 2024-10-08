package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JlX  reason: case insensitive filesystem */
public final class C60439JlX extends 2Rw {
    public LFA A00;
    public Integer A01 = AnonymousClass05K.A00;
    public final C3515589i A02;
    public final 27r A03;
    public final MV6 A04;
    public final String A05;
    public final List A06;
    public final int A07;
    public final ImmutableList A08;
    public final UserSession A09;
    public final Integer A0A;
    public final HashSet A0B;

    public final int A02(AudioOverlayTrack audioOverlayTrack) {
        0qQ.A0B(audioOverlayTrack, 0);
        LFA A002 = C63198Kt5.A00(audioOverlayTrack);
        LFA lfa = this.A00;
        this.A00 = A002;
        if (this.A01.intValue() != 1) {
            return 0;
        }
        if (lfa != null) {
            notifyItemChanged(this.A06.indexOf(lfa) + 1);
        }
        int indexOf = this.A06.indexOf(A002) + 1;
        notifyItemChanged(indexOf);
        A00(this, A002);
        return indexOf;
    }

    public final void A03(Collection collection) {
        Number number;
        0qQ.A0B(collection, 0);
        Integer num = AnonymousClass05K.A00;
        A01(num);
        List list = this.A06;
        ArrayList A0r = AnonymousClass7TG.A0r(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C66569MWx mWx = (C66569MWx) it.next();
            0qQ.A0B(mWx, 0);
            List BDX = mWx.BDX();
            int i = 0;
            if (!(BDX == null || BDX.isEmpty() || (number = (Number) 00k.A0O(BDX, 0)) == null)) {
                i = number.intValue();
            }
            A0r.add(new LFA(mWx, num, i, mWx.C95()));
        }
        list.addAll(A0r);
        if (this.A01 == AnonymousClass05K.A01) {
            notifyDataSetChanged();
        }
    }

    public final void A04(Collection collection) {
        Integer num = AnonymousClass05K.A01;
        A01(num);
        ArrayList A0r = AnonymousClass7TG.A0r(collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0r.add(C63198Kt5.A00((AudioOverlayTrack) it.next()));
        }
        ArrayList<Object> A1C = AnonymousClass7TE.A1C();
        for (Object next : A0r) {
            LFA lfa = (LFA) next;
            if (!this.A06.contains(lfa) && lfa.A02.getId() != null) {
                A1C.add(next);
            }
        }
        for (Object add : A1C) {
            this.A06.add(0, add);
        }
        if (this.A01 == num) {
            notifyDataSetChanged();
        }
    }

    public final void onBindViewHolder(C249703kE r8, int i) {
        int A072 = JTP.A07(this, r8, 0, i);
        if (A072 == 0) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        } else if (A072 != 1) {
            C60635Joi joi = (C60635Joi) r8;
            joi.A01.postDelayed(new M3T(joi), joi.A00 * ((long) i));
        } else {
            LFA lfa = (LFA) this.A06.get(i - 1);
            C60614JoN joN = (C60614JoN) r8;
            boolean A0K = 0qQ.A0K(lfa, this.A00);
            0qQ.A0B(lfa, 0);
            joN.A00 = lfa;
            C66569MWx mWx = lfa.A02;
            String title = mWx.getTitle();
            KHS khs = joN.A01;
            khs.setTitle(title);
            khs.setSubtitle(mWx.getDisplayArtist());
            String A0u = DbV.A0u(khs.getContext(), title, mWx.getDisplayArtist(), 2131974663);
            0qQ.A07(A0u);
            khs.setTalkback(A0u);
            ((GIH) joN.A02.getValue()).A04(mWx.As5());
            khs.setSelected(A0K);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (X.JWB.A01(r1) != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C249703kE onCreateViewHolder(android.view.ViewGroup r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            if (r7 == 0) goto L_0x0051
            r0 = 1
            if (r7 == r0) goto L_0x003a
            r0 = 2
            if (r7 != r0) goto L_0x002f
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r6)
            int r0 = r5.A07
            java.lang.Integer r3 = r5.A0A
            com.instagram.common.session.UserSession r1 = r5.A09
            X.KHS r2 = new X.KHS
            r2.<init>(r4, r1, r3, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r3 != r0) goto L_0x0028
            boolean r1 = X.JWB.A01(r1)
            r0 = 1
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            X.Joi r1 = new X.Joi
            r1.<init>(r2, r0)
            return r1
        L_0x002f:
            r0 = 1051(0x41b, float:1.473E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x003a:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r6)
            int r3 = r5.A07
            java.lang.Integer r2 = r5.A0A
            com.instagram.common.session.UserSession r1 = r5.A09
            X.KHS r0 = new X.KHS
            r0.<init>(r4, r1, r2, r3)
            X.JoN r1 = new X.JoN
            r1.<init>(r5, r0, r2, r3)
            return r1
        L_0x0051:
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r6)
            int r3 = r5.A07
            java.lang.Integer r2 = r5.A0A
            com.instagram.common.session.UserSession r1 = r5.A09
            X.KHS r0 = new X.KHS
            r0.<init>(r4, r1, r2, r3)
            X.Jo3 r1 = new X.Jo3
            r1.<init>(r5, r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60439JlX.onCreateViewHolder(android.view.ViewGroup, int):X.3kE");
    }

    public final void onViewAttachedToWindow(C249703kE r14) {
        0Aj r2;
        0qQ.A0B(r14, 0);
        int absoluteAdapterPosition = r14.getAbsoluteAdapterPosition();
        if (absoluteAdapterPosition > 0) {
            List list = this.A06;
            if (absoluteAdapterPosition < list.size() + 1) {
                long itemId = getItemId(absoluteAdapterPosition);
                if (getItemViewType(absoluteAdapterPosition) == 1 && this.A0B.add(Long.valueOf(itemId))) {
                    C3515589i r7 = this.A02;
                    27r r10 = this.A03;
                    C66569MWx mWx = ((LFA) list.get(absoluteAdapterPosition - 1)).A02;
                    if (r7 == null) {
                        String str = this.A05;
                        r2 = AnonymousClass7TE.A0e(r10.A01, AnonymousClass000.A00(158));
                        if (r2.isSampled()) {
                            Long A0m = C51971G9r.A0m();
                            try {
                                A0m = Long.valueOf(Long.parseLong(mWx.BfO()));
                            } catch (NumberFormatException e) {
                                0kD.A0H("IgCameraLoggerImpl", e);
                            }
                            r2.A9F("audio_asset_id", A0m);
                            JTP.A1E(r2);
                            C66569MWx.A03(r2, mWx);
                            C66569MWx.A01(r2, mWx);
                            C66569MWx.A00(r2, mWx);
                            JTQ.A12(r2, r10);
                            r2.AAJ("category", "suggested_audio_sound_sync");
                            AnonymousClass283 r0 = r10.A04;
                            AnonymousClass7TE.A1V(r2, r0);
                            JTP.A1I(r2, r0);
                            AnonymousClass7TE.A1W(r2, "event_type", 2);
                            C66569MWx.A02(r2, mWx);
                            C66569MWx.A04(r2, mWx, "browse_session_id", str);
                            C51973G9u.A14(r2, "product", C14245TsS.A00(MusicProduct.CLIPS_CAMERA_FORMAT_V2));
                        } else {
                            return;
                        }
                    } else {
                        String str2 = this.A05;
                        0qQ.A0B("For you", 2);
                        r2 = AnonymousClass7TE.A0e(r10.A01, AnonymousClass000.A00(158));
                        if (r2.isSampled()) {
                            Long A0m2 = C51971G9r.A0m();
                            try {
                                A0m2 = Long.valueOf(Long.parseLong(mWx.BfO()));
                            } catch (NumberFormatException e2) {
                                0kD.A0H("IgCameraLoggerImpl", e2);
                            }
                            r2.A9F("audio_asset_id", A0m2);
                            JTP.A1H(r2);
                            C66569MWx.A03(r2, mWx);
                            C66569MWx.A01(r2, mWx);
                            C66569MWx.A00(r2, mWx);
                            JTQ.A12(r2, r10);
                            r2.AAJ("category", "suggested_audio_sound_sync");
                            AnonymousClass283 r02 = r10.A04;
                            AnonymousClass7TE.A1V(r2, r02);
                            JTP.A1I(r2, r02);
                            AnonymousClass7TE.A1W(r2, "event_type", 2);
                            C66569MWx.A02(r2, mWx);
                            C66569MWx.A04(r2, mWx, "browse_session_id", str2);
                            r2.A8M(r7, "music_browser_entry_point");
                            C51973G9u.A14(r2, "product", C14245TsS.A00(MusicProduct.MUSIC_IN_FEED));
                            JTP.A1F(r2);
                            r2.A8M(C371088xY.POST_CAPTURE_AUDIO_BAR, "surface_element");
                            r2.A9F("audio_index", DbS.A0j(absoluteAdapterPosition));
                            r2.AAJ("audio_browser_surface", "preview");
                            r2.AAJ("section_name", "For you");
                            r2.A9F("section_id", AnonymousClass7TE.A10("2282005535164995"));
                        } else {
                            return;
                        }
                    }
                    r2.Cgf();
                }
            }
        }
    }

    public static final void A00(C60439JlX jlX, LFA lfa) {
        LFA lfa2 = jlX.A00;
        if (lfa2 != null) {
            jlX.notifyItemChanged(jlX.A06.indexOf(lfa2) + 1);
        }
        jlX.A00 = lfa;
        MV6 mv6 = jlX.A04;
        MusicAssetModel A022 = MusicAssetModel.A02(lfa.A02);
        int i = lfa.A01;
        mv6.Cwu(new AudioOverlayTrack(A022, i, Math.min(90000, lfa.A00 - i)));
    }

    private final void A01(Integer num) {
        List list = this.A06;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((LFA) next).A03 == num) {
                A1C.add(next);
            }
        }
        list.removeAll(A1C);
    }

    public C60439JlX(C3515589i r4, UserSession userSession, MV6 mv6, Integer num, String str, List list, int i) {
        AnonymousClass7TG.A1O(userSession, str);
        this.A09 = userSession;
        this.A05 = str;
        this.A06 = list;
        this.A07 = i;
        this.A04 = mv6;
        this.A0A = num;
        this.A02 = r4;
        int ceil = (int) Math.ceil(4.3d);
        ArrayList A0v = DbS.A0v(ceil);
        for (int i2 = 0; i2 < ceil; i2++) {
            AnonymousClass7TF.A1M(A0v, i2);
        }
        this.A08 = ImmutableList.copyOf((Collection) A0v);
        this.A03 = 27p.A01(this.A09);
        this.A0B = AnonymousClass7TE.A1F();
    }

    public final int getItemCount() {
        int size;
        int A032 = AnonymousClass0fD.A03(-2014594058);
        if (this.A01.intValue() != 1) {
            size = this.A08.size();
        } else {
            size = this.A06.size() + 1;
        }
        AnonymousClass0fD.A0A(-1421843860, A032);
        return size;
    }

    public final long getItemId(int i) {
        int A032 = AnonymousClass0fD.A03(1288755542);
        int itemViewType = getItemViewType(i);
        long j = 0;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                j = (long) C51971G9r.A0I(this.A08, i);
            } else {
                Long A0n = C51971G9r.A0n(0, ((LFA) this.A06.get(i - 1)).A02.BfO());
                if (A0n != null) {
                    j = A0n.longValue();
                }
            }
        }
        AnonymousClass0fD.A0A(-1802706184, A032);
        return j;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(2078038683);
        int i2 = 2;
        if (this.A01.intValue() == 1) {
            i2 = C51970G9q.A1U(i);
        }
        AnonymousClass0fD.A0A(1023792401, A032);
        return i2;
    }
}
