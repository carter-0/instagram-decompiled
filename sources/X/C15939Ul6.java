package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.mapquery.MapQuery;
import java.util.Iterator;

/* renamed from: X.Ul6  reason: case insensitive filesystem */
public final class C15939Ul6 extends C15293UZz implements C20901X3s, XC1, XC3, XC4 {
    public static final String __redex_internal_original_name = "LocationSearchHistoryFragment";
    public View A00;
    public C15487Udc A01;
    public View A02;
    public RecyclerView A03;
    public C19227WQi A04;
    public C358448av A05;
    public C14436TwK A06;
    public String A07;
    public String A08;

    public final float BbN() {
        return 0.5f;
    }

    public final void D9S(AnonymousClass0iw r12, C66942Mfb mfb, C66967Mg0 mg0) {
        boolean A1U = AnonymousClass7TF.A1U(0, mfb, mg0);
        int i = mfb.A01;
        String str = "hideSearchEntryController";
        if (i == A1U) {
            C14436TwK twK = this.A06;
            if (twK != null) {
                twK.A01(((C69160Nfj) mfb).A00, mg0, C14407Tva.MAP);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } else if (i == 2) {
            C14436TwK twK2 = this.A06;
            if (twK2 != null) {
                twK2.A03(((C69158Nfh) mfb).A00, mg0, C14407Tva.MAP);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } else if (i == 6) {
            C14436TwK twK3 = this.A06;
            if (twK3 != null) {
                MapQuery mapQuery = ((C69156Nff) mfb).A00;
                C14407Tva tva = C14407Tva.MAP;
                0qQ.A0B(mapQuery, 0);
                if (mg0.A0F) {
                    C18646Vvr A002 = VGC.A00(twK3.A01);
                    synchronized (A002) {
                        A002.A01.A05(mapQuery);
                    }
                }
                for (C19227WQi A003 : twK3.A06) {
                    C19227WQi.A00(A003);
                }
                VGH.A00(new C15593UfL(twK3.A00, new C19556Wbg(1, mapQuery, mg0, twK3), twK3.A02), twK3.A01, tva, mapQuery.A00, mg0.A08, 6);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        } else {
            throw new IllegalStateException("Invalid entry type");
        }
        if (VGC.A00(AnonymousClass7TE.A0l(this.A00)).A00().isEmpty()) {
            View view = this.A00;
            if (view == null) {
                str = "clearAllButton";
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            view.setVisibility(8);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView A0K = DbX.A0K(view);
        this.A03 = A0K;
        if (A0K != null) {
            DbV.A1B(view.getContext(), A0K);
            RecyclerView recyclerView = this.A03;
            if (recyclerView != null) {
                C15487Udc udc = this.A01;
                String str = "locationSearchHistoryAdapter";
                if (udc != null) {
                    recyclerView.setAdapter(udc);
                    RecyclerView recyclerView2 = this.A03;
                    if (recyclerView2 != null) {
                        recyclerView2.A0S = true;
                        recyclerView2.setItemAnimator((AnonymousClass3AS) null);
                        C15487Udc udc2 = this.A01;
                        if (udc2 != null) {
                            udc2.A00();
                            View requireViewById = view.requireViewById(R.id.back_button);
                            this.A02 = requireViewById;
                            if (requireViewById == null) {
                                str = "searchCancelButton";
                            } else {
                                WB8.A00(requireViewById, 62, this);
                                View requireViewById2 = view.requireViewById(R.id.clear_action_view);
                                this.A00 = requireViewById2;
                                if (requireViewById2 == null) {
                                    str = "clearAllButton";
                                } else {
                                    WB8.A00(requireViewById2, 63, this);
                                    WBX.A00(view, 7, this);
                                    return;
                                }
                            }
                        }
                    }
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DIe(C69160Nfj nfj, C66967Mg0 mg0) {
        HashtagImpl hashtagImpl = nfj.A00;
        MediaMapFragment mediaMapFragment = this.mParentFragment;
        if (mediaMapFragment != null) {
            MediaMapFragment.A08(mediaMapFragment, C16614UyA.HASHTAG, hashtagImpl.A0C, hashtagImpl.A0D);
            C18780W1f.A01(mediaMapFragment);
        }
        AnonymousClass0eM r2 = this.A00;
        VGC.A00(AnonymousClass7TE.A0l(r2)).A01(nfj.A00);
        C18373VqZ.A00(AnonymousClass7TE.A0l(r2), nfj);
        A02(nfj, mg0);
    }

    public final void DPY(C69156Nff nff, C66967Mg0 mg0) {
        MapQuery mapQuery = nff.A00;
        MediaMapFragment mediaMapFragment = this.mParentFragment;
        if (mediaMapFragment != null) {
            MediaMapFragment.A08(mediaMapFragment, C16614UyA.CATEGORY, mapQuery.A00, mapQuery.A01);
            C18780W1f.A01(mediaMapFragment);
        }
        C15293UZz.A00(this, mapQuery, nff);
        A02(nff, mg0);
    }

    public final void DXI(C69158Nfh nfh, C66967Mg0 mg0) {
        C18072Vl0 vl0 = nfh.A00;
        MediaMapFragment mediaMapFragment = this.mParentFragment;
        if (mediaMapFragment != null) {
            mediaMapFragment.A0J(vl0);
        }
        AnonymousClass0eM r2 = this.A00;
        VGC.A00(AnonymousClass7TE.A0l(r2)).A02(nfh.A00);
        C18373VqZ.A00(AnonymousClass7TE.A0l(r2), nfh);
        A02(nfh, mg0);
    }

    public final String getModuleName() {
        String str = this.A07;
        if (str != null) {
            return str;
        }
        0qQ.A0F("moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        MediaMapFragment mediaMapFragment = this.mParentFragment;
        if (mediaMapFragment == null) {
            return true;
        }
        0hq r2 = mediaMapFragment.A0B.A03;
        if (r2.A0M() <= 1) {
            return true;
        }
        r2.A0c();
        return true;
    }

    public static final C14198Trd A01(C15939Ul6 ul6) {
        01N A1H = 0jo.A1H();
        A1H.addAll(VGC.A00(AnonymousClass7TE.A0l(ul6.A00)).A00());
        01V.A1C(A1H);
        01N A1I = 0jo.A1I(A1H);
        C14199Tre tre = new C14199Tre(false);
        Iterator it = A1I.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C66966Mfz mfz = new C66966Mfz();
            mfz.A09 = "null_state_recent";
            mfz.A08 = "RECENT";
            mfz.A0F = true;
            mfz.A05 = C66582MXn.A0w("RECENT");
            tre.A03(mfz, next);
        }
        return tre.A01();
    }

    private final void A02(C66942Mfb mfb, C66967Mg0 mg0) {
        OVV A002 = C70326O2e.A00(mfb);
        A002.A07 = mg0.A09;
        A002.A01 = mg0.A05;
        C14486Tx8 A012 = A002.A01();
        C358448av r0 = this.A05;
        if (r0 == null) {
            0qQ.A0F("searchLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        int i = mg0.A00;
        r0.CkL(A012, AnonymousClass05K.A07, AnonymousClass05K.A0C, "", mg0.A06, i);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1956374135);
        C15939Ul6.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r4 = this.A00;
        this.A01 = new C15487Udc(requireContext(), this, AnonymousClass7TE.A0l(r4), this);
        UserSession A0l = AnonymousClass7TE.A0l(r4);
        0qQ.A0B(A0l, 1);
        this.A06 = new C14436TwK((Context) null, A0l, (C14450TwY) null);
        this.A04 = new C19227WQi(this);
        this.A07 = 002.A0R(C320236s2.A01(requireArguments, "argument_parent_module_name"), "_edit_recent");
        String A0b = AnonymousClass7TF.A0b();
        this.A08 = A0b;
        if (A0b != null) {
            UserSession A0l2 = AnonymousClass7TE.A0l(r4);
            String str = this.A08;
            if (str != null) {
                C14444TwS twS = new C14444TwS(this, A0l2, str);
                UserSession A0l3 = AnonymousClass7TE.A0l(r4);
                0qQ.A0B(A0l3, 3);
                this.A05 = new C14443TwR(this, A0l3, twS, A0b, (String) null, (String) null, (String) null);
                AnonymousClass0fD.A09(-51112629, A022);
                return;
            }
        }
        0qQ.A0F("searchSessionId");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(413654650);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_location_search_history, false);
        AnonymousClass0fD.A09(273302213, A022);
        return A0D;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-756525329);
        super.onResume();
        C15487Udc udc = this.A01;
        if (udc == null) {
            0qQ.A0F("locationSearchHistoryAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        udc.A00 = A01(this);
        udc.A00();
        AnonymousClass0fD.A09(287741962, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-241891450);
        C15939Ul6.super.onStart();
        C14436TwK twK = this.A06;
        if (twK != null) {
            C19227WQi wQi = this.A04;
            if (wQi != null) {
                twK.A04.add(wQi);
                C14436TwK twK2 = this.A06;
                if (twK2 != null) {
                    C19227WQi wQi2 = this.A04;
                    if (wQi2 != null) {
                        twK2.A07.add(wQi2);
                        C14436TwK twK3 = this.A06;
                        if (twK3 != null) {
                            C19227WQi wQi3 = this.A04;
                            if (wQi3 != null) {
                                twK3.A06.add(wQi3);
                                1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A00));
                                Class<WQG> cls = WQG.class;
                                C19227WQi wQi4 = this.A04;
                                if (wQi4 != null) {
                                    A002.A01(wQi4, cls);
                                    AnonymousClass0fD.A09(162181767, A022);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("recentsUpdatedListener");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("hideSearchEntryController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1165771304);
        C15939Ul6.super.onStop();
        C14436TwK twK = this.A06;
        if (twK != null) {
            C19227WQi wQi = this.A04;
            if (wQi != null) {
                twK.A04.remove(wQi);
                C14436TwK twK2 = this.A06;
                if (twK2 != null) {
                    C19227WQi wQi2 = this.A04;
                    if (wQi2 != null) {
                        twK2.A07.remove(wQi2);
                        C14436TwK twK3 = this.A06;
                        if (twK3 != null) {
                            C19227WQi wQi3 = this.A04;
                            if (wQi3 != null) {
                                twK3.A06.remove(wQi3);
                                1Ng A002 = AnonymousClass1Nd.A00(AnonymousClass7TE.A0l(this.A00));
                                Class<WQG> cls = WQG.class;
                                C19227WQi wQi4 = this.A04;
                                if (wQi4 != null) {
                                    A002.A02(wQi4, cls);
                                    AnonymousClass0fD.A09(1411495197, A022);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            0qQ.A0F("recentsUpdatedListener");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("hideSearchEntryController");
        throw AnonymousClass00P.createAndThrow();
    }
}
