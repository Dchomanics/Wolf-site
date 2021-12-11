package testing;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class occurunit {
	

		@Test
		public void test() {
			JunitTesting test = new JunitTesting();
			int output = test.countA("\"Once upon a midnight dreary, while I pondered, weak and weary,\\r\\n\"\r\n"
					+ "				+ \"Over many a quaint and curious volume of forgotten lore�\\r\\n\"\r\n"
					+ "				+ \"While I nodded, nearly napping, suddenly there came a tapping,\\r\\n\"\r\n"
					+ "				+ \"As of some one gently rapping, rapping at my chamber door.\\r\\n\"\r\n"
					+ "				+ \"��Tis some visiter,� I muttered, �tapping at my chamber door�\\r\\n\"\r\n"
					+ "				+ \"Only this and nothing more.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"Ah, distinctly I remember it was in the bleak December,\\r\\n\"\r\n"
					+ "				+ \"And each separate dying ember wrought its ghost upon the floor.\\r\\n\"\r\n"
					+ "				+ \"Eagerly I wished the morrow;�vainly I had sought to borrow\\r\\n\"\r\n"
					+ "				+ \"From my books surcease of sorrow�sorrow for the lost Lenore�\\r\\n\"\r\n"
					+ "				+ \"For the rare and radiant maiden whom the angels name Lenore�\\r\\n\"\r\n"
					+ "				+ \"Nameless here for evermore.\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"And the silken sad uncertain rustling of each purple curtain\\r\\n\"\r\n"
					+ "				+ \"Thrilled me�filled me with fantastic terrors never felt before;\\r\\n\"\r\n"
					+ "				+ \"So that now, to still the beating of my heart, I stood repeating\\r\\n\"\r\n"
					+ "				+ \"��Tis some visiter entreating entrance at my chamber door�\\r\\n\"\r\n"
					+ "				+ \"Some late visiter entreating entrance at my chamber door;\\r\\n\"\r\n"
					+ "				+ \"This it is and nothing more.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"Presently my soul grew stronger; hesitating then no longer,\\r\\n\"\r\n"
					+ "				+ \"�Sir,� said I, �or Madam, truly your forgiveness I implore;\\r\\n\"\r\n"
					+ "				+ \"But the fact is I was napping, and so gently you came rapping,\\r\\n\"\r\n"
					+ "				+ \"And so faintly you came tapping, tapping at my chamber door,\\r\\n\"\r\n"
					+ "				+ \"That I scarce was sure I heard you��here I opened wide the door�\\r\\n\"\r\n"
					+ "				+ \"Darkness there and nothing more.\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"Deep into that darkness peering, long I stood there wondering, fearing,\\r\\n\"\r\n"
					+ "				+ \"Doubting, dreaming dreams no mortals ever dared to dream before;\\r\\n\"\r\n"
					+ "				+ \"But the silence was unbroken, and the stillness gave no token,\\r\\n\"\r\n"
					+ "				+ \"And the only word there spoken was the whispered word, �Lenore?�\\r\\n\"\r\n"
					+ "				+ \"This I whispered, and an echo murmured back the word, �Lenore!��\\r\\n\"\r\n"
					+ "				+ \"Merely this and nothing more.\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"Back into the chamber turning, all my soul within me burning,\\r\\n\"\r\n"
					+ "				+ \"Soon again I heard a tapping something louder than before.\\r\\n\"\r\n"
					+ "				+ \"�Surely,� said I, �surely that is something at my window lattice;\\r\\n\"\r\n"
					+ "				+ \"Let me see, then, what thereat is and this mystery explore�\\r\\n\"\r\n"
					+ "				+ \"Let my heart be still a moment and this mystery explore;�\\r\\n\"\r\n"
					+ "				+ \"�Tis the wind and nothing more.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"Open here I flung the shutter, when, with many a flirt and flutter,\\r\\n\"\r\n"
					+ "				+ \"In there stepped a stately Raven of the saintly days of yore.\\r\\n\"\r\n"
					+ "				+ \"Not the least obeisance made he; not a minute stopped or stayed he,\\r\\n\"\r\n"
					+ "				+ \"But, with mien of lord or lady, perched above my chamber door�\\r\\n\"\r\n"
					+ "				+ \"Perched upon a bust of Pallas just above my chamber door�\\r\\n\"\r\n"
					+ "				+ \"Perched, and sat, and nothing more.\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"Then the ebony bird beguiling my sad fancy into smiling,\\r\\n\"\r\n"
					+ "				+ \"By the grave and stern decorum of the countenance it wore,\\r\\n\"\r\n"
					+ "				+ \"�Though thy crest be shorn and shaven, thou,� I said, �art sure no craven,\\r\\n\"\r\n"
					+ "				+ \"Ghastly grim and ancient Raven wandering from the Nightly shore�\\r\\n\"\r\n"
					+ "				+ \"Tell me what thy lordly name is on the Night�s Plutonian shore!�\\r\\n\"\r\n"
					+ "				+ \"Quoth the Raven, �Nevermore.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"Much I marvelled this ungainly fowl to hear discourse so plainly,\\r\\n\"\r\n"
					+ "				+ \"Though its answer little meaning�little relevancy bore;\\r\\n\"\r\n"
					+ "				+ \"For we cannot help agreeing that no living human being\\r\\n\"\r\n"
					+ "				+ \"Ever yet was blessed with seeing bird above his chamber door�\\r\\n\"\r\n"
					+ "				+ \"Bird or beast upon the sculptured bust above his chamber door,\\r\\n\"\r\n"
					+ "				+ \"With such name as �Nevermore.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"But the Raven, sitting lonely on that placid bust, spoke only\\r\\n\"\r\n"
					+ "				+ \"That one word, as if its soul in that one word he did outpour\\r\\n\"\r\n"
					+ "				+ \"Nothing farther then he uttered; not a feather then he fluttered�\\r\\n\"\r\n"
					+ "				+ \"Till I scarcely more than muttered: �Other friends have flown before�\\r\\n\"\r\n"
					+ "				+ \"On the morrow he will leave me, as my Hopes have flown before.�\\r\\n\"\r\n"
					+ "				+ \"Then the bird said �Nevermore.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"Startled at the stillness broken by reply so aptly spoken,\\r\\n\"\r\n"
					+ "				+ \"�Doubtless,� said I, �what it utters is its only stock and store,\\r\\n\"\r\n"
					+ "				+ \"Caught from some unhappy master whom unmerciful Disaster\\r\\n\"\r\n"
					+ "				+ \"Followed fast and followed faster till his songs one burden bore�\\r\\n\"\r\n"
					+ "				+ \"Till the dirges of his Hope that melancholy burden bore\\r\\n\"\r\n"
					+ "				+ \"Of �Never�nevermore.��\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"But the Raven still beguiling all my sad soul into smiling,\\r\\n\"\r\n"
					+ "				+ \"Straight I wheeled a cushioned seat in front of bird and bust and door;\\r\\n\"\r\n"
					+ "				+ \"Then, upon the velvet sinking, I betook myself to linking\\r\\n\"\r\n"
					+ "				+ \"Fancy unto fancy, thinking what this ominous bird of yore�\\r\\n\"\r\n"
					+ "				+ \"What this grim, ungainly, ghastly, gaunt, and ominous bird of yore\\r\\n\"\r\n"
					+ "				+ \"Meant in croaking �Nevermore.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"This I sat engaged in guessing, but no syllable expressing\\r\\n\"\r\n"
					+ "				+ \"To the fowl whose fiery eyes now burned into my bosom�s core;\\r\\n\"\r\n"
					+ "				+ \"This and more I sat divining, with my head at ease reclining\\r\\n\"\r\n"
					+ "				+ \"On the cushion�s velvet lining that the lamp-light gloated o�er,\\r\\n\"\r\n"
					+ "				+ \"But whose velvet violet lining with the lamp-light gloating o�er\\r\\n\"\r\n"
					+ "				+ \"She shall press, ah, nevermore!\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"Then, methought, the air grew denser, perfumed from an unseen censer\\r\\n\"\r\n"
					+ "				+ \"Swung by Seraphim whose foot-falls tinkled on the tufted floor.\\r\\n\"\r\n"
					+ "				+ \"�Wretch,� I cried, �thy God hath lent thee�by these angels he hath sent thee\\r\\n\"\r\n"
					+ "				+ \"Respite�respite and nepenthe from thy memories of Lenore!\\r\\n\"\r\n"
					+ "				+ \"Quaff, oh quaff this kind nepenthe and forget this lost Lenore!�\\r\\n\"\r\n"
					+ "				+ \"Quoth the Raven, �Nevermore.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"�Prophet!� said I, �thing of evil!�prophet still, if bird or devil!�\\r\\n\"\r\n"
					+ "				+ \"Whether Tempter sent, or whether tempest tossed thee here ashore,\\r\\n\"\r\n"
					+ "				+ \"Desolate, yet all undaunted, on this desert land enchanted�\\r\\n\"\r\n"
					+ "				+ \"On this home by Horror haunted�tell me truly, I implore�\\r\\n\"\r\n"
					+ "				+ \"Is there�is there balm in Gilead?�tell me�tell me, I implore!�\\r\\n\"\r\n"
					+ "				+ \"Quoth the Raven, �Nevermore.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"�Prophet!� said I, �thing of evil!�prophet still, if bird or devil!\\r\\n\"\r\n"
					+ "				+ \"By that Heaven that bends above us�by that God we both adore�\\r\\n\"\r\n"
					+ "				+ \"Tell this soul with sorrow laden if, within the distant Aidenn,\\r\\n\"\r\n"
					+ "				+ \"It shall clasp a sainted maiden whom the angels name Lenore�\\r\\n\"\r\n"
					+ "				+ \"Clasp a rare and radiant maiden whom the angels name Lenore.�\\r\\n\"\r\n"
					+ "				+ \"Quoth the Raven, �Nevermore.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"�Be that our sign of parting, bird or fiend!� I shrieked, upstarting�\\r\\n\"\r\n"
					+ "				+ \"�Get thee back into the tempest and the Night�s Plutonian shore!\\r\\n\"\r\n"
					+ "				+ \"Leave no black plume as a token of that lie thy soul has spoken!\\r\\n\"\r\n"
					+ "				+ \"Leave my loneliness unbroken!�quit the bust above my door!\\r\\n\"\r\n"
					+ "				+ \"Take thy beak from out my heart, and take thy form from off my door!�\\r\\n\"\r\n"
					+ "				+ \"Quoth the Raven, �Nevermore.�\\r\\n\"\r\n"
					+ "				+ \"\\r\\n\"\r\n"
					+ "				+ \"And the Raven, never flitting, still is sitting, still is sitting\\r\\n\"\r\n"
					+ "				+ \"On the pallid bust of Pallas just above my chamber door;\\r\\n\"\r\n"
					+ "				+ \"And his eyes have all the seeming of a demon�s that is dreaming\\r\\n\"\r\n"
					+ "				+ \"And the lamp-light o�er him streaming throws his shadows on the floor;\\r\\n\"\r\n"
					+ "				+ \"And my soul from out that shadow that lies floating on the floor\\r\\n\"\r\n"
					+ "				+ \"Shall be lifted�nevermore!\"");
			assertEquals(342, output);
		}

	}