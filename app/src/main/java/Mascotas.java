public class MascotaAdapter extends RecyclerView.Adapter<MascotaAdapter.MascotaViewHolder> {

    private List<MascotaAdapter> listaMascotas;

    public MascotaAdapter(List<MascotaAdapter> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_mascota, parent, false);
        return new MascotaViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder holder, int position) {
        Mascota mascota = listaMascotas.get(position);
        holder.bind(mascota);
    }

    @Override
    public int getItemCount() {
        return listaMascotas.size();
    }

    public class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageViewMascota;
        private TextView textViewNombre;
        private ImageView imageViewHueso;
        private TextView textViewRating;

        public MascotaViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewMascota = itemView.findViewById(R.id.image_mascota);
            textViewNombre = itemView.findViewById(R.id.text_nombre);
            imageViewHueso = itemView.findViewById(R.id.icon_hueso);
            textViewRating = itemView.findViewById(R.id.text_rating);
        }

        public void bind(Mascota mascota) {
            imageViewMascota.setImageResource(mascota.getImagen());
            textViewNombre.setText(mascota.getNombre());
            textViewRating.setText(String.valueOf(mascota.getRating()));

            imageViewHueso.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Implementa aquí la lógica para raitear la mascota
                    // Puedes actualizar el rating de la mascota y notificar el cambio al adaptador
                    RecyclerView recyclerViewMascotas = findViewById(R.id.recycler_mascotas);
// Crea una lista de mascotas (puedes reemplazarla con tus propios datos)
                    List<Mascota> listaMascotas = new ArrayList<>();
                    listaMascotas.add(new Mascota("Mascota 1", R.drawable.mascota1, 5));
                    listaMascotas.add(new Mascota("Mascota 2", R.drawable.mascota2, 3));
// Agrega más mascotas según tus necesidades

                    MascotaAdapter mascotaAdapter = new MascotaAdapter(listaMascotas);
                    recyclerViewMascotas.setAdapter(mascotaAdapter);
                    LinearLayoutManager layoutManager = new LinearLayoutManager(this);
                    recyclerViewMascotas.setLayoutManager(layoutManager);
// Crea una lista de mascotas
                    List<Mascota> listaMascotas = new ArrayList<>();

// Agrega mascotas a la lista
                    listaMascotas.add(new Mascota("Max", R.drawable.mascota_max, 4));
                    listaMascotas.add(new Mascota("Bella", R.drawable.mascota_bella, 2));
                    listaMascotas.add(new Mascota("Charlie", R.drawable.mascota_charlie, 5));
// Agrega más mascotas según tus necesidades
                    MascotaAdapter mascotaAdapter = new MascotaAdapter(listaMascotas);
                    recyclerViewMascotas.setAdapter(mascotaAdapter);
                    @Override
                    public boolean onCreateOptionsMenu(Menu menu) {
                        getMenuInflater().inflate(R.menu.menu_main, menu);
                        return true;
                    }

                    @Override
                    public boolean onOptionsItemSelected(MenuItem item) {
                        int itemId = item.getItemId();
                        if (itemId == R.id.action_favorites) {
                            // Abre la actividad de las mascotas favoritas
                            Intent intent = new Intent(this, FavoritasActivity.class);
                            startActivity(intent);
                            return true;
                        }
                        return super.onOptionsItemSelected(item);
                        // Habilita el botón de retroceso en la barra de herramientas
                        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

// Configura el comportamiento del botón de retroceso
                        @Override
                        public boolean onOptionsItemSelected(MenuItem item) {
                            int itemId = item.getItemId();
                            if (itemId == android.R.id.home) {
                                finish(); // Cierra la actividad actual y regresa al Activity padre
                                return true;
                            }
                            return super.onOptionsItemSelected(item);
                        }

                    }

                }
            });