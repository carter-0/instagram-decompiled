package com.instagram.debug.devoptions.signalsplayground.viewmodel;

import X.02o;
import X.02z;
import X.05G;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.106;
import X.10b;
import X.1Hj;
import X.2YL;
import X.AnonymousClass0Ud;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C228042kh;
import X.C262224Cq;
import X.C318116oQ;
import X.C59678JTj;
import X.C59702JUj;
import X.C60340gF;
import X.MQ0;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundDataSource;
import com.instagram.debug.devoptions.signalsplayground.repository.CreatorInspirationSignalsPlaygroundRepository;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundSignalsViewModel extends 2YL {
    public final 05G _uiState;
    public final CreatorInspirationSignalsPlaygroundRepository repository;
    public final AnonymousClass0Ud uiState;

    @DebugMetadata(c = "com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalsViewModel$1", f = "CreatorInspirationSignalsPlaygroundSignalsViewModel.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalsViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int label;

        /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalsViewModel$1, X.4D7] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
            return new AnonymousClass1(r4);
        }

        public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
            return new AnonymousClass1(r4).invokeSuspend(C60340gF.A00);
        }

        /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.debug.devoptions.signalsplayground.viewmodel.CreatorInspirationSignalsPlaygroundSignalsViewModel$1, X.4D7] */
        public final Object invokeSuspend(Object obj) {
            1Hj r4 = 1Hj.A02;
            int i = this.label;
            if (i == 0) {
                0eS.A00(obj);
                final CreatorInspirationSignalsPlaygroundSignalsViewModel creatorInspirationSignalsPlaygroundSignalsViewModel = CreatorInspirationSignalsPlaygroundSignalsViewModel.this;
                AnonymousClass0Ud r1 = creatorInspirationSignalsPlaygroundSignalsViewModel.repository.signalsState;
                AnonymousClass1 r0 = new 02o() {
                    public final Object emit(MQ0 mq0, AnonymousClass4D7 r5) {
                        05G r2;
                        Object obj;
                        if (mq0 instanceof C59702JUj) {
                            r2 = CreatorInspirationSignalsPlaygroundSignalsViewModel.this._uiState;
                            obj = UiState.Loading.INSTANCE;
                        } else if (C59678JTj.A01(1, mq0)) {
                            r2 = CreatorInspirationSignalsPlaygroundSignalsViewModel.this._uiState;
                            obj = new UiState.Loaded((List) ((C59678JTj) mq0).A01);
                        } else if (C59678JTj.A02(mq0)) {
                            r2 = CreatorInspirationSignalsPlaygroundSignalsViewModel.this._uiState;
                            obj = UiState.Error.INSTANCE;
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                        r2.Epw(obj);
                        return C60340gF.A00;
                    }
                };
                this.label = 1;
                if (r1.collect(r0, this) == r4) {
                    return r4;
                }
            } else if (i != 1) {
                throw AnonymousClass7TE.A0x();
            } else {
                0eS.A00(obj);
            }
            throw new RuntimeException();
        }
    }

    public final class Factory extends C228042kh {
        public final UserSession userSession;

        public Factory(UserSession userSession2) {
            0qQ.A0B(userSession2, 1);
            this.userSession = userSession2;
        }

        public CreatorInspirationSignalsPlaygroundSignalsViewModel create() {
            return new CreatorInspirationSignalsPlaygroundSignalsViewModel(new CreatorInspirationSignalsPlaygroundRepository(this.userSession, (CreatorInspirationSignalsPlaygroundDataSource) null, 2, (DefaultConstructorMarker) null));
        }
    }

    public CreatorInspirationSignalsPlaygroundSignalsViewModel(CreatorInspirationSignalsPlaygroundRepository creatorInspirationSignalsPlaygroundRepository) {
        0qQ.A0B(creatorInspirationSignalsPlaygroundRepository, 1);
        this.repository = creatorInspirationSignalsPlaygroundRepository;
        02z A01 = 106.A01(UiState.Loading.INSTANCE);
        this._uiState = A01;
        this.uiState = 10b.A03(A01);
        AnonymousClass7TE.A1Z(new AnonymousClass1((AnonymousClass4D7) null), C318116oQ.A00(this));
    }

    public final AnonymousClass0Ud getUiState() {
        return this.uiState;
    }

    public final void fetchSignalsList() {
        AnonymousClass7TE.A1Z(new CreatorInspirationSignalsPlaygroundSignalsViewModel$fetchSignalsList$1(this, (AnonymousClass4D7) null), C318116oQ.A00(this));
    }

    public abstract class UiState {

        public final class Error extends UiState {
            public static final Error INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public int hashCode() {
                return -1164578377;
            }

            public String toString() {
                return "Error";
            }
        }

        public final class Loaded extends UiState {
            public final List signals;

            public Loaded(List list) {
                0qQ.A0B(list, 1);
                this.signals = list;
            }

            public final List component1() {
                return this.signals;
            }

            public final Loaded copy(List list) {
                0qQ.A0B(list, 0);
                return new Loaded(list);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Loaded) && 0qQ.A0K(this.signals, ((Loaded) obj).signals));
            }

            public int hashCode() {
                return this.signals.hashCode();
            }

            public String toString() {
                return super.toString();
            }

            public static /* synthetic */ Loaded copy$default(Loaded loaded, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = loaded.signals;
                }
                0qQ.A0B(list, 0);
                return new Loaded(list);
            }

            public final List getSignals() {
                return this.signals;
            }
        }

        public final class Loading extends UiState {
            public static final Loading INSTANCE = new Object();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public int hashCode() {
                return -652685013;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ UiState(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public UiState() {
        }
    }
}
