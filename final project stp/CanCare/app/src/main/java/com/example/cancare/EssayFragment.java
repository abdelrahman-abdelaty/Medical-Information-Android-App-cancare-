package com.example.cancare;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class EssayFragment extends Fragment {

    String disease = "تنشأ الأمراض المُعْدِيَة (Infectious diseases) عند دخول أجسامِ غريبةٍ ملوثة إلى جسم الإنسان. تكون هذه الأجسام الغريبة عبارة عن جراثيم، فيروسات، فطريات أو طفيليات. تنتقل هذه الأجسام عن طريق العَدْوى من إنسان آخر، حيوانات، طعام ملوث، أو من التعرض لأي من العوامل البيئية التي تكون ملوثةً بأيِ من هذه الأجسام.\n" +
            "إن لهذه التلوثات أعراضًا كثيرة على الجسم، منها ارتفاع حرارة الجسم والأوجاع، بالإضافة إلى عوارض أخرى تختلف باختلاف موقع الإصابة بالعدوى، نوع العَدْوى وحدتها. فبالإمكان الإصابة بعَدْوى تسبب أعراضًا مرضيةً خفيفةً، وبالتالي لا يستلزم علاجها أكثر من تلقي العلاج المنزلي. وبالمقابل هنالك حالات خطيرة قد تسبب الوفاة.\n";

    String aarad = "يسبب التلوث أعراضًا كثيرة ومختلفة، إلا أن غالبية الأمراض المُعْدِية، قد تحمل أعراض الإصابة بالتالي:\n" +
            "1- ارتفاع حرارة الجسم (الحمى)\n" +
            "2- فقدان الشهية\n" +
            "3- الضعف\n" +
            "4- أوجاع فى العضلات\n";
    String cause = "توجد هنالك أسباب كثيرة للإصابة بالتلوثات وتشتمل على ما يلي:\n" +
            "الجراثيم (Bacteria): وهي كائنات حية وحيدة الخلية، والتي تسبب نطاقًا واسعًا من الأمراض، بدءًا من الأمراض الخفيفة كالتهاب الحنجرة العِقدي، أو التلوث في قنوات البول، وانتهاءً بأمراض حادة وصعبة، كأمراض الحُمَّى المختلفة أو التهاب أغشية الدماغ.\n" +
            "الفيروسات (Viruses): إن الفيروس كائنٌ حيٌّ يصغُر الجرثومة، ولا يمتلك القدرة على الحياة بشكل مستقل. تتسبب الفيروسات بأمراض كثيرة، منها الأمراض واسعة الانتشار، كالنزلات البردية الاعتيادية، ومنها الأنواع شديدة الندرة كمرض الإيدز.\n" +
            "الطفيليات (Parasites): تسبب الطفيليات أمراضًا مثل الملاريا أو العَمى النًّهري (River blindness) والتي تعتبر أقل انتشارًا في الدول الغربية.\n" +
            "قد يتم التقاط العَدْوى عند الملامسة المباشرة، أي عند التلامس مع شخص حامل للعامل الملوّث المصاب بمرض مثل:\n" +
            "1- التعرض لشخص آخر والذي يكون مريضًا- قد يكون انتقال العَدْوى من شخص مريض عن طريق الملامسة المباشرة أو عن طريق سوائل الجسم (التي تنتقل عبر القبلة، السعال أو العطس).\n" +
            "2- تكون بعض الحيوانات حاملة للعوامل الملوّثة، وتنتقل إلى الإنسان عند تلقيه عضة من الحيوان المصاب، أو بفعل التعرض للإفرازات الناتجة من الحيوان عن طريق اللمس.\n" +
            "3- قد تنتقل العدوى بالتلوث إلى الجنين إذا أصيبت الأم الحامل، عن طريق الحبل السري أو وقت الولادة عن طريق قنوات الولادة.\n" +
            "4- قد تنتقل العَدْوى أيضًا بطريقة غير مباشرة، عندما يكون ناقل المرض حاملاً للعامل الملوّث، ولكن من غير أن يكون مصابًا بالمرض مثلاً                                                                                                     \n" +
            "عند لمس الأسطح الملوَّثة                                                                                                        \n" +
            "  عند تناول طعام يحتوي عوامل ملوِّثَة                                                                                                                                         \n" +
            "التعرض لحامل للعامل الملوِّث مثل الناموس، البراغيث والقمل                                                           \n" +
            "إن جميع الأشخاص معرضون للإصابة بالتلوُّثات، إلاّ أن خطر الإصابة لدى الأشخاص ذوي المناعة المتدنية يكون أكبر.                                                                                                                            \n" +
            "مجموعات الأشخاص المعرضين لخطر الإصابة أكثر من غيرهم تشمل:\n" +
            "الأشخاص المصابين بأمراض المناعة الذاتية، الأشخاص الذين يتلقون علاجاتٍ تحتوي على ستيروئيدا (Steroids)، الأشخاص الذين يتلقون علاجات مضادة للسرطان، الأشخاص الذين أجروا عمليات لزراعة الأعضاء ومرضى نقص المناعة البشرية/ الإيدز.\n";
    String mult = "تنتهي حالة التلوث، عادة بسرعة ودون الحاجة لتلقي علاج معين، وحتى أحيانًا، لا يشعر المريض بالإصابة بأي أعراض مرضية عند الإصابة بهذه الأمراص.\n" +
            "إلا أنه من الوارد حدوث أعراض ومضاعفات مختلفة. مثلاً، قد ينشأ ضرر دائم بأحد أعضاء الجسم، إذا تعرض للتلوث؛ كالتلوث الذي يصيب الكُلى بالالتهاب (Pyelonephritis) أو كضرر يصيب أعضاءً أخرى من مركز التلوث الأولي، مثل  الحمى الروماتزمية (Rheumatic fever). كما توجد أنواع من التلوثات، قد تزيد خطر الإصابة بأمراض كفيروس الحُلَيْمي البشري (HPV) الذي يزيد خطر الإصابة بسرطان الرحم.\n" +
            "من التلوثات التي قد تعرض المصاب لخطر الموت، التهاب الرئتين، التهاب السَّحايا(Meningitis) والإيدز.\n";
    String tash = "يتأثر عدد كبير من أجهزة الجسم بفعل التلوّث، لذلك تكون الفحوصات اللازمة لتشخيص الإصابة، مختلفة باختلاف التوقعات الإكلينيكية للطبيب المعالج. يتم الكشف عن الإصابة بالأمراض المُعْدِيَة بالطرق التالية:\n" +
            "- اختبار الدم: من الممكن إيجاد دلالات على عملية تلوث في الجسم عن طريق فحص للدم، عند إجراء تعداد للخلايا البيضاء. يكون هذا الاختبار، في بعض الحالات، كافيًا للكشف عن نوع التلوّث.\n" +
            " - اختبار البول: يعد هذا الاختبار هامًّا، خاصة عند تشخيص التلوثات التي تصيب الجهاز البولي، إلا أنها تتعدى ذلك، للكشف عن تلوثات في أجهزة الجسم الأخرى.\n" +
            " - لُطاخة للحنجرة: يستعمل هذا الاختبار عادة لتشخيص الالتهابات التي تصيب منطقة الحنجرة، وأمراض أخرى تصيب جهاز التنفس.\n" +
            " - اختبار تصويري: تتطلب بعض الحالات إجراء فحوصات تصويرية: مثل التصوير بالأشعة السينية رنتجن، التصوير المقطعي المحوسب (CT) أو تصوير الرنين المغناطيسي (MRI).\n" +
            " - فحص عيّنة (خزعة – Biopsy): إجراء التشخيص بواسطة أخذ عيّنة من المنطقة المصابة.\n";
    String cure = "تختلف أنواع العلاجات التي تتناسب مع الملوث بشكل خاص، وذلك نظرًا لاختلاف أنواع الملوثات المسببة.\n" +
            "تستخدم المضادات الحيوية (Antibiotics) لعلاج الأمراض التي تسببها الجراثيم، بحيث يكون لكل نوع من الجراثيم، نوع مختلف من المضادات الحيوية. تكمن المشكلة الأساسية في استعمال المضادات الحيوية، في أن التعرض للمضادات الحيوية، يزيد من مقدرة الجراثيم على مقاومة هذه المضادات. لذلك، من المهم استعمال علاجات المضادات الحيوية بشكل موزون.\n" +
            "تعتمد العلاجات المضادة للفيروسات (Antiviral)، على علاج الأمراض المتسببة بواسطة الفيروسات. لا يوجد علاج خاص لكافة أنواع الفيروسات. تتوفّر العلاجات المضادة  لفيروس الهِرْبِس (Herpes)، فيروس الأنفلونزا، فيروسات التهاب الكبد بأنواعها (Hepatitis) المختلفة، وفيروس نقص المناعة البشرية. HIV \n" +
            "أما في حالات الإصابة بالفطريات، فهنالك العديد من الوسائل العلاجية المضادة للفطريات. تُعتَمد المراهم لعلاج التلوثات الجلدية التي تسببها الفطريات، بينما تُعتمد العلاجات المضادة للفطريات (Antifungal) والتي تؤخذ عن طريق الفم أو تحقن وريديًّا، إذا كان التلوث بالفطريات في الأعضاء الداخلية.\n" +
            "وأخيرًا في حال التلوّث بالطفيليات، تتوفر علاجات مختلفة وأشهرها علاج داء الملاريا بواسطة الكينين (Quinine) ومشتقاته.\n";
    String prot = "يمكن القيام بالكثير من الخطوات التي تساهم في تقليل خطر الإصابة بالتلوّث منها:\n" +
            "غسل اليدين: خاصةً قبل تناول الطعام، بعد لمس الأطعمة غير المجهّزة، قبل تناول الوجبة، بعد لمس الأشخاص المصابين بأمراض وعند الخروج من دورة المياه.\n" +
            "تلقي التطعيمات: تتوفر تطعيمات عديدة للوقاية من الكثير من الأمراض المُعْدِيَة، التي تسببها جراثيم أو فيروسات، فَتَلَقِّي هذه التطعيمات مهم جدًّا للوقاية من الإصابة بها، خاصة عند الأطفال وكبار السن.\n" +
            "الحفاظ على النظافة في المطبخ: وخاصة عند إعداد الطعام والامتناع عن ترك أطعمة غير مطبوخة لوقت طويل في المطبخ، دون حفظها بدرجة حرارة مناسبة.\n" +
            "الجنس الآمن: من الهام ممارسة الجنس بشكل آمن، لمنع نقل الأمراض المُعْدِيَة جنسيًّا.\n" +
            "الخلاصة:\n" +
            "إن التلوثات شائعة جدًّا، وعادة لا تهدد خطر الحياة. ينصح بالتوجه لتلقي العلاج في الحالات التالية: عند التعرض لعضة من حيوان أو عند مواجهة صعوبة في التنفس، عند السعال المستمر على امتداد أكثر من أسبوع، عند الشعور بآلام حادة في الرأس، عند حدوث نوبات، عند ظهور طفوح جلدية أو انتفاخات.\n" +
            "توجد هنالك الكثير من الخطوات التي تساعد على الوقاية من الامراض المعدية، منها الحفاظ على النظافة الشخصية والعامة، والامتناع من التعرض/ الانكشاف للمرضى.\n";
    String san = "كلما رأيتُ شخصاً سابلاً او في سيارة، يرمي شيئاً من يده الى الشارع او أي مكان عام او حتى دائرته التي يعمل فيها، كأن يكون الشيء الذي يرميه قنينة ماء او مشروب غازي او عقب سيكارة اوبقايا علكة وغيرها أتذكر مقولة كانت أمي ترددها أمام مسامعنا وهي تربينا على مبادئ النظافة العامة في صغرنا، كانت تقول: إن مَن لايحرص على نظافة المكان الذي يقف فيه، أياً كان هذا المكان، إنما هو قذر في بيته.\n" +
            "هذه المقولة إتخذتها حكمة، تجعلني أحكم دوماً على كل من يرمي على أرض دائرته او الشارع او أي مكان عام شيئاً وإن كان عود ثقاب بأنه كما قالت أمي.\n" +
            "وحين أجد أماً ترمي حفاظة طفلها او علبة عصير او حليب فارغة من بيتها او من السيارة الى الشارع، أقول لنفسي كم الفارق شاسع بين أمي وهذه الأم التي تعلم طفلها أن يعتدي على الشارع برمي أي شيء!! وكيف لهذه الأم الجاهلة أن تربي طفلها على النظافة إذا كانت هي بها حاجة الى من يعلمها أصول النظافة.\n" +
            "الذي يثير الغيظ أكثر إن أولئك المتجاوزين على نظافة الممتلكات العامة يبررون تصرفاتهم تلك بأن البلد كله وسخ او شوارعه كلها وسخة!! فكيف يكون المواطن نظيفاً؟! او بأنّ الكل يرمي النفايات في الشارع، فلماذا لاأفعل أنا مثلهم؟!! وكأننا يجب أن نخطئ كما يخطئ الآخرون، ونسلك بالضرورة مايسلكونه؟!\n" +
            "من جانب، نقول.. نعم لو كانت الدوائر المسؤولة عن النظافة حريصة على تنظيف الشوارع والأمكنة العامة، وتوفرَ قانونٌ يحاسب المتجاوز على النظافة العامة، لكان لزاماً على المواطن أن يحافظ على نظافة الشوارع والأمكنة العامة، بل لوجد مواطنين آخرين يهبون لردعه إن هو تجاوز ورمى نفاية ما في شارع نظيف، لكن من جانب آخر لايجوز أن نبرر اونعول على هذا او نتحجج بأنّ الشارع وسخ كله ورمينا نفاية أخرى فيه لايعني شيئاً أمام النفايات المنتشرة فيه، بل يجب أن تنبع النظافة من دواخلنا، فهي من الإيمان كما نعرف جميعاً وهي من الشعور بالوطنية والمسؤولية تجاه المجتمع، وقبل هذا وذاك هي تعبير عن احترام الذات كذلك. فكيف يدعي أحدهم أنه مؤمن لمجرد إنه يلتزم ببعض آداب الدين ولايلتزم بالنظافة العامة ؟! بل كيف نتهم الغرب بالكفر إذا كان نظيفاً ؟! أليس الإنسان الغربي يحافظ على نظافة الأمكنة العامة ما يجعله في خانة الإيمان التي ندعي أنها لنا فقط ؟!\n" +
            "وكيف يكون المواطن وطنياً إذا كان يزيد من حجم الأوساخ في الشوارع ؟! وكيف يريد أن يُبنى البلد إذا لم يسهم المواطن بنفسه بما يستطيع وبما يعبر عن تحضره ومدنيته؟ وكيف ينتظر من الآخر أن يحترمه إذا لم يحترم هو ذاته ؟!\n" +
            "إنّ الذين يتجاوزون على نظافة الممتلكات والأمكنة العامة.. هل يقبلون بأن يتجاوز آخرون على ممتلكاتهم الخاصة، في الوقت الذي لايلتفتون الى حقيقة أن الممتلكات العامة وجدت لأجلهم ولخدمتهم، وبالتالي فإن نظافتها من شأنهم، كما هي الحال مع الشوارع والأرصفة وسائر الأمكنة العامة التي نظافتها او قذارتها تنعكسان علينا، فكيف يتقبل البعض أن يكون هذا الانعكاس سلبياً، كما هي الحال مع البعض الذي يتوقف بسيارته وسط الشارع ويفتح بابها الأمامي ويمد يده الى الشارع حاملاً منفضة سكائر ليرمي مافيها من رماد سكائر وبقايا حلوى وعلك على الشارع، ثم يغلق الباب وينطلق بسيارته كأنّ شيئا لم يكن. او كما يفعل بعضهم، يمضغون العلكة ويلقونها من أفواههم على أسفلت الشوارع والأرصفة او حتى على أرضيات دوائرهم التي يعملون فيها، ومثلهم كثيرون ممن لايتوانون حتى عن رمي أوساخهم على جيرانهم، وأولئك جميعاً ينبغي لهم أن يخجلوا من تصرفاتهم التي تعبر عن جهل وهمجية وعدم تحضر او مدنية، وعليهم أن لايتحدثوا عن النظافة او حتى الأناقة أمام أحد وإلاّ أثار ذلك سخريته، إذ لن يصدق أنهم نظيفون في بيوتهم، كما ستبدو عنايتهم بمظاهرهم مفتعلة وناشزة وغير متوافقة مع تجاوزهم على أناقة المكان العام.\n" +
            "فيا أيها المنتهكون للنظافة العامة التفتوا الى الأذى الناجم عن تجاوزاتكم، ولاتسهموا في زيادة بشاعة الشوارع وتلوثها ما ينعكس سلباً على الصحة العامة وسلامة البيئة، فيكفينا تقصير الدوائر البلدية في أداء مهامها، ولاتخدشوا الأمكنة العامة ولاتتجاوزوا على نظافة الدوائر الرسمية، وأخيراً تأملوا حكمة أمي، وكل أمهاتنا المربيات الفاضلات الواعيات، اللواتي يربين أولادهن على الشعور بالمسؤولية تجاه المجتمع منذ نعومة أظفارهم حتى يعتادوا ذلك، ويكون جزءًا من شخصياتهم وضمن قيمهم وقناعاتهم الإنسانية التي يحملونها معهم في مسيرة الحياة.\n";
    String hyg = "تُعرّف النّظافة أو العادة الصحيّة بالإنجليزية:(Hygiene) بأنّها جملةٌ من السّلوكات والممارسات التي تتفق مع حفاظ الإنسان على صحته ومعيشته، وهو مفهومٌ متّصل بالطبّ، حيثُ تُستخدم الممارسات الصحيّة في الجانب الطبّي لتقليل نسبة الإصابة بالأمراض وانتشارها، بالإضافة لارتباط المفهومِ بالعناية الشخصيّة والمهنيّة التي ترتبط بأغلب نواحي الحياة.[٣] تُعرّف النّظافة الشّخصية بأنّها مجموعةُ السّلوكات والعادات التي يقوم بها الإنسان بقصدِ الحفاظ على صحته ومظهره ورائحته، حيثُ تُعتبر النّظافة الشّخصيّة عِماد الصحّة، ومن العوامل المهمّة التي تبعث على احترام النّاس، كما تمنحُ الإنسان الشّعور بالحيوية والنّشاط.";
    String hyg_im = "للاهتمام بالنّظافة الشّخصية والمحافظة عليها أهميّة كبيرة، منها:\n" +
            "1- تقي النّظافة الشخصيّة جسم الإنسان من الإصابة بأمراضٍ عديدة، كالإسهال، والتَّسمم، والجرب، والالتهاب الرئوي، والتهاب العين والجلد، ومن القمل، والكوليرا، والزّحار، وتُقلّل احتماليّة انتشار الإنفلونزا. كما تُقلِّل من نسبة انتشار الجراثيم، والميكروبات، وما تسببه من أمراض.\n" +
            "2- تجعل مظهر الفردِ لائقاً ورائحته زكيّة، مما لا يُنفِّر الناس ولا يؤذيهم، حيثُ إنّها تُشكِّل أول انطباعٍ عن الفرد وشخصيّته وسمةً أساسية للحكم عليه من خلالها، مما يرفعُ من قيمة احترام النّاس للفرد وينشر محبته بينهم، كما تجعلُ الآخرين يشعورن بالرّاحة أثناء الوجود معه.\n" +
            " 3- تمنحُ النّظافة الشّخصية الفردَ الشّعور بالراحة والاسترخاء، كما تُشعرُه بالانتعاش خاصةً في فصل الصيف. تمنحُ النظافة الشّخصية للفرد حُريّة التنقّل والحركة والاقتراب من الناس حوله على نحوٍ لا يُزعجهم، بعكسِ الفرد الذي لا يُحافظ على نظافته.\n" +
            "4-  تنعكس آثار الاهتمام بالنّظافة الشخصية على صحّة الفرد النّفسية، حيثُ تحميه من أن يُصاب بالاكتئاب، والتّوتر، وتمنحه ثقةً بنفسه. تزيدُ قدرة الفرد على التّركيز في تنفيذ الأعمال الموكلة إليه، وإنهائها بسرعةٍ وكفاءةٍ عالية؛ لأنها تمنحُه النشاط والحيوية. \n" +
            "5- تخفف النّظافة الشّخصية من احتمالية خروج رائحة للجسم، والتي قد تُسبب الحرج للفرد في حالات اختلاطه بالنّاس في مجتمعه\n";
    String hyg_how = "يُعدُّ جسم الإنسان مكاناً من الممكن أن تتكاثر فيه الجراثيم والطفيليات لتسبب له فيما بعد أمراضاً كثيرةً، وأكثر هذه الأماكن عرضةً لذلك الجلد وداخل وحول الفتحات الموجودة في الجسم، ولكن تقلُّ فرص تكاثر هذه الجراثيم والطفيليات لدى الأشخاص الذين يتّبعون عاداتٍ صحيّة لنظافتهم الشخصية، ومن هذه العادات:\n" +
            "1- الاغتسال يومياً قدر الإمكان، وعندما لا يكون ذلك ممكناً سواءً لنقصٍ في المياه أو لظروفٍ مُعيّنة، كالخروج في رحلة تخييم فإنّ السباحة أو غسل الجسم بإسفنجة رطبة أو قماشٍ مبلل بالماء يفي بالغرض. وبشكلٍ عام يجبُ الاغتسال 3 مراتٍ أسبوعياً على الأقل.\n" +
            "2- تنظيفُ الأسنان باستمرار، وبمعدّل مرة واحدةٍ يومياً على الأقل، حيثُ يُفضَّلُ غسل الأسنان بعد تناول كلّ وجبة لتجنّب احتمالية الإصابة بأمراض اللثة والتّسوس، ومن المهمّ تنظيفها بعد وجبة الإفطار، وقبل الخلود للنوم.\n" +
            "3- غسلُ الشّعر بسائل تنظيف الشّعر المناسب له مرّة واحدةً في الأسبوع على الأقل.\n" +
            "4- الحرص على ارتداء ملابس نظيفة وتبديلها حال اتّساخها، وبالأخص الملابس الدّاخلية، وتعليق الملابس بعد غسلها في الشّمس لتجفّ، لأنّ أشعة الشمس تساهم بقتل بعض الجراثيم والطفيليات.\n" +
            "5- الحرص على تنظيف اليدين قبل تناول الطّعام وبعده، وبعد استخدام المرحاض، وخلال ممارسة الأنشطة اليومية الطبيعية كاللعب والعمل.\n" +
            "6- صرفُ الوجه بعيداً عن الآخرين، وتغطية الأنف والفم عند العُطاس أو السّعال، لمنع انتشار رذاذ السائل الذي يحتوي على الجراثيم إلى النّاس مسببّاً لهم العدوى\n";
    String islam = "دعاء الإسلام إلى الطّهارة والاعتناء بالنظافة، وعدّها أساساً من أسسه بل فريضةً يجبُ اتِّباعها، كما عدّها شرطاً لأكبر العبادات وأكبر الفرائض وهي الصّلاة، وقد أمر الله نبيّه محمد -صلى الله عليه وسلّم- بالمداومة على قول الله أكبر، وأتبع ذلك بالأمر بالتّطهّر في قوله تعالى: (وَرَبَّكَ فَكَبِّرْ*وَثِيَابَكَ فَطَهِّرْ)  كما تُعدّ النّظافة والطّهارة من الأخلاق الكريمة والعادات السامية في الإسلام، حيثُ جعلَ الّنبي محمد -صلى الله عليه وسلم- الطّهارة شطرٌ للإيمان، فقال: (الطُّهورُ شَطرُ الإيمان).\n" +
            " ودعا الإسلام المسلمين إلى العناية الحثيثة بطهارتهم ونظافتهم الشّخصية عند أداء الصّلاة وفي مختلف الأحوال، وبيّن كيفيتها، فقال تعالى: (يَا أَيُّهَا الَّذِينَ آمَنُوا إِذَا قُمْتُمْ إِلَى الصَّلَاةِ فَاغْسِلُوا وُجُوهَكُمْ وَأَيْدِيَكُمْ إِلَى الْمَرَافِقِ وَامْسَحُوا بِرُءُوسِكُمْ وَأَرْجُلَكُمْ إِلَى الْكَعْبَيْنِ وَإِنْ كُنْتُمْ جُنُبًا فَاطَّهَّرُوا وَإِنْ كُنْتُمْ مَرْضَى أَوْ عَلَى سَفَرٍ أَوْ جَاءَ أَحَدٌ مِنْكُمْ مِنَ الْغَائِطِ أَوْ لَامَسْتُمُ النِّسَاءَ فَلَمْ تَجِدُوا مَاءً فَتَيَمَّمُوا صَعِيدًا طَيِّبًا فَامْسَحُوا بِوُجُوهِكُمْ وَأَيْدِيكُمْ مِنْهُ مَا يُرِيدُ اللَّهُ لِيَجْعَلَ عَلَيْكُمْ مِنْ حَرَجٍ وَلَكِنْ يُرِيدُ لِيُطَهِّرَكُمْ وَلِيُتِمَّ نِعْمَتَهُ عَلَيْكُمْ لَعَلَّكُمْ تَشْكُرُونَ) ولم يتوقّف الإسلام عند ذلك، بل ارتقى بقيمة النّظافة وأهمّيتها لمراتب أعلى، حيثُ عدّها صفةً ينالُ بها المسلم محبّة الله تعالى، قال تعالى: (...إِنَّ اللَّهَ يُحِبُّ التَّوَّابِينَ وَيُحِبُّ الْمُتَطَهِّرِينَ)، كما قال تعالى: (...وَاللَّهُ يُحِبُّ الْمُطَّهِّرِين(\n";
    String dis = "الأمراض المزمنة هي أمراض بطيئة الحدوث فهي لا تظهر على الشخص المُصاب بها بأي أعراض وذلك في بادئ الأمر من قبل أن تظهر أي مضاعفات\n" +
            "الأمراض المزمنة تكون مرتبطة بشكل كبير بطريقة الغذاء التي يقوم الشخص بإتباعها وطريقة الحركة أيضاً وما يقوم الشخص بممارسته لبعض من العادات السيئة التي قد تتسبب في إصابته بأي من الأمراض المزمنة وذلك كالتدخين .\n" +
            "هذة الأمراض لا تكن مثل غيرها من الأمراض الأخرى وذلك من الناحية العلاجية فهي قد تحتاج إلى وقت كبيراً جداً  حتى يتم التخلص منها بشكل صحيح ومن الممكن أن تمتد هذة الأمراض إلى مدى حياة الشخص المريض بها ويكون علاجها مكلف بشكل كبير جداً ويعتبر هذا العلاج مثكلف ومزعج لذلك الشخص \n" +
            "للوقاية منها:\n" +
            "     1- أن يتم تناول الطعام الصحي للإنسان وخاصة الفواكه والخضراوات.\n" +
            "     2- شرب المياة بكميات كبيرة فهي تعمل على تقوية الجسم ومن خلالها يتم مكافحة العدوى.\n" +
            "     3- أن يتم تناول السمك ولو لمرة واحدة فقط في الأسبوع حيث أنه قد أثبتت الدراسات بأنّه قد يعمل على تقليل الإصابة بجلطات القلب.\n" +
            "     4- مراعاة عدم الذهاب إلى الأماكن المزدحمة وذلك في حال وجود أي مرض من الأمراض التي قد تسبب العدوى.\n" +
            "     5- التوقف عن التدخين يُعد أمراً ضرورياً وذلك لكي يتم الحد من الإصابة بأمراض في الرئتين والسرطان وكل ذلك يكون بسبب مادة النيكوتين.\n";

    String some_dis = "أمراض القلب\n" +
            "1- متلازمة الشريان التاجي: وهو عبارة عن اعتلال الشرايين الناتج عن تراكم الصفائح الدهنية داخل جدرانها، وتنتشر الأوعية الدموية التاجية على الجانب الخارجي من عضلة القلب، وتكمن وظيفتها في توصيل الدم إلى القلب نفسه، ومن أعراض الإصابة بمتلازمة الشريان التاجي، الذبحة الصدرية، واحتشاء عضلة القلب، وتلك الأعراض تكون مصحوبة بالتعرق وضيق التنفس، والاحساس بالاختناق والغثيان.\n" +
            "2- اضطراب ضربات القلب: وهناك أنواع مختلفة منه وأهمها انقباض أذيني سابق لأوانه، وانقباض بطيني سابق لأوانه، والرجفان الأذيني، والرفرفة الأذينية، وقد ينتج عن اضطراب ضربات القلب اختلال في توازن الشوارد الكهربائية في الدم، واضطرابات توصيل النظام الكهربائي في القلب.\n" +
            "3- اعتلال عضلة القلب: ويكون السبب الرئيسي في الإصابة بهذه المشكلة هو توسع البطين الأيسر، وهو حجرة ضخ الدم الرئيسية في القلب، وبالتالي تصبح فعالية القلب في ضخ الدم أقل، ممّا يؤدي إلى عدم جريان الدم في القلب ثمّ ضخه في الجسم بالشكل الصحيح.\n" +
            "4- عدوى عضلة القلب: والتي تكون بسبب الطفيليات أو البكتيريا أو الفيروسات.\n" +
            "5- أمراض أخرى: مرض صمامات القلب. قصور القلب. مرض القلب الالتهابي والذي يشمل التهاب عضلة القلب، والتهاب بطانة القلب. عيوب القلب الخلقية.\n" +
            "طرق الوقاية من أمراض القلب:\n" +
            "1- اتباع نظام غذائي متوازن وصحي، حيث يعتمد على تناول الأطعمة قليلة الدهون والغنية بالألياف، كما يجب تناول الخضروات والفواكه الطازجة والحبوب الكاملة، بالإضافة إلى ذلك فإنّه يفضل عدم تناول الأطعمة التي تحتوي على كميات كبيرة من الملح، إذ إنّ كمية الملح الموصى بها يومياً يجب أن لا تتجاوز ستة غرامات.\n" +
            "2- ممارسة التمارين الرياضية والأنشطة البدنية بانتظام، لأنّها تساعد بفعالية في زيادة كفاءة القلب والأوعية الدموية، كما أنّها تنشط الدورة الدموية وتزيد تدفق الدم لجميع أعضاء الجسم، بالإضافة إلى أنّ الرياضة تخفض الكولسترول وتذيب الدهون وتحافظ على ضغط الدم ضمن مستواها الطبيعي.\n" +
            "3- الابتعاد عن التدخين وتناول المشروبات الكحولية، حيث يزيدان خطر الإصابة بالنوبات القلبية. عدم تناول كميات كبيرة من السكر للمحافظة على مستوى السكر في الدم ضمن معدله الطبيعي. الاتبعاد عن كل ما يسبب التوتر والعصبية والإجهاد النفسي.\n" +
            "\n" +
            "\n" +
            "مرض السرطان\n" +
            "مرض السرطان (cancer): هو مصطلح طبّيّ يشمل مجموعة كبيرة من الأمراض التي تغزو جسم الإنسان، وهو عبارة عن خلايا تنمو نموّاً غير طبيعيّ وسريع في الجسم، هذة الخلايا السرطانيّة لها القدرة أن تخترق الأنسجة، وتعمل على تدمير وإصابة الأنسجة السليمة في الجسم، من خلال حدوث انقسام لهذة الخلايا وهو لايصيب عضو معيّناً، فقد يصاب أيّ عضو في الجسم بالسرطان، ويُعتبر السرطان هو من الأسباب الرئيسيّة للوفاة، واحتماليّة الشفاء منه عالية إذا تمّ اكتشافه مبكّراً وفي مراحله الأولى، من أكثر أنواع السرطانات المنتشرة بين النساء هو سرطان الثدي، وبين الرجال سرطان غدّة البروستات.\n" +
            " مضاعفات السرطان:\n" +
            " تأثيرات جانبيّة مترتّبة، خلّل في أكثر من عضو. تفشّي السرطان.\n" +
            " خلل في جهاز المناعة.\n" +
            " عودة خلايا السرطان بعد الشفاء منه.\n" +
            "طرق الوقاية من مرض السرطان:\n" +
            "1- الإقلاع عن التدخين: حيث إنّ تدخين سيجارة واحدة يزيد من فرصة الشخص للإصابة به، وخصوصاً سرطان الرئة، فعند ترك التدخين والابتعاد عنه سوف يخفّض من فرص انقسام ونموّ هذة الخلايا في الجسم وتفشّيها، كما يُعتبر التدخين السلبيّ خطيراً جدّاً على حياة الأشخاص الذين يستنشقون رائحة الدخان، ومن الممكن إصابة بالعديد من السرطانات، لذا ينبغي الابتعاد عن الشخص المدخّن، والحدّ من التعرّض للتدخين.\n" +
            "2- تجنّب التعرّض الكثير لأشعة الشمس: من المعروف أنّ شمس مصدر مهمّ لفيتامين D، لكن التعرّض الزائد لأشعّة الشمس قد يزيد من فرصة الإصابة بسرطان الجلد، لذا ينبغي تجنّب أشعّة الشمس بإرتداء ملابس واقية، وأيضاً تجنّبها في منتصف النهار قدر المستطاع.\n" +
            "3- المحافظة على نظام غذائيّ صحّيّ ومتوازن: زيادة الوزن والسمنة تزيد من فرص نموّ الخلايا السرطانيّة في الجسم، لذا ينبغي تناول طعام صحّي ومفيد للجسم، والعمل على التخلّص من الوزن الزائد، وممارسة الرياضة باستمرار.\n" +
            "4- الحرص على إجراء فحوصات:والهدف منها الكشف المبكر عن وجود أيّ خلايا غريبة بالجسم، والعمل على معالجتها منذ البداية، قبل أن يتفشّى السرطان في الجسم ويصعب علاجه.\n" +
            "5- الحدّ من شرب الكحول:قد يعرّض الجسم للإصابة بالعديد من الأمراض ومنها السرطان، تناول الكحول يزيد من فرص الإصابة بالسرطان، وخصوصاً سرطان الكبد، لذا ينبغي الإقلاع عنه بشكل نهائيّ.\n" +
            "6- شرب الكثير من الماء: حيث يقلّل خطر إصابة الشخص بسرطان المثانة، وطرد جميع الموادّ الضارّة من المثانة بشرب كمّيّات كافية من الماء يوميّاً.\n" +
            "\n" +
            "\n" +
            " أمراض الجهاز التنفسي\n" +
            "هناك عدة امراض قد تصيب الجهاز التنفسي منها:\n" +
            "1- التهاب القصبات الهوائية: هو الالتهاب الذي ينتج عن الإصابة بعدوى فيروسية، حيث يمكن الوقاية منه عن طريق أخذ حقن التطعيم.\n" +
            "2- ذات الرئة: هي عدوى تصيب عمق الرئة، وتؤدّي إلى التهابها، إذ يمكن الوقاية منها عن طريق أخذ اللقاح المضادّ لهذه العدوى.\n" +
            "3- التهاب الجيوب الأنفية: هي التهاب يُصيب منطقة الجيوب، ويُشعر المريض بألم وضيق في منطقة الوجه، ويمكن الوقاية منه عن طريق أخذ الحذر من الإصابة بنزلات البرد، لأنّها تعتبر من مسبباته الأساسية، بالإضافة إلى عدم التمخط بقوة لعدم تغلغل البكتيريا في الجيوب.\n" +
            "4- نزلات البرد: تُصيب الأغشية المخاطية في جدار الأنف، حيث يمكن الوقاية منها عن طريق غسل اليدين بشكلٍ مستمرّ لتجنّب انتقال البكتيريا والفيروسات إلى الجسم بعد ملامسة الأنف.\n" +
            "5- الحساسية: تتمثل في إصابة الشخص بحساسية الربو، أو الحساسية الأنفية، بسبب التأثر بمادة ما، لذلك يُفضّل الابتعاد بقدر الإمكان عن المواد التي تسبّب هذا النوع من الحساسية.\n" +
            "حماية الجهاز التنفسي:\n" +
            " قد يصاب الجهاز التنفسي بالعديد من المشاكل، سواء بفعل المؤثرات الخارجيّة، أو بسبب الممارسات الخاطئة التي يقوم بها الإنسان، ولحمايته يجب اتباع ما يلي:\n" +
            "1- تجنّب التنفس من الفم، حيث يؤدّي ذلك إلى استنشاق هواء غير نقي، ومليء بالأتربة. ممارسة الرياضة بشكلٍ منتظم، لما لها من أهمية في تنشيط الجهاز التنفسي، عن طريق استنشاق كميات أكبر من الهواء.\n" +
            "2- التجوّل في الأماكن الخضراء والغنية بالأشجار، إذ إنّ هذه المناطق تحتوي على كميات كبيرة من الأكسجين.\n" +
            "3- الابتعاد عن التدخين، والمخدارت، مع العلم أنّ التدخين بكثرة يسبّب التهاب الجهاز التنفسي، والشعب الهوائية، بالإضافة إلى الإصابة بالسرطان.\n" +
            "4- تناول الأغذية التي تحتوي على كميات كبيرة من الفيتامينات، وخاصية فيتامين ج، وفيتامين د، وفيتامين هـ.\n" +
            "5- أخذ المطاعيم عند الإصابة بالإنفلونزا، لمنع تفاقم المرض وحدوث التهابات مزمنة في الجهاز التنفسي. شرب السوائل بكثرة، حيث تعمل على تقليل إفرازات الرئتين، وبالتالي تحسين عملية التنفس.\n" +
            "6- الابتعاد عن عوادم ومحركات مركبات القيادة، بالإضافة إلى الأماكن ذات الهواء الملوّث.\n" +
            "\n" +
            "\n" +
            "مرض السكر\n" +
            "يُعرّف مرض السكر (بالإنجليزية: Diabetes) على أنّه مجموعة من الاضطرابات الأيضية التي ينجم عنها ارتفاع مستويات السكر في الدم فوق الحدّ الطبيعيّ، وذلك إمّا بسبب عدم إنتاج البنكرياس كميات كافية من الإنسولين، وإمّا بسبب ضعف استجابة أو مقاومة خلايا الجسم للإنسولين المُفرز، وإمّا بسبب وجود هاتين المشكلتين في الوقت ذاته، ويجدر بيان أنّ ارتفاع السكر في الدم بسبب عدم إفراز الإنسولين يُعرف بمرض السكر من النوع الأول، ويُشكل هذا النوع ما نسبته 10% من مجموع حالات مرض السكري، بينما يُعتبر مرض السكر الناجم إمّا عن إفراز الإنسولين بكمية أقل من حاجة الجسم أو بسبب عدم استجابة الخلايا للإنسولين على الوجه المطلوب بمرض السكر من النوع الثاني.\n" +
            " الوقاية من مرض السكر:\n" +
            " في الحديث عن الوقاية من مرض السكر، يُقصد مرض السكر من النوع الثاني، إذ إنّ هناك الكثير من الحالات التي يُعاني فيها الأشخاص من مرحلةٍ تُعرف بما قبل السكري (بالإنجليزية: Prediabetes)، وهي المرحلة التي ترتفع فيها مستويات السكر في الدم ولكن دون الحدّ الذي يكفي لتشخيص الإصابة بالسكري، وإنّ 70% من مرضى مرحلة ما قبل السكري تتطور حالاتهم إلى السكري، وعليه لا بُدّ من تقديم بعض النصائح حول كيفية الوقاية أو الحدّ من خطر الإصابة بالمرض في هذه الحالات، ويمكن تفصيل طرق الوقاية فيما يأتي:\n" +
            "1- ضبط النظام الغذائي هناك أربع نصائح رئيسية تلعب دوراً مهمّاً في الوقاية أو على الأقل تقليل خطر الإصابة بمرض السكري من النوع الثاني، ويمكن إجمال هذه النصائح فيما يأتي:\n" +
            "أ- الحدّ من تناول الأطعمة المحتوية على الكربوهيدرات المُعالجة والمُكرّرة، والاستعاضة عنها بالحبوب الكاملة مثل القمح والنخالة، فهناك العديد من الأدلة الموثوقة التي تُثبت أنّ تناول الكربوهيدرات المكررة يزيد من خطر الإصابة بمرض السكر، ومن الأمثلة على هذه الكربوهيدرات: الأرز الأبيض، والخبز الأبيض، والبطاطا المهروسة بالزبدة، وغيرها، وذلك لأنّ الكربوهيدرات المُكرّرة تتسبب بارتفاع مستويات السكر في الدم بشكلٍ سريع وحادّ للغاية، الأمر الذي يؤدي إلى زيادة خطر الإصابة بمرض السكري، وبالمقابل تُعيق الحبوب الكاملة عملية هضم النشويات من قبل الإنزيمات الهاضمة، الأمر الذي يؤخر تكسيرها إلى سكر الجلوكوز، وبالتالي ترتفع مستويات السكر في الدم بشكلٍ أبطأ وأقل مقارنة بالكربوهيدرات المكررة، وهذا ما جعل من الحبوب الكاملة خياراً جيداً لتقليل خطر الإصابة بمرض السكري.\n" +
            "ب- تجنّب المشروبات المُحلّاة والاستعاضة عنها بالماء، أو الشاي، أو القهوة غير المُحلّاة، وذلك لأنّ العصائر والمشروبات المُحلّاة عموماً تتسبب بزيادة خطر الإصابة بمرض السكري، وذلك لعدة عوامل، منها: تسببها بزيادة مستوى الدهون الثلاثية، والالتهاب المزمن، ومقاومة الخلايا للإنسولين، وفي الوقت ذاته تتسبب هذه المشروبات بإنقاص مستوى الكولسترول الجيد المعروف علمياً بالبروتين الدهنيّ مرتفع الكثافة (بالإنجليزية: High Density Lipoprotein)، ومن جهة أخرى تبيّن أنّ تناول المشروبات المُحلّاة يزيد الوزن، وإنّ الاستعاضة عنه بالماء تؤدي إلى إنقاص الوزن، وكما سيتمّ بيانه فإنّ إنقاص الوزن يُقلّل خطر الإصابة بالسكري.\n" +
            "ج- اختيار الأطعمة المحتوية على الدهون الجيدة بدلاً من الدهون السيئة، ومن الأمثلة على الدهون الجيدة: الدهون غير المشبعة المتعددة (بالإنجليزية: Polyunsaturated fats)، كتلك الموجودة بالمكسرات والزيون النباتية، في حين تُعدّ الأطعمة المقلية، والسمنة النباتية، ومعظم الأطعمة الجاهزة من الأمثلة على مصادر الدهون الضارة.\n" +
            "د- الامتناع عن تناول اللحوم المعالجة، مثل النقانق، ويُنصح بالحدّ من كمية اللحوم الحمراء، كلحم البقر والضأن، ويُنصح بالاستعاضة عن هذه الأطعمة بالسمك.\n" +
            "2- إنقاص الوزن الزائد تبين أنّ الأشخاص الذين يُعانون من مرحلة ما قبل السكري مُصابون بزيادة الوزن، وخاصة في منطقة البطن، وما حول الأعضاء الداخلية بما فيها الكبد، الأمر الذي يزيد من مقاومة خلايا الجسم للإنسولين المُفرز، ويُحفّز الالتهاب، وهذا ما يؤدي إلى زيادة احتمالية تطور المرحلة إلى مرض السكري، وعليه فإنّ إنقاص الوزن يحدّ من خطر تطور الأمر إلى مرض السكري، حتى إن كانت نسبة إنقاص الوزن قليلة.\n" +
            "3- الإقلاع عن التدخين يزيد التدخين من فرصة الإصابة بمرض السكري، وقد أثبتت دراسات موثوقة أنّ الإقلاع عن التدخين يُقلّل هذا الخطر، فبعد مرور خمسة أعوام على الإقلاع عن التدخين تنخفض نسبة الإصابة بالسكري بما يُقارب 13%، وبعد مرور عشرين عاماً على الإقلاع عن التدخين يُصبح خطر الإصابة بالسكري لدى المُدخّنين كما هو لدى غير المُدخّنين.\n" +
            "4- ممارسة الرياضة بانتظام تساعد ممارسة التمارين الرياضية بشكلٍ منتظم على زيادة حساسية خلايا الجسم للإنسولين المُفرز، الأمر الذي يتطلب كميات أقل من الإنسولين للسيطرة على مستويات السكر في الدم، وهذا ما يُقلّل خطر الإصابة بالسكري، ومن الأمثلة على التمارين الرياضية التي يُنصح بممارستها: التمارين الهوائية، وتمارين القوة.\n" +
            "5- نصائح أخرى إضافة إلى ما سبق، هناك مجموعة من النصائح التي تُقدّم لتقليل خطر الإصابة بالسكري، ويمكن إجمالها فيما يأتي:\n" +
            "أ- الحرص على اختيار الماء كمشروب رئيسيّ، فهذا من شأنه أن يُقلل من تناول الإنسان للمشروبات الغازية، والعصائر، والسوائل المُحلّاة عامة، وبالتالي تقليل فرصة الإصابة بمرض السكري.\n" +
            "ب- تجنّب الوجبات الكبيرة، والاستعاضة عنها بوجبات صغيرة متكررة، إذ إنّ تناول كمية كبيرة من الطعام دفعة واحد يتسبب بزيادة خطر ارتفاع السكر والإنسولين، وهذا ما يزيد احتمالية المعاناة من مرض السكر.\n" +
            "ج- تجنّب الجلوس لفترات طويلة من الزمن.\n" +
            "د- تناول الأطعمة الغنية بفتيامين د أو تناول المكملات المحتوية عليه، وذلك لدوره في تقليل فرصة الإصابة بمرض السكر.\n";

    public EssayFragment() {
        // Required empty public constructor
    }


    private TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12, tv13, tv14, tv15, tv16, tv17, tv18,tv19;
    private TextView ev1, ev2, ev3, ev4, ev5, ev6, ev7, ev8, ev9, ev10, ev11, ev12, ev13, ev14;
    int tvv1 = R.id.tt1;int tvv2 = R.id.tt2;int tvv3 = R.id.tt3;int tvv4 = R.id.tt4;int tvv5 = R.id.tt5;int tvv6 = R.id.tt6;int tvv7 = R.id.tt7;int tvv8 = R.id.tt8;int tvv9 = R.id.tt9;int tvv10 = R.id.tt10;int tvv11 = R.id.tt11;int tvv12 = R.id.tt12;int tvv13 = R.id.tt13;
    int tvv14 = R.id.tt14;int tvv15 = R.id.tt15;int tvv16 = R.id.tt16;int tvv17 = R.id.tt17;int tvv18 = R.id.tt18;int tvv19=R.id.tt19;
    int evv1 = R.id.disease;int evv2 = R.id.aarad;int evv3 = R.id.cause;int evv4 = R.id.mult;int evv5 = R.id.tash;int evv6 = R.id.cure;int evv7 = R.id.prot;int evv8 = R.id.san;int evv9 = R.id.hyg;int evv10 = R.id.hyg_im;int evv11 = R.id.hyg_how;int evv12 = R.id.islam;int evv13 = R.id.dis;int evv14 = R.id.some_dis;
    int o1 = 0;int o2 = 0;int o3 = 0;int o4 = 0;int o5 = 0;int o6 = 0;int o7 = 0;int o8 = 0;int o9 = 0;int o10 = 0;int o11 = 0;int o12 = 0;int o13 = 0;int o14 = 0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_essay, container, false);
        tv1 = id(view, tvv1);tv2 = id(view, tvv2);tv3 = id(view, tvv3);tv4 = id(view, tvv4);tv5 = id(view, tvv5);tv6 = id(view, tvv6);tv7 = id(view, tvv7);tv8 = id(view, tvv8);tv9 = id(view, tvv9);tv10 = id(view, tvv10);tv11 = id(view, tvv11);tv12 = id(view, tvv12);tv13 = id(view, tvv13);tv14 = id(view, tvv14);tv15 = id(view, tvv15);tv16 = id(view, tvv16);tv17 = id(view, tvv17);tv18 = id(view, tvv18);tv19=id(view,tvv19);
        ev1 = id(view, evv1);ev2 = id(view, evv2);ev3 = id(view, evv3);ev4 = id(view, evv4);ev5 = id(view, evv5);ev6 = id(view, evv6);ev7 = id(view, evv7);ev8 = id(view, evv8);ev9 = id(view, evv9);ev10 = id(view, evv10);ev11 = id(view, evv11);ev12 = id(view, evv12);ev13 = id(view, evv13);ev14 = id(view, evv14);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (o1 % 2 == 0) {
                    ev1.setText(disease);
                    o1++;
                } else {
                    ev1.setText("");
                    o1++;
                }

            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (o2 % 2 == 0) {
                    ev2.setText(aarad);
                    o2++;
                } else {
                    ev2.setText("");
                    o2++;
                }            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o3 % 2 == 0) {
                    ev3.setText(cause);
                    o3++;
                } else {
                    ev3.setText("");
                    o3++;
                }
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (o4 % 2 == 0) {
                    ev4.setText(mult);
                    o4++;
                } else {
                    ev4.setText("");
                    o4++;
                }
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o5 % 2 == 0) {
                    ev5.setText(tash);
                    o5++;
                } else {
                    ev5.setText("");
                    o5++;
                }
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o6 % 2 == 0) {
                    ev6.setText(cure);
                    o6++;
                } else {
                    ev6.setText("");
                    o6++;
                }
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o7 % 2 == 0) {
                    ev7.setText(prot);
                    o7++;
                } else {
                    ev7.setText("");
                    o7++;
                }
            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o8 % 2 == 0) {
                    ev8.setText(san);
                    o8++;
                } else {
                    ev8.setText("");
                    o8++;
                }
            }
        });
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o9 % 2 == 0) {
                    ev9.setText(hyg);
                    o9++;
                } else {
                    ev9.setText("");
                    o9++;
                }
            }
        });
        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o10 % 2 == 0) {
                    ev10.setText(hyg_im);
                    o10++;
                } else {
                    ev10.setText("");
                    o10++;
                }
            }
        });
        tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o11 % 2 == 0) {
                    ev11.setText(hyg_how);
                    o11++;
                } else {
                    ev11.setText("");
                    o11++;
                }
            }
        });
        tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o12 % 2 == 0) {
                    ev12.setText(islam);
                    o12++;
                } else {
                    ev12.setText("");
                    o12++;
                }
            }
        });
        tv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o13 % 2 == 0) {
                    ev13.setText(dis);
                    o13++;
                } else {
                    ev13.setText("");
                    o13++;
                }
            }
        });
        tv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (o14 % 2 == 0) {
                    ev14.setText(some_dis);
                    o14++;
                } else {
                    ev14.setText("");
                    o14++;
                }
            }
        });
        tv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                internet("http://hayatouki.com/child/content/1846323-%D8%A7%D9%84%D8%A3%D9%85%D8%B1%D8%A7%D8%B6-%D8%A7%D9%84%D8%AA%D9%8A-%D9%82%D8%AF-%D8%AA%D8%B5%D9%8A%D8%A8-%D8%B7%D9%81%D9%84%D9%83-%D9%81%D9%8A-%D8%A7%D9%84%D9%85%D8%AF%D8%B1%D8%B3%D8%A9-%D9%88%D9%83%D9%8A%D9%81%D9%8A%D8%A9-%D8%A7%D9%84%D9%88%D9%82%D8%A7%D9%8A%D8%A9-%D9%85%D9%86%D9%87%D8%A7");
            }
        });
        tv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                internet("https://mawdoo3.com/%D9%85%D8%A7_%D9%87%D9%8A_%D8%A3%D9%85%D8%B1%D8%A7%D8%B6_%D8%A7%D9%84%D9%85%D9%86%D8%A7%D8%B9%D8%A9");
            }
        });
        tv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                internet("https://mawdoo3.com/%D9%83%D9%8A%D9%81%D9%8A%D8%A9_%D8%B9%D9%84%D8%A7%D8%AC_%D8%A7%D9%84%D9%85%D8%B1%D9%8A%D8%B6_%D8%A7%D9%84%D9%86%D9%81%D8%B3%D9%8A");
            }
        });
        tv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                internet("https://mawdoo3.com/%D8%B7%D8%B1%D9%82_%D8%A7%D9%84%D9%88%D9%82%D8%A7%D9%8A%D8%A9_%D9%85%D9%86_%D9%81%D9%8A%D8%B1%D9%88%D8%B3_%D8%B3%D9%8A");
            }
        });
        tv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                internet("https://www.webteb.com/general-health/diseases");
            }
        });


        return view;
    }

//بتعرف ال Textview بال id
    private TextView id(View view, int m) {
        return view.findViewById(m);
    }
//بتفتح المتصفح ب url معين
    private void internet(String url) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }
}