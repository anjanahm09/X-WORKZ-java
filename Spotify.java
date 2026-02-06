class Spotify{
	public static void main(String[] songs){
		String kannadaSongs[] = {
		"Neene neene", "Belageddu" , "Dwapara" , "Singara siriye", "Dance anthem", "Varaha Roopam", "Mast Malaika" , "Soul of Dia", "Bangle Bangari", "Psyco saithan"};
		
		/*String neeneNeene = kannadaSongs[0];
		String belageddu = kannadaSongs[1];
		String dwapara = kannadaSongs[2];
		String singaraSiriye = kannadaSongs[3];
		String danceAnthem = kannadaSongs[4];
		String varahaRoopam = kannadaSongs[5];
		String mastMalaika = kannadaSongs[6];
		String soulOfDia = kannadaSongs[7];
		String bangleBangari = kannadaSongs[8];
		String psycoSaithan = kannadaSongs[9];*/
		
		int size = kannadaSongs.length;
		
		System.out.println("The number of songs available on Spotify are : " + size);
		
		System.out.println("List of songs available on Spotify are : ");
		//System.out.println(neeneNeene + "\n"+ belageddu + "\n" + dwapara +"\n" + singaraSiriye +"\n"+ danceAnthem +"\n" + varahaRoopam +"\n"+ mastMalaika +"\n"+ soulOfDia +"\n"+ bangleBangari +"\n"+ psycoSaithan);
	
	    for(String song : kannadaSongs){
			System.out.println(song);
		}
	
	}
}