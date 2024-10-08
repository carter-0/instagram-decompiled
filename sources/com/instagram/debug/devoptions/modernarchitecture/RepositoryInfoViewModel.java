package com.instagram.debug.devoptions.modernarchitecture;

import X.02z;
import X.05G;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.0sn;
import X.106;
import X.10b;
import X.1Hj;
import X.2YL;
import X.AnonymousClass0T0;
import X.AnonymousClass0Ud;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C228042kh;
import X.C252733pa;
import X.C262224Cq;
import X.C318116oQ;
import X.C60340gF;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class RepositoryInfoViewModel extends 2YL {
    public static final int $stable = 8;
    public final 05G _repositories;
    public final AnonymousClass0Ud repositories;
    public final UserSession session;

    @DebugMetadata(c = "com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel$1", f = "RepositoryInfoViewModel.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel$1  reason: invalid class name */
    public final class AnonymousClass1 extends AnonymousClass1Ek implements 0sL {
        public int label;

        /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel$1] */
        public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
            return new AnonymousClass1(r4);
        }

        public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
            return new AnonymousClass1(r4).invokeSuspend(C60340gF.A00);
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [X.4D7, com.instagram.debug.devoptions.modernarchitecture.RepositoryInfoViewModel$1] */
        public final Object invokeSuspend(Object obj) {
            1Hj r7 = 1Hj.A02;
            int i = this.label;
            if (i == 0) {
                0eS.A00(obj);
                RepositoryInfoViewModel repositoryInfoViewModel = RepositoryInfoViewModel.this;
                05G r6 = repositoryInfoViewModel._repositories;
                List A02 = repositoryInfoViewModel.session.A02();
                ArrayList<C252733pa> A1C = AnonymousClass7TE.A1C();
                for (Object next : A02) {
                    if (next instanceof C252733pa) {
                        A1C.add(next);
                    }
                }
                ArrayList A0r = AnonymousClass7TG.A0r(A1C);
                for (C252733pa r1 : A1C) {
                    String simpleName = r1.getClass().getSimpleName();
                    if (simpleName == null) {
                        simpleName = "unknown";
                    }
                    A0r.add(new RepositoryInfo(simpleName, r1.A00, (MemoryCacheStats) null));
                }
                this.label = 1;
                if (r6.emit(A0r, this) == r7) {
                    return r7;
                }
            } else if (i == 1) {
                0eS.A00(obj);
            } else {
                throw AnonymousClass7TE.A0x();
            }
            return C60340gF.A00;
        }
    }

    public final class MemoryCacheStats extends AnonymousClass0T0 {
        public static final int $stable = 0;
        public final int evictionCount;
        public final int hitCount;
        public final int missCount;
        public final int putCount;

        public final int component1() {
            return this.hitCount;
        }

        public final int component2() {
            return this.missCount;
        }

        public final int component3() {
            return this.putCount;
        }

        public final int component4() {
            return this.evictionCount;
        }

        public final MemoryCacheStats copy(int i, int i2, int i3, int i4) {
            return new MemoryCacheStats(i, i2, i3, i4);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof MemoryCacheStats) {
                    MemoryCacheStats memoryCacheStats = (MemoryCacheStats) obj;
                    if (!(this.hitCount == memoryCacheStats.hitCount && this.missCount == memoryCacheStats.missCount && this.putCount == memoryCacheStats.putCount && this.evictionCount == memoryCacheStats.evictionCount)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((((this.hitCount * 31) + this.missCount) * 31) + this.putCount) * 31) + this.evictionCount;
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ MemoryCacheStats copy$default(MemoryCacheStats memoryCacheStats, int i, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = memoryCacheStats.hitCount;
            }
            if ((i5 & 2) != 0) {
                i2 = memoryCacheStats.missCount;
            }
            if ((i5 & 4) != 0) {
                i3 = memoryCacheStats.putCount;
            }
            if ((i5 & 8) != 0) {
                i4 = memoryCacheStats.evictionCount;
            }
            return new MemoryCacheStats(i, i2, i3, i4);
        }

        public final int getEvictionCount() {
            return this.evictionCount;
        }

        public final int getHitCount() {
            return this.hitCount;
        }

        public final int getMissCount() {
            return this.missCount;
        }

        public final int getPutCount() {
            return this.putCount;
        }

        public MemoryCacheStats(int i, int i2, int i3, int i4) {
            this.hitCount = i;
            this.missCount = i2;
            this.putCount = i3;
            this.evictionCount = i4;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MemoryCacheStats(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
        }

        public MemoryCacheStats() {
            this(0, 0, 0, 0);
        }
    }

    public final class RepositoryInfo extends AnonymousClass0T0 {
        public static final int $stable = 0;
        public final String featureTag;
        public final MemoryCacheStats memoryCacheStats;
        public final String name;

        public static /* synthetic */ RepositoryInfo copy$default(RepositoryInfo repositoryInfo, String str, String str2, MemoryCacheStats memoryCacheStats2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = repositoryInfo.name;
            }
            if ((i & 2) != 0) {
                str2 = repositoryInfo.featureTag;
            }
            if ((i & 4) != 0) {
                memoryCacheStats2 = repositoryInfo.memoryCacheStats;
            }
            return repositoryInfo.copy(str, str2, memoryCacheStats2);
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.featureTag;
        }

        public final MemoryCacheStats component3() {
            return this.memoryCacheStats;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof RepositoryInfo) {
                    RepositoryInfo repositoryInfo = (RepositoryInfo) obj;
                    if (!0qQ.A0K(this.name, repositoryInfo.name) || !0qQ.A0K(this.featureTag, repositoryInfo.featureTag) || !0qQ.A0K(this.memoryCacheStats, repositoryInfo.memoryCacheStats)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public String toString() {
            return super.toString();
        }

        public final String getFeatureTag() {
            return this.featureTag;
        }

        public final MemoryCacheStats getMemoryCacheStats() {
            return this.memoryCacheStats;
        }

        public final String getName() {
            return this.name;
        }

        public final boolean hasMemoryCache() {
            return AnonymousClass7TF.A1V(this.memoryCacheStats);
        }

        public int hashCode() {
            return AnonymousClass7TF.A08(this.featureTag, AnonymousClass7TE.A0O(this.name)) + AnonymousClass7TG.A0C(this.memoryCacheStats);
        }

        public RepositoryInfo(String str, String str2, MemoryCacheStats memoryCacheStats2) {
            AnonymousClass7TG.A1O(str, str2);
            this.name = str;
            this.featureTag = str2;
            this.memoryCacheStats = memoryCacheStats2;
        }

        public final RepositoryInfo copy(String str, String str2, MemoryCacheStats memoryCacheStats2) {
            AnonymousClass7TG.A1N(str, str2);
            return new RepositoryInfo(str, str2, memoryCacheStats2);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ RepositoryInfo(String str, String str2, MemoryCacheStats memoryCacheStats2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : memoryCacheStats2);
        }
    }

    public RepositoryInfoViewModel(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.session = userSession;
        02z A01 = 106.A01(0sn.A00);
        this._repositories = A01;
        this.repositories = 10b.A03(A01);
        AnonymousClass7TE.A1Z(new AnonymousClass1((AnonymousClass4D7) null), C318116oQ.A00(this));
    }

    public final AnonymousClass0Ud getRepositories() {
        return this.repositories;
    }

    public final class Factory extends C228042kh {
        public static final int $stable = 8;
        public final UserSession userSession;

        public Factory(UserSession userSession2) {
            0qQ.A0B(userSession2, 1);
            this.userSession = userSession2;
        }

        public RepositoryInfoViewModel create() {
            return new RepositoryInfoViewModel(this.userSession);
        }
    }
}
