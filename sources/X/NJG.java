package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.android.R;
import com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.mediasize.GifUrlImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class NJG extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectChallengeCreationBlockedFragment";
    public AnonymousClass2Ep A00;
    public DirectThreadKey A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final AnonymousClass4DS A03 = C71832OrZ.A00;

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        ImmutableList immutableList;
        String str;
        NYM nym;
        AnonymousClass9JN r1;
        String str2;
        Long l;
        Number number;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        2dY.A01(C71401Ok0.A00(this, 17), DbX.A0I(view2, R.id.direct_challenge_action_bar)).A0X(this.A03);
        AnonymousClass0eM r5 = this.A02;
        C72566PAx pAx = new C72566PAx(this, AnonymousClass7TE.A0l(r5), (C3256673q) null, (C332857Wq) null, (C332487Vf) null, (P8I) null, (AnonymousClass7ZN) null, (AnonymousClass7DZ) null, (AnonymousClass7DY) null);
        C68066MzX mzX = new C68066MzX(view2);
        AnonymousClass9HC A0M = C66584MXp.A0M(AnonymousClass9HC.A1b, r5);
        Context requireContext = requireContext();
        Integer num = AnonymousClass05K.A00;
        AnonymousClass2Ep r12 = this.A00;
        String str3 = "thread";
        if (r12 != null) {
            AnonymousClass7L2 A012 = C329927Kt.A00.A01(requireContext, A0M, r12.C5v(), num);
            2FW r8 = 2FW.A0y;
            List list = null;
            AnonymousClass7FE r90 = new AnonymousClass7FE(A0M, A012, r8, AnonymousClass0eN.A01(C73742Pj3.A00), false, false, false, false, false, false);
            MessageIdentifier A0i = C66580MXl.A0i("fakeMessageId", (String) null);
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass7FT r75 = new AnonymousClass7FT((C61063Jw1) null, new AnonymousClass7FR((GifUrlImpl) null, (Integer) null, "", "", (String) null, (String) null, (String) null, (String) null, (List) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, (C62320sa) null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false), C327627Bo.NUX_TYPE_NONE, 2FW.A1g, A0i, (MessageIdentifier) null, (List) null, currentTimeMillis, false, false, false, true, false);
            AnonymousClass2Ep r13 = this.A00;
            if (r13 != null) {
                C59832Ja7 ja7 = ((AnonymousClass3U9) r13).A01.A0a;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (ja7 == null || (number = (Number) ja7.A00) == null) {
                    j = 0;
                } else {
                    j = number.longValue();
                }
                long millis = timeUnit.toMillis(j);
                DirectThreadKey directThreadKey = this.A01;
                str3 = "threadKey";
                if (directThreadKey != null) {
                    String str4 = directThreadKey.A00;
                    if (ja7 != null && millis > System.currentTimeMillis()) {
                        int A0A = AnonymousClass7TG.A0A((Number) ja7.A01);
                        Long valueOf = Long.valueOf(millis);
                        String str5 = ja7.A05;
                        AnonymousClass7FT r89 = r75;
                        String str6 = str5;
                        nym = new NYM((C3259574v) null, r89, r90, (C328667Fr) null, Integer.valueOf(R.drawable.instagram_trophy_pano_outline_24), valueOf, str6, getString(2131973441), (String) null, getString(2131954912), ja7.A04, DbY.A0d(DbV.A05(this), A0A, R.plurals.challenges_blocked_submission_count), (List) null);
                    } else if (str4 != null) {
                        Object obj = ((C72184Oxt) AnonymousClass7TF.A0L(r5, 0).A01(C72184Oxt.class, C73810Pk9.A00)).A00.get(str4);
                        if (obj != null) {
                            2Dm A002 = 2L2.A00(AnonymousClass7TE.A0l(r5));
                            DirectThreadKey directThreadKey2 = this.A01;
                            if (directThreadKey2 != null) {
                                ArrayList Aax = A002.Aax(directThreadKey2, true);
                                ArrayList A1C = AnonymousClass7TE.A1C();
                                Iterator it = Aax.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    C254703su r0 = (C254703su) next;
                                    ImmutableList A0H = r0.A0H();
                                    if (r0.A10 == r8 && A0H != null && !A0H.isEmpty()) {
                                        C254873tC r02 = (C254873tC) 00k.A0J(A0H);
                                        if (r02 == null || (l = r02.A0m) == null) {
                                            str2 = null;
                                        } else {
                                            str2 = l.toString();
                                        }
                                        JTR.A1P(str2, obj, next, A1C);
                                    }
                                }
                                if (AnonymousClass7TE.A1b(A1C)) {
                                    C254703su r03 = (C254703su) 00k.A0J(A1C);
                                    if (r03 == null || (immutableList = r03.A0H()) == null) {
                                        immutableList = ImmutableList.of();
                                        0qQ.A07(immutableList);
                                    }
                                    if (immutableList.size() == 2) {
                                        C254873tC r2 = (C254873tC) 00k.A0O(immutableList, 0);
                                        C254873tC r04 = (C254873tC) 00k.A0O(immutableList, 1);
                                        if (r2 != null && r04 != null) {
                                            Long l2 = r2.A0n;
                                            String str7 = r2.A1N;
                                            ImmutableList A013 = r2.A01();
                                            if (A013 == null || (r1 = (AnonymousClass9JN) A013.get(0)) == null) {
                                                str = null;
                                            } else {
                                                str = r1.A04;
                                            }
                                            ImmutableList A014 = r2.A01();
                                            if (A014 != null) {
                                                A014.get(0);
                                            }
                                            String str8 = r2.A0u;
                                            Integer valueOf2 = Integer.valueOf(R.drawable.instagram_trophy_pano_outline_24);
                                            String str9 = r04.A11;
                                            String str10 = r04.A1N;
                                            String str11 = r04.A0t;
                                            C61078JwG jwG = r04.A0M;
                                            if (jwG != null) {
                                                list = (List) jwG.A00;
                                            }
                                            nym = new NYM((C3259574v) null, r75, r90, (C328667Fr) null, valueOf2, l2, str7, str, str8, str9, str10, str11, list);
                                        } else {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                    pAx.ADp(nym, mzX);
                    return;
                }
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int i;
        DirectThreadKey directThreadKey;
        int A022 = AnonymousClass0fD.A02(-1388701455);
        NJG.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (directThreadKey = (DirectThreadKey) bundle2.getParcelable(BurnerSendThreadDetailsFragment.ARGUMENT_DIRECT_THREAD_KEY)) == null) {
            i = 1694663851;
        } else {
            this.A01 = directThreadKey;
            2Dr A002 = 2L2.A00(AnonymousClass7TE.A0l(this.A02));
            DirectThreadKey directThreadKey2 = this.A01;
            if (directThreadKey2 == null) {
                0qQ.A0F("threadKey");
                throw AnonymousClass00P.createAndThrow();
            }
            AnonymousClass3U9 A032 = 2Dr.A03(A002, directThreadKey2);
            if (A032 == null) {
                i = 1994210932;
            } else {
                this.A00 = A032;
                i = 1585724999;
            }
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-911181974);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_challenges_creation_blocked, false);
        AnonymousClass0fD.A09(-1926859350, A022);
        return A0D;
    }
}
